
	var rectify_measures_close = {
		
		id : "rectify_measures_close_alert_Modal",
		
		// 页面初始化
		init : function(){
			
			var this_ = this;
			// 加载附件
			this_.loadAttachment();
			// 加载数据
			this_.loadData();
		},
		
		param : {
			data:{},
			edit:1,//1是关闭操作，2是驳回
			callback:function(){}//回调函数
		},
		
		// 显示弹窗
		show : function(param, isReload){
			if(param){
				$.extend(this.param, param);
			}
			this.init();
			if(this.param.edit == 1){
				$("#"+this.id+" #measures_assessment_close_title").html("关闭信息");
				$("#"+this.id+" #measures_assessment_close_etitle").html("Close the Info");
				$("#"+this.id+" #measures_assessment_close_name").html("关闭原因");
				$("#"+this.id+" #measures_assessment_close_ename").html("Clsoe Reason");
			}else if(this.param.edit == 2){
				$("#"+this.id+" #measures_assessment_close_title").html("驳回信息");
				$("#"+this.id+" #measures_assessment_close_etitle").html("Reject the Info");
				$("#"+this.id+" #measures_assessment_close_name").html("驳回原因");
				$("#"+this.id+" #measures_assessment_close_ename").html("Reject Reason");
			}
			$("#"+this.id).modal("show");
		},
		// 下载文件
		downloadfile : function(id){
			PreViewUtil.handle(id, PreViewUtil.Table.D_011);
		},
		
		// 加载附件
		loadAttachment : function(){
			var this_ = this;
			var attachmentsObj = attachmentsUtil.getAttachmentsComponents('attachments_list_close');
			attachmentsObj.show({
				attachHead : true,
				djid:formatUndefine(this_.param.data.id),
				fileType:"noticeOfDiscovery",
		 		colOptionhead : true,
				fileHead : true,
				left_column : false,
			});//显示附件
		},
		// 加载数据
		loadData : function(){
			var this_ = this;
			var data = this_.param.data;
			preventive_measure.show({//预防措施
				data:data,
				option:false,
				modal:this_.id
			});
			measures_record.show({//流程记录
				id:data.id,
				dprtcode:data.dprtcode,
				modal:this_.id
			});
			measures_assessment.show({//纠正及预防措施评估
				data:data,
				option:false,
				modal:this_.id
			})
			this_.fillData(data);//基本信息
		},
		fillData : function(obj){
			$("#"+this.id+" #shwtbh").val(obj.shwtbh);
			$("#"+this.id+" #sjShrq").val(obj.auditDiscovery?(obj.auditDiscovery.sjShrq?obj.auditDiscovery.sjShrq.substring(0,10):""):"");
			$("#"+this.id+" #lx").val(obj.auditDiscovery==null?"":formatUndefine(DicAndEnumUtil.getEnumName('auditDiscoverTypeEnum',obj.auditDiscovery.lx)));
			$("#"+this.id+" #shlb").val(obj.auditDiscovery==null?"":formatUndefine(DicAndEnumUtil.getEnumName('auditnoticeTyepEnum',obj.auditDiscovery.shlb)));					
			$("#"+this.id+" #shdx").val(obj.auditDiscovery?(StringUtil.escapeStr(obj.auditDiscovery.shdxbh)+" "+StringUtil.escapeStr(obj.auditDiscovery.shdxmc)):"");			
			$("#"+this.id+" #zrr").val(obj.auditDiscovery?(StringUtil.escapeStr(obj.auditDiscovery.zrrbh)+" "+StringUtil.escapeStr(obj.auditDiscovery.zrrmc)):"");
			$("#"+this.id+" #wtdj").val(obj.wtdj);
			$("#"+this.id+" #wtfl").val(obj.wtfl);
			$("#"+this.id+" #yqfkrq").val(obj.auditDiscovery?(obj.auditDiscovery.yqfkrq?obj.auditDiscovery.yqfkrq.substring(0,10):""):"");
			$("#"+this.id+" #wtms").val(obj.wtms);
			$("#"+this.id+" #zgjy").val(obj.auditDiscovery?obj.auditDiscovery.zgjy:"");
			$("#"+this.id+" #yzjg").val(obj.yzjg);
			$("#"+this.id+" #yzjg").attr("disabled",true);
			if(this.param.edit == 1){
				$("#"+this.id+" #gbsm").val(obj.gbsm);
			}else{
				$("#"+this.id+" #gbsm").val(obj.bz);
			}
			$("#"+this.id+" #wtfxr").val(obj.auditDiscovery?(StringUtil.escapeStr(obj.auditDiscovery.whr.username)+" "+StringUtil.escapeStr(obj.auditDiscovery.whr.realname)):"");
			$("#"+this.id+" #wttbr").val(obj.auditDiscovery?obj.auditDiscovery.whsj:"");
			this.initWebuiPopover();
		},
		initWebuiPopover : function(){
			var this_ = this;
			WebuiPopoverUtil.initWebuiPopover('attachment-view2',"#"+this_.id,function(obj){
				return this_.getHistoryAttachmentList(obj);
			});
		},
		getHistoryAttachmentList:function(obj){//获取历史附件列表
			var id = this.param.data.auditDiscovery.id;
			var jsonData = [
			   	         {mainid : id, type : '附件'}
			   	    ];
			 return history_attach_alert_Modal.getHistoryAttachmentList(jsonData);
		},
		// 获取数据
		getData : function(){
			var obj = {};			
			obj.id = this.param.data.id;
			if(this.param.edit == 1){
				obj.gbsm = $.trim($("#"+this.id+" #gbsm").val());
				obj.zt = 9;
			}else if(this.param.edit == 2){
				obj.bz = $.trim($("#"+this.id+" #gbsm").val());
				obj.zt = 6;
			}
			obj.attachments = attachmentsUtil.getAttachmentsComponents('attachments_list_close').getAttachments();		
			return obj;
		},
		
		// 保存
		saveData : function(){
			var this_ = this;
			var obj = this_.getData();
			if(this.param.callback && typeof(this.param.callback) == "function"){
				this_.param.callback(obj);
			}
		},
		// 提交
		submitData : function(){
			var this_ = this;
			
			obj.zt = 2;
			if(!this_.valid(obj)){
				return false;
			}
			if(this.param.callback && typeof(this.param.callback) == "function"){
				this_.param.callback(obj);
			}
		},
		valid:function(data){
			if(!preventive_measure.isValid){
				return false;
			}
			return true;
		},
	};
	
	