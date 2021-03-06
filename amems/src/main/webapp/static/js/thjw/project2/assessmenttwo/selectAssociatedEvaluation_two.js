/**
 * 选择评估单
 */
open_win_evaluation_modal = {
	id:'open_win_evaluation_modal',
	paginationId:'open_win_evaluation_modal_pagination',
	loaded: false,//是否已加载
	data:[],
	param: {
		multi:false, //是否多选 默认单选
		selected:null, //已经选择的
		existsIdList:null,//已经选择的集合
		parentid:null,//第一层模态框id
		userId:userId,//指定人员id,默认当前登录人
		dprtcode:userJgdm,//默认登录人当前机构代码
		jx:null,//机型
		zlxl:null,//指令类型
		callback:function(){}//回调函数
	},
	//显示弹窗 isReload = true 表示强制加载
	show : function(param, isReload){
		$("#"+this.id).modal("show");
		if(param){
			$.extend(this.param, param);
		}
		this.initParam();
		AlertUtil.hideModalFooterMessage();		
		this.load();
		if(!this.loaded || isReload === true){
		}
	},
	//初始化参数
	initParam: function(){
		$("#"+this.id+"_keyword_search").val('');
		if(this.param.multi){
			$("#checkAll", $("#"+this.id)).show();
			$("#checkSingle", $("#"+this.id)).hide();
		}else{
			$("#checkAll", $("#"+this.id)).hide();
			$("#checkSingle", $("#"+this.id)).show();
		}
	},
	//加载数据
	load : 	function(pageNumber, sortColumn, orderType){
		if(typeof(pageNumber) == "undefined"){
			pageNumber = 1;
		}
		if(typeof(sortColumn) == "undefined"){
			sortColumn = "auto";
		} 
		if(typeof(orderType) == "undefined"){
			orderType = "desc";
		} 
		
		var obj =this.getParams();
		obj.pagination = {page:pageNumber, sort:sortColumn, order:orderType, rows:10};
		startWait();
		var this_ = this;
		AjaxUtil.ajax({
			url: basePath+"/project2/assessment/getgljspgdList",
			type: "post",
			contentType:"application/json;charset=utf-8",
			dataType:"json",
			data:JSON.stringify(obj),
			success:function(data){
				SelectUtil.selectNode('selectAllId',this_.id+"_list");
				if(data.total >0){
					this_.data = data.rows;
					this_.appendContentHtml(data.rows);
					new Pagination({
						renderTo : this_.id+"_pagination",
						data: data,
						sortColumn : sortColumn,
						orderType : orderType,
						controller: this_
					}); 
					// 标记关键字
					signByKeyword($("#"+this_.id+"_keyword_search").val(),[2], "#"+this_.id+"_list tr td");
				} else {
					$("#"+this_.id+"_list").empty();
					$("#"+this_.id+"_pagination").empty();
					$("#"+this_.id+"_list").append("<tr><td class='text-center' colspan=\"10\">暂无数据 No data.</td></tr>");
				}
				this_.loaded = true;
				finishWait();
		    }
		}); 
	},	
	getParams : function(){		
		 var paramsMap = {};
		 var keyword = $.trim($("#"+this.id+"_keyword_search").val());
		 paramsMap.jswjid = formatUndefine($("#gljswjid").val());//关联技术文件id
		 paramsMap.jx = formatUndefine($("#Assessment_Open_Modal_jx").val());//机型
		 paramsMap.dprtcode = $("#dprtcode").val();//组织机构
		 paramsMap.keyword = keyword;
		 return paramsMap;
	},
	appendContentHtml: function(list){
		var htmlContent = '';
		var this_ = this;
		$.each(list,function(index,row){
			
			if (index % 2 == 0) {
				htmlContent += "<tr  bgcolor=\"#f9f9f9\" onclick='"+this_.id+".rowonclick(event);' >";
			} else {
				htmlContent += "<tr  bgcolor=\"#fefefe\" onclick='"+this_.id+".rowonclick(event);' >";
			}
		   
			htmlContent += "<td style='text-align:center;vertical-align:middle;'>"; 
			if(this_.param.multi){
				if(this_.param.selected&&this_.param.selected[row.id]!=null){
					checked = "checked";
				}
					htmlContent += "<input type='checkbox' name='"+this_.id+"_list_radio' value='"+index+"' onclick=\"SelectUtil.checkRow(this,'selectAllId','"+this_.id+"_list')\" "+checked+">"; 					
			}else{
				var checked = "";
				if(this_.param.selected && this_.param.selected == row.id){
					checked = "checked";
				}
				htmlContent += "<input type='radio' name='"+this_.id+"_list_radio' value='"+index+"' "+checked+" >"; 
			}
			htmlContent += "</td>";
		   
			htmlContent += "<td title='"+StringUtil.escapeStr(row.pgdh)+"' style='text-align:left;vertical-align:middle;'><a href='javascript:void(0);' onclick='"+this_.id+".toViewPgd(\""+ row.id +"\")'>"+StringUtil.escapeStr(row.pgdh)+"</a></td>"; 
		    htmlContent += "<td title='R"+StringUtil.escapeStr(row.bb)+"' style='text-align:center;vertical-align:middle;'>R"+StringUtil.escapeStr(row.bb)+"</td>";
		    htmlContent += "<td title='"+StringUtil.escapeStr(row.airworthiness==null?"":row.airworthiness.jswjlx)+"' style='text-align:left;vertical-align:middle;'>"+StringUtil.escapeStr(row.airworthiness==null?"":row.airworthiness.jswjlx)+"</td>";
		    htmlContent += "<td title='"+StringUtil.escapeStr(row.airworthiness==null?"":row.airworthiness.jswjbh) +" "+StringUtil.escapeStr(row.airworthiness==null?"":row.airworthiness.bb==null?"":"R"+row.airworthiness.bb)+"' style='text-align:left;vertical-align:middle;'><a href='#' onclick='"+this_.id+".ToAirworthiness(\""+ row.jswjid+ "\")'>"+StringUtil.escapeStr(row.airworthiness==null?"":row.airworthiness.jswjbh)+" "+StringUtil.escapeStr(row.airworthiness==null?"":row.airworthiness.bb==null?"":"R"+row.airworthiness.bb)+"</a></td>";
		    htmlContent += "<td title='"+StringUtil.escapeStr(row.pgdzt)+"' style='text-align:left;vertical-align:middle;'>"+StringUtil.escapeStr(row.pgdzt)+"</td>";
//		    htmlContent += "<td title='"+StringUtil.escapeStr(row.airworthiness==null?"":row.airworthiness.scfj==null?"":row.airworthiness.scfj.wbwjm+"."+row.airworthiness.scfj.hzm)+"' style='text-align:left;vertical-align:middle;'><a href='javascript:void(0);' onclick='"+this_.id+".downloadfile(\""+(row.airworthiness.scfj ==null?"":StringUtil.escapeStr(row.airworthiness.scfj.id))+"\")' >"+StringUtil.escapeStr(row.airworthiness.scfj==null?"":row.airworthiness.scfj.wbwjm+"."+row.airworthiness.scfj.hzm)+"</a></td>";
		    htmlContent += "<td title='"+StringUtil.escapeStr(row.airworthiness==null?"":row.airworthiness.bfrq==null?"":row.airworthiness.bfrq.substring(0,10))+"' style='text-align:center;vertical-align:middle;'>"+StringUtil.escapeStr(row.airworthiness==null?"":row.airworthiness.bfrq==null?"":row.airworthiness.bfrq.substring(0,10))+"</td>";
		    htmlContent += "<td title='"+StringUtil.escapeStr(row.airworthiness==null?"":row.airworthiness.sxrq==null?"":row.airworthiness.sxrq.substring(0,10))+"' style='text-align:center;vertical-align:middle;'>"+StringUtil.escapeStr(row.airworthiness==null?"":row.airworthiness.sxrq==null?"":row.airworthiness.sxrq.substring(0,10))+"</td>";
//		   
		    htmlContent += "<td title='"+StringUtil.escapeStr(row.airworthiness==null?"":row.airworthiness.dqrq==null?"":row.airworthiness.dqrq.substring(0,10))+"' style='text-align:center;vertical-align:middle;'>"+StringUtil.escapeStr(row.airworthiness==null?"":row.airworthiness.dqrq==null?"":row.airworthiness.dqrq.substring(0,10))+"</td>";
		    htmlContent += "<td title='"+StringUtil.escapeStr(row.pgr==null?"":row.pgr.id)+"' style='text-align:left;vertical-align:middle;'>"+StringUtil.escapeStr(row.pgr==null?"":row.pgr.id)+"</td>";	   
		   	htmlContent += "</tr>";
	   });
	   $("#"+this_.id+"_list").html(htmlContent);
	   SelectUtil.selectNode('selectAllId',this_.id+"_list");
	},
	//搜索
	search: function(){
		this.load();
	},
	//确认
	rowonclick: function(e){
		if(!this.param.multi){
			$(e.target).parent().find("input[type='radio']").attr("checked",true);
		}else{
			SelectUtil.checkRow($(e.target).parent().find("input[type='checkbox']"),'selectAllId',this.id+"_list");
		}
	},
	save: function(){
		
		if(this.param.callback && typeof(this.param.callback) == "function"){
			if(this.param.multi){
				var this_ = this;
				var data = [];
				$("#"+this_.id+"_list", $("#"+this_.id)).find("tr input:checked").each(function(){
					var index = $(this).attr("value");	
					data.push(this_.data[index]);
				});
				if(data==null||data==undefined||data.length==0){
					AlertUtil.showModalFooterMessage("请选择评估单!",this_.id);
					return false;
				}
				this.param.callback(data);
			}else{
				var $checkedRadio = $("#"+this.id+"_list").find("input:checked");
				this.param.callback(this.data[$checkedRadio.attr("value")]);
			}
			$("#"+this.id).modal("hide");
		}
	},
	ToAirworthiness:function(id){
		window.open(basePath + "/project2/airworthiness/view?id="+ id );
	},
	downloadfile : function(id){
		PreViewUtil.handle(id, PreViewUtil.Table.D_011);
	},
	toViewPgd:function(id){
		window.open(basePath+"/project2/assessment/view?id="+id);
	},
	close : function(){
		$("#"+this.id).modal("hide");
	},
	clearData:function(){
		if(this.param.callback && typeof(this.param.callback) == "function"){			
				this.param.callback({});
		}
		this.close();
	}
};