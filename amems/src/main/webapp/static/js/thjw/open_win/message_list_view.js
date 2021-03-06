
MessageListViewModal = {
	id:'MessageListViewModal',
	tbodyId:'open_messageListTable',
	param: {
		viewObj:null,
		callback:function(){}
	},
	show : function(param){
		if(param){
			$.extend(this.param, param);
		}
		//回显数据
		if(this.param.viewObj){
			this.updateViewStatusByDjIdUId(this.param.viewObj.id);
			this.initMessageList(this.param.viewObj.id);
		}else{
			$("#"+this.tbodyId, $("#"+this.id)).append("<tr style='height:35px;'><td colspan='6'  style='text-align:center;vertical-align:middle;' >暂无数据 No data.</td></tr>");
		}
		$("#"+this.id).modal("show");
	},
	initMessageList : function(djid){
		var this_ = this;
		var searchParam = {};
		searchParam.djid = djid;
		AjaxUtil.ajax({
			async: false,
			url:basePath+"/aerialmaterial/message/queryMessageList",
			contentType:"application/json;charset=utf-8",
			type:"post",
			data:JSON.stringify(searchParam),
			dataType:"json",
			success:function(data){
				if(data != null && data.length > 0){
					this_.appendMessageHtml(data);
			   } else {
				   $("#"+this_.tbodyId, $("#"+this_.id)).empty();
				   $("#"+this_.tbodyId, $("#"+this_.id)).append("<tr style='height:35px;'><td colspan='5'  style='text-align:center;vertical-align:middle;' >暂无数据 No data.</td></tr>");
			   }
			}
		});
	},
	updateViewStatusByDjIdUId : function(djid){
		AjaxUtil.ajax({
			url:basePath + "/aerialmaterial/message/updateViewStatusByDjIdUId",
			type:"post",
			async: false,
			data:{
				djid : djid
			},
			dataType:"json",
			success:function(data){
				
			}
		});
	},
	appendMessageHtml : function(list){
		var this_ = this;
		var userId = $("#userId").val();
		var htmlContent = '';
		$.each(list,function(index,row){
			
			var jsrnames = formatUndefine(row.jsrnames);
			var lynr = StringUtil.escapeStr(row.nbwjm);
			if(this_.checkUser(row.messageRecipientsList)){
			   lynr = '<span style="color: red">' + lynr + "</span>";
			}
		   if (index % 2 == 0) {
			   htmlContent += "<tr bgcolor=\"#f9f9f9\" >";
			   
		   } else {
			   htmlContent += "<tr bgcolor=\"#fefefe\"  >";
		   }
		   
		   htmlContent += "<td style='text-align:center;vertical-align:middle;'>"+(index+1)+"</td>";	
		   htmlContent += "<td style='text-align:center;vertical-align:middle;' >"+StringUtil.escapeStr(row.wbwjm)+"</td>";
		   htmlContent += "<td title='"+StringUtil.escapeStr(row.zdr?row.zdr.displayName:'')+"' style='text-align:left;vertical-align:middle;' >"+StringUtil.escapeStr(row.zdr?row.zdr.displayName:'')+"</td>";
		   htmlContent += "<td title='"+StringUtil.escapeStr(row.nbwjm)+"' style='text-align:left;vertical-align:middle;' >"+lynr+"</td>";
		   htmlContent += "<td title='"+this_.formartTiele(jsrnames)+"' style='text-align:left;vertical-align:middle;'>"+this_.formartJsr(jsrnames)+"</td>"; 
		   htmlContent += "</tr>";  
			    
		});
		$("#"+this_.tbodyId, $("#"+this_.id)).empty();
		$("#"+this_.tbodyId, $("#"+this_.id)).html(htmlContent);

	},
	checkUser : function(messageRecipientsList){
		var flag = false;
		if(messageRecipientsList != null && messageRecipientsList.length > 0){
			$.each(messageRecipientsList, function(i, obj){
				if($("#userId").val() == obj.jsrid){
					flag = true;
					return flag;
				}
			});
		}
		return flag;
	},
	formartTiele : function(jsrnames){
		var jsrnameArr = jsrnames.split(",");
		var str = '';
		$.each(jsrnameArr, function(i, jname){
			var zt = jname.substring(0,1);
			var name = jname.substring(1,jname.length);
			if(zt == 0){
				str += name + "(未读),";
			}else{
				str += name + "(已读),";
			}
		});
		
		if(str != ''){
			str = str.substring(0,str.length - 1);
		}
		return str;
	},
	formartJsr : function(jsrnames){
		var jsrnameArr = jsrnames.split(",");
		var str = '';
		$.each(jsrnameArr, function(i, jname){
			var zt = jname.substring(0,1);
			var name = jname.substring(1,jname.length);
			if(zt == 0){
				str += name + ",";
			}else{
				str += '<span style="color: blue">' + name + "</span>,";
			}
		});
		
		if(str != ''){
			str = str.substring(0,str.length - 1);
		}
		return str;
	}
}
