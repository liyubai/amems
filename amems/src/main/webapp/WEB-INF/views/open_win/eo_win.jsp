<%@ page contentType="text/html; charset=utf-8" language="java" errorPage=""%>
<script type="text/javascript" src="${ctx}/static/js/thjw/open_win/eo_win.js"></script>
<!-- 飞机注册号选择 -->
<div class="modal fade in modal-new" id="open_win_eo" tabindex="-1" role="dialog" aria-labelledby="open_win_eo" aria-hidden="true">
	<div class="modal-dialog" style="width:60%;">
		<div class="modal-content">	
			<div class="modal-header modal-header-new" >
               	<h4 class="modal-title" >
           			<div class='pull-left'>
               			<div class="font-size-12 ">工程指令</div>
						<div class="font-size-9">EO</div>
				 	</div>
 					<div class='pull-right' style='padding-top:10px;'>
						<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true" style='font-size:30px !important;' >&times;</span></button>
					</div>
					<div class='clearfix'></div>
				</h4>
          	</div>
			<div class="modal-body padding-bottom-0">
            	<div class="input-group-border" style='margin-top:8px;padding-top:5px;'>
	         		
	         		<div class=" pull-right padding-left-0 padding-right-8 margin-top-0 modalSearch">	
						
						<!-- 搜索框start -->
						<div class=" pull-right padding-left-0 padding-right-0">
							<div class=" pull-left padding-left-0 padding-right-0" style="width: 250px;">
								<input type="text" placeholder='EO/标题' id="open_win_eo_keyword_search" class="form-control" />
							</div>
		                   	<div class=" pull-right padding-left-5 padding-right-0 ">   
							<button name="keyCodeSearch" type="button" class=" btn btn-primary padding-top-1 padding-bottom-1 " onclick="open_win_eo.search()">
								<div class="font-size-12">搜索</div>
								<div class="font-size-9">Search</div>
		                  		</button>
		                  	</div> 
						</div>
						<!-- 搜索框end -->
					</div>
            	
	         		<div class="clearfix"></div>
	         		
					<!-- start:table -->
					<div class="margin-left-8 margin-right-8" style='margin-top:5px;margin-bottom:5px;'>
						<div class='col-xs-12 padding-left-0 padding-right-0' id="searchTable" class="table-content">
							<table id="open_win_regist_basic_table" class="table table-bordered table-striped table-hover table-set table-thin" >
								<thead>
							   		<tr>
										<th style="width:50px" id="checkSingle">
											<div class="font-size-12 line-height-18">操作</div>
											<div class="font-size-9 line-height-18">Operation</div>
										</th>
										<th style="width:50px" id="checkAll" style='text-align:center;vertical-align:middle;width:5%'>
											<a href="#" onclick="SelectUtil.performSelectAll('open_win_eo_list')" ><img src="${ctx}/static/assets/img/d1.png" alt="全选" /></a>
											<a href="#" class="margin-left-5" onclick="SelectUtil.performSelectClear('open_win_eo_list')" ><img src="${ctx}/static/assets/img/d2.png" alt="不全选" /></a>
										</th>
										<th>
											<div class="important">
											    <div class="font-size-12 line-height-18">工程指令编号</div>
									            <div class="font-size-9 line-height-18">EO No.</div>
											</div>
									    </th>
									    <th>
										    <div class="font-size-12 line-height-18">版本</div>
								            <div class="font-size-9 line-height-18">Rev.</div>
									    </th>
									    <th>
										    <div class="font-size-12 line-height-18">机型</div>
								            <div class="font-size-9 line-height-18">A/C Type</div>
									    </th>
									    <th>
									    	<div class="important">
											    <div class="font-size-12 line-height-18">标题</div>
									            <div class="font-size-9 line-height-18">Title</div>
								            </div>
									    </th>
									    <th>
										    <div class="font-size-12 line-height-18">适用性</div>
								            <div class="font-size-9 line-height-18">Applicability</div>
									    </th>
							 		 </tr>
								</thead>
								<tbody id="open_win_eo_list">
								
								</tbody>
							</table>
							<div class="col-xs-12 text-center page-height padding-right-0 padding-left-0" id="open_win_eo_pagination"></div>
						</div>
					</div>
					<!-- end:table -->
		     		<div class="clearfix"></div>
			 	 </div>
				<div class="clearfix"></div>
			</div>
			
			<div class="clearfix"></div>  
            <div class="modal-footer">
          		<div class="col-xs-12 padding-leftright-8" >
					<div class="input-group">
						<span class="input-group-addon modalfootertip" >
						</span>
	                   	<span class="input-group-addon modalfooterbtn">
	                     	<button type="button" class="btn btn-primary padding-top-1 padding-bottom-1" onclick="open_win_eo.save();" data-dismiss="modal">
								<div class="font-size-12">确定</div>
								<div class="font-size-9">Confirm</div>
							</button>
							<button type="button" onclick="open_win_eo.clear()" id="open_win_eo_btn_clear"
								class="btn btn-primary padding-top-1 padding-bottom-1">
								<div class="font-size-12">清空</div>
								<div class="font-size-9">Clear</div>
							</button>
							<button type="button" class="btn btn-primary padding-top-1 padding-bottom-1" data-dismiss="modal">
								<div class="font-size-12">关闭</div>
								<div class="font-size-9">Close</div>
							</button>
	                   	</span>
              		</div><!-- /input-group -->
				</div>
  			</div>
		</div>
	</div>
</div>
