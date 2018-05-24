$(document).ready(function(){
		Navigation(menuCode,"","");//初始化导航
		$('input[name=date-range-picker]').daterangepicker({"opens":"left"}).prev().on("click",
			function() {
				$(this).next().focus();
			}
		);
		$("input[name='date-picker']").datepicker({
			autoclose : true,
			clearBtn : true
		});
		//默认审核日期 并 加载数据
		setShrq();
	});
 function setShrq(){
	 TimeUtil.getCurrentDate(function(date) {
			 var startStr = date; 
			 startStr=startStr.replaceAll('/','-');
			 var endStr = addMonths(startStr,6);
			 $("#shrq_search").data('daterangepicker').setStartDate(startStr);
			 $("#shrq_search").data('daterangepicker').setEndDate(endStr);
			 $("#shrq_search").val(startStr + " ~ " + endStr);
			//加载数据
			auditnoticeMain.reload();
		});
 }
 function searchreset(){
	 TimeUtil.getCurrentDate(function(date) {
		 var startStr = date; 
		 startStr=startStr.replaceAll('/','-');
		 var endStr = addMonths(startStr,6);
		 $("#shrq_search").data('daterangepicker').setStartDate(startStr);
		 $("#shrq_search").data('daterangepicker').setEndDate(endStr);
		 $("#shrq_search").val(startStr + " ~ " + endStr);
	});
	 $("#zt1").attr("checked",true);
	 $("#zt2").attr("checked",false);
	 $("#shdxmc_search").val("");
	 $("#shdxid_search").val("");
	 $("#shlb").val("");
	 $("#dprtcode").val(userJgdm);
	 
 }
 function addMonths(date, months){ 
		var d=new Date(Date.parse(date.replace(
				/-/g, "/"))); 
		d.setMonth(d.getMonth()+months); 
		var month=d.getMonth()+1; 
		var day = d.getDate(); 
		if(month<10){ 
		month = "0"+month; 
		} 
		if(day<10){ 
		day = "0"+day; 
		} 
		var val = d.getFullYear()+"-"+month+"-"+day; 
		return val; 
	}
 var choseAllIds=[]; 
 var auditnoticeMain={
			pagination : {},
			gatherSearchParam:function(){
				var searchParam={};
				 searchParam.lx=$("#lx").val();
				 searchParam.shdx=$("#shdx").val();
				 searchParam.shlb=$("#shlb").val();
				 searchParam.dprtcode=$("#dprtcode").val();
				 searchParam.keyword=$.trim($('#keyword_search').val());
				 //只查看该部门下数据
				 searchParam.shdxid = currentUser.bmdm;
				 paramsMap = {}
				 var ztList=[];
				 if($("#zt1").attr("checked")){
					 ztList.push(1);
				}
				 if($("#zt2").attr("checked")){
					 ztList.push(2);
				 }
				 if(ztList.length>0){
					 paramsMap.ztList=ztList;
				 }
				 
				 
				 if(searchParam.shdxid == null || searchParam.shdxid ==""){
					 searchParam.shdxmc = $.trim($('#shdxmc_search').val());
				 }
				 var shrq=$("#shrq_search").val();
				 //生效日期
				 if(null != shrq && "" != shrq){
					 var shrqBegin = shrq.substring(0,10)+" 00:00:00";
					 var shrqEnd = shrq.substring(13,23)+" 23:59:59";
					 paramsMap.shrqBegin = shrqBegin;
					 paramsMap.shrqEnd = shrqEnd;
				 }else{
					 paramsMap.shrqBegin = "";
					 paramsMap.shrqEnd = "";
				 }
				 searchParam.paramsMap=paramsMap;
				 return searchParam;
			},
			goPage:function(pageNumber,sortType,sequence){
				this.AjaxGetDatasWithSearch(pageNumber,sortType,sequence);
			},
			AjaxGetDatasWithSearch:function(pageNumber,sortType,sequence){
				 var _this = this;
				 _this.pagination = {page:pageNumber,sort:sortType,order:sequence,rows:20};
				 var searchParam=_this.gatherSearchParam();
				 if(searchParam.paramsMap.ztList == null || searchParam.paramsMap.ztList.length <= 0 || searchParam.shdxid == null || searchParam.shdxid ==""){
					$("#auditnotice_list").empty();
					$("#auditnotice_pagination").empty();
					$("#auditnotice_list").append("<tr><td class='text-center' colspan=\"13\">暂无数据 No data.</td></tr>");
					return false;
				 }
				 searchParam.pagination = _this.pagination;
				/* if(id != ""){
					 	searchParam.id = id;
						id = "";
					}*/
				 AjaxUtil.ajax({
					 url:basePath+"/quality/auditnotice/queryAll",
					   type: "post",
					   contentType:"application/json;charset=utf-8",
					   dataType:"json",
					   data:JSON.stringify(searchParam),
					   success:function(data){
				 			if(data.rows.length > 0){
				 			_this.appendContentHtml(data.rows);
				 			//分页
				 			var page_ = new Pagination({
								renderTo : "auditnotice_pagination",
								data: data,
								sortColumn : sortType,
								orderType : sequence,
								extParams:{},
								goPage: function(a,b,c){
									_this.AjaxGetDatasWithSearch(a,b,c);
								}
							});
				 		// 标记关键字
							   signByKeyword($("#keyword_search").val(),[5,8,16,20]);
				 		
				 		}else{
				 			$("#auditnotice_list").empty();
							$("#auditnotice_pagination").empty();
							$("#auditnotice_list").append("<tr><td class='text-center' colspan=\"13\">暂无数据 No data.</td></tr>");
							
						}
				 			new Sticky({tableId:'quality_check_list_table'});
				 		}
				 });
			},
			reload:function(){
				TableUtil.resetTableSorting("quality_check_list_table");
				this.goPage(1,"auto","desc");
			},
			// 表格拼接
			appendContentHtml:function(list){
				var _this = this;
				var htmlContent = '';
				choseAllIds = [];
				$.each(list,function(index,row){
					choseAllIds.push(index);
						htmlContent += "<tr >";
				    htmlContent += "<td style='text-align:center;vertical-align:middle;' class='fixed-column '>";
				    if(row.zt == 1){
				    	htmlContent += "<i class='fa fa-check-circle color-blue cursor-pointer' onClick=\"accept('"
				    		+ row.id + "')\" title='接收 Accept '></i>&nbsp;&nbsp;";
				    }
				    	
				    htmlContent += "</td>";
				    htmlContent += "<td style='text-align:center;vertical-align:middle;' class='fixed-column ' title='"+StringUtil.escapeStr(DicAndEnumUtil.getEnumName('auditnoticeStatusEnum',row.zt))+"'>"+StringUtil.escapeStr(DicAndEnumUtil.getEnumName('auditnoticeStatusEnum',row.zt))+"</td>";
				    htmlContent += "<td style='text-align:center;vertical-align:middle;'title='"+StringUtil.escapeStr(row.jhShrq?row.jhShrq.substring(0,10):'')+"'>"+StringUtil.escapeStr(row.jhShrq?row.jhShrq.substring(0,10):'')+"</td>"; 
				    htmlContent += "<td style='text-align:left;vertical-align:middle;'  title='"+StringUtil.escapeStr(row.jcnr)+"'>"+StringUtil.escapeStr(formatUndefine(row.jcnr))+"</td>"; 
				    htmlContent +=	"<td  title='附件 Attachment' style='text-align:center;vertical-align:middle;'>";
				    if(row.paramsMap && (row.paramsMap.fjcount && row.paramsMap.fjcount > 0)){
				    	htmlContent += '<i auditNoticeId="'+row.id+'" class="attachment-view glyphicon glyphicon glyphicon-list color-blue cursor-pointer "  style="font-size:15px"></i>';
				    }
				    htmlContent +=	"</td>"; 
				    htmlContent +=_this.getGroupLeaderInfo(row.paramsMap?row.paramsMap.shcy:null,index); 
				    
				    htmlContent += "<td style='text-align:center;vertical-align:middle;' title='"+StringUtil.escapeStr(DicAndEnumUtil.getEnumName('auditnoticeTyepEnum',row.shlb))+"'>"+StringUtil.escapeStr(DicAndEnumUtil.getEnumName('auditnoticeTyepEnum',row.shlb))+"</td>";
				    htmlContent += "<td style='text-align:center;vertical-align:middle;' title='"+StringUtil.escapeStr(formatUndefine(row.jcdbh))+"'><a href=\"javascript:view('"+row.id+"')\">"+StringUtil.escapeStr(formatUndefine(row.jcdbh))+"</a></td>";
				    if(row.lx == 1){
					    htmlContent += "<td style='text-align:center;vertical-align:middle;'  title='内部'>内部</td>";
				    }else{
					    htmlContent += "<td style='text-align:center;vertical-align:middle;'  title='外部'>外部</td>";
				    }
				    htmlContent += "<td style='text-align:left;vertical-align:middle;' title='"+StringUtil.escapeStr(formatUndefine(row.whr.displayName))+"'>"+StringUtil.escapeStr(formatUndefine(row.whr.displayName))+"</td>"; 
				    htmlContent += "<td style='text-align:center;vertical-align:middle;' title='"+row.whsj+"'>"+row.whsj+"</td>"; 
				    htmlContent += "<td style='text-align:left;vertical-align:middle;'  title='"+StringUtil.escapeStr(formatUndefine(row.jg_dprt.dprtname))+"'>"+StringUtil.escapeStr(formatUndefine(row.jg_dprt.dprtname))+"</td>"; 
				    htmlContent += "</tr>" ;
			   $("#auditnotice_list").empty();
			   $("#auditnotice_list").html(htmlContent);
			   refreshPermission(); 
			   initWebuiPopover();
			 });
			},
			formatLastShcy : function(data){
				var str = "";
				if(data == null || data == ""){
					str += "<td></td>";
					return str;
				}
				var list = data.split(",");
				var shcy = '';
				var shcyTitle = '';
				$.each(list,function(index,row){
					var tdArr = row.split("#_#");
					if( tdArr[0] ==1 ){
						shcy += "组长："+tdArr[2]+" "+tdArr[3]+"</br>";
						shcyTitle += "组长："+tdArr[2]+" "+tdArr[3]+"\n";
					}else{
						shcy += "组员："+tdArr[2]+" "+tdArr[3]+"</br>";
						shcyTitle += "组员："+tdArr[2]+" "+tdArr[3]+"\n";
					}
				});
				str += "<td title='"+shcyTitle.replaceAll("</br>","\n")+"' style='text-align:center;vertical-align:middle;'>"+shcy+"</td>";
				return str;
			},
			/** 组长组员信息*/
			getGroupLeaderInfo:function(data,indx){
				_this=this;
				var str = "";
				var flg=false;
				if(data == null || data == ""){
					str += "<td></td>";
					return str;
				}
				var list = data.split(",");
				var zzStr = "";
				var cyStr = "";
				var shcyTitle ="";
				if(list != null && list.length >0){
					$.each(list,function(index,row){
						var tdArr = row.split("#_#");
						if( tdArr[0] ==1 ){
							flg = true;
						}
					});
					
					$.each(list,function(index,row){
						var tdArr = row.split("#_#");
						if( tdArr[0] ==1 ){
							var shcyTitle = "组长："+tdArr[2]+" "+tdArr[3];
							zzStr += "<p class='text-left margin-bottom-0 cursor-pointer' title='"+shcyTitle+"' style='height:20px;line-height:20px;'>组长："+tdArr[2]+"&nbsp;&nbsp;"+tdArr[3]+"</p>";
							zzStr +="<div id='"+indx+"content' style='display:none;'>" ;
						}else{
							var shcyTitle = "成员："+tdArr[2]+" "+tdArr[3];
							
							if(cyStr==""){
								cyStr += "<p class='text-left margin-bottom-0 cursor-pointer' title='"+shcyTitle+"' style='height:20px;line-height:20px;'>成员："+tdArr[2]+"&nbsp;&nbsp;"+tdArr[3];
								cyStr += "</p>"
							}else{
								cyStr += "<p style='height:20px;line-height:20px;padding-left:35px;' title='"+shcyTitle+"' class='text-left margin-bottom-0 cursor-pointer'>"+tdArr[2]+"&nbsp;&nbsp;"+tdArr[3]+"</p>";	
							}
							if(!flg){
								cyStr +="<div id='"+indx+"content' style='display:none;'>" ;
								flg = true;
							}
						}
					});
				}
				return "<td style='text-align:center;vertical-align:middle;'>"+zzStr+cyStr+"</td>";
			},
			//展示组员信息
			getGroupInfo:function(i){
				var flag = $("#"+choseAllIds[i]+'content').is(":hidden");
				 if(flag){
					 $("#"+choseAllIds[i]+'content').fadeIn(500);
					 $("#"+choseAllIds[i]+'icon').removeClass("icon-caret-down");
					 $("#"+choseAllIds[i]+'icon').addClass("icon-caret-up");
				 }else{
					 $("#"+choseAllIds[i]+'content').hide();
					 $("#"+choseAllIds[i]+'icon').removeClass("icon-caret-up");
					 $("#"+choseAllIds[i]+'icon').addClass("icon-caret-down");
				 }
				 new Sticky({tableId:'quality_check_list_table'});
			},
			//收缩组员信息
			getGroupInfoAll:function(){
				var obj = $("th[name='th_return']");
				var flag = obj.hasClass("downward");
				if(flag){
					obj.removeClass("downward").addClass("upward");
				}else{
					obj.removeClass("upward").addClass("downward");
				}
				 for(var i=0;i<choseAllIds.length;i++){
					 if(flag){				
						 $("#"+choseAllIds[i]+'content').fadeIn(500);
						 $("#"+choseAllIds[i]+'icon').removeClass("icon-caret-down");
						 $("#"+choseAllIds[i]+'icon').addClass("icon-caret-up");
					 }else{
						 $("#"+choseAllIds[i]+'content').hide();
						 $("#"+choseAllIds[i]+'icon').removeClass("icon-caret-up");
						 $("#"+choseAllIds[i]+'icon').addClass("icon-caret-down");
					 }
				 }
				 new Sticky({tableId:'quality_check_list_table'});
			}
		}
	function initWebuiPopover(){//初始化
			WebuiPopoverUtil.initWebuiPopover('attachment-view','body',function(obj){
				return getHistoryAttachmentList(obj);
			});
			$("#quality_check_list_table").scroll(function(){
				$('.attachment-view').webuiPopover('hide');
			});
		}
	function getHistoryAttachmentList(obj){//获取历史附件列表
		var jsonData = [
	         {mainid : $(obj).attr('auditNoticeId'), type : '附件'}
	    ];
		return history_attach_alert_Modal.getHistoryAttachmentList(jsonData);
	}
 
