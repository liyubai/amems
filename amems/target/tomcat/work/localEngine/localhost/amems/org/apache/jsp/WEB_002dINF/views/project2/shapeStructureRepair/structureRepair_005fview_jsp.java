package org.apache.jsp.WEB_002dINF.views.project2.shapeStructureRepair;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.sql.*;

public final class structureRepair_005fview_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

static private org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_0;

static {
  _jspx_fnmap_0= org.apache.jasper.runtime.ProtectedFunctionMapper.getMapForFunction("erayFns:escapeStr", com.eray.common.jstl.StringUtils.class, "escapeStr", new Class[] {java.lang.String.class});
}

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(3);
    _jspx_dependants.add("/WEB-INF/views/common_new.jsp");
    _jspx_dependants.add("/WEB-INF/views/alert.jsp");
    _jspx_dependants.add("/WEB-INF/tld/erayFns.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.release();
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			"", true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\r\n");
      out.write("<title>外形缺损</title>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/static/lib/bootstrap-tagsinput/bootstrap-tagsinput.js\"></script>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/static/lib/bootstrap-tagsinput/bootstrap-tagsinput.css\" type=\"text/css\">\r\n");
      if (_jspx_meth_c_005fset_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("//预警颜色码\r\n");
      out.write("var warningColor = {\r\n");
      out.write("\tlevel1:\"#F7630C\",//橙色\r\n");
      out.write("\tlevel2:\"#FFB900\",//黄色\r\n");
      out.write("\tlevel3:\"#ececec\"//灰色\r\n");
      out.write("}\r\n");
      out.write(" \r\n");
      out.write("var basePath = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("';\r\n");
      out.write("var userId = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.user.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("';\r\n");
      out.write("var userBmdm = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.user.bmdm}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("';\r\n");
      out.write("var userName = '';\r\n");
      out.write("var displayName = '';\r\n");
      out.write("var userJgdm = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.user.jgdm}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("';\r\n");
      out.write("var userType = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.user.userType}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("';\r\n");
      out.write("var menuCode = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${menuCodeHigh}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("';\r\n");
      out.write("var deptInfo = '';\r\n");
      out.write("\r\n");
      out.write("var buttonPermissions ;\r\n");
      out.write("var accessDepartment ;\r\n");
      out.write("var currentUser ;\r\n");
      out.write("var userStoreList ;\r\n");
      out.write("var userMenuListJson;\r\n");
      out.write("var userACRegList;//用户具有的飞机注册号权限   DPRTCODE,FJJX,FJZCH\r\n");
      out.write("var userACReg135145List;//用户具有的飞机注册号权限   DPRTCODE,FJJX,FJZCH\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("$.ajax({\r\n");
      out.write("   async: false,\r\n");
      out.write("   url:basePath+\"/common/getSessions\",\r\n");
      out.write("   type: \"post\",\r\n");
      out.write("   success:function(data){\r\n");
      out.write("\t  if(data && data.dicts){\r\n");
      out.write("\t\t  buttonPermissions = data.dicts.btnPriCodeListJson?data.dicts.btnPriCodeListJson:[];\r\n");
      out.write("\t\t  accessDepartment = data.dicts.accessDepartmentJson?data.dicts.accessDepartmentJson:[];\r\n");
      out.write("\t\t  currentUser = data.dicts.userJson?data.dicts.userJson:{};\r\n");
      out.write("\t\t  userStoreList = data.dicts.userStoreList?data.dicts.userStoreList:[];\r\n");
      out.write("\t\t  userMenuListJson = data.dicts.userMenuListJson?data.dicts.userMenuListJson:[];\r\n");
      out.write("\t\t  userACRegList = data.dicts.userACRegListJson?data.dicts.userACRegListJson:[];\r\n");
      out.write("\t\t  userACReg135145List = data.dicts.userACReg135145ListJson?data.dicts.userACReg135145ListJson:[];\r\n");
      out.write("\t\t  deptInfo = data.dicts.deptInfoJson?data.dicts.deptInfoJson:[];\r\n");
      out.write("\t\t  userName = currentUser.username;\r\n");
      out.write("\t\t  displayName = currentUser.displayName;\r\n");
      out.write("\t  }\r\n");
      out.write("   }\r\n");
      out.write("}); \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("var userACTypeList = [];//用户具有的机型权限   DPRTCODE,FJJX\r\n");
      out.write("if(userACRegList && userACRegList.length > 0){\r\n");
      out.write("\t$.each(userACRegList, function(index, row){\r\n");
      out.write("\t\tvar flag = true;\r\n");
      out.write("\t\t$.each(userACTypeList, function(index1, row1){\r\n");
      out.write("\t\t\tif(row1.DPRTCODE == row.DPRTCODE && row1.FJJX == row.FJJX){\r\n");
      out.write("\t\t\t\tflag = false;\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\tif(flag){\r\n");
      out.write("\t\t\tuserACTypeList.push({DPRTCODE:row.DPRTCODE, FJJX:row.FJJX});\r\n");
      out.write("\t\t}\r\n");
      out.write("\t});\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("var acAndTypeUtil = {\r\n");
      out.write("\t//param:{DPRTCODE:?,FJJX:?}机构必填\r\n");
      out.write("\tgetACRegList:function(param){\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tvar result = [];\r\n");
      out.write("\t\t$.each(userACRegList, function(index, row){\r\n");
      out.write("\t\t\t//传入了机构，和机型\r\n");
      out.write("\t\t\tif(param.FJJX && param.DPRTCODE && (param.FJJX == row.FJJX)\r\n");
      out.write("\t\t\t\t\t && (param.DPRTCODE == row.DPRTCODE)  && row.FJZCH != \"-\" ){\r\n");
      out.write("\t\t\t\tresult.push(row);\r\n");
      out.write("\t\t\t}//只传入了机构\r\n");
      out.write("\t\t\telse if(param.DPRTCODE && !param.FJJX && (param.DPRTCODE == row.DPRTCODE) && row.FJZCH != \"-\" ){\r\n");
      out.write("\t\t\t\tresult.push(row);\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\tresult.sort(function(a, b){\r\n");
      out.write("\t\t\treturn (a.FJZCH < b.FJZCH) ? -1 : 1;\r\n");
      out.write("\t\t})\r\n");
      out.write("\t\treturn result;\r\n");
      out.write("\t\t\r\n");
      out.write("\t} ,\r\n");
      out.write("\t//param:{DPRTCODE:?,FJJX:?}机构必填 135,145 飞机注册号合集\r\n");
      out.write("\tgetACReg135145List:function(param){\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tvar result = [];\r\n");
      out.write("\t\t$.each(userACReg135145List, function(index, row){\r\n");
      out.write("\t\t\t//传入了机构，和机型\r\n");
      out.write("\t\t\tif(param.FJJX && param.DPRTCODE && (param.FJJX == row.FJJX)\r\n");
      out.write("\t\t\t\t\t && (param.DPRTCODE == row.DPRTCODE)  && row.FJZCH != \"-\" ){\r\n");
      out.write("\t\t\t\tresult.push(row);\r\n");
      out.write("\t\t\t}//只传入了机构\r\n");
      out.write("\t\t\telse if(param.DPRTCODE && !param.FJJX && (param.DPRTCODE == row.DPRTCODE) && row.FJZCH != \"-\" ){\r\n");
      out.write("\t\t\t\tresult.push(row);\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\tresult.sort(function(a, b){\r\n");
      out.write("\t\t\treturn (a.FJZCH < b.FJZCH) ? -1 : 1;\r\n");
      out.write("\t\t})\r\n");
      out.write("\t\treturn result;\r\n");
      out.write("\t\t\r\n");
      out.write("\t} \r\n");
      out.write("\t//param:{DPRTCODE:?}机构必填\r\n");
      out.write("\t,getACTypeList:function(param){\r\n");
      out.write("\t\tvar result = [];\r\n");
      out.write("\t\t$.each(userACTypeList, function(index, row){\r\n");
      out.write("\t\t\t//只传入了机构\r\n");
      out.write("\t\t\tif(param.DPRTCODE && (param.DPRTCODE == row.DPRTCODE)){\r\n");
      out.write("\t\t\t\tresult.push(row);\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\tresult.sort(function(a, b){\r\n");
      out.write("\t\t\treturn (a.FJJX < b.FJJX) ? -1 : 1;\r\n");
      out.write("\t\t})\r\n");
      out.write("\t\treturn result;\r\n");
      out.write("\t}\r\n");
      out.write("};\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/static/js/ms/privilege.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/static/js/thjw/common/ajax.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/static/js/thjw/common/pagination.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/static/js/thjw/common/NavigationBar.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t\r\n");
      out.write("\tvar DicAndEnumUtil = {\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tdata:{}\r\n");
      out.write("\t\t\t,setData:function(returnData){\r\n");
      out.write("\t\t\t\tthis.data = returnData;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t,loadDicAndEnums:function (){\r\n");
      out.write("\t\t\t\tvar util = this;\r\n");
      out.write("\t\t\t\tAjaxUtil.ajax({\r\n");
      out.write("\t\t\t\t\t   async: false,\r\n");
      out.write("\t\t\t\t\t   url:basePath+\"/common/loadDicAndEnums\",\r\n");
      out.write("\t\t\t\t\t   type: \"post\",\r\n");
      out.write("\t\t\t\t\t   success:function(data){\r\n");
      out.write("\t\t\t\t\t\t  util.setData(data);\r\n");
      out.write("\t\t\t\t      },\r\n");
      out.write("\t\t\t\t      error:function(data){\r\n");
      out.write("\t\t\t\t    \t     alert(\"system error.\");\r\n");
      out.write("\t\t\t\t      }\r\n");
      out.write("\t\t\t    }); \r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t,getEnumName:function(enumKey,enumId){\r\n");
      out.write("\t\t\t\tvar enumname = ''\r\n");
      out.write("\t\t\t\tvar enumMap = this.data.enumMap!=undefined?this.data.enumMap:{};\r\n");
      out.write("\t\t\t\tvar items = enumMap[enumKey]!=undefined?enumMap[enumKey]:[];\r\n");
      out.write("\t\t\t\tvar len = items.length;\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tfor(i=0;i<len;i++){\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\tif(items[i].id == enumId ){\r\n");
      out.write("\t\t\t\t\t\tenumname = items[i].name;\r\n");
      out.write("\t\t\t\t\t\tbreak;\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\treturn enumname ; \r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t,getEnum:function(enumKey){\r\n");
      out.write("\t\t\t\tvar enumMap = this.data.enumMap!=undefined?this.data.enumMap:{};\r\n");
      out.write("\t\t\t\tvar items = enumMap[enumKey]!=undefined?enumMap[enumKey]:[];\r\n");
      out.write("\t\t\t\treturn items; \r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t   \r\n");
      out.write("\t\t\t,registerEnum:function(enumKey,elementId){\r\n");
      out.write("\t\t\t\t if(this.data.enumMap!=undefined ){\r\n");
      out.write("\t\t\t\t\t var enumMap = this.data.enumMap!=undefined?this.data.enumMap:{};\r\n");
      out.write("\t\t\t\t\t var items = enumMap[enumKey]!=undefined?enumMap[enumKey]:[];\r\n");
      out.write("\t\t\t\t\t var len = items.length;\r\n");
      out.write("\t\t\t\t\t for(i=0;i<len;i++){\r\n");
      out.write("\t\t\t\t\t\t$('#'+elementId).append(\"<option value='\"+items[i].id+\"' >\"+StringUtil.escapeStr(items[i].name)+\"</option>\")\r\n");
      out.write("\t\t\t\t\t }\r\n");
      out.write("\t\t\t\t }\r\n");
      out.write("\t\t\t\t \r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t//获取数据字典项\r\n");
      out.write("\t\t\t,getDict:function(dicId, dprtcode){\r\n");
      out.write("\t\t\t\tvar dicMap = this.data.dicMap!=undefined?this.data.dicMap:{};\r\n");
      out.write("\t\t\t\tif(dicMap[dprtcode]){\r\n");
      out.write("\t\t\t\t\tif(dicMap[dprtcode][dicId]){\r\n");
      out.write("\t\t\t\t\t\treturn dicMap[dprtcode][dicId];\r\n");
      out.write("\t\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t\tif(dicMap[\"-1\"]){\r\n");
      out.write("\t\t\t\t\t\t\tif(dicMap[\"-1\"][dicId]){\r\n");
      out.write("\t\t\t\t\t\t\t\treturn dicMap[\"-1\"][dicId];\r\n");
      out.write("\t\t\t\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t\t\t\treturn [];\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\treturn [];\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}else if(dicMap[\"-1\"]){\r\n");
      out.write("\t\t\t\t\tif(dicMap[\"-1\"][dicId]){\r\n");
      out.write("\t\t\t\t\t\treturn dicMap[\"-1\"][dicId];\r\n");
      out.write("\t\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t\treturn [];\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\treturn [];\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t//TODO 带处理 \r\n");
      out.write("\t\t\t,registerDic:function(dicId,elementId,dprtcode){ \r\n");
      out.write("\r\n");
      out.write("\t\t\t\t /* if(this.data.dicMap!=undefined ){\r\n");
      out.write("\t\t\t\t\t var dicMap = this.data.dicMap!=undefined?this.data.dicMap:{};\r\n");
      out.write("\t\t\t\t\t var items = dicMap[dicId]!=undefined?dicMap[dicId]:[];\r\n");
      out.write("\t\t\t\t\t var len = items.length;\r\n");
      out.write("\t\t\t\t\t \r\n");
      out.write("\t\t\t\t\t for(i=0;i<len;i++){\r\n");
      out.write("\t\t\t\t\t\t $('#'+elementId).append(\"<option value='\"+StringUtil.escapeStr(items[i].id)+\"' >\"+StringUtil.escapeStr(items[i].name)+\"</option>\")\r\n");
      out.write("\t\t\t\t\t }\r\n");
      out.write("\t\t\t\t } */\r\n");
      out.write("\t\t\t\t if(typeof dprtcode == undefined || dprtcode==null || dprtcode == ''){\r\n");
      out.write("\t\t\t\t\tdprtcode = userJgdm;\r\n");
      out.write("\t\t \t\t}\r\n");
      out.write("\t\t\t\t if(this.data.dicMap!=undefined ){\r\n");
      out.write("\t\t\t\t\t var dicMap = this.data.dicMap!=undefined?this.data.dicMap:{};\r\n");
      out.write("\t\t\t\t\t var items = this.getDict(dicId, dprtcode);\r\n");
      out.write("\t\t\t\t\t var len = items.length;\r\n");
      out.write("\t\t\t\t\t \r\n");
      out.write("\t\t\t\t\t for(i=0;i<len;i++){\r\n");
      out.write("\t\t\t\t\t\t $('#'+elementId).append(\"<option value='\"+StringUtil.escapeStr(items[i].id)+\"' >\"+StringUtil.escapeStr(items[i].name)+\"</option>\")\r\n");
      out.write("\t\t\t\t\t }\r\n");
      out.write("\t\t\t\t }\r\n");
      out.write("\t\t\t\t \r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t//TODO 带处理 \r\n");
      out.write("\t\t\t,getDicItems:function(dicId,dprtcode){ \t\t\t\t\r\n");
      out.write("\t\t\t\t /* if(this.data.dicMap!=undefined ){\r\n");
      out.write("\t\t\t\t\t var dicMap = this.data.dicMap!=undefined?this.data.dicMap:{};\r\n");
      out.write("\t\t\t\t\t var items = dicMap[dicId]!=undefined?dicMap[dicId]:[];\r\n");
      out.write("\t\t\t\t\t return items;\r\n");
      out.write("\t\t\t\t } */\r\n");
      out.write("\t\t\t\t \r\n");
      out.write("\t\t\t\t if(typeof dprtcode == undefined || dprtcode==null || dprtcode == ''){\r\n");
      out.write("\t\t\t\t\t\tconsole.info('未指定机构，采用默认机构');\r\n");
      out.write("\t\t\t\t\t\tdprtcode = userJgdm;\r\n");
      out.write("\t\t\t\t }\r\n");
      out.write("\t\t\t\t if(this.data.dicMap!=undefined ){\r\n");
      out.write("\t\t\t\t\t var dicMap = this.data.dicMap!=undefined?this.data.dicMap:{};\r\n");
      out.write("\t\t\t\t\t var items = this.getDict(dicId, dprtcode);\r\n");
      out.write("\t\t\t\t\t return items;\r\n");
      out.write("\t\t\t\t } \r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t//TODO 带处理 \r\n");
      out.write("\t\t\t,registerDicBySelect:function(dicId,element,dprtcode){ \r\n");
      out.write("\t\t\t\t /* if(this.data.dicMap!=undefined ){\r\n");
      out.write("\t\t\t\t\t var dicMap = this.data.dicMap!=undefined?this.data.dicMap:{};\r\n");
      out.write("\t\t\t\t\t var items = dicMap[dicId]!=undefined?dicMap[dicId]:[];\r\n");
      out.write("\t\t\t\t\t var len = items.length;\r\n");
      out.write("\t\t\t\t\t \r\n");
      out.write("\t\t\t\t\t for(i=0;i<len;i++){\r\n");
      out.write("\t\t\t\t\t\t \r\n");
      out.write("\t\t\t\t\t\t$(element).append(\"<option value='\"+StringUtil.escapeStr(items[i].id)+\"' >\"+StringUtil.escapeStr(items[i].name)+\"</option>\")\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t }\r\n");
      out.write("\t\t\t\t } */\r\n");
      out.write("\t\t\t\tif(this.data.dicMap!=undefined ){\r\n");
      out.write("\t\t\t\t\tif(typeof dprtcode == undefined || dprtcode==null || dprtcode == ''){\r\n");
      out.write("\t\t\t\t\t\tconsole.info('未指定机构，采用默认机构');\r\n");
      out.write("\t\t\t\t\t\tdprtcode = userJgdm;\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t var dicMap = this.data.dicMap!=undefined?this.data.dicMap:{};\r\n");
      out.write("\t\t\t\t\t var items = this.getDict(dicId, dprtcode);\r\n");
      out.write("\t\t\t\t\t var len = items.length;\r\n");
      out.write("\t\t\t\t\t \r\n");
      out.write("\t\t\t\t\t for(i=0;i<len;i++){\r\n");
      out.write("\t\t\t\t\t\t \r\n");
      out.write("\t\t\t\t\t\t$(element).append(\"<option value='\"+StringUtil.escapeStr(items[i].id)+\"' >\"+StringUtil.escapeStr(items[i].name)+\"</option>\")\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t }\r\n");
      out.write("\t\t\t\t }\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\t//获取字典项描述，适用于数据字典在页面中title方式显示字典描述\r\n");
      out.write("\t\t\tgetDicItemDesc : function(dicId, value, dprtcode) {\r\n");
      out.write("\t\t\t\tif (typeof dprtcode == undefined || dprtcode == null\r\n");
      out.write("\t\t\t\t\t\t|| dprtcode == '') {\r\n");
      out.write("\t\t\t\t\tconsole.info('未指定机构，采用默认机构');\r\n");
      out.write("\t\t\t\t\tdprtcode = userJgdm;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\tvar items = this.getDict(dicId, dprtcode);\r\n");
      out.write("\t\t\t\tvar len = items.length;\r\n");
      out.write("\t\t\t\tfor (i = 0; i < len; i++) {\r\n");
      out.write("\t\t\t\t\tif(items[i].id == value){\r\n");
      out.write("\t\t\t\t\t\tvar desc = items[i].desc;\r\n");
      out.write("\t\t\t\t\t\tif(typeof dprtcode == undefined || dprtcode == null\r\n");
      out.write("\t\t\t\t\t\t\t\t|| dprtcode == ''){\r\n");
      out.write("\t\t\t\t\t\t\treturn value;\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\treturn desc;\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\treturn value;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t};\r\n");
      out.write("\r\n");
      out.write("\tDicAndEnumUtil.loadDicAndEnums();\r\n");
      out.write("\r\n");
      out.write("\t/**\r\n");
      out.write("\t * 访问机构代码\r\n");
      out.write("\t * @param dprtcode\t机构代码\r\n");
      out.write("\t * @return dpartName 机构名称\r\n");
      out.write("\t * @return infoType 组织机构信息类别\r\n");
      out.write("\t */\r\n");
      out.write("\tvar AccessDepartmentUtil = {\r\n");
      out.write("\t\tgetDpartName : function(dprtcode) {\r\n");
      out.write("\t\t\tvar dpartName = '';\r\n");
      out.write("\t\t\tif (null == accessDepartment) {\r\n");
      out.write("\t\t\t\treturn dpartName;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t$.each(accessDepartment, function(i, obj) {\r\n");
      out.write("\t\t\t\tif (dprtcode == obj.id) {\r\n");
      out.write("\t\t\t\t\tdpartName = obj.dprtname;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\treturn dpartName;\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\tgetDpartinfoType : function(dprtcode) {\r\n");
      out.write("\t\t\tvar infoType = '';\r\n");
      out.write("\t\t\tif (null == accessDepartment) {\r\n");
      out.write("\t\t\t\treturn infoType;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t$.each(accessDepartment, function(i, obj) {\r\n");
      out.write("\t\t\t\tif (dprtcode == obj.id) {\r\n");
      out.write("\t\t\t\t\tvar dprtInfo = obj.deptInfo;\r\n");
      out.write("\t\t\t\t\tif(dprtInfo != null && dprtInfo.deptType != null){\r\n");
      out.write("\t\t\t\t\t\tinfoType = dprtInfo.deptType;\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\treturn infoType;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t};\r\n");
      out.write("\r\n");
      out.write("\t/**\r\n");
      out.write("\t * 标记关键字\r\n");
      out.write("\t * @param keyword\t关键字的值\r\n");
      out.write("\t * @param columns\t需要被标记的列（数组）\r\n");
      out.write("\t */\r\n");
      out.write("\tfunction signByKeyword(keyword, columns, path) {\r\n");
      out.write("\r\n");
      out.write("\t\tvar defaultPath = \"tbody tr td\";\r\n");
      out.write("\t\tkeyword = $.trim(keyword);\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tkeyword\t&& $.each(columns, function(i, obj) {\r\n");
      out.write("\t\t\t$((path || defaultPath) + \":nth-child(\" + obj + \")\").each(function() {\r\n");
      out.write("\t\t\t\tvar content = $(this);\r\n");
      out.write("\t\t\t\tvar value = content.text();\r\n");
      out.write("\t\t\t\tif (content.find(\"[name='keyword']\").length >= 1) {\r\n");
      out.write("\t\t\t\t\tcontent = content.find(\"[name='keyword']\");\r\n");
      out.write("\t\t\t\t\tvalue = content.text();\r\n");
      out.write("\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t// 当td里面包含的不直接是文本内容，而是html代码嵌套，则取最里面一层的内容作为文本内容\r\n");
      out.write("\t\t\t\t\twhile (content.children().length >= 1) {\r\n");
      out.write("\t\t\t\t\t\tcontent = content.children().first();\r\n");
      out.write("\t\t\t\t\t\tvalue = content.text();\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\tvar startIndex = value.toUpperCase().indexOf(keyword.toUpperCase());\r\n");
      out.write("\t\t\t\tif (startIndex != -1) {\r\n");
      out.write("\t\t\t\t\tcontent.html([StringUtil.escapeStr(value.substr(0,startIndex)),\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\"<font style='color:red'>\",\r\n");
      out.write("\t\t\t\t\t\t\t\t\tStringUtil.escapeStr(value.substr(startIndex,keyword.length)),\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\"</font>\",\r\n");
      out.write("\t\t\t\t\t\t\t\t\tStringUtil.escapeStr(value.substr(parseInt(startIndex)+ parseInt(keyword.length)))]\r\n");
      out.write("\t\t\t\t\t\t\t\t\t.join(\"\"));\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t});\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\t/**\r\n");
      out.write("\t * 格式化工具\r\n");
      out.write("\t */\r\n");
      out.write("\tvar FormatUtil = {\r\n");
      out.write("\t\t/**\r\n");
      out.write("\t\t * 替换null或undefined，必须在生成html之后调用\r\n");
      out.write("\t\t * 默认无参为table布局，如果是非table布局，则手动输入选择器。\r\n");
      out.write("\t\t * 例如：FormatUtil.removeNullOrUndefined(\"#id input\")，则会替换该id下的所有输入框\r\n");
      out.write("\t\t */\r\n");
      out.write("\t\tremoveNullOrUndefined : function(path) {\r\n");
      out.write("\t\t\tpath = path || \"tbody tr td\";\r\n");
      out.write("\t\t\t$(path).each(\r\n");
      out.write("\t\t\t\t\tfunction() {\r\n");
      out.write("\t\t\t\t\t\tif ($(this).text() == \"null\"\r\n");
      out.write("\t\t\t\t\t\t\t\t|| $(this).text() == \"undefined\") {\r\n");
      out.write("\t\t\t\t\t\t\t$(this).text(\"\");\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\tif ($(this).attr(\"title\") == \"null\"\r\n");
      out.write("\t\t\t\t\t\t\t\t|| $(this).attr(\"title\") == \"undefined\") {\r\n");
      out.write("\t\t\t\t\t\t\t$(this).attr(\"title\", \"\");\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\t\t}\r\n");
      out.write("\t};\r\n");
      out.write("\r\n");
      out.write("\t/**\r\n");
      out.write("\t * 格式化字符串工具\r\n");
      out.write("\t */\r\n");
      out.write("\tvar StringUtil = {\r\n");
      out.write("\t\tsubString : function(str, length) {\r\n");
      out.write("\t\t\tif (typeof (length) == \"undefined\") {\r\n");
      out.write("\t\t\t\tlength = 20;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tif (str == null || str == '' || str == \"undefined\") {\r\n");
      out.write("\t\t\t\treturn '';\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tif (str.length > length) {\r\n");
      out.write("\t\t\t\tstr = str.substring(0, length) + \"...\";\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\treturn str;\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\ttitle : function(str, length) {\r\n");
      out.write("\t\t\tif (typeof (length) == \"undefined\") {\r\n");
      out.write("\t\t\t\tlength = 20;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tif (str == null || str == '' || str == \"undefined\"\r\n");
      out.write("\t\t\t\t\t|| str.length <= length) {\r\n");
      out.write("\t\t\t\treturn '';\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\treturn str;\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\tescapeStr : function(str) {\r\n");
      out.write("\t\t\tif (typeof (str) == 'undefined' || str == undefined || str == null) {\r\n");
      out.write("\t\t\t\treturn \"\";\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tif (typeof (str) != 'string') {\r\n");
      out.write("\t\t\t\treturn str;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tstr = str.replaceAll(\"&\", \"&amp;\");\r\n");
      out.write("\t\t\tstr = str.replaceAll(\"<\", \"&lt;\");\r\n");
      out.write("\t\t\tstr = str.replaceAll(\">\", \"&gt;\");\r\n");
      out.write("\t\t\t//str = str.replaceAll(\" \", \"&nbsp;\");\r\n");
      out.write("\t\t\tstr = str.replaceAll(\"'\", \"&#39;\");\r\n");
      out.write("\t\t\tstr = str.replaceAll(\"\\\"\", \"&quot;\");\r\n");
      out.write("\t\t\t//str = str.replaceAll(\"\\n\", \"<br>\");\r\n");
      out.write("\t\t\treturn str;\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\t// 替换输入框、下拉框为文本\r\n");
      out.write("\t\treplaceAsText : function(selector) {\r\n");
      out.write("\t\t\t$(\"#\" + selector + \" input:visible\").each(function() {\r\n");
      out.write("\t\t\t\tvar content;\r\n");
      out.write("\t\t\t\tif (this.type == \"text\") {\r\n");
      out.write("\t\t\t\t\tcontent = $(this).val();\r\n");
      out.write("\t\t\t\t} else if (this.type == \"checkbox\") {\r\n");
      out.write("\t\t\t\t\tcontent = this.checked ? \"是\" : \"否\";\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\t$(this).parent().attr(\"title\", content);\r\n");
      out.write("\t\t\t\t$(this).parent().text(content);\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\t$(\"#\" + selector + \" select:visible\").each(function() {\r\n");
      out.write("\t\t\t\tvar content = $(this).find(\"option:selected\").text();\r\n");
      out.write("\t\t\t\t$(this).parent().attr(\"title\", content);\r\n");
      out.write("\t\t\t\t$(this).parent().text(content);\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\t$(\"#\" + selector + \" textarea\").each(function() {\r\n");
      out.write("\t\t\t\tvar content = $(this).val();\r\n");
      out.write("\t\t\t\t$(this).parent().attr(\"title\", content);\r\n");
      out.write("\t\t\t\t$(this).parent().text(content);\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t}\r\n");
      out.write("\t};\r\n");
      out.write("\r\n");
      out.write("\t/**\r\n");
      out.write("\t * 全选反选工具,selectAllId全选id,selectNodeId列表id\r\n");
      out.write("\t */\r\n");
      out.write("\tvar SelectUtil = {\r\n");
      out.write("\t\tselectAll : function(selectAllId, selectNodeId) {//全选或不选\r\n");
      out.write("\t\t\tvar this_ = this;\r\n");
      out.write("\t\t\t//如果选中全选\r\n");
      out.write("\t\t\tif ($(\"#\" + selectAllId).is(\":checked\")) {\r\n");
      out.write("\t\t\t\t$(\"#\" + selectNodeId).find(\"tr input[type='checkbox']\").each(\r\n");
      out.write("\t\t\t\t\t\tfunction() {\r\n");
      out.write("\t\t\t\t\t\t\t$(this).attr(\"checked\", 'true');//点击全选\r\n");
      out.write("\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t} else {\r\n");
      out.write("\t\t\t\t$(\"#\" + selectNodeId).find(\"tr input[type='checkbox']:checked\")\r\n");
      out.write("\t\t\t\t\t\t.each(function() {\r\n");
      out.write("\t\t\t\t\t\t\t$(this).removeAttr(\"checked\");//点击取消全选\r\n");
      out.write("\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\tselectNode : function(selectAllId, selectNodeId) {//单选后是否全选\r\n");
      out.write("\t\t\tvar this_ = this;\r\n");
      out.write("\t\t\tvar checkNum = $(\"#\" + selectNodeId).find(\r\n");
      out.write("\t\t\t\t\t\"tr input[type='checkbox']:checked\").length;//选中个数\r\n");
      out.write("\t\t\tvar totalNum = $(\"#\" + selectNodeId).find(\"tr\").length;//总数\r\n");
      out.write("\t\t\tif (checkNum == totalNum && totalNum != 0) {\r\n");
      out.write("\t\t\t\t$(\"#\" + selectAllId).attr(\"checked\", 'true');//选中全选\r\n");
      out.write("\t\t\t} else {\r\n");
      out.write("\t\t\t\t$(\"#\" + selectAllId).removeAttr(\"checked\");//取消全选\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\tcheckRow : function(e, selectAllId, selectNodeId) {//选中一行\r\n");
      out.write("\t\t\tif ($(e).is(\":checked\")) {\r\n");
      out.write("\t\t\t\t$(e).removeAttr(\"checked\");\r\n");
      out.write("\t\t\t} else {\r\n");
      out.write("\t\t\t\t$(e).attr(\"checked\", \"true\");\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tthis.selectNode(selectAllId, selectNodeId);\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\trowonclick : function(id) {\r\n");
      out.write("\t\t\t$(\"#\" + id + \" tr\").click(\r\n");
      out.write("\t\t\t\t\tfunction(event) {\r\n");
      out.write("\t\t\t\t\t\t// 避免复选框重复选择\r\n");
      out.write("\t\t\t\t\t\tif ($(event.target).attr(\"type\") == \"checkbox\") {\r\n");
      out.write("\t\t\t\t\t\t\treturn;\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\tvar checked = $(this).find(\"input[type='checkbox']\")\r\n");
      out.write("\t\t\t\t\t\t\t\t.is(\":checked\");\r\n");
      out.write("\t\t\t\t\t\t$(this).find(\"input[type='checkbox']\").attr(\"checked\",\r\n");
      out.write("\t\t\t\t\t\t\t\t!checked);\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\tselectRadioRow : function(obj) {//选中一行radio\r\n");
      out.write("\t\t\t$(obj).find(\"input[type='radio']\").attr(\"checked\", true);\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\tclickRow : function(index, id, name) {//选中一行checkbox,id:tbody id,name:row name\r\n");
      out.write("\t\t\tvar $checkbox1 = $(\"#\" + id + \" :checkbox[name='\" + name + \"']:eq(\"\r\n");
      out.write("\t\t\t\t\t+ index + \")\");\r\n");
      out.write("\t\t\tvar $checkbox2 = $(\".sticky-col :checkbox[name='\" + name + \"']:eq(\"\r\n");
      out.write("\t\t\t\t\t+ index + \")\");\r\n");
      out.write("\t\t\tvar checked = $checkbox1.is(\":checked\");\r\n");
      out.write("\t\t\t$checkbox1.attr(\"checked\", !checked);\r\n");
      out.write("\t\t\t$checkbox2.attr(\"checked\", !checked);\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t/* 选择复选框 */\r\n");
      out.write("\t\tselectCheckbox : function(e,index,id,name,obj){\r\n");
      out.write("\t\t\te = e || window.event;  \r\n");
      out.write("\t\t    if(e.stopPropagation) { //W3C阻止冒泡方法  \r\n");
      out.write("\t\t        e.stopPropagation();  \r\n");
      out.write("\t\t    } else {  \r\n");
      out.write("\t\t        e.cancelBubble = true; //IE阻止冒泡方法  \r\n");
      out.write("\t\t    }\r\n");
      out.write("\t\t    var $checkbox1 = $(\"#\" + id + \" :checkbox[name='\" + name + \"']:eq(\"\r\n");
      out.write("\t \t\t\t\t+ index + \")\");\r\n");
      out.write("\t \t\tvar $checkbox2 = $(\".sticky-col :checkbox[name='\" + name + \"']:eq(\"\r\n");
      out.write("\t \t\t\t\t+ index + \")\");\r\n");
      out.write("\t\t    if(!$(obj).parents(\"table\").hasClass(\"sticky-col\")){\r\n");
      out.write("\t\t    \tvar checked = $checkbox1.is(\":checked\");\r\n");
      out.write("\t\t \t\t$checkbox1.attr(\"checked\", checked);\r\n");
      out.write("\t\t \t\t$checkbox2.attr(\"checked\", checked);\t\r\n");
      out.write("\t\t    }else{\r\n");
      out.write("\t\t    \tvar checked = $checkbox2.is(\":checked\");\r\n");
      out.write("\t\t \t\t$checkbox1.attr(\"checked\", checked);\r\n");
      out.write("\t\t \t\t$checkbox2.attr(\"checked\", checked);\r\n");
      out.write("\t\t    }\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\tperformSelectAll : function(selectNodeId) {//全选\r\n");
      out.write("\t\t\t$(\":checkbox\", $(\"#\" + selectNodeId)).attr(\"checked\", true);\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\tperformSelectClear : function(selectNodeId) {//清空选中\r\n");
      out.write("\t\t\t$(\":checkbox\", $(\"#\" + selectNodeId)).removeAttr(\"checked\");//点击取消全选\r\n");
      out.write("\t\t}\r\n");
      out.write("\t};\r\n");
      out.write("\r\n");
      out.write("\t/**\r\n");
      out.write("\t * 时间工具\r\n");
      out.write("\t * 使用方法： TimeUtil.operateTime(\"152.168\", \"0\", TimeUtil.Separator.DOT, TimeUtil.Operation.ADD);\r\n");
      out.write("\t * 后2个参数可为空，默认分隔符是“：”，默认操作是“+”，\r\n");
      out.write("\t */\r\n");
      out.write("\tvar TimeUtil = {\r\n");
      out.write("\t\tcompareDate : function(d1Str, d2Str) {\r\n");
      out.write("\t\t\treturn ((new Date(d1Str.replace(/-/g, \"\\/\"))) > (new Date(d2Str\r\n");
      out.write("\t\t\t\t\t.replace(/-/g, \"\\/\"))));\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\t//日期相减返回天数\r\n");
      out.write("\t\tdateMinus : function(d1Str, d2Str) {\r\n");
      out.write("\t\t\tvar d1date = new Date(d1Str.replace(/-/g, \"/\"));\r\n");
      out.write("\t\t\tvar d2date = new Date(d2Str.replace(/-/g, \"/\"));\r\n");
      out.write("\t\t\tvar days = d2date.getTime() - d1date.getTime();\r\n");
      out.write("\t\t\tvar day = parseInt(days / (1000 * 60 * 60 * 24));\r\n");
      out.write("\t\t\treturn day; \r\n");
      out.write("\t\t},\r\n");
      out.write("\t\t//获取当前数据库日期\r\n");
      out.write("\t\tgetCurrentDate : function(obj) {\r\n");
      out.write("\t\t\tAjaxUtil.ajax({\r\n");
      out.write("\t\t\t\turl : basePath + \"/common/sysdate?t=\" + new Date().getTime(),\r\n");
      out.write("\t\t\t\ttype : \"get\",\r\n");
      out.write("\t\t\t\tsuccess : function(data) {\r\n");
      out.write("\t\t\t\t\tif (data && data.sysdate) {\r\n");
      out.write("\t\t\t\t\t\tdata.sysdate = data.sysdate.substr(0, 10);\r\n");
      out.write("\t\t\t\t\t\tif (typeof (obj) == \"undefined\") {\r\n");
      out.write("\t\t\t\t\t\t\treturn;\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\tif (typeof (obj) == \"function\") {\r\n");
      out.write("\t\t\t\t\t\t\tobj(data.sysdate);\r\n");
      out.write("\t\t\t\t\t\t\treturn;\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\tif (typeof (obj) == \"string\") {\r\n");
      out.write("\t\t\t\t\t\t\t$(obj).val(data.sysdate);\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\t//获取当前数据库时间\r\n");
      out.write("\t\tgetCurrentTime : function(obj) {\r\n");
      out.write("\t\t\tAjaxUtil.ajax({\r\n");
      out.write("\t\t\t\turl : basePath + \"/common/sysdate?t=\" + new Date().getTime(),\r\n");
      out.write("\t\t\t\ttype : \"get\",\r\n");
      out.write("\t\t\t\tsuccess : function(data) {\r\n");
      out.write("\t\t\t\t\tif (data && data.sysdate) {\r\n");
      out.write("\t\t\t\t\t\tif (typeof (obj) == \"undefined\") {\r\n");
      out.write("\t\t\t\t\t\t\treturn;\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\tif (typeof (obj) == \"function\") {\r\n");
      out.write("\t\t\t\t\t\t\tobj(data.sysdate);\r\n");
      out.write("\t\t\t\t\t\t\treturn;\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\tif (typeof (obj) == \"string\") {\r\n");
      out.write("\t\t\t\t\t\t\t$(obj).val(data.sysdate);\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\t//根据日期、天数、运算符获取日期\r\n");
      out.write("\t\tdateOperator : function(date, days, operator) {\r\n");
      out.write("\t\t\tif (typeof (date) == \"undefined\" || date == null || date == '') {\r\n");
      out.write("\t\t\t\treturn '';\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tif (typeof (days) == \"undefined\" || days == null || days == '') {\r\n");
      out.write("\t\t\t\treturn '';\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tif (typeof (operator) == \"undefined\") {\r\n");
      out.write("\t\t\t\toperator = this.Operation.ADD;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tdate = date.replace(/-/g, \"/\"); //更改日期格式  \r\n");
      out.write("\r\n");
      out.write("\t\t\tvar nd = new Date(date);\r\n");
      out.write("\t\t\tnd = nd.valueOf();\r\n");
      out.write("\t\t\tif (operator == this.Operation.ADD) {\r\n");
      out.write("\t\t\t\tnd = nd + days * 24 * 60 * 60 * 1000;\r\n");
      out.write("\t\t\t} else if (operator == this.Operation.SUBTRACT) {\r\n");
      out.write("\t\t\t\tnd = nd - days * 24 * 60 * 60 * 1000;\r\n");
      out.write("\t\t\t} else {\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tnd = new Date(nd);\r\n");
      out.write("\t\t\tvar y = nd.getFullYear();\r\n");
      out.write("\t\t\tvar m = nd.getMonth() + 1;\r\n");
      out.write("\t\t\tvar d = nd.getDate();\r\n");
      out.write("\t\t\tif (m <= 9)\r\n");
      out.write("\t\t\t\tm = \"0\" + m;\r\n");
      out.write("\t\t\tif (d <= 9)\r\n");
      out.write("\t\t\t\td = \"0\" + d;\r\n");
      out.write("\t\t\tvar cdate = y + \"-\" + m + \"-\" + d;\r\n");
      out.write("\t\t\treturn cdate;\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\t//根据日期、月数、运算符获取日期\r\n");
      out.write("\t\tdateOperator4Month : function(date, m, operator) {\r\n");
      out.write("\t\t\tif (typeof (date) == \"undefined\" || date == null || date == '') {\r\n");
      out.write("\t\t\t\treturn '';\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tif (typeof (m) == \"undefined\" || m == null || m == '') {\r\n");
      out.write("\t\t\t\treturn '';\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tif (typeof (operator) == \"undefined\") {\r\n");
      out.write("\t\t\t\toperator = this.Operation.ADD;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tdate = date.replace(/-/g, \"/\"); //更改日期格式  \r\n");
      out.write("\r\n");
      out.write("\t\t\tvar nd = new Date(date);\r\n");
      out.write("\t\t\tif (operator == this.Operation.ADD) {\r\n");
      out.write("\t\t\t\tnd.setMonth(nd.getMonth() + m*1);\r\n");
      out.write("\t\t\t} else if (operator == this.Operation.SUBTRACT) {\r\n");
      out.write("\t\t\t\tnd.setMonth(nd.getMonth() - m*1);\r\n");
      out.write("\t\t\t} else {\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tvar y = nd.getFullYear();\r\n");
      out.write("\t\t\tvar m = nd.getMonth() + 1;\r\n");
      out.write("\t\t\tvar d = nd.getDate();\r\n");
      out.write("\t\t\tif (m <= 9)\r\n");
      out.write("\t\t\t\tm = \"0\" + m;\r\n");
      out.write("\t\t\tif (d <= 9)\r\n");
      out.write("\t\t\t\td = \"0\" + d;\r\n");
      out.write("\t\t\tvar cdate = y + \"-\" + m + \"-\" + d;\r\n");
      out.write("\t\t\treturn cdate;\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\t// 分隔符\r\n");
      out.write("\t\tSeparator : {\r\n");
      out.write("\t\t\tCOLON : \":\",\r\n");
      out.write("\t\t\tDOT : \".\"\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\t// 操作\r\n");
      out.write("\t\tOperation : {\r\n");
      out.write("\t\t\tADD : \"+\",\r\n");
      out.write("\t\t\tSUBTRACT : \"-\"\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\t// 时间操作\r\n");
      out.write("\t\toperateTime : function(time1, time2, separator, operation) {\r\n");
      out.write("\t\t\ttime1 = \"\" + time1;\r\n");
      out.write("\t\t\ttime2 = \"\" + time2;\r\n");
      out.write("\t\t\tvar minuteAllTotal = 0;\r\n");
      out.write("\t\t\t// 转换成分钟\r\n");
      out.write("\t\t\tvar minute1Total = this.convertToMinute(time1);\r\n");
      out.write("\t\t\tvar minute2Total = this.convertToMinute(time2);\r\n");
      out.write("\t\t\tseparator = separator || this.Separator.COLON;\r\n");
      out.write("\t\t\toperation = operation || this.Operation.ADD;\r\n");
      out.write("\t\t\tif (operation == this.Operation.ADD) {\r\n");
      out.write("\t\t\t\tminuteAllTotal = minute1Total + minute2Total;\r\n");
      out.write("\t\t\t} else if (operation == this.Operation.SUBTRACT) {\r\n");
      out.write("\t\t\t\tminuteAllTotal = minute1Total - minute2Total;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\treturn this.convertToHour(minuteAllTotal, separator);\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\t// 转换成分钟\r\n");
      out.write("\t\tconvertToMinute : function(time) {\r\n");
      out.write("\t\t\tvar hour = parseFloat(this.getHour(time));\r\n");
      out.write("\t\t\tvar minute = parseFloat(this.getMinute(time));\r\n");
      out.write("\t\t\tif (isNaN(hour) || isNaN(minute)) {\r\n");
      out.write("\t\t\t\treturn 0;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\treturn hour * 60 + minute;\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\t// 转换成小时\r\n");
      out.write("\t\tconvertToHour : function(minuteTotal, separator) {\r\n");
      out.write("\t\t\tif(!minuteTotal && minuteTotal != 0){\r\n");
      out.write("\t\t\t\treturn null;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tvar reverseFlag = false;\r\n");
      out.write("\t\t\tif (minuteTotal < 0) {\r\n");
      out.write("\t\t\t\treverseFlag = true;\r\n");
      out.write("\t\t\t\tminuteTotal = 0 - minuteTotal;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tvar hour = parseInt(minuteTotal / 60);\r\n");
      out.write("\t\t\tvar minute = minuteTotal % 60;\r\n");
      out.write("\t\t\tif(minute == 0){\r\n");
      out.write("\t\t\t\treturn (reverseFlag ? \"-\" : \"\") + hour;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\treturn (reverseFlag ? \"-\" : \"\") + hour + separator\r\n");
      out.write("\t\t\t\t\t+ (minute < 10 ? \"0\" + minute : minute);\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\t// 获取小时\r\n");
      out.write("\t\tgetHour : function(time) {\r\n");
      out.write("\t\t\tvar hour = time;\r\n");
      out.write("\t\t\t$.each(TimeUtil.Separator, function(i, obj) {\r\n");
      out.write("\t\t\t\tif (time.indexOf(obj) != -1) {\r\n");
      out.write("\t\t\t\t\thour = time.split(obj)[0];\r\n");
      out.write("\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\treturn hour;\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\t// 获取分钟\r\n");
      out.write("\t\tgetMinute : function(time) {\r\n");
      out.write("\t\t\tvar minute = 0;\r\n");
      out.write("\t\t\t$.each(this.Separator, function(i, obj) {\r\n");
      out.write("\t\t\t\tif (time.indexOf(obj) != -1) {\r\n");
      out.write("\t\t\t\t\tminute = time.split(obj)[1];\r\n");
      out.write("\t\t\t\t\tif (time.indexOf(\"-\") != -1) {\r\n");
      out.write("\t\t\t\t\t\tminute = 0 - minute;\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\treturn minute;\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\t// 组合时间\r\n");
      out.write("\t\tcombine : function(hour, minute, separator) {\r\n");
      out.write("\t\t\treturn (hour || \"0\") + separator + (minute || \"0\");\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\t// 添加时间验证 \r\n");
      out.write("\t\taddTimeValidate : function(selector) {\r\n");
      out.write("\t\t\tvar input = $(selector);\r\n");
      out.write("\t\t\tif (input.val().indexOf(\":\") == -1) {\r\n");
      out.write("\t\t\t\tinput.val(input.val() + \":\");\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\tinput.keyup(function() {\r\n");
      out.write("\t\t\t\t// 当前输入框对象\r\n");
      out.write("\t\t\t\tvar obj = $(this);\r\n");
      out.write("\t\t\t\t// 时间正则表达式\r\n");
      out.write("\t\t\t\tvar reg = /^([0-9]+)?((\\:)?[0-5]?[0-9]?)?$/;\r\n");
      out.write("\t\t\t\t// 当前输入值\r\n");
      out.write("\t\t\t\tvar value = obj.val();\r\n");
      out.write("\t\t\t\tvar value_new = obj.val();\r\n");
      out.write("\t\t\t\t// 不满足正则回退\r\n");
      out.write("\t\t\t\twhile (!(reg.test(value_new)) && value_new.length > 0) {\r\n");
      out.write("\t\t\t\t\tvalue_new = value_new.substr(0, value_new.length - 1);\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\tvar position = -1;\r\n");
      out.write("\t\t\t\t// 删除冒号再添加\r\n");
      out.write("\t\t\t\tif (value_new.indexOf(\":\") == -1) {\r\n");
      out.write("\t\t\t\t\tvalue_new += \":\";\r\n");
      out.write("\t\t\t\t\tposition = value_new.length - 1;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\tif (value != value_new) {\r\n");
      out.write("\t\t\t\t\tobj.val(value_new);\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\t// 输入框光标移至冒号前\r\n");
      out.write("\t\t\t\tif (position != -1) {\r\n");
      out.write("\t\t\t\t\tvar o = obj.get(0);\r\n");
      out.write("\t\t\t\t\tif (o.createTextRange) {//IE浏览器\r\n");
      out.write("\t\t\t\t\t\tvar range = o.createTextRange();\r\n");
      out.write("\t\t\t\t\t\trange.collapse(true);\r\n");
      out.write("\t\t\t\t\t\trange.moveEnd(\"character\", position);\r\n");
      out.write("\t\t\t\t\t\trange.moveStart(\"character\", position);\r\n");
      out.write("\t\t\t\t\t\trange.select();\r\n");
      out.write("\t\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t\to.setSelectionRange(position, position);\r\n");
      out.write("\t\t\t\t\t\to.focus();\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t\tinput.blur(function() {\r\n");
      out.write("\t\t\t\t// 当前输入框对象\r\n");
      out.write("\t\t\t\tvar obj = $(this);\r\n");
      out.write("\t\t\t\t// 当前输入值\r\n");
      out.write("\t\t\t\tvar value = obj.val();\r\n");
      out.write("\t\t\t\tif (value.indexOf(\":\") != -1) {\r\n");
      out.write("\t\t\t\t\tvar hour = value.split(\":\")[0] || \"0\";\r\n");
      out.write("\t\t\t\t\tvar minute = value.split(\":\")[1] || \"0\";\r\n");
      out.write("\t\t\t\t\t// 分钟补零\r\n");
      out.write("\t\t\t\t\tif (parseInt(minute) < 10) {\r\n");
      out.write("\t\t\t\t\t\tminute = \"0\" + parseInt(minute);\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\tvalue = hour + \":\" + minute;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\tobj.val(value);\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t}\r\n");
      out.write("\t};\r\n");
      out.write("\r\n");
      out.write("\t/**\r\n");
      out.write("\t * 列表收缩展开工具\r\n");
      out.write("\t * 使用方法： CollapseOrExpandUtil.collapseOrExpandAll(this);\r\n");
      out.write("\t * th_class为th的class选择器;td_class为td隐藏div的class选择器;table_id为table的id,主要是动态表格行展开时样式,可为空\r\n");
      out.write("\t */\r\n");
      out.write("\tCollapseOrExpandUtil = {\r\n");
      out.write("\t\tid : \"CollapseOrExpandUtil\",\r\n");
      out.write("\t\tcollapseOrExpandAll : function(obj) {\r\n");
      out.write("\t\t\tvar this_ = this;\r\n");
      out.write("\t\t\tvar flag = $(obj).hasClass(\"downward\");\r\n");
      out.write("\t\t\tvar th_class = $(obj).attr(\"th_class\");\r\n");
      out.write("\t\t\tvar td_class = $(obj).attr(\"td_class\");\r\n");
      out.write("\t\t\tvar table_id = $(obj).attr(\"table_id\");\r\n");
      out.write("\t\t\tif (flag) {\r\n");
      out.write("\t\t\t\t$(\".\" + th_class).removeClass(\"downward\").addClass(\"upward\");\r\n");
      out.write("\t\t\t\t$(\".\" + td_class).fadeIn(500);\r\n");
      out.write("\t\t\t\t$(\".\" + td_class).prev().removeClass(\"icon-caret-down\")\r\n");
      out.write("\t\t\t\t\t\t.addClass(\"icon-caret-up\");\r\n");
      out.write("\t\t\t} else {\r\n");
      out.write("\t\t\t\t$(\".\" + th_class).removeClass(\"upward\").addClass(\"downward\");\r\n");
      out.write("\t\t\t\t$(\".\" + td_class).hide();\r\n");
      out.write("\t\t\t\t$(\".\" + td_class).prev().removeClass(\"icon-caret-up\").addClass(\r\n");
      out.write("\t\t\t\t\t\t\"icon-caret-down\");\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tif (table_id != null && table_id != ''\r\n");
      out.write("\t\t\t\t&& typeof table_id != undefined) {\r\n");
      out.write("\t\t\t\tnew Sticky({\r\n");
      out.write("\t\t\t\t\ttableId : table_id\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\tcollapseOrExpandRow : function(td_class, table_id) {\r\n");
      out.write("\t\t\tif (table_id != null && table_id != ''\r\n");
      out.write("\t\t\t\t\t&& typeof table_id != undefined) {\r\n");
      out.write("\t\t\t\tnew Sticky({\r\n");
      out.write("\t\t\t\t\ttableId : table_id\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tvar flag = $(\".\" + td_class).next().is(\":hidden\");\r\n");
      out.write("\t\t\tif (flag) {\r\n");
      out.write("\t\t\t\t$(\".\" + td_class).next().fadeIn(500);\r\n");
      out.write("\t\t\t\t$(\".\" + td_class).removeClass(\"icon-caret-down\");\r\n");
      out.write("\t\t\t\t$(\".\" + td_class).addClass(\"icon-caret-up\");\r\n");
      out.write("\t\t\t} else {\r\n");
      out.write("\t\t\t\t$(\".\" + td_class).next().hide();\r\n");
      out.write("\t\t\t\t$(\".\" + td_class).removeClass(\"icon-caret-up\");\r\n");
      out.write("\t\t\t\t$(\".\" + td_class).addClass(\"icon-caret-down\");\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\tcollapseOrExpand : function(this_, table_id) {\r\n");
      out.write("\t\t\tvar flag = $(this_).next().is(\":hidden\");\r\n");
      out.write("\t\t\tif (flag) {\r\n");
      out.write("\t\t\t\t$(this_).next().fadeIn(500);\r\n");
      out.write("\t\t\t\t$(this_).removeClass(\"icon-caret-down\");\r\n");
      out.write("\t\t\t\t$(this_).addClass(\"icon-caret-up\");\r\n");
      out.write("\t\t\t} else {\r\n");
      out.write("\t\t\t\t$(this_).next().hide();\r\n");
      out.write("\t\t\t\t$(this_).removeClass(\"icon-caret-up\");\r\n");
      out.write("\t\t\t\t$(this_).addClass(\"icon-caret-down\");\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tif (table_id != null && table_id != ''\r\n");
      out.write("\t\t\t\t&& typeof table_id != undefined) {\r\n");
      out.write("\t\t\t\tnew Sticky({\r\n");
      out.write("\t\t\t\t\ttableId : table_id\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\t/**\r\n");
      out.write("\t * 列表收缩展开工具\r\n");
      out.write("\t * 使用方法： ModalUtil.showModal(id);弹窗modal显示\r\n");
      out.write("\t * ModalUtil.modalBodyHeight(id)设置高度\r\n");
      out.write("\t */\r\n");
      out.write("\tModalUtil = {\r\n");
      out.write("\t\tid : \"ModalUtil\",\r\n");
      out.write("\t\tshowModal : function(id) {\r\n");
      out.write("\t\t\tvar this_ = this;\r\n");
      out.write("\t\t\t$(\"#\" + id).modal(\"show\");\r\n");
      out.write("// \t\t\t$('#' + id).on('shown.bs.modal', function() {\r\n");
      out.write("// \t\t\t\tthis_.modalBodyHeight(id);\r\n");
      out.write("// \t\t\t\t$(\"#\"+id+\" .modal-body\").prop('scrollTop','0');\r\n");
      out.write("// \t\t\t});\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\tshowSearchModal : function(parentid, id, paginationId) {\r\n");
      out.write("// \t\t\tvar this_ = this;\r\n");
      out.write("// \t\t\t$(\"#\" + id).modal(\"show\");\r\n");
      out.write("// \t\t\tthis_.searchModal(parentid, id, paginationId);\r\n");
      out.write("// \t\t\t$('#' + id).on('shown.bs.modal', function() {\r\n");
      out.write("// \t\t\t\tthis_.searchModal(parentid, id, paginationId);\r\n");
      out.write("// \t\t\t});\r\n");
      out.write("\t\t\t//隐藏Modal时验证销毁重构\r\n");
      out.write("\t\t\t/* $(\"#\"+id).on(\"hidden.bs.modal\", function() {\r\n");
      out.write("\t\t\t\tthis_.searchModal(parentid,id,paginationId);\r\n");
      out.write("\t\t\t}); */\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\tmodalBodyHeight : function(id) {\r\n");
      out.write("\t\t\t//window高度\r\n");
      out.write("// \t\t\tvar windowHeight = $(window).height()\r\n");
      out.write("// \t\t\t//modal-footer的高度\r\n");
      out.write("// \t\t\tvar modalFooterHeight = $(\"#\" + id + \" .modal-footer\")\r\n");
      out.write("// \t\t\t\t\t.outerHeight() || 0;\r\n");
      out.write("// \t\t\t//modal-header 的高度\r\n");
      out.write("// \t\t\tvar modalHeaderHeight = $(\"#\" + id + \" .modal-header\")\r\n");
      out.write("// \t\t\t\t\t.outerHeight() || 0;\r\n");
      out.write("// \t\t\t//modal-dialog的margin-top值\r\n");
      out.write("// \t\t\tvar modalDialogMargin = parseInt($(\"#\" + id + \" .modal-dialog\")\r\n");
      out.write("// \t\t\t\t\t.css(\"margin-top\")) || 0\r\n");
      out.write("// \t\t\t//modal-body 的设置\r\n");
      out.write("// \t\t\tvar modalBodyHeight = windowHeight - modalFooterHeight\r\n");
      out.write("// \t\t\t\t\t- modalHeaderHeight - modalDialogMargin * 2 - 8;\r\n");
      out.write("// \t\t\t$(\"#\" + id + \" .modal-body\").attr(\r\n");
      out.write("// \t\t\t\t\t'style',\r\n");
      out.write("// \t\t\t\t\t'max-height:' + modalBodyHeight\r\n");
      out.write("// \t\t\t\t\t\t\t+ 'px !important;overflow: auto;margin-top:0px;');\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\tsearchModal : function(parentid, id, paginationId) {\r\n");
      out.write("\r\n");
      out.write("// \t\t\tvar windowHeight = $(window).height();\r\n");
      out.write("\r\n");
      out.write("// \t\t\tvar modalFooterHeight = $(\"#\" + id + \" .modal-footer\")\r\n");
      out.write("// \t\t\t\t\t.outerHeight() || 0;\r\n");
      out.write("\r\n");
      out.write("// \t\t\tvar modalHeaderHeight = $(\"#\" + id + \" .modal-header\")\r\n");
      out.write("// \t\t\t\t\t.outerHeight() || 0;\r\n");
      out.write("\r\n");
      out.write("// \t\t\tvar modalDialogMargin = parseInt($(\"#\" + id + \" .modal-dialog\")\r\n");
      out.write("// \t\t\t\t\t.css(\"margin-top\")) || 0;\r\n");
      out.write("\r\n");
      out.write("// \t\t\tvar modalSearch = $(\"#\" + id + \" .modalSearch\").outerHeight() || 0;\r\n");
      out.write("\r\n");
      out.write("// \t\t\tvar modalpagination = $(\"#\" + paginationId).outerHeight() || 0;\r\n");
      out.write("\r\n");
      out.write("// \t\t\tif (parentid == null || parentid == \"\") {\r\n");
      out.write("\r\n");
      out.write("// \t\t\t\tvar modalBodyHeight = windowHeight - modalFooterHeight\r\n");
      out.write("// \t\t\t\t\t\t- modalHeaderHeight - modalDialogMargin * 2 - 8;\r\n");
      out.write("\r\n");
      out.write("// \t\t\t} else {\r\n");
      out.write("// \t\t\t\tvar parentMargin = parseInt($(\"#\" + parentid + \" .modal-dialog\")\r\n");
      out.write("// \t\t\t\t\t\t.css(\"margin-top\")) || 0;\r\n");
      out.write("\r\n");
      out.write("// \t\t\t\tvar parentHeader = $(\"#\" + parentid + \" .modal-header\")\r\n");
      out.write("// \t\t\t\t\t\t.outerHeight() || 0;\r\n");
      out.write("\r\n");
      out.write("// \t\t\t\tvar parentFooter = $(\"#\" + parentid + \" .modal-footer\")\r\n");
      out.write("// \t\t\t\t\t\t.outerHeight() || 0;\r\n");
      out.write("\r\n");
      out.write("// \t\t\t\t$(\"#\" + id).css(\"margin-top\", (parentHeader + 10) + \"px\");\r\n");
      out.write("\r\n");
      out.write("// \t\t\t\tvar parentHeight = parseInt($(\"#\" + parentid).css(\"height\")) || 0;\r\n");
      out.write("\r\n");
      out.write("// \t\t\t\tvar modalBodyHeight = parentHeight - parentHeader - 10\r\n");
      out.write("// \t\t\t\t\t\t- parentFooter - 10 - modalFooterHeight\r\n");
      out.write("// \t\t\t\t\t\t- modalHeaderHeight - 8 - parentMargin * 2;\r\n");
      out.write("\r\n");
      out.write("// \t\t\t}\r\n");
      out.write("// \t\t\tvar tableSearchheight = modalBodyHeight - modalpagination\r\n");
      out.write("// \t\t\t\t\t- modalSearch - 18;\r\n");
      out.write("\r\n");
      out.write("// \t\t\t$(\"#\" + id + \" #searchTable\").attr(\r\n");
      out.write("// \t\t\t\t\t'style',\r\n");
      out.write("// \t\t\t\t\t'max-height:' + tableSearchheight\r\n");
      out.write("// \t\t\t\t\t\t\t+ 'px !important;overflow: auto;');\r\n");
      out.write("\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\tvar TableUtil = {\r\n");
      out.write("\r\n");
      out.write("\t\t/**\r\n");
      out.write("\t\t * 选中行可见\r\n");
      out.write("\t\t * @param row\t目标行\t\r\n");
      out.write("\t\t * @param topDiv\t上方div\r\n");
      out.write("\t\t * @param corrected_value\t修正值\r\n");
      out.write("\t\t */\r\n");
      out.write("\t\tmakeTargetRowVisible : function(row, topDiv, corrected_value) {\r\n");
      out.write("\r\n");
      out.write("\t\t\t// 选中行的高度\r\n");
      out.write("\t\t\tvar row_offset = row.offset().top;\r\n");
      out.write("\t\t\t// table的高度\r\n");
      out.write("\t\t\tvar table_offset = topDiv.offset().top;\r\n");
      out.write("\t\t\t// thead的高度\r\n");
      out.write("\t\t\tvar table_head = topDiv.find(\"thead\").outerHeight();\r\n");
      out.write("\t\t\t// 修正值\r\n");
      out.write("\t\t\tcorrected_value = corrected_value || 1;\r\n");
      out.write("\r\n");
      out.write("\t\t\t// 需要偏移的高度\r\n");
      out.write("\t\t\tvar offset = row_offset - table_offset - table_head\r\n");
      out.write("\t\t\t\t\t- corrected_value;\r\n");
      out.write("\t\t\tif (offset > 0) {\r\n");
      out.write("\t\t\t\ttopDiv.scrollTop(offset);\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t/**\r\n");
      out.write("\t\t * table添加title\r\n");
      out.write("\t\t * @param selector\t选择器\r\n");
      out.write("\t\t */\r\n");
      out.write("\t\taddTitle : function(selector){\r\n");
      out.write("\t\t\tselector = selector || \"table tr td\";\r\n");
      out.write("\t\t\t$(selector).each(function(){\r\n");
      out.write("\t\t\t\tif(!$(this).attr(\"title\") && $.trim($(this).text()) != \"\"){\r\n");
      out.write("\t\t\t\t\t$(this).attr(\"title\", $(this).text());\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\tshowDisplayContent:function(){\r\n");
      out.write("\t\t\t$(\".displayContent\").show();\r\n");
      out.write("\t\t\tApp.resizeHeight();\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\thideDisplayContent:function(){\r\n");
      out.write("\t\t\t$(\".displayContent\").hide();\r\n");
      out.write("\t\t\tApp.resizeHeight();\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\t//重置排序图标\r\n");
      out.write("\t\tresetTableSorting : function(tableId){\r\n");
      out.write("\t\t\t$(\".sorting_desc\", $(\"#\"+tableId)).removeClass(\"sorting_desc\").addClass(\"sorting\");\r\n");
      out.write("\t\t\t$(\".sorting_asc\", $(\"#\"+tableId)).removeClass(\"sorting_asc\").addClass(\"sorting\");\r\n");
      out.write("\t\t}\r\n");
      out.write("\t};\r\n");
      out.write("\t \r\n");
      out.write("\tfunction goHistory(obj) {\r\n");
      out.write("\t\tobj.history.go(-1)\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\t/**监控值检查*/\r\n");
      out.write("\tvar monitor_setting_check = {\r\n");
      out.write("\t\t/**是合法飞行循环*/\r\n");
      out.write("\t\tisFh: function($obj,value){\r\n");
      out.write("\t\t\t \r\n");
      out.write("\t\t\tvar result = true;\r\n");
      out.write("\t\t\tvar reg = /^(0|[1-9]\\d*)(\\:[0-5]?[0-9]?)?$/;\r\n");
      out.write("\t\t\tvar value = $obj.val();\r\n");
      out.write("\t\t\tvalue = value.replace(/：/g, \":\");\r\n");
      out.write("\t\t\twhile(!(reg.test(value)) && value.length > 0){\r\n");
      out.write("\t\t\t\tvalue = value.substr(0, value.length-1);\r\n");
      out.write("\t\t\t\tresult = false;\r\n");
      out.write("\t\t    }\r\n");
      out.write("\t\t\t$obj.val(value);\r\n");
      out.write("\t\t\treturn result;\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\t/**是合法飞行小时*/\r\n");
      out.write("\t\tisFc: function($obj,value){\r\n");
      out.write("\t\t\tvar reg =  /^[1-9]\\d*$/;\r\n");
      out.write("\t\t\t  \r\n");
      out.write("\t\t\t//value = value.replace(/：/g, \":\");\r\n");
      out.write("\t\t\tif(!(reg.test(value)) && value.length > 0){\r\n");
      out.write("\t\t\t\tvalue = value.substr(0, value.length-1);\r\n");
      out.write("\t\t\t\t$obj.val('0');\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t    }\r\n");
      out.write("\t\t\treturn true;\r\n");
      out.write("\t\t},\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/static/js/thjw/common/alert.js\"></script>\r\n");
      out.write("<!-------alert对话框 Start-------->\r\n");
      out.write("<div class=\"modal fade modal-new\" id=\"alertModal\" role=\"dialog\" aria-labelledby=\"myModalLabel\" aria- hidden=\"true\" data-keyboard=\"false\" data-backdrop=\"static\" style=\"z-index: 100000 ! important;\">\r\n");
      out.write("\t<div class=\"modal-dialog\">\r\n");
      out.write("\t\t<div class=\"modal-content\">\r\n");
      out.write("\t     \t<div class=\"modal-header modal-header-new\">\r\n");
      out.write("\t\t\t\t<h4 class=\"modal-title\">\r\n");
      out.write("\t\t\t\t\t<div class='pull-left'>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"font-size-14\">提示信息</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"font-size-12\">Prompt Info</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class='pull-right'>\r\n");
      out.write("\t\t\t\t\t\t<button type=\"button\" class=\"icon-remove modal-close\"\r\n");
      out.write("\t\t\t\t\t\t\tdata-dismiss=\"modal\" aria-label=\"Close\"></button>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class='clearfix'></div>\r\n");
      out.write("\t\t\t\t</h4>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"modal-body\">\r\n");
      out.write("\t\t\t\t<div class=\"input-group-border\" style=\"padding-top: 5px; margin-top: 8px;\">\r\n");
      out.write("\t\t\t\t\t<i class=\"glyphicon glyphicon-info-sign alert-modalbody-icon\"></i>\r\n");
      out.write("\t\t\t\t\t<label id=\"alertModalBody\" class=\"paddind-bottom-5\"></label>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"modal-footer\">\r\n");
      out.write("           \t\t<div class=\"col-xs-12 padding-leftright-8\" >\r\n");
      out.write("\t\t\t     \t<div class=\"input-group\">\r\n");
      out.write("\t                    <span class=\"input-group-addon modalfooterbtn\">\r\n");
      out.write("\t                    \t<button type=\"button\" class=\"btn btn-primary padding-top-1 padding-bottom-1\" data-dismiss=\"modal\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"font-size-12\">关闭</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"font-size-9\">Close</div>\r\n");
      out.write("\t\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t\t</span>\r\n");
      out.write("\t               \t</div>\r\n");
      out.write("               \t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("<!-------alert对话框 End-------->\r\n");
      out.write("\t\r\n");
      out.write("<!-------alert refreshPage对话框 Start-------->\r\n");
      out.write("<div class=\"modal fade\" id=\"alertAfterModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel\" aria-hidden=\"true\" data-keyboard=\"false\" data-backdrop=\"static\" style=\"z-index: 100000 ! important;\">\r\n");
      out.write("\t<div class=\"modal-dialog\">\r\n");
      out.write("\t\t<div class=\"modal-content\">\r\n");
      out.write("\t\t<div class=\"modal-header alert-modal-header\" >\r\n");
      out.write("                      <h4 class=\"modal-title\" >\r\n");
      out.write("                         <div class='pull-left'>\r\n");
      out.write("                       <div class=\"font-size-12 \">提示信息</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"font-size-9\">Prompt Info</div>\r\n");
      out.write("\t\t\t\t\t  </div>\r\n");
      out.write("\t\t\t\t\t  <div class='pull-right' style='padding-top:10px;'>\r\n");
      out.write("\t\t\t\t\t  \t<button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\"><span aria-hidden=\"true\" style='font-size:30px !important;' >&times;</span></button>\r\n");
      out.write("\t\t\t\t\t  </div>\r\n");
      out.write("\t\t\t\t\t  <div class='clearfix'></div>\r\n");
      out.write("                      </h4>\r\n");
      out.write("           </div>\r\n");
      out.write("\t\t\t<div class=\"modal-body alert-modal-body\" id=\"alertAfterModalBody\"></div>\r\n");
      out.write("\t\t\t<div class=\"modal-footer\">\r\n");
      out.write("\t\t\t\t<button type=\"button\" onclick=\"refreshPage();\" class=\"btn btn-primary padding-top-1 padding-bottom-1\" data-dismiss=\"modal\">\r\n");
      out.write("\t\t\t\t\t<div class=\"font-size-12\">关闭</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"font-size-9\">Close</div>\r\n");
      out.write("\t\t\t\t</button>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("<!-------alert refreshPage对话框 End-------->\r\n");
      out.write("<!-------alert error对话框 Start-------->\r\n");
      out.write("<div class=\"modal fade modal-new\" id=\"alertErrorModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel\" aria-hidden=\"true\" data-keyboard=\"false\" data-backdrop=\"static\" style=\"z-index: 100000 ! important;\">\r\n");
      out.write("\t<div class=\"modal-dialog\">\r\n");
      out.write("\t\t<div class=\"modal-content\">\r\n");
      out.write("\t\t\t<div class=\"modal-header modal-header-new\">\r\n");
      out.write("\t\t\t\t<h4 class=\"modal-title\">\r\n");
      out.write("\t\t\t\t\t<div class='pull-left'>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"font-size-14\">提示信息</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"font-size-12\">Prompt Info</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class='pull-right'>\r\n");
      out.write("\t\t\t\t\t\t<button type=\"button\" class=\"icon-remove modal-close\"\r\n");
      out.write("\t\t\t\t\t\t\tdata-dismiss=\"modal\" aria-label=\"Close\"></button>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class='clearfix'></div>\r\n");
      out.write("\t\t\t\t</h4>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"modal-body\">\r\n");
      out.write("\t\t\t\t<div class=\"input-group-border\" style=\"padding-top: 5px; margin-top: 8px;\">\r\n");
      out.write("\t\t\t\t\t<i class=\"glyphicon glyphicon-info-sign alert-modalbody-icon\"></i>\r\n");
      out.write("\t\t\t\t\t<label id=\"alertErrorModalBody\" class=\"paddind-bottom-5\"></label>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"modal-footer\">\r\n");
      out.write("           \t\t<div class=\"col-xs-12 padding-leftright-8\" >\r\n");
      out.write("\t\t\t     \t<div class=\"input-group\">\r\n");
      out.write("\t                    <span class=\"input-group-addon modalfooterbtn\">\r\n");
      out.write("\t                    \t<button type=\"button\" class=\"btn btn-primary padding-top-1 padding-bottom-1\" data-dismiss=\"modal\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"font-size-12\">关闭</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"font-size-9\">Close</div>\r\n");
      out.write("\t\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t\t</span>\r\n");
      out.write("\t               \t</div>\r\n");
      out.write("               \t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("\t<!-------alert error对话框 End-------->\r\n");
      out.write("\t\r\n");
      out.write("<!-------alert error对话框 Start-------->\r\n");
      out.write("<div class=\"modal fade modal-new\" id=\"alertConfirmModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel\" aria- hidden=\"true\" data-backdrop='static' data-keyboard= false style=\"z-index: 100000 ! important;\">\r\n");
      out.write("    <input type=\"hidden\" value=\"\" id=\"url\"/>\r\n");
      out.write("\t<div class=\"modal-dialog\" style=\"width:40%;\">\r\n");
      out.write("\t\t<div class=\"modal-content\">\r\n");
      out.write("\t\t\t<div class=\"modal-header modal-header-new\">\r\n");
      out.write("\t\t\t\t<h4 class=\"modal-title\">\r\n");
      out.write("\t\t\t\t\t<div class='pull-left'>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"font-size-14\">提示信息</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"font-size-12\">Prompt Info</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class='clearfix'></div>\r\n");
      out.write("\t\t\t\t</h4>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"modal-body\">\r\n");
      out.write("\t\t\t\t<div class=\"input-group-border\" style=\"padding-top: 5px; margin-top: 8px;\">\r\n");
      out.write("\t\t\t\t\t<i class=\"fa fa-question-circle-o alert-modalbody-icon\"></i>\r\n");
      out.write("\t\t\t\t\t<label id=\"alertConfirmModalBody\" class=\"paddind-bottom-5\"></label>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"modal-footer\">\r\n");
      out.write("           \t\t<div class=\"col-xs-12 padding-leftright-8\" >\r\n");
      out.write("\t\t\t     \t<div class=\"input-group\">\r\n");
      out.write("\t                    <span class=\"input-group-addon modalfooterbtn\">\r\n");
      out.write("\t                      <button id=\"confirmY\" type=\"button\" class=\"btn btn-primary padding-top-1 padding-bottom-1\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"font-size-12 lin-height-12\">是</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"font-size-9 \">Yes</div>\r\n");
      out.write("\t\t\t\t\t\t </button>\r\n");
      out.write("\t\t                 <button id=\"confirmN\" type=\"button\" class=\"btn btn-primary padding-top-1 padding-bottom-1\" >\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"font-size-12 lin-height-12\">否</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"font-size-9 \">No</div>\r\n");
      out.write("\t\t\t\t\t\t </button>\r\n");
      out.write("\t                    </span>\r\n");
      out.write("\t               \t</div>\r\n");
      out.write("               \t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("<!-------alert error对话框 End-------->\r\n");
      out.write("\r\n");
      out.write("<!-------图片预览对话框-------->\r\n");
      out.write("<div class=\"modal fade\" id=\"imageModal\" role=\"dialog\" aria-labelledby=\"myModalLabel\" aria- hidden=\"true\" data-keyboard=\"false\" data-backdrop=\"static\" style=\"z-index: 70000 ! important;\">\r\n");
      out.write("\t<div class=\"modal-dialog\" style=\"text-align:center;\">\r\n");
      out.write("\t\t<div class=\"modal-content\" style=\"border: none;\">\r\n");
      out.write("\t\t    <div class=\"modal-header alert-modal-header\" >\r\n");
      out.write("                      <h4 class=\"modal-title\" >\r\n");
      out.write("                         <div class='pull-left text-left'>\r\n");
      out.write("                       <div class=\"font-size-12 \">图片预览</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"font-size-9\">Preview Picture</div>\r\n");
      out.write("\t\t\t\t\t  </div>\r\n");
      out.write("\t\t\t\t\t  <div class='pull-right' style='padding-top:10px;'>\r\n");
      out.write("\t\t\t\t\t  \t<button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\"><span aria-hidden=\"true\" style='font-size:30px !important;' >&times;</span></button>\r\n");
      out.write("\t\t\t\t\t  </div>\r\n");
      out.write("\t\t\t\t\t  <div class='clearfix'></div>\r\n");
      out.write("                      </h4>\r\n");
      out.write("           </div>\r\n");
      out.write("           <div class=\"modal-body alert-modal-body text-left\">\r\n");
      out.write("\t\t\t\t<img alt=\"预览失败\" src=\"\" id=\"previewImage\"/>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"modal-footer alert-modal-footer\">\r\n");
      out.write("\t\t\t     <div class=\"input-group\">\r\n");
      out.write("                    <span class=\"input-group-addon modalfooterbtn\">\r\n");
      out.write("                      <button  type=\"button\" class=\"btn btn-primary padding-top-1 padding-bottom-1\" data-dismiss=\"modal\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"font-size-12 lin-height-12\">关闭</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"font-size-9 \">Close</div>\r\n");
      out.write("\t\t\t\t\t </button>\r\n");
      out.write("                    </span>\r\n");
      out.write("               \t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("<!-------图片预览对话框-------->\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("\r\n");
      out.write(".ajax-file-upload_ext {\r\n");
      out.write("    background: #428bca  none repeat scroll 0 0;\r\n");
      out.write("    border: medium none;\r\n");
      out.write("    border-radius: 4px;\r\n");
      out.write("    color: #fff;\r\n");
      out.write("    cursor: pointer;\r\n");
      out.write("     display: inline-block; \r\n");
      out.write("    font-family: Arial,Helvetica,sans-serif;\r\n");
      out.write("    font-size: 12px;\r\n");
      out.write("    /* font-weight: bold; */\r\n");
      out.write("    height: 34px;\r\n");
      out.write("    width: 48px;\r\n");
      out.write("    line-height: 16px;\r\n");
      out.write("    margin: 0;\r\n");
      out.write("    /* padding: 3px 22px 0 22px; */\r\n");
      out.write("    text-align: center;\r\n");
      out.write("    text-decoration: none;\r\n");
      out.write("    vertical-align: middle;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"page-header-fixed\">\r\n");
      out.write("\t \r\n");
      out.write("\t<!-- BEGIN HEADER -->\r\n");
      out.write("\t<div class=\"clearfix\"></div>\r\n");
      out.write("\t<!-- BEGIN CONTAINER -->\r\n");
      out.write("\t<input type=\"hidden\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${shapeStructureRepair.sjlx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" id=\"sjlx\">\r\n");
      out.write("\t<div class=\"page-content\">\r\n");
      out.write("\t\t<div class=\"panel panel-primary\">\r\n");
      out.write("\t\t\t<!--导航开始  -->\r\n");
      out.write("\t\t\t<div class=\"panel-heading\" id=\"NavigationBar\"></div>\r\n");
      out.write("\t\t\t<div class=\"panel-body\" >\r\n");
      out.write("\t\t \t\t<div class=\"col-xs-12 \" style='padding:0px;'>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-4 col-sm-6 col-xs-12 padding-left-0 padding-right-0 form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<span class=\"col-md-3 col-sm-4 col-xs-3 text-right padding-left-0 padding-right-0\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"font-size-12 margin-topnew-2\">飞机注册号</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"font-size-9\">A/C REG</div>\r\n");
      out.write("\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-9 col-sm-8 col-xs-9 padding-leftright-8\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control date-picker\"\r\n");
      out.write("\t\t\t\t\t\t\t\t id=\"fjzch\" name=\"fjzch\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${erayFns:escapeStr(shapeStructureRepair.fjzch)}", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0, false));
      out.write("\" />\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("                    \t<div class=\"col-md-4 col-sm-6 col-xs-12 padding-left-0 padding-right-0 form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<span class=\"col-md-3 col-sm-4 col-xs-3 text-right padding-left-0 padding-right-0\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"font-size-12 margin-topnew-2\">发现日期</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"font-size-9\">Discovery Date</div>\r\n");
      out.write("\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-9 col-sm-8 col-xs-9 padding-leftright-8\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control date-picker\"\r\n");
      out.write("\t\t\t\t\t\t\t\tmaxlength=\"10\" data-date-format=\"yyyy-mm-dd\" id=\"fxrq\" name=\"fxrq\" \r\n");
      out.write("\t\t\t\t\t\t\t\tvalue=\"");
      if (_jspx_meth_fmt_005fformatDate_005f0(_jspx_page_context))
        return;
      out.write("\" />\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("                    \t<div class=\"col-md-4 col-sm-6 col-xs-12 padding-left-0 padding-right-0 form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<span class=\"col-md-3 col-sm-4 col-xs-3 text-right padding-left-0 padding-right-0\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"font-size-12 margin-topnew-2\">ATA章节号</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"font-size-9\">Maint Date</div>\r\n");
      out.write("\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-9 col-sm-8 col-xs-9 padding-leftright-8\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control date-picker\"\r\n");
      out.write("\t\t\t\t\t\t\t\tmaxlength=\"10\" data-date-format=\"yyyy-mm-dd\" id=\"fxrq\" name=\"fxrq\" \r\n");
      out.write("\t\t\t\t\t\t\t\t value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${erayFns:escapeStr(shapeStructureRepair.fixChapter.zjh)}", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0, false));
      out.write(' ');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${erayFns:escapeStr(shapeStructureRepair.fixChapter.ywms)}", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0, false));
      out.write("\"/>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-12 col-sm-12 col-xs-12 padding-left-0 padding-right-0 form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<span class=\"col-lg-1 col-md-1 col-sm-2 col-xs-3 text-right padding-left-0 padding-right-0\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"font-size-12 margin-topnew-2\">位置</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"font-size-9\">Positon</div>\r\n");
      out.write("\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-lg-11 col-md-11 col-sm-10 col-xs-9 padding-leftright-8\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<textarea id=\"wz\" name=\"wz\" class=\"form-control\" disabled=\"disabled\" maxlength=\"160\" style=\"height:55px\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${erayFns:escapeStr(shapeStructureRepair.wz)}", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0, false));
      out.write("</textarea>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-12 col-sm-12 col-xs-12 padding-left-0 padding-right-0 form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<span class=\"col-lg-1 col-md-1 col-sm-2 col-xs-3 text-right padding-left-0 padding-right-0\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"font-size-12 margin-topnew-2\">缺陷描述</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"font-size-9\">Positon</div>\r\n");
      out.write("\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-lg-11 col-md-11 col-sm-10 col-xs-9 padding-leftright-8\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<textarea id=\"qxms\" name=\"qxms\" class=\"form-control\" disabled=\"disabled\" maxlength=\"1300\" style=\"height:55px\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${erayFns:escapeStr(shapeStructureRepair.qxms)}", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0, false));
      out.write("</textarea>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-12 col-sm-12 col-xs-12 padding-left-0 padding-right-0 form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<span class=\"col-md-1 col-sm-2 col-xs-3 text-right padding-left-0 padding-right-0\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"font-size-12 margin-topnew-2\">照片列表</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"font-size-9\">Version</div>\r\n");
      out.write("\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-11 col-sm-10 col-xs-9 padding-leftright-8\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-lg-12 col-md-12 padding-left-0 padding-right-0 \" style=\"overflow-x: auto;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<table  class=\"table table-thin table-bordered table-striped table-hover table-set\" style='margin-bottom:0px !important'>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<thead>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<th class=\"colwidth-20\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"font-size-12 line-height-18\">文件说明</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"font-size-9 line-height-18\">File Desc</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<th class=\"colwidth-10\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"font-size-12 line-height-18\">文件大小</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"font-size-9 line-height-18\">File Size</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<th class=\"colwidth-13\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"font-size-12 line-height-18\">上传人</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"font-size-9 line-height-18\">Uploader</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<th class=\"colwidth-13\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"font-size-12 line-height-18\">上传时间</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"font-size-9 line-height-18\">Upload Time</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<tbody id=\"filelist\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-4 col-sm-6 col-xs-12 padding-left-0 padding-right-0 form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<span class=\"col-md-3 col-sm-4 col-xs-3 text-right padding-left-0 padding-right-0\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"font-size-12 margin-topnew-2\">修理日期</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"font-size-9\">Maint Date</div>\r\n");
      out.write("\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-9 col-sm-8 col-xs-9 padding-leftright-8\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control date-picker\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tmaxlength=\"10\" data-date-format=\"yyyy-mm-dd\" id=\"xlrq\" name=\"xlrq\"\r\n");
      out.write("\t\t\t\t\t\t\t\tvalue=\"");
      if (_jspx_meth_fmt_005fformatDate_005f2(_jspx_page_context))
        return;
      out.write("\"\t />\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-4 col-sm-6 col-xs-12 padding-left-0 padding-right-0 form-group\" >\r\n");
      out.write("\t\t\t\t\t\t\t<span class=\"col-md-3 col-sm-4 col-xs-3 text-right padding-left-0 padding-right-0\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"font-size-12 margin-topnew-2\">关闭</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"font-size-9\">Close</div>\r\n");
      out.write("\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-9 col-sm-8 col-xs-9 padding-leftright-8 label-input-div\" >\r\n");
      out.write("\t\t\t\t\t\t\t\t<span style=\" font-weight:normal\" class=\"pull-left\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"radio\" name=\"is_gb\" id=\"is_gb\" value='1' ");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write(" >是\r\n");
      out.write("\t\t\t\t\t\t\t\t</span>\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t<span style=\" font-weight:normal\" class=\"pull-left padding-left-10\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"radio\" name=\"is_gb\"  value='0' id=\"is_gb\" ");
      if (_jspx_meth_c_005fif_005f1(_jspx_page_context))
        return;
      out.write(" >否\r\n");
      out.write("\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-4 col-sm-6 col-xs-12 padding-left-0 padding-right-0 form-group\" >\r\n");
      out.write("\t\t\t\t\t\t\t<span class=\"col-md-3 col-sm-4 col-xs-3 text-right padding-left-0 padding-right-0\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"font-size-12 margin-topnew-2\">加入维修方案</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"font-size-9\">Join Maintenanc</div>\r\n");
      out.write("\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-9 col-sm-8 col-xs-9 padding-leftright-8 label-input-div\" >\r\n");
      out.write("\t\t\t\t\t\t\t\t<span style=\" font-weight:normal\" class=\"pull-left\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"radio\" name=\"is_jrwxfq\" id=\"is_jrwxfq\" value='1' ");
      if (_jspx_meth_c_005fif_005f2(_jspx_page_context))
        return;
      out.write(" >是\r\n");
      out.write("\t\t\t\t\t\t\t\t</span>\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t<span style=\" font-weight:normal\" class=\"pull-left padding-left-10\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"radio\" name=\"is_jrwxfq\"  value='0' id=\"is_jrwxfq\" ");
      if (_jspx_meth_c_005fif_005f3(_jspx_page_context))
        return;
      out.write(" >否\r\n");
      out.write("\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"clearfix\"></div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-4 col-sm-6 col-xs-12 padding-left-0 padding-right-0 form-group\" >\r\n");
      out.write("\t\t\t\t\t\t\t<span class=\"col-md-3 col-sm-4 col-xs-3 text-right padding-left-0 padding-right-0\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"font-size-12 margin-topnew-2\">修理方式</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"font-size-9\">Repair model</div>\r\n");
      out.write("\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-9 col-sm-8 col-xs-9 padding-leftright-8 label-input-div\" >\r\n");
      out.write("\t\t\t\t\t\t\t\t<span style=\" font-weight:normal\" class=\"pull-left\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"radio\" name=\"xlfs\" id=\"xlfs\" value='1'  ");
      if (_jspx_meth_c_005fif_005f4(_jspx_page_context))
        return;
      out.write(" >永久修理\r\n");
      out.write("\t\t\t\t\t\t\t\t</span>\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t<span style=\" font-weight:normal\" class=\"pull-left padding-left-10\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"radio\" name=\"xlfs\"  value='2' id=\"xlfs\" ");
      if (_jspx_meth_c_005fif_005f5(_jspx_page_context))
        return;
      out.write(" >临时修理\r\n");
      out.write("\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-12 col-sm-12 col-xs-12 padding-left-0 padding-right-0 form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<span class=\"col-lg-1 col-md-1 col-sm-2 col-xs-3 text-right padding-left-0 padding-right-0\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"font-size-12 margin-topnew-2\">修理依据</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"font-size-9\">Repair Basis</div>\r\n");
      out.write("\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-lg-11 col-md-11 col-sm-10 col-xs-9 padding-leftright-8\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<textarea id=\"xlyj\" name=\"xlyj\" class=\"form-control\" disabled=\"disabled\" maxlength=\"1300\" style=\"height:55px\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${erayFns:escapeStr(shapeStructureRepair.xlyj)}", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0, false));
      out.write("</textarea>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div  id=\"xlyjlookfile\"  class=\"col-md-12 col-sm-12 col-xs-12 padding-left-0 padding-right-0 form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<span class=\"col-md-1 col-sm-2 col-xs-3 text-right padding-left-0 padding-right-0\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"font-size-12 margin-topnew-2\">修理依据附件</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"font-size-9\">Repair Basis Files</div>\r\n");
      out.write("\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-11 col-sm-10 col-xs-9 padding-leftright-8\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-lg-12 col-md-12 padding-left-0 padding-right-0 \" style=\"overflow-x: auto;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<table  class=\"table table-thin table-bordered table-striped table-hover table-set \" style='margin-bottom:0px !important'>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<thead>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<th class=\"colwidth-20\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"font-size-12 line-height-18\">文件说明</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"font-size-9 line-height-18\">File Desc</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<th class=\"colwidth-10\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"font-size-12 line-height-18\">文件大小</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"font-size-9 line-height-18\">File Size</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<th class=\"colwidth-13\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"font-size-12 line-height-18\">上传人</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"font-size-9 line-height-18\">Uploader</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<th class=\"colwidth-13\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"font-size-12 line-height-18\">上传时间</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"font-size-9 line-height-18\">Upload Time</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<tbody id=\"xlyjfilelist\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-4 col-sm-6 col-xs-12 padding-left-0 padding-right-0 form-group\" >\r\n");
      out.write("\t\t\t\t\t\t\t<span class=\"col-md-3 col-sm-4 col-xs-3 text-right padding-left-0 padding-right-0\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"font-size-12 margin-topnew-2\">例行检查</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"font-size-9\">Inspection</div>\r\n");
      out.write("\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-9 col-sm-8 col-xs-9 padding-leftright-8 label-input-div\" >\r\n");
      out.write("\t\t\t\t\t\t\t\t<span style=\" font-weight:normal\" class=\"pull-left\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"radio\" name=\"is_xlxjc\" id=\"is_xlxjc\" value='1' ");
      if (_jspx_meth_c_005fif_005f6(_jspx_page_context))
        return;
      out.write(" >是\r\n");
      out.write("\t\t\t\t\t\t\t\t</span>\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t<span style=\" font-weight:normal\" class=\"pull-left padding-left-10\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"radio\" name=\"is_xlxjc\"  value='0' id=\"is_xlxjc\" ");
      if (_jspx_meth_c_005fif_005f7(_jspx_page_context))
        return;
      out.write(" >否\r\n");
      out.write("\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div id=\"lxjcjg-div\" class=\"col-md-4 col-sm-6 col-xs-12 padding-left-0 padding-right-0 form-group\" >\r\n");
      out.write("\t\t\t\t\t\t\t<span class=\"col-md-3 col-sm-4 col-xs-3 text-right padding-left-0 padding-right-0\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"font-size-12 margin-topnew-2\">例行检查间隔</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"font-size-9\">Inspec Interval</div>\r\n");
      out.write("\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t\t<div id=\"div-wxsb\" class=\"col-md-9 col-sm-8 col-xs-9 padding-leftright-8\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control date-picker\"\r\n");
      out.write("\t\t\t\t\t\t\t\tmaxlength=\"33\" id=\"lxjcjg\" name=\"lxjcjg\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${erayFns:escapeStr(shapeStructureRepair.lxjcjg)}", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0, false));
      out.write("\" />\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"clearfix\"></div>\t\r\n");
      out.write("\t\t\t\t\t\t<div  id=\"lookfile\"  class=\"col-md-12 col-sm-12 col-xs-12 padding-left-0 padding-right-0 form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<span class=\"col-md-1 col-sm-2 col-xs-3 text-right padding-left-0 padding-right-0\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"font-size-12 margin-topnew-2\">照片列表</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"font-size-9\">Version</div>\r\n");
      out.write("\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-11 col-sm-10 col-xs-9 padding-leftright-8\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-lg-12 col-md-12 padding-left-0 padding-right-0 \" style=\"overflow-x: auto;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<table  class=\"table table-thin table-bordered table-striped table-hover table-set \" style='margin-bottom:0px !important'>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<thead>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<th class=\"colwidth-20\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"font-size-12 line-height-18\">文件说明</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"font-size-9 line-height-18\">File Desc</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<th class=\"colwidth-10\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"font-size-12 line-height-18\">文件大小</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"font-size-9 line-height-18\">File Size</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<th class=\"colwidth-13\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"font-size-12 line-height-18\">上传人</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"font-size-9 line-height-18\">Uploader</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<th class=\"colwidth-13\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"font-size-12 line-height-18\">上传时间</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"font-size-9 line-height-18\">Upload Time</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<tbody id=\"xlhfilelist\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\t\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("        \t</div>\r\n");
      out.write("\t\t</div>\t\t\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/static/js/thjw/common/preview.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/static/js/thjw/project2/shapeStructureRepair/structureRepair_view.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fset_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f0.setParent(null);
    // /WEB-INF/views/common_new.jsp(12,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setVar("ctx");
    // /WEB-INF/views/common_new.jsp(12,0) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setValue(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/common_new.jsp(12,0) '${pageContext.request.contextPath}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${pageContext.request.contextPath}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
    if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
    return false;
  }

  private boolean _jspx_meth_fmt_005fformatDate_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_005fformatDate_005f0 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    _jspx_th_fmt_005fformatDate_005f0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_005fformatDate_005f0.setParent(null);
    // /WEB-INF/views/project2/shapeStructureRepair/structureRepair_view.jsp(41,15) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fformatDate_005f0.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${shapeStructureRepair.fxrq}", java.util.Date.class, (PageContext)_jspx_page_context, null, false));
    // /WEB-INF/views/project2/shapeStructureRepair/structureRepair_view.jsp(41,15) name = pattern type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fformatDate_005f0.setPattern("yyyy-MM-dd");
    int _jspx_eval_fmt_005fformatDate_005f0 = _jspx_th_fmt_005fformatDate_005f0.doStartTag();
    if (_jspx_th_fmt_005fformatDate_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.reuse(_jspx_th_fmt_005fformatDate_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.reuse(_jspx_th_fmt_005fformatDate_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /WEB-INF/views/project2/shapeStructureRepair/structureRepair_view.jsp(106,11) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/project2/shapeStructureRepair/structureRepair_view.jsp(106,11) '${shapeStructureRepair.attachments}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${shapeStructureRepair.attachments}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/views/project2/shapeStructureRepair/structureRepair_view.jsp(106,11) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("attachments");
    // /WEB-INF/views/project2/shapeStructureRepair/structureRepair_view.jsp(106,11) name = varStatus type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVarStatus("status");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<td title=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${attachments.wbwjm}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" class=\"text-left\"><a key=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${attachments.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" href=\"javascript:void(0)\" onclick=\"openAttachmentWinEdit(this)\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${attachments.wbwjm}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write('.');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${attachments.hzm}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</a></td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"text-left\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${attachments.wjdxStr}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"text-left\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${attachments.czrname}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"text-center\">");
          if (_jspx_meth_fmt_005fformatDate_005f1(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
            return true;
          out.write("</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_005fformatDate_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_005fformatDate_005f1 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    _jspx_th_fmt_005fformatDate_005f1.setPageContext(_jspx_page_context);
    _jspx_th_fmt_005fformatDate_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
    // /WEB-INF/views/project2/shapeStructureRepair/structureRepair_view.jsp(111,37) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fformatDate_005f1.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${attachments.czsj}", java.util.Date.class, (PageContext)_jspx_page_context, null, false));
    // /WEB-INF/views/project2/shapeStructureRepair/structureRepair_view.jsp(111,37) name = pattern type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fformatDate_005f1.setPattern("yyyy-MM-dd HH:mm:ss");
    int _jspx_eval_fmt_005fformatDate_005f1 = _jspx_th_fmt_005fformatDate_005f1.doStartTag();
    if (_jspx_th_fmt_005fformatDate_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.reuse(_jspx_th_fmt_005fformatDate_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.reuse(_jspx_th_fmt_005fformatDate_005f1);
    return false;
  }

  private boolean _jspx_meth_fmt_005fformatDate_005f2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_005fformatDate_005f2 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    _jspx_th_fmt_005fformatDate_005f2.setPageContext(_jspx_page_context);
    _jspx_th_fmt_005fformatDate_005f2.setParent(null);
    // /WEB-INF/views/project2/shapeStructureRepair/structureRepair_view.jsp(128,15) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fformatDate_005f2.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${shapeStructureRepair.xlrq}", java.util.Date.class, (PageContext)_jspx_page_context, null, false));
    // /WEB-INF/views/project2/shapeStructureRepair/structureRepair_view.jsp(128,15) name = pattern type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fformatDate_005f2.setPattern("yyyy-MM-dd");
    int _jspx_eval_fmt_005fformatDate_005f2 = _jspx_th_fmt_005fformatDate_005f2.doStartTag();
    if (_jspx_th_fmt_005fformatDate_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.reuse(_jspx_th_fmt_005fformatDate_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.reuse(_jspx_th_fmt_005fformatDate_005f2);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f0.setParent(null);
    // /WEB-INF/views/project2/shapeStructureRepair/structureRepair_view.jsp(139,63) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${shapeStructureRepair.is_gb eq 1 }", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("checked");
        int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f1.setParent(null);
    // /WEB-INF/views/project2/shapeStructureRepair/structureRepair_view.jsp(142,64) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${shapeStructureRepair.is_gb eq 0 }", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
    if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("checked");
        int evalDoAfterBody = _jspx_th_c_005fif_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f2.setParent(null);
    // /WEB-INF/views/project2/shapeStructureRepair/structureRepair_view.jsp(154,71) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${shapeStructureRepair.is_jrwxfq eq 1 }", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f2 = _jspx_th_c_005fif_005f2.doStartTag();
    if (_jspx_eval_c_005fif_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("checked");
        int evalDoAfterBody = _jspx_th_c_005fif_005f2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f2);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f3.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f3.setParent(null);
    // /WEB-INF/views/project2/shapeStructureRepair/structureRepair_view.jsp(157,72) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${shapeStructureRepair.is_jrwxfq eq 0 }", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f3 = _jspx_th_c_005fif_005f3.doStartTag();
    if (_jspx_eval_c_005fif_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("checked");
        int evalDoAfterBody = _jspx_th_c_005fif_005f3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f3);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f4 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f4.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f4.setParent(null);
    // /WEB-INF/views/project2/shapeStructureRepair/structureRepair_view.jsp(169,62) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${shapeStructureRepair.xlfs eq 1 }", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f4 = _jspx_th_c_005fif_005f4.doStartTag();
    if (_jspx_eval_c_005fif_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("checked");
        int evalDoAfterBody = _jspx_th_c_005fif_005f4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f4);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f5 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f5.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f5.setParent(null);
    // /WEB-INF/views/project2/shapeStructureRepair/structureRepair_view.jsp(172,62) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f5.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${shapeStructureRepair.xlfs eq 2 }", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f5 = _jspx_th_c_005fif_005f5.doStartTag();
    if (_jspx_eval_c_005fif_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("checked");
        int evalDoAfterBody = _jspx_th_c_005fif_005f5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f5);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f1.setParent(null);
    // /WEB-INF/views/project2/shapeStructureRepair/structureRepair_view.jsp(215,12) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/project2/shapeStructureRepair/structureRepair_view.jsp(215,12) '${shapeStructureRepair.xlyjAttachment}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${shapeStructureRepair.xlyjAttachment}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/views/project2/shapeStructureRepair/structureRepair_view.jsp(215,12) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setVar("attachments");
    // /WEB-INF/views/project2/shapeStructureRepair/structureRepair_view.jsp(215,12) name = varStatus type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setVarStatus("status");
    int[] _jspx_push_body_count_c_005fforEach_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f1 = _jspx_th_c_005fforEach_005f1.doStartTag();
      if (_jspx_eval_c_005fforEach_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td title=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${attachments.wbwjm}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" class=\"text-left\"><a key=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${attachments.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" href=\"javascript:void(0)\" onclick=\"openAttachmentWinEdit(this)\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${attachments.wbwjm}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write('.');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${attachments.hzm}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</a></td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"text-left\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${attachments.wjdxStr}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"text-left\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${attachments.czrname}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"text-center\">");
          if (_jspx_meth_fmt_005fformatDate_005f3(_jspx_th_c_005fforEach_005f1, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f1))
            return true;
          out.write("</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f1.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f1);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_005fformatDate_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_005fformatDate_005f3 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    _jspx_th_fmt_005fformatDate_005f3.setPageContext(_jspx_page_context);
    _jspx_th_fmt_005fformatDate_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f1);
    // /WEB-INF/views/project2/shapeStructureRepair/structureRepair_view.jsp(220,38) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fformatDate_005f3.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${attachments.czsj}", java.util.Date.class, (PageContext)_jspx_page_context, null, false));
    // /WEB-INF/views/project2/shapeStructureRepair/structureRepair_view.jsp(220,38) name = pattern type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fformatDate_005f3.setPattern("yyyy-MM-dd HH:mm:ss");
    int _jspx_eval_fmt_005fformatDate_005f3 = _jspx_th_fmt_005fformatDate_005f3.doStartTag();
    if (_jspx_th_fmt_005fformatDate_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.reuse(_jspx_th_fmt_005fformatDate_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.reuse(_jspx_th_fmt_005fformatDate_005f3);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f6 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f6.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f6.setParent(null);
    // /WEB-INF/views/project2/shapeStructureRepair/structureRepair_view.jsp(235,68) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f6.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${shapeStructureRepair.is_xlxjc eq 1 }", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f6 = _jspx_th_c_005fif_005f6.doStartTag();
    if (_jspx_eval_c_005fif_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("checked");
        int evalDoAfterBody = _jspx_th_c_005fif_005f6.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f6);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f7(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f7 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f7.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f7.setParent(null);
    // /WEB-INF/views/project2/shapeStructureRepair/structureRepair_view.jsp(238,69) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f7.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${shapeStructureRepair.is_xlxjc eq 0 }", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f7 = _jspx_th_c_005fif_005f7.doStartTag();
    if (_jspx_eval_c_005fif_005f7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("checked");
        int evalDoAfterBody = _jspx_th_c_005fif_005f7.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f7);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f7);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f2.setParent(null);
    // /WEB-INF/views/project2/shapeStructureRepair/structureRepair_view.jsp(283,12) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f2.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/project2/shapeStructureRepair/structureRepair_view.jsp(283,12) '${shapeStructureRepair.xlhAttachment}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${shapeStructureRepair.xlhAttachment}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/views/project2/shapeStructureRepair/structureRepair_view.jsp(283,12) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f2.setVar("attachments");
    // /WEB-INF/views/project2/shapeStructureRepair/structureRepair_view.jsp(283,12) name = varStatus type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f2.setVarStatus("status");
    int[] _jspx_push_body_count_c_005fforEach_005f2 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f2 = _jspx_th_c_005fforEach_005f2.doStartTag();
      if (_jspx_eval_c_005fforEach_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td title=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${attachments.wbwjm}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" class=\"text-left\"><a key=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${attachments.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" href=\"javascript:void(0)\" onclick=\"openAttachmentWinEdit(this)\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${attachments.wbwjm}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write('.');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${attachments.hzm}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</a></td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"text-left\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${attachments.wjdxStr}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"text-left\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${attachments.czrname}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"text-center\">");
          if (_jspx_meth_fmt_005fformatDate_005f4(_jspx_th_c_005fforEach_005f2, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f2))
            return true;
          out.write("</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f2.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f2);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_005fformatDate_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f2, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_005fformatDate_005f4 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    _jspx_th_fmt_005fformatDate_005f4.setPageContext(_jspx_page_context);
    _jspx_th_fmt_005fformatDate_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f2);
    // /WEB-INF/views/project2/shapeStructureRepair/structureRepair_view.jsp(288,38) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fformatDate_005f4.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${attachments.czsj}", java.util.Date.class, (PageContext)_jspx_page_context, null, false));
    // /WEB-INF/views/project2/shapeStructureRepair/structureRepair_view.jsp(288,38) name = pattern type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fformatDate_005f4.setPattern("yyyy-MM-dd HH:mm:ss");
    int _jspx_eval_fmt_005fformatDate_005f4 = _jspx_th_fmt_005fformatDate_005f4.doStartTag();
    if (_jspx_th_fmt_005fformatDate_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.reuse(_jspx_th_fmt_005fformatDate_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.reuse(_jspx_th_fmt_005fformatDate_005f4);
    return false;
  }
}
