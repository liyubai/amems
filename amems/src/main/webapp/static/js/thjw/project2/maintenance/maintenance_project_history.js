﻿	
	var MaintenanceProjectHistory={
			// 获取历史版本列表
			getHistoryData : function(id, previousBb, func){
				var this_ = this;
				AjaxUtil.ajax({
					url:basePath+"/project2/maintenanceproject/versionlist",
					contentType:"application/json;charset=utf-8",
					type:"post",
					data:JSON.stringify({
						id : id,
						paramsMap : {
							previousBb : previousBb
						}
					}),
					dataType:"json",
					success:function(data){
						if(typeof(func)=="function"){
							func(data); 
						}
					}
				});
			},
			// 拼接历史版本html
			buildHistoryHtml : function(data, previousBb){
				var this_ = this;
				var html = '<div class="col-lg-12 col-md-12 padding-left-0 padding-right-0 padding-bottom-0 padding-top-0 margin-bottom-0" style="overflow-x: auto;margin:0px;padding-bottom:8px;width:100%;">';
				html += '<table class="table-thin table-set text-center webui-popover-table" style="border:0px;" width="100%">';
				html += ['<thead>',
								'<tr>',
									'<th class="colwidth-15">',
									   '<div class="font-size-12 line-height-12">任务号</div>',
							           '<div class="font-size-9 line-height-12">Task No.</div>',
								   	'</th>',
								   	'<th class="colwidth-5">',
									   '<div class="font-size-12 line-height-12">版本</div>',
							           '<div class="font-size-9 line-height-12">Rev.</div>',
								   	'</th>',
								   	'<th class="colwidth-9">',
									   '<div class="font-size-12 line-height-12">日期</div>',
							           '<div class="font-size-9 line-height-12">Date</div>',
								   	'</th>',
								'</tr>',
							'</thead>'].join('');
				html += '<tbody id="history_list">';
				if(data && data.length > 0){
					$.each(data, function(i, row){
						
						html += ['<tr>',
									'<td>',
										'<a href="javascript:void(0);" onclick="MaintenanceProjectHistory.viewProject(\''+row.id+'\')">'+StringUtil.escapeStr(row.rwh)+'</a>',
									'</td>',
									'<td><a href="javascript:void(0);" onclick="MaintenanceProjectHistory.viewProject(\''+row.id+'\')">R'+StringUtil.escapeStr(row.bb)+'</a></td>',
									'<td>'+(row.scheme.sjSxrq||"未生效").substr(0,10)+'</td>',
								'</tr>'].join('');
					});
				}
				html += '</tbody>';
				html += '</table>';
				html += '</div>';
				html += '<div class="clearfix"></div>';
				return html;
			},
			viewProject:function(id){
				window.open(basePath + "/project2/maintenanceproject/view?id=" + id);
			}
	}
	