//查看
 function view(id){
	 window.open(basePath+"/quality/auditnotice/view?id="+id);
 }
  //搜索条件显示与隐藏 
    function search() {
    	if ($("#divSearch").css("display") == "none") {
    		$("#divSearch").css("display", "block");
    		App.resizeHeight();
    		$("#icon").removeClass("icon-caret-down");
    		$("#icon").addClass("icon-caret-up");
    	} else {
    		$("#divSearch").css("display", "none");
    		App.resizeHeight();
    		$("#icon").removeClass("icon-caret-up");
    		$("#icon").addClass("icon-caret-down");
    	}
    }
    function orderBy(obj){
    	// 字段排序
    		var orderStyle = $("#" + obj + "_order").attr("class");
    		$("th[id$=_order]").each(function() { //重置class
    			$(this).removeClass("sorting_desc").removeClass("sorting_asc").addClass("sorting");
    		});
    		$("#" + obj + "_" + "order").removeClass("sorting");
    		var orderType = "asc";
    		if (orderStyle.indexOf("sorting_asc") >= 0) {
    			$("#" + obj + "_" + "order").addClass("sorting_desc");
    			orderType = "desc";
    		} else {
    			$("#" + obj + "_" + "order").addClass("sorting_asc");
    			orderType = "asc";
    		}
    		orderStyle = $("#" + obj + "_order").attr("class");
    		var currentPage = $("#pagination li[class='active']").text();
    		auditnoticeMain.goPage(currentPage,obj,orderStyle.split("_")[1]);
    }
    //选择部门
    function openzrdw(fl) {
    		var this_ = this;
    		if(fl){
    			var dprtname = $("#shdxmc_search").val();
        		var dprtcode = $("#shdxid_search").val();
    		}else{
    			var dprtname = $("#shdxmc").val();
        		var dprtcode = $("#shdxid").val();
    		}
    		departmentModal.show({
    			dprtnameList : dprtname,// 部门名称
    			dprtcodeList : dprtcode,// 部门id
    			type : false,// 勾选类型true为checkbox,false为radio
    			parentid : "addModal",
    			clearDepartment : true,
    			dprtcode : $("#dprt").val()==""?userJgdm:$("#dprt").val(),// 默认登录人当前机构代码
    			callback : function(data) {// 回调函数
    				if(data.dprtcode != ""){
    					if(fl){
    						$("#shdxid_search").val(data.dprtcode);
    						$("#shdxmc_search").val(data.dprtname);
    					}else{
    						$("#shdxid").val(data.dprtcode);
    						$("#shdxbh").val(data.dprtbm);
    						$("#shdxmc").val(data.dprtname);
    						$("#shdxmcText").val(data.dprtbm+" "+data.dprtname);
    					}
    				}else{
    					$("#shdxid").val('');
    					$("#shdxid_search").val('');
    					$("#shdxmc_search").val('');
    					$("#shdxbh").val('');
    					$("#shdxmc").val('');
    					$("#shdxmcText").val('');
    				}
    			}
    		})
    }
    
  //部门的改变事件
    function shdxQk(){
    	$("#shdxid_search").val('');
    }
    
  //接收
    function accept(id){
    	 var str = "是否确定接收?";
    	 AlertUtil.showConfirmMessage(str, {callback: function(){
    		 	var message = "接收成功!";
    			var url = basePath+"/quality/auditnotice/acceptAuditNotice";
    			performAction(url, id, message);
    		}});
    }
  //提交后台
    function performAction(url, id, message){
    		var this_ = this;
    		startWait();
    		// 提交数据
    		AjaxUtil.ajax({
    			url:url,
    			type:"post",
    			data:{
    				"id":id
    			},
    			dataType:"json",
    			success:function(data){
    				finishWait();
    				AlertUtil.showMessage(message);
    				auditnoticeMain.goPage(auditnoticeMain.pagination.page, auditnoticeMain.pagination.sort, auditnoticeMain.pagination.order);
    			}
    		});
    }
  //导出
    function exportExcel(){
    	var searchParam = airworthinessMain.gatherSearchParam();
    	if(!searchParam.paramsMap.wjlxList){
    		searchParam.paramsMap.wjlxList = "";
    	}
    	if(!searchParam.paramsMap.xpgbsList){
    		searchParam.paramsMap.xpgbsList = "";
    	}
    		window.open(basePath+"/project2/airworthiness/airworthiness.xls?dprtcode="
    				+ encodeURIComponent(searchParam.dprtcode)+ "&jswjly="+encodeURIComponent(searchParam.jswjly)+"&keyword="
    				+ encodeURIComponent(searchParam.keyword) + "&zt=" + encodeURIComponent(searchParam.zt)+"&paramsMap[sxrqBegin]="
    				+ encodeURIComponent(searchParam.paramsMap.sxrqBegin) + "&paramsMap[sxrqEnd]=" + encodeURIComponent(searchParam.paramsMap.sxrqEnd)+"&paramsMap[pgqxBegin]="
    				+ encodeURIComponent(searchParam.paramsMap.pgqxBegin) + "&paramsMap[pgqxEnd]=" + encodeURIComponent(searchParam.paramsMap.pgqxEnd)+"&wjlxList="
    				+ encodeURIComponent(searchParam.paramsMap.wjlxList) + "&xpgbsList=" + encodeURIComponent(searchParam.paramsMap.xpgbsList));
    }
    
 