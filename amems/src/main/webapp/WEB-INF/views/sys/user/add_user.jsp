<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage=""%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	<title></title>
	<script type="text/javascript">
	var pageParam = '${param.pageParam}';
		$(document).ready(function(){
		//导航
		Navigation(menuCode,"添加用户","Add");
		});
	</script>
	<style type="text/css">
		.line {
	    	border-bottom: 0px;
	   	}
	</style>
	<%@ include file="/WEB-INF/views/common_new.jsp"%>
	<script type="text/javascript" src="${ctx }/static/js/thjw/sys/jquery.bootstrap-duallistbox.js"></script> 
</head>
<body>
<input type="hidden" id="departmentId" name="departmentId" value=""/>
<div class="page-content  ">
	<div class="panel panel-primary">
		<div class="panel-heading" id="NavigationBar"></div>
			<div class="panel-body">
				<form id="form" >
					<div class="col-lg-12 col-sm-12 col-xs-12 padding-left-0 padding-right-0 margin-bottom-10">
						<div class=" col-lg-4 col-sm-6 col-xs-12  padding-left-0 padding-right-0 margin-bottom-10 form-group" >
							<label class="col-lg-3 col-sm-3 col-xs-3 text-right padding-left-0 padding-right-0">
								<div class="font-size-12 line-height-18">
									<span style="color: red">*</span>用户代码
								</div>
								<div class="font-size-9 line-height-18">User Code</div>
							</label>
							 <div class="col-lg-9 col-sm-9 col-xs-9 padding-left-8 padding-right-0" >
								<input type="text" class="form-control "  id="username1" maxlength="50" name="username1">
							</div>
						</div>
						<div class=" col-lg-4 col-sm-6 col-xs-12  padding-left-0 padding-right-0 margin-bottom-10 form-group" >
							<label class="col-lg-3 col-sm-3 col-xs-3 text-right padding-left-0 padding-right-0">
								<div class="font-size-12 line-height-18">
									<span style="color: red">*</span>姓名
								</div>
								<div class="font-size-9 line-height-18">Name</div>
							</label>
						    <div class="col-lg-9 col-sm-9 col-xs-9 padding-left-8 padding-right-0" >
								<input type="text" class="form-control" maxlength="100" id="realname" name="realname">
							</div>
						</div>
						
						<div class=" col-lg-4 col-sm-6 col-xs-12  padding-left-0 padding-right-0 margin-bottom-10 form-group" >
							<label  class="col-lg-3 col-sm-3 col-xs-3 text-right padding-left-0 padding-right-0">
								<div class="font-size-12 line-height-18">登录账号</div>
								<div class="font-size-9 line-height-18">Login Account</div>
							</label>
							<div class="padding-left-8 padding-right-0 input-group" >
								<input type="text" class="form-control"  name="username" maxlength="30" id="username" onchange="onUsernameChanged();"/>
								<input type="hidden" class="form-control" name="drzhid" id="drzhid" />
								<span class="input-group-btn">
									<button type="button" onclick="openAccountSelect();" class="btn btn-primary">
										<i class="icon-search" ></i>
									</button>
								</span>
							</div>
						</div>
					
					    
					 <div class="clearfix"></div>
						<div class=" col-lg-4 col-sm-6 col-xs-12  padding-left-0 padding-right-0 margin-bottom-10 form-group" >
							<label class="col-lg-3 col-sm-3 col-xs-3 text-right padding-left-0 padding-right-0">
								<div class="font-size-12 line-height-18">固定电话</div>
								<div class="font-size-9 line-height-18">Telephone</div>
							</label>
						    <div class="col-lg-9 col-sm-9 col-xs-9 padding-left-8 padding-right-0" >
								<input type="text" class="form-control " maxlength="20" id="phone" name="phone">
							</div>
						</div>
						
						<div class=" col-lg-4 col-sm-6 col-xs-12  padding-left-0 padding-right-0 margin-bottom-10 form-group" >
							<label class="col-lg-3 col-sm-3 col-xs-3 text-right padding-left-0 padding-right-0">
								<div class="font-size-12 line-height-18">手机号</div>
								<div class="font-size-9 line-height-18">Mobile Phone</div>
							</label>
						    <div class="col-lg-9 col-sm-9 col-xs-9 padding-left-8 padding-right-0" >
								<input type="text" class="form-control " maxlength="20" id="cellphone" name="cellphone">
							</div>
						</div>
					
						<div class=" col-lg-4 col-sm-6 col-xs-12  padding-left-0 padding-right-0 margin-bottom-10" >
							<label class="col-lg-3 col-sm-3 col-xs-3 text-right padding-left-0 padding-right-0">
								<div class="font-size-12 line-height-18">
									<span style="color: red">*</span>性别
								</div>
								<div class="font-size-9 line-height-18">Sex</div>
							</label>
							<div class='col-lg-9 col-sm-9 col-xs-9 padding-left-8 padding-right-0'>
								<div class="col-lg-8  padding-left-8 padding-right-0 form-group">
									<label style="margin-right: 20px;font-weight: normal"><input name="sex" style="vertical-align: middle;margin-top: -4px;margin-right: 3px;" type="radio" value="1" checked/>男</label> 
									<label style="font-weight: normal"><input name="sex" style="vertical-align: middle;margin-top: -4px;margin-right: 3px;" type="radio" value="2" />女</label> 
								</div>
							</div>
						</div>
		
						<div class="clearfix"></div>
						<div class=" col-lg-4 col-sm-6 col-xs-12  padding-left-0 padding-right-0 margin-bottom-10 form-group" >
							<label class="col-lg-3 col-sm-3 col-xs-3 text-right padding-left-0 padding-right-0">
								<div class="font-size-12 line-height-18">电子邮箱</div>
								<div class="font-size-9 line-height-18">E-mail</div>
							</label>
						    <div class="col-lg-9 col-sm-9 col-xs-9 padding-left-8 padding-right-0" >
								<input type="text" class="form-control " maxlength="20" id="email" name="email">
							</div>
						</div>
						<div class=" col-lg-4 col-sm-6 col-xs-12  padding-left-0 padding-right-0 margin-bottom-10" >
							<label class="col-lg-3 col-sm-3 col-xs-3 text-right padding-left-0 padding-right-0">
								<div class="font-size-12 line-height-18">
									电子签名
								</div>
								<div class="font-size-9 line-height-18">Electronic Signature</div>
							</label>
							<div class='col-lg-9 col-sm-9 col-xs-9 padding-left-8 padding-right-0'>
								<input id="dzqm" name="myfile" type="file" data-show-caption="true" data-min-file-count="1">  
							</div>
						</div>
					
						<div class="col-lg-12 line5 padding-top-0 padding-right-0  padding-left-0">
					
							<div  class="col-lg-8  padding-top-10 padding-right-0" >
							
							<!-----标签导航start---->
							<ul class="nav nav-tabs" role="tablist" id="tablist">
								<li  class="active">
									<a href="#FunctionalRoleList" data-toggle="tab">功能角色 Functional Role</a>
								</li>
								<li >
									<a  href="#ModelRoleList" data-toggle="tab">机型角色 Model Role</a>
								</li>
								<li >
									<a  href="#WarehouseRoleList" data-toggle="tab">库房角色 Warehouse Role</a>
								</li>
							</ul>
							
							<div class="tab-content" >
								<div class="tab-pane fade in active" id="FunctionalRoleList">
									<div class="col-lg-12 padding-right-0" >
										<label class="col-xs-1 text-left padding-left-0 padding-right-0 ">
											<div class="font-size-12 line-height-18">选择角色</div>
											<div class="font-size-9 line-height-18">Choice Role</div>
										</label>
										<div class=" col-xs-11 " >
										      <select multiple="true" size="10" name="duallistbox_demo2" id="duallistbox_demo2"  class="demo2" >
										      
										      </select>
									    </div>
									</div>
								</div>
				
							<div class="tab-pane fade" id="ModelRoleList">
								<div class="col-lg-12 padding-right-0" >
									<label class="col-xs-1 text-left padding-left-0 padding-right-0 ">
										<div class="font-size-12 line-height-18">选择角色</div>
										<div class="font-size-9 line-height-18">Choice Role</div>
									</label>
									<div class=" col-xs-11 " >
							     	<select multiple="true" size="10" name="duallistbox_demo3" id="duallistbox_demo3" class="demo2">
							    	
						    	    </select>
							      </div>
								</div>
							</div>
							
							<div class="tab-pane fade" id="WarehouseRoleList">
										<div class="col-lg-12 padding-right-0" >
										<label class="col-xs-1 text-left padding-left-0 padding-right-0 ">
											<div class="font-size-12 line-height-18">选择角色</div>
											<div class="font-size-9 line-height-18">Choice Role</div>
										</label>
										<div class=" col-xs-11 " >
								        <select multiple="true" size="10" name="duallistbox_demo4" id="duallistbox_demo4" class="demo2">
									      
									    </select>
								      </div>
								</div>
							</div>
						</div>
	  				</div>		
	  				
					<div class=" col-lg-4 col-sm-4 col-xs-12  padding-right-0 padding-top-10 padding-left-10" >
						<label class="col-xs-4 col-sm-4 col-xs-4 text-right padding-left-0 padding-right-0">
							<div class="font-size-12 line-height-18">
								<span style="color: red">*</span>组织机构
							</div>
							<div class="font-size-9 line-height-18">Organization</div>
						</label>
							 <div class="col-xs-8 col-sm-8 col-xs-8 padding-left-8 padding-right-0" >
								<select id="jgdm" name="jgdm"  class="form-control" onchange="initRoleSelect();">
									<c:forEach items="${accessDepartments}" var="type">
										<option value="${type.id}" <c:if test="${user.jgdm eq type.id }">selected='selected'</c:if>>${erayFns:escapeStr(type.dprtname)}</option>
									</c:forEach>
								</select>
							</div>
							
							<div class="clearfix"></div>
							
							<label class="col-xs-4 text-right padding-left-0 padding-right-0 padding-top-10 pull-left">
								<div  class="font-size-12 line-height-18">部门机构</div>
								<div class="font-size-8 line-height-18">Institutional</div>
							</label>
								<div id="tab_trade" class="tab-pane active col-xs-8" style="padding:10px;  height: 374px! important;overflow-y : auto;">
									<div class="zTreeDemoBackground">
										<ul id="treeDemo" class="ztree" style=" height:355px;"></ul>
									</div>
								</div>
					</div>
					
					<div class="clearfix"></div>
		
				</div>
			</form>
			<div class="clearfix"></div>
		    <div class="text-right">
		    
                 <button class="btn btn-primary padding-top-1 padding-bottom-1" onclick="javascript:save()">
                  	<div class="font-size-12">保存</div>
					<div class="font-size-9">Save</div>
				</button>
				
               	<button class="btn btn-primary padding-top-1 padding-bottom-1" onclick="back()">
               		<div class="font-size-12">返回</div>
					<div class="font-size-9">Back</div>
				</button>
            </div>
            
			<div class="clearfix"></div>
			
			</div>
		</div>
	</div>
<%@ include file="/WEB-INF/views/open_win/account_select.jsp"%>
<script type="text/javascript" src="${ctx }/static/js/thjw/sys/add_user.js"></script>
</body>
</html>