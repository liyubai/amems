package org.apache.jsp.WEB_002dINF.views.material.stock;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.sql.*;

public final class stock_005fmain_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

static private org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_0;
static private org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_1;

static {
  _jspx_fnmap_0= org.apache.jasper.runtime.ProtectedFunctionMapper.getMapForFunction("fn:length", org.apache.taglibs.standard.functions.Functions.class, "length", new Class[] {java.lang.Object.class});
  _jspx_fnmap_1= org.apache.jasper.runtime.ProtectedFunctionMapper.getMapForFunction("erayFns:escapeStr", com.eray.common.jstl.StringUtils.class, "escapeStr", new Class[] {java.lang.String.class});
}

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(6);
    _jspx_dependants.add("/WEB-INF/views/common_new.jsp");
    _jspx_dependants.add("/WEB-INF/views/alert.jsp");
    _jspx_dependants.add("/WEB-INF/views/material/stock/fieldmaterial_main.jsp");
    _jspx_dependants.add("/WEB-INF/views/material/stock/assage_main.jsp");
    _jspx_dependants.add("/WEB-INF/views/open_win/import.jsp");
    _jspx_dependants.add("/WEB-INF/tld/erayFns.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fchoose;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fotherwise;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fchoose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fotherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
    _005fjspx_005ftagPool_005fc_005fchoose.release();
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fotherwise.release();
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
      out.write("<title></title>\r\n");
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
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("var tdbjh = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${bjh}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\";\r\n");
      out.write("var tddprtcode = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dprtcode}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\";\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"page-header-fixed\">\r\n");
      out.write("\t<input type=\"hidden\" id=\"fazhi\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${threshold}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" />\r\n");
      out.write("\t<input type=\"hidden\" id=\"fazhi1\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${threshold1}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" />\r\n");
      out.write("\t<input type=\"hidden\" id=\"zzjgid\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.jgdm}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" />\r\n");
      out.write("\t<!-- BEGIN HEADER -->\r\n");
      out.write("\t<div class=\"clearfix\"></div>\r\n");
      out.write("\t<!-- BEGIN CONTAINER -->\r\n");
      out.write("\r\n");
      out.write("\t<!-- BEGIN CONTENT -->\r\n");
      out.write("\t<div class=\"page-content \">\r\n");
      out.write("\t\t<!-- BEGIN PAGE TITLE & BREADCRUMB-->\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"panel panel-primary\">\r\n");
      out.write("\t\t\r\n");
      out.write("<div class=\"panel-heading\" id=\"NavigationBar\"></div>\r\n");
      out.write("\t\t\t<div class=\"clearfix\"></div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"panel-body padding-bottom-0 \" style=\"padding-top: 10px;\">\r\n");
      out.write("\t\t\t\t<!-----标签导航start---->\r\n");
      out.write("\t\t\t\t<ul class=\"nav nav-tabs\" role=\"tablist\" id=\"tablist\">\r\n");
      out.write("\t\t\t\t\t<li role=\"presentation\" class=\"active\"><a href=\"#stock\">在库航材列表 List Of Library Materials</a></li>\r\n");
      out.write("\t\t\t\t\t<li role=\"presentation\"><a href=\"#fieldmaterial\">外场航材列表 List Of Field Equipment</a></li>\r\n");
      out.write("\t\t\t\t\t<li role=\"presentation\"><a href=\"#assage\">在途航材列表 List Of Way Materials</a></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<!-----标签内容start---->\r\n");
      out.write("\t\t\t\t<div class=\"tab-content \">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"tab-pane fade in active\" id=\"stock\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-xs-12 padding-left-0 padding-right-0 margin-bottom-0\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t<!--------搜索框start-------->\r\n");
      out.write("\t\t\t\t<div style=\"float: left;margin-left: -10px\">\r\n");
      out.write("\t\t\t\t<button type=\"button\" onclick=\"stockOutPDF();\"  style=\"margin-left:10px\"\r\n");
      out.write("\t\t\t\t\t\tclass=\"btn btn-primary padding-top-1 padding-bottom-1 pull-left\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"font-size-12\">打印</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"font-size-9\">Print</div>\r\n");
      out.write("\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t\t<button type=\"button\" onclick=\"showImportModal();\"  style=\"margin-left:10px\"\r\n");
      out.write("\t\t\t\t\tclass=\"btn btn-primary padding-top-1 padding-bottom-1 pull-left\">\r\n");
      out.write("\t\t\t\t\t<div class=\"font-size-12\">导入</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"font-size-9\">Import</div>\r\n");
      out.write("\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\" pull-right padding-left-0 padding-right-0\" >\r\n");
      out.write("\t\t\t\t\t<div class=\" pull-left\">\r\n");
      out.write("\t\t\t\t\t<div class=\"pull-left  text-right padding-left-0 padding-right-0\">\r\n");
      out.write("\t\t\t\t\t\t  <div class=\"font-size-12\">仓库</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"font-size-9\">Store</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div class=\" padding-left-8 pull-left\" style=\"width: 200px; margin-right:10px;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<select class='form-control' id='ckh' name=\"ckh\" onchange=\"searchRevision()\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<div class=\" pull-left padding-left-0 padding-right-0 row-height \" style=\"width:250px;\" >\r\n");
      out.write("\t\t\t\t\t\t<input placeholder=\"件号/中英文/厂家件号/ID\" id=\"keyword_search\" class=\"form-control \" type=\"text\">\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("                    <div class=\" pull-right padding-left-5 padding-right-0 \">   \r\n");
      out.write("\t\t\t\t\t\t<button type=\"button\" class=\" btn btn-primary padding-top-1 padding-bottom-1 \" onclick=\"searchRevision();\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"font-size-12\">搜索</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"font-size-9\">Search</div>\r\n");
      out.write("                   \t\t</button>\r\n");
      out.write("                         <button type=\"button\" class=\"btn btn-primary dropdown-toggle padding-top-1 padding-bottom-1 resizeHeight\" id=\"btn\" onclick=\"search();\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"pull-left text-center\"><div class=\"font-size-12\">更多</div><div class=\"font-size-9\">More</div></div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"pull-left padding-top-5\">\r\n");
      out.write("\t\t\t\t\t\t\t &nbsp;<i class=\"font-size-15 icon-caret-down\" id=\"icon\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t   \t\t</button>\r\n");
      out.write("                    </div> \r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<!------------搜索框end------->\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-lg-12 col-sm-12 col-xs-12 triangle  padding-top-10  margin-top-10 display-none border-cccccc search-height\"\r\n");
      out.write("\t\t\t\t\t\t\t\tid=\"divSearch\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-lg-12 col-sm-12 col-xs-12 padding-left-0 padding-right-0\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-lg-3 col-sm-6 col-xs-12 padding-left-0 padding-right-0 \">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tclass=\"pull-left col-xs-4 col-sm-4 text-right padding-left-0 padding-right-0 \">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"font-size-12\">航材类型</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"font-size-9\">Airmaterial type</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tclass=\"form-group col-xs-8 col-sm-8 padding-left-8 padding-right-0\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<select id=\"hclx\" class=\"form-control \" name=\"hclx\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"\">显示全部All</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-lg-3 col-sm-6 col-xs-12 padding-left-0 padding-right-0 \">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tclass=\"pull-left col-xs-4 col-sm-4 text-right padding-left-0 padding-right-0 \">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"font-size-12\">状态</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"font-size-9\">State</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tclass=\"form-group col-xs-8 col-sm-8 padding-left-8 padding-right-0\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<select id=\"zt\" class=\"form-control \" name=\"zt\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"\">显示全部All</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"1\">收货</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"2\">正常</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"3\">冻结</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"4\">待报废</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"col-lg-3 col-sm-6 col-xs-12  padding-left-0 padding-right-0 margin-bottom-10  \">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<span\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tclass=\"pull-left col-xs-4 col-sm-4 text-right padding-left-0 padding-right-0\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"font-size-12\">组织机构</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"font-size-9\">Organization</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"col-xs-8 col-sm-8 padding-left-8 padding-right-0\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<select id=\"dprtcode\" class=\"form-control \" name=\"dprtcode\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_c_005fchoose_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-lg-2 pull-right text-right padding-right-0\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tstyle=\"margin-bottom: 10px;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<button type=\"button\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tclass=\"btn btn-primary padding-top-1 padding-bottom-1\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tonclick=\"searchreset();\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"font-size-12\">重置</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"font-size-9\">Reset</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"hidden\" id=\"adjustHeight\" value=\"60\">\r\n");
      out.write("\t<div  class=\"col-xs-12 text-center padding-left-0 padding-right-0 padding-top-0 table-h\"  style=\"overflow-x:scroll\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<table id=\"zkhc\" class=\"table table-thin table-bordered table-set\" style=\"min-width:3000px\">\r\n");
      out.write("\t\t\t\t\t\t\t<thead>\r\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th class='fixed-column colwidth-7'  style=\"vertical-align: middle;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"javascript:checkAll();\" class=\"pull-left margin-left-10 margin-bottom-10\" id='checkAll' ><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/static/assets/img/d1.png\" alt=\"全选\" title=\"全选\" /></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"javascript:notCheckAll();\" class=\"pull-left margin-left-10 margin-bottom-10\" id='cancelAll'><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/static/assets/img/d2.png\" alt=\"不全选\" title=\"不全选\" /></a> \r\n");
      out.write("\t\t\t\t\t\t\t\t\t</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th class='fixed-column colwidth-5' ><div\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tclass=\"font-size-12 line-height-18\">序号</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"font-size-9 line-height-18\">No.</div></th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th class='fixed-column sorting colwidth-15' \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tonclick=\"orderBy('bjh')\" id=\"bjh_order\"><div class=\"important\"><div\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tclass=\"font-size-12 line-height-18\">件号</div></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"font-size-9 line-height-18\">P/N</div></th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th class='sorting colwidth-30' \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tonclick=\"orderBy('ywms')\" id=\"ywms_order\"><div class=\"important\"><div\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tclass=\"font-size-12 line-height-18\">英文名称</div></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"font-size-9 line-height-18\">F.Name</div></th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th class='sorting colwidth-25' \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tonclick=\"orderBy('zwms')\" id=\"zwms_order\"><div class=\"important\"><div\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tclass=\"font-size-12 line-height-18\">中文名称</div></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"font-size-9 line-height-18\">CH.Name</div></th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th  class=\"sorting colwidth-15\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tonclick=\"orderBy('cjjh')\" id=\"cjjh_order\"><div class=\"important\"><div\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tclass=\"font-size-12 line-height-18\">厂家件号</div></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"font-size-9 line-height-18\">MP/N</div></th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th  class=\"sorting colwidth-9\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tonclick=\"orderBy('hclx')\" id=\"hclx_order\"><div\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tclass=\"font-size-12 line-height-18\">航材类型</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"font-size-9 line-height-18\">Airmaterial type</div></th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th  class=\"sorting colwidth-10\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tonclick=\"orderBy('gljb')\" id=\"gljb_order\"><div\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tclass=\"font-size-12 line-height-18\">航材管理级别</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"font-size-9 line-height-18\">Level</div></th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th  class=\"sorting colwidth-15\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tonclick=\"orderBy('sn')\" id=\"sn_order\"><div\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tclass=\"font-size-12 line-height-18\">序列号</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"font-size-9 line-height-18\">S/N</div></th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th  class=\"sorting colwidth-15\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tonclick=\"orderBy('pch')\" id=\"pch_order\"><div\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tclass=\"font-size-12 line-height-18\">批次号</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"font-size-9 line-height-18\">B/N</div></th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th  id=\"shzh_order\" class=\"sorting colwidth-15\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tonclick=\"orderBy('shzh')\"><div\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tclass=\"font-size-12 line-height-18\">适航证号</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"font-size-9 line-height-18\">Certificate Of No.</div></th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th  id=\"kcsl_order\" class=\"sorting colwidth-5\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tonclick=\"orderBy('kcsl')\"><div\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tclass=\"font-size-12 line-height-18\">数量</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"font-size-9 line-height-18\">Num</div></th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th class=\"colwidth-5\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"font-size-12 line-height-18\">替代数量</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"font-size-9 line-height-18\">Num</div></th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th  class=\"sorting colwidth-5\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tonclick=\"orderBy('jldw')\" id=\"jldw_order\"><div\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tclass=\"font-size-12 line-height-18\">单位</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"font-size-9 line-height-18\">Unit</div></th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th  id=\"ckmc_order\" class=\"sorting colwidth-9\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tonclick=\"orderBy('ckmc')\"><div\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tclass=\"font-size-12 line-height-18\">仓库</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"font-size-9 line-height-18\">Store</div></th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th  id=\"kwh_order\" class=\"sorting colwidth-10\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tonclick=\"orderBy('kwh')\"><div\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tclass=\"font-size-12 line-height-18\">库位</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"font-size-9 line-height-18\">Storage Location</div></th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th  id=\"hjsm_order\" class=\"sorting colwidth-10\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tonclick=\"orderBy('hjsm')\"><div\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tclass=\"font-size-12 line-height-18\">货架寿命</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"font-size-9 line-height-18\">Shelf-Life</div></th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th  id=\"syts_order\" class=\"sorting colwidth-10\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tonclick=\"orderBy('syts')\"><div class=\"font-size-12 line-height-18\">剩余货架寿命</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"font-size-9 line-height-18\">Shelf-Life(day)</div></th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th  id=\"spqx_order\" class=\"sorting colwidth-9\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tonclick=\"orderBy('spqx')\"><div\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tclass=\"font-size-12 line-height-18\">索赔期限</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"font-size-9 line-height-18\">Claim Period</div></th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th  id=\"sytss_order\" class=\"sorting colwidth-10\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tonclick=\"orderBy('sytss')\"><div class=\"font-size-12 line-height-18\">剩余索赔天数</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"font-size-9 line-height-18\">Claim Period(day)</div></th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th   id=\"rkrid_order\" onclick=\"orderBy('rkrid')\" class=\"sorting colwidth-15\" ><div\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tclass=\"font-size-12 line-height-18\">维护人</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"font-size-9 line-height-18\">Maintainer</div></th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th  id=\"rksj_order\" onclick=\"orderBy('rksj')\" class=\"sorting colwidth-13\" >\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"font-size-12 line-height-18\">维护时间</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"font-size-9 line-height-18\">Maintenance Time</div></th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th  id=\"zt_order\" class=\"sorting colwidth-5\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tonclick=\"orderBy('zt')\"><div\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tclass=\"font-size-12 line-height-18\">状态</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"font-size-9 line-height-18\">State</div></th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th  id=\"dprtcode_order\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"sorting colwidth-20\" onclick=\"orderBy('dprtcode')\"><div\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tclass=\"font-size-12 line-height-18\">组织机构</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"font-size-9 line-height-18\">Organization</div></th>\r\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t\t\t\t<tbody id=\"list\">\r\n");
      out.write("\t\t\t\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\" col-xs-12  text-center page-height padding-left-0 padding-right-0\" id=\"pagination\">\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"tab-pane fade\" id=\"fieldmaterial\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"row feature\">\r\n");
      out.write("\t\t\t\t\t\t");
      out.write("\r\n");
      out.write("<div  class=\"tab-pane fade in active\" style=\"padding-left:15px;padding-right:15px;\" id=\"fieldmaterial\" >\r\n");
      out.write("\t\t<div class=\" col-xs-12 padding-left-0 padding-right-0 \">\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<!--------搜索框start-------->\r\n");
      out.write("\t\t\t\t<div class=\" pull-right padding-left-0 padding-right-0\" >\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t\t\t<div class=\" pull-left padding-left-0 padding-right-0 row-height  \" style=\"width:250px;\" >\r\n");
      out.write("\t\t\t\t\t\t<input placeholder=\"件号/中英文/厂家件号\" id=\"keyword_search2\" class=\"form-control \" type=\"text\">\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("                    <div class=\" pull-right padding-left-5 padding-right-0 \">   \r\n");
      out.write("\t\t\t\t\t\t<button type=\"button\" class=\" btn btn-primary padding-top-1 padding-bottom-1 \" onclick=\"searchRevision2();\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"font-size-12\">搜索</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"font-size-9\">Search</div>\r\n");
      out.write("                   \t\t</button>\r\n");
      out.write("                         <button type=\"button\" class=\"btn btn-primary dropdown-toggle padding-top-1 padding-bottom-1 resizeHeight\" id=\"btn\" onclick=\"search2();\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"pull-left text-center\"><div class=\"font-size-12\">更多</div><div class=\"font-size-9\">More</div></div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"pull-left padding-top-5\">\r\n");
      out.write("\t\t\t\t\t\t\t &nbsp;<i class=\"font-size-15 icon-caret-down\" id=\"icon2\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t   \t\t</button>\r\n");
      out.write("                    </div> \r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<!------------搜索框end------->\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<div class=\"col-lg-12 col-sm-12 col-xs-12 triangle  padding-top-10  margin-top-10 display-none border-cccccc search-height\" id=\"divSearch2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-lg-12 col-sm-12 col-xs-12 padding-left-0 padding-right-0\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-lg-3 col-sm-6 col-xs-12 padding-left-0 padding-right-0 \">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tclass=\"pull-left col-xs-4 col-sm-4 col-lg-4 text-right padding-left-0 padding-right-0 \">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"font-size-12\">航材类型</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"font-size-9\">Airmaterial type</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tclass=\"form-group col-xs-8 col-sm-8 col-lg-8 padding-left-8 padding-right-0\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<select id=\"hclx2\" class=\"form-control \" name=\"hclx2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"\">显示全部All</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-lg-3 col-sm-6 col-xs-12 padding-left-0 padding-right-0 \">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tclass=\"pull-left col-xs-4 col-sm-4 col-lg-4 text-right padding-left-0 padding-right-0 \">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"font-size-12\">状态</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"font-size-9\">State</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tclass=\"form-group col-xs-8 col-sm-8 col-lg-8 padding-left-8 padding-right-0\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<select id=\"zt2\" class=\"form-control \" name=\"zt2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"\">显示全部All</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"2\">正常</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"3\">冻结</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"4\">待报废</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"col-lg-3 col-sm-6 col-xs-12  padding-left-0 padding-right-0 margin-bottom-10  \">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<span\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tclass=\"pull-left col-xs-4 col-sm-4 col-lg-4 text-right padding-left-0 padding-right-0\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"font-size-12\">组织机构</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"font-size-9\">Organization</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"col-xs-8 col-sm-8 col-lg-8 padding-left-8 padding-right-0\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<select id=\"dprtcode2\" class=\"form-control \" name=\"dprtcode2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_c_005fchoose_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-lg-2 pull-right text-right padding-right-0\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tstyle=\"margin-bottom: 10px;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<button type=\"button\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tclass=\"btn btn-primary padding-top-1 padding-bottom-1\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tonclick=\"searchreset2();\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"font-size-12\">重置</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"font-size-9\">Reset</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div  class=\" col-xs-12 text-center padding-left-0 padding-right-0 table-h\" style=\"overflow-x:scroll \"> \r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<table id=\"wchc\" class=\"table table-thin table-bordered text-center table-set\" style=\"min-width: 1500px !important\">\r\n");
      out.write("\t\t\t\t\t\t\t<thead>\r\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th class='fixed-column colwidth-5' style=\"vertical-align: middle;\"><div\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tclass=\"font-size-12 line-height-18\">序号</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"font-size-9 line-height-18\">No.</div></th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th class='fixed-column sorting colwidth-15' \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tname=\"column_bjh\" onclick=\"orderBy2('bjh',this)\" ><div class=\"important\"><div\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tclass=\"font-size-12 line-height-18\">件号</div></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"font-size-9 line-height-18\">P/N</div></th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th class=' sorting colwidth-30' \r\n");
      out.write("\t\t\t\t\t\t\t\t\tname=\"column_ywms\"\tonclick=\"orderBy2('ywms',this)\"><div class=\"important\"><div\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tclass=\"font-size-12 line-height-18\">英文名称</div></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"font-size-9 line-height-18\">F.Name</div></th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th class=' sorting colwidth-25' \r\n");
      out.write("\t\t\t\t\t\t\t\t\tname=\"column_zwms\"\tonclick=\"orderBy2('zwms',this)\"><div class=\"important\"><div\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tclass=\"font-size-12 line-height-18\">中文名称</div></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"font-size-9 line-height-18\">CH.Name</div></th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th  class=\"sorting colwidth-15\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tname=\"column_cjjh\"\tonclick=\"orderBy2('cjjh',this)\"><div class=\"important\"><div\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tclass=\"font-size-12 line-height-18\">厂家件号</div></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"font-size-9 line-height-18\">MP/N</div></th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th  class=\"sorting colwidth-9\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tname=\"column_hclx\"\tonclick=\"orderBy2('hclx',this)\"><div\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tclass=\"font-size-12 line-height-18\">航材类型</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"font-size-9 line-height-18\">Airmaterial type</div></th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th  class=\"sorting colwidth-10\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tname=\"column_gljb\"\tonclick=\"orderBy2('gljb',this)\"><div\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tclass=\"font-size-12 line-height-18\">航材管理级别</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"font-size-9 line-height-18\">Level</div></th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th  class=\"sorting colwidth-15\" name=\"column_sn\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tonclick=\"orderBy2('sn',this)\"><div\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tclass=\"font-size-12 line-height-18\">序列号</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"font-size-9 line-height-18\">S/N</div></th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th  class=\"sorting colwidth-15\" name=\"column_pch\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tonclick=\"orderBy2('pch',this)\"><div\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tclass=\"font-size-12 line-height-18\">批次号</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"font-size-9 line-height-18\">B/N</div></th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th   class=\"sorting colwidth-15\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tname=\"column_shzh\"\tonclick=\"orderBy2('shzh',this)\"><div\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tclass=\"font-size-12 line-height-18\">适航证号</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"font-size-9 line-height-18\">Certificate Of No.</div></th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th  class=\"sorting colwidth-5\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tname=\"column_kcsl\"\tonclick=\"orderBy2('kcsl',this)\"><div\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tclass=\"font-size-12 line-height-18\">数量</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"font-size-9 line-height-18\">Num</div></th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th  class=\"sorting colwidth-5\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tname=\"column_jldw\"\tonclick=\"orderBy2('jldw',this)\"><div\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tclass=\"font-size-12 line-height-18\">单位</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"font-size-9 line-height-18\">Unit</div></th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<!-- <th   class=\"sorting colwidth-6\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tname=\"column_ckmc\"\tonclick=\"orderBy2('ckmc',this)\"><div\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tclass=\"font-size-12 line-height-18\">仓库</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"font-size-9 line-height-18\">Store</div></th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th   class=\"sorting colwidth-6\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tname=\"column_kwh\"\tonclick=\"orderBy2('kwh',this)\"><div\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tclass=\"font-size-12 line-height-18\">库位</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"font-size-9 line-height-18\">Storage Location</div></th> -->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th  class=\"sorting colwidth-9\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tname=\"column_hjsm\"\tonclick=\"orderBy2('hjsm',this)\"><div\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tclass=\"font-size-12 line-height-18\">货架寿命</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"font-size-9 line-height-18\">Shelf-Life</div></th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th   class=\"sorting colwidth-9\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tname=\"column_syts\"\tonclick=\"orderBy2('syts',this)\"><div class=\"font-size-12 line-height-18\">剩余天数</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"font-size-9 line-height-18\">Surplus(day)</div></th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th  class=\"sorting colwidth-5\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tname=\"column_zt\"\tonclick=\"orderBy2('zt',this)\"><div\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tclass=\"font-size-12 line-height-18\">状态</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"font-size-9 line-height-18\">State</div></th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th  \r\n");
      out.write("\t\t\t\t\t\t\t\t\tname=\"column_dprtcode\"\tclass=\"sorting colwidth-20\" onclick=\"orderBy2('dprtcode',this)\"><div\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tclass=\"font-size-12 line-height-18\">组织机构</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"font-size-9 line-height-18\">Organization</div></th>\r\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t\t\t\t<tbody id=\"list2\">\r\n");
      out.write("\t\t\t\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\" col-xs-12  text-center page-height padding-left-0 padding-right-0\"  id=\"pagination2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/static/js/thjw/material/stock/fieldmaterial_main.js\"></script>\r\n");
      out.write("</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"tab-pane fade\" id=\"assage\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"row feature\">\r\n");
      out.write("\t\t\t\t\t\t\t");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"tab-pane fade in active\"\r\n");
      out.write("\tstyle=\"padding-left: 15px; padding-right: 15px;\" id=\"assage\">\r\n");
      out.write("\t<div class=\" col-xs-12 padding-left-0 padding-right-0 \">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<!--------搜索框start-------->\r\n");
      out.write("\t\t<div class=\" pull-right padding-left-0 padding-right-0\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\" pull-left padding-left-0 padding-right-0 row-height  \"\r\n");
      out.write("\t\t\t\tstyle=\"width: 250px;\">\r\n");
      out.write("\t\t\t\t<input placeholder=\"件号/中英文/厂家件号/合同号/供应商名称\" id=\"keyword_search1\"\r\n");
      out.write("\t\t\t\t\tclass=\"form-control \" type=\"text\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\" pull-right padding-left-5 padding-right-0 \">\r\n");
      out.write("\t\t\t\t<button type=\"button\"\r\n");
      out.write("\t\t\t\t\tclass=\" btn btn-primary padding-top-1 padding-bottom-1 \"\r\n");
      out.write("\t\t\t\t\tonclick=\"searchRevision1();\">\r\n");
      out.write("\t\t\t\t\t<div class=\"font-size-12\">搜索</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"font-size-9\">Search</div>\r\n");
      out.write("\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t<button type=\"button\"\r\n");
      out.write("\t\t\t\t\tclass=\"btn btn-primary dropdown-toggle padding-top-1 padding-bottom-1 resizeHeight\"\r\n");
      out.write("\t\t\t\t\tid=\"btn\" onclick=\"search1();\">\r\n");
      out.write("\t\t\t\t\t<div class=\"pull-left text-center\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"font-size-12\">更多</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"font-size-9\">More</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"pull-left padding-top-5\">\r\n");
      out.write("\t\t\t\t\t\t&nbsp;<i class=\"font-size-15 icon-caret-down\" id=\"icon1\"></i>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</button>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!------------搜索框end------->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<div\r\n");
      out.write("\t\t\tclass=\"col-lg-12 col-sm-12 col-xs-12 triangle  padding-top-10 margin-top-10 display-none border-cccccc search-height\"\r\n");
      out.write("\t\t\tid=\"divSearch1\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"col-lg-3 col-sm-6 col-xs-12 padding-left-0 padding-right-0\">\r\n");
      out.write("\t\t\t\t<span\r\n");
      out.write("\t\t\t\t\tclass=\"pull-left col-xs-4 col-sm-4 col-lg-4 text-right padding-left-0 padding-right-0 \">\r\n");
      out.write("\t\t\t\t\t<div class=\"font-size-12\">航材类型</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"font-size-9\">Airmaterial type</div>\r\n");
      out.write("\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t<div\r\n");
      out.write("\t\t\t\t\tclass=\"form-group col-xs-8 col-sm-8 col-lg-8 padding-left-8 padding-right-0\">\r\n");
      out.write("\t\t\t\t\t<select id=\"hclx1\" class=\"form-control \" name=\"hclx1\">\r\n");
      out.write("\t\t\t\t\t\t<option value=\"\">显示全部</option>\r\n");
      out.write("\t\t\t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f4(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"col-lg-3 col-sm-6 col-xs-12 padding-left-0 padding-right-0\">\r\n");
      out.write("\t\t\t\t\t<span\r\n");
      out.write("\t\t\t\t\tclass=\"pull-left col-xs-4 col-sm-4 col-lg-4 text-right padding-left-0 padding-right-0 \">\r\n");
      out.write("\t\t\t\t\t<div class=\"font-size-12\">在途类型</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"font-size-9\">Transit Type</div>\r\n");
      out.write("\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t<div\r\n");
      out.write("\t\t\t\t\tclass=\"form-group col-xs-8 col-sm-8 col-lg-8 padding-left-8 padding-right-0\">\r\n");
      out.write("\t\t\t\t\t<select id=\"lx\" class=\"form-control \" name=\"lx\">\r\n");
      out.write("\t\t\t\t\t\t<option value=\"\">显示全部</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"1\">提订航材</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"2\">送修航材</option>\r\n");
      out.write("\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div\r\n");
      out.write("\t\t\t\tclass=\"col-lg-3 col-sm-6 col-xs-12  padding-left-0 padding-right-0 margin-bottom-10  \">\r\n");
      out.write("\t\t\t\t<span\r\n");
      out.write("\t\t\t\t\tclass=\"pull-left col-xs-4 col-sm-4 col-lg-4 text-right padding-left-0 padding-right-0\">\r\n");
      out.write("\t\t\t\t\t<div class=\"font-size-12\">组织机构</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"font-size-9\">Organization</div>\r\n");
      out.write("\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t<div class=\"col-xs-8 col-sm-8 col-lg-8 padding-left-8 padding-right-0\">\r\n");
      out.write("\t\t\t\t\t<select id=\"dprtcode1\" class=\"form-control \" name=\"dprtcode1\"\r\n");
      out.write("\t\t\t\t\t\tonchange=\"changeSelectedPlane()\">\r\n");
      out.write("\t\t\t\t\t\t");
      if (_jspx_meth_c_005fchoose_005f2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"col-lg-2 pull-right text-right padding-right-0\"\r\n");
      out.write("\t\t\t\tstyle=\"margin-bottom: 10px;\">\r\n");
      out.write("\t\t\t\t<button type=\"button\"\r\n");
      out.write("\t\t\t\t\tclass=\"btn btn-primary padding-top-1 padding-bottom-1\"\r\n");
      out.write("\t\t\t\t\tonclick=\"searchreset1();\">\r\n");
      out.write("\t\t\t\t\t<div class=\"font-size-12\">重置</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"font-size-9\">Reset</div>\r\n");
      out.write("\t\t\t\t</button>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div\r\n");
      out.write("\t\tclass=\" col-xs-12 text-center  padding-left-0 padding-right-0 table-h\"\r\n");
      out.write("\t\tstyle=\"overflow-x: scroll\">\r\n");
      out.write("\r\n");
      out.write("\t\t<table id=\"zthc\"\r\n");
      out.write("\t\t\tclass=\"table table-thin table-bordered text-center table-set\"\r\n");
      out.write("\t\t\tstyle=\"min-width: 1500px !important\">\r\n");
      out.write("\t\t\t<thead>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th class=\"fixed-column colwidth-5\" style=\"vertical-align: middle;\"><div\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"font-size-12 line-height-18\">序号</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"font-size-9 line-height-18\">No.</div></th>\r\n");
      out.write("\t\t\t\t\t<th class=\"fixed-column sorting colwidth-15\" name=\"column_bjh\"\r\n");
      out.write("\t\t\t\t\t\tonclick=\"orderBy1('bjh',this)\"><div class=\"important\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"font-size-12 line-height-18\">件号</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"font-size-9 line-height-18\">P/N</div></th>\r\n");
      out.write("\t\t\t\t\t<th class=\"sorting colwidth-30\" name=\"column_ywms\"\r\n");
      out.write("\t\t\t\t\t\tonclick=\"orderBy1('ywms',this)\"><div class=\"important\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"font-size-12 line-height-18\">英文名称</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"font-size-9 line-height-18\">F.Name</div></th>\r\n");
      out.write("\t\t\t\t\t<th class=\"sorting colwidth-25\" name=\"column_zwms\"\r\n");
      out.write("\t\t\t\t\t\tonclick=\"orderBy1('zwms',this)\"><div class=\"important\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"font-size-12 line-height-18\">中文名称</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"font-size-9 line-height-18\">CH.Name</div></th>\r\n");
      out.write("\t\t\t\t\t<th class=\"sorting colwidth-15\" name=\"column_cjjh\"\r\n");
      out.write("\t\t\t\t\t\tonclick=\"orderBy1('cjjh',this)\"><div class=\"important\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"font-size-12 line-height-18\">厂家件号</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"font-size-9 line-height-18\">MP/N</div></th>\r\n");
      out.write("\t\t\t\t\t<th class=\"sorting colwidth-10\" name=\"column_gljb\"\r\n");
      out.write("\t\t\t\t\t\tonclick=\"orderBy1('gljb',this)\"><div\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"font-size-12 line-height-18\">航材管理级别</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"font-size-9 line-height-18\">Level</div></th>\r\n");
      out.write("\t\t\t\t\t<th class=\"sorting colwidth-9\" name=\"column_hclx\"\r\n");
      out.write("\t\t\t\t\t\tonclick=\"orderBy1('hclx',this)\"><div\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"font-size-12 line-height-18\">航材类型</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"font-size-9 line-height-18\">Aircraft Type</div></th>\r\n");
      out.write("\t\t\t\t\t<th class=\"sorting colwidth-5\" name=\"column_jldw\"\r\n");
      out.write("\t\t\t\t\t\tonclick=\"orderBy1('jldw',this)\"><div\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"font-size-12 line-height-18\">单位</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"font-size-9 line-height-18\">Unit</div></th>\r\n");
      out.write("\t\t\t\t\t<th class=\"sorting colwidth-15\" name=\"column_sn\"\r\n");
      out.write("\t\t\t\t\t\tonclick=\"orderBy1('sn',this)\"><div\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"font-size-12 line-height-18\">序列号</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"font-size-9 line-height-18\">S/N</div></th>\r\n");
      out.write("\t\t\t\t\t<th class=\"colwidth-7\"><div\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"font-size-12 line-height-18\">在途数量</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"font-size-9 line-height-18\">Passage Num</div></th>\r\n");
      out.write("\t\t\t\t\t\t<th class=\"colwidth-9\"><div\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"font-size-12 line-height-18\">合同号</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"font-size-9 line-height-18\">Contract No.</div></th>\r\n");
      out.write("\t\t\t\t\t\t\t<th class=\"colwidth-9\"><div\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"font-size-12 line-height-18\">供应商名称</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"font-size-9 line-height-18\">Supplier Name</div></th>\t\r\n");
      out.write("\t\t\t\t\t<th class=\"colwidth-10\"><div\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"font-size-12 line-height-18\">合同到货日期</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"font-size-9 line-height-18\">Arrival Contract\r\n");
      out.write("\t\t\t\t\t\t\tDate</div></th>\r\n");
      out.write("\t\t\t\t\t<th class=\"sorting colwidth-20\" name=\"column_dprtcode\"\r\n");
      out.write("\t\t\t\t\t\tonclick=\"orderBy1('dprtcode',this)\"><div\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"font-size-12 line-height-18\">组织机构</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"font-size-9 line-height-18\">Organization</div></th>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</thead>\r\n");
      out.write("\t\t\t<tbody id=\"list1\">\r\n");
      out.write("\t\t\t</tbody>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div\r\n");
      out.write("\t\tclass=\" col-xs-12  text-center page-height padding-left-0 padding-right-0\"\r\n");
      out.write("\t\tid=\"pagination1\"></div>\r\n");
      out.write("</div>\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/static/js/thjw/material/stock/assage_main.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<!-------替代部件对话框 Start-------->\r\n");
      out.write("<div class=\"modal fade\" id=\"AlertModalWinAddModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel\" aria-hidden=\"true\">\r\n");
      out.write("\t<div class=\"modal-dialog\" style=\"width: 80%;\">\r\n");
      out.write("\t\t<div class=\"modal-content\">\r\n");
      out.write("\t\t\t<div class=\"modal-body padding-bottom-0\" id=\"alertModalUserBody\">\r\n");
      out.write("\t\t\t  \t<div class=\"panel panel-primary\">\r\n");
      out.write("\t\t\t\t\t<div class=\"panel-heading  padding-top-3 padding-bottom-1\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"font-size-16 line-height-18\">替代库存</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"font-size-9 \">Stock Substitution</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"panel-body padding-top-0 padding-bottom-0\">\r\n");
      out.write("\t\t            \t<div class=\"col-lg-12 col-xs-12 padding-left-0 padding-right-0\">\r\n");
      out.write("\t\t            \t\r\n");
      out.write("\t\t            \t\t<div class=\" pull-right padding-left-0 padding-right-0 margin-top-10\">\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t<!-- 搜索框start -->\r\n");
      out.write("\t\t\t\t\t\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<!-- 搜索框end -->\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t            \t\r\n");
      out.write("\t\t\t         \t\t<div class=\"clearfix\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t<!-- start:table -->\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"margin-top-10 overflow-auto\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<table class=\"table table-bordered table-striped table-hover text-center table-set\" >\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<thead>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<th class='colwidth-5' >\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"font-size-12 line-height-18\">序号</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"font-size-9 line-height-18\">No.</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<th class='colwidth-15' >\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"font-size-12 line-height-18\">件号</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"font-size-9 line-height-18\">P/N</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<th class='colwidth-30'>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"font-size-12 line-height-18\">英文名称</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"font-size-9 line-height-18\">F.Name</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<th class='colwidth-25'>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"font-size-12 line-height-18\">中文名称</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"font-size-9 line-height-18\">CH.Name</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<th class=\"colwidth-8\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"font-size-12 line-height-18\">厂家件号</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"font-size-9 line-height-18\">MP/N</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<th class=\"colwidth-10\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"font-size-12 line-height-18\">航材类型</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"font-size-9 line-height-18\">Airmaterial type</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<th class=\"colwidth-20\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"font-size-12 line-height-18\">航材管理级别</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"font-size-9 line-height-18\">Aircraft Management Level</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<th class=\"colwidth-15\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"font-size-12 line-height-18\">序列号</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"font-size-9 line-height-18\">S/N</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<th class=\"colwidth-15\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"font-size-12 line-height-18\">批次号</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"font-size-9 line-height-18\">B/N</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<th class=\"colwidth-6\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"font-size-12 line-height-18\">适航证号</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"font-size-9 line-height-18\">Certificate Of No.</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<th class=\"colwidth-5\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"font-size-12 line-height-18\">数量</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"font-size-9 line-height-18\">Num</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<th class=\"colwidth-5\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"font-size-12 line-height-18\">单位</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"font-size-9 line-height-18\">Unit</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<th class=\"colwidth-6\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"font-size-12 line-height-18\">仓库</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"font-size-9 line-height-18\">Store</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<th class=\"colwidth-8\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"font-size-12 line-height-18\">库位</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"font-size-9 line-height-18\">Storage Location</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<th class=\"colwidth-8\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"font-size-12 line-height-18\">货架寿命</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"font-size-9 line-height-18\">Shelf-Life</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<th class=\"colwidth-10\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"font-size-12 line-height-18\">剩余货架寿命</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"font-size-9 line-height-18\">Shelf-Life(day)</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<th class=\"colwidth-8\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"font-size-12 line-height-18\">索赔期限</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"font-size-9 line-height-18\">Claim Period</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<th class=\"colwidth-15\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"font-size-12 line-height-18\">剩余索赔天数</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"font-size-9 line-height-18\">Claim Period(day)</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<th class=\"colwidth-15\" >\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"font-size-12 line-height-18\">维护人</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"font-size-9 line-height-18\">Maintainer</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<th class=\"colwidth-13\" >\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"font-size-12 line-height-18\">维护时间</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"font-size-9 line-height-18\">Maintenance Time</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<th class=\"colwidth-5\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"font-size-12 line-height-18\">状态</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"font-size-9 line-height-18\">State</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t \t\t </tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tbody id=\"stockSubList\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-xs-12 text-center page-height padding-right-0 padding-left-0\" id=\"stockSubPagination\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t<!-- end:table -->\r\n");
      out.write("\t\t                \t<div class=\"text-right margin-bottom-10\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<button type=\"button\" class=\"btn btn-primary padding-top-1 padding-bottom-1\" data-dismiss=\"modal\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"font-size-12\">关闭</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"font-size-9\">Close</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t                </div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("\t<!-------替代部件对话框 End-------->\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t<script type=\"text/javascript\"\r\n");
      out.write("\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/static/js/thjw/material/stock/stock_main.js\"></script>\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/static//js/tool/jquery-upload-file-master/css/uploadfile.css\" rel=\"stylesheet\">\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/static//js/tool/jquery-upload-file-master/jquery.uploadfile.min.js\"></script>\t\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/static/js/thjw/open_win/import.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write(".ajax-file-upload-statusbar{\r\n");
      out.write("\tdisplay: none;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<div class=\"modal fade modal-new\" id=\"ImportModal\" tabindex=\"-1\" role=\"dialog\"\r\n");
      out.write("\taria-labelledby=\"myModalLabel\" aria- hidden=\"true\" data-backdrop='static' data-keyboard= false>\r\n");
      out.write("\t<div class=\"modal-dialog\">\r\n");
      out.write("\t\t<div class=\"modal-content\">\r\n");
      out.write("\t\t<div class=\"modal-header modal-header-new\">\r\n");
      out.write("\t\t\t\t<h4 class=\"modal-title\" >\r\n");
      out.write("                <div class='pull-left'>\r\n");
      out.write("                    <div class=\"font-size-12\" >导入</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"font-size-9\" >Import</div>\r\n");
      out.write("\t\t  \t\t</div>\r\n");
      out.write("\t\t  \t\t<div class='pull-right' >\r\n");
      out.write("\t\t\t\t  \t<button type=\"button\" class=\"icon-remove modal-close\" data-dismiss=\"modal\" aria-label=\"Close\"></button>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t  \t\t<div class='clearfix'></div>\r\n");
      out.write("              \t</h4>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"modal-body padding-bottom-0\" id=\"ImportBody\">\r\n");
      out.write("\t\t\t\t<div class=\"col-xs-12 margin-top-8 \">\r\n");
      out.write("\t            <div class=\"input-group-border padding-bottom-8\">\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<label class=\"col-lg-2 text-right padding-left-0 padding-right-0\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"font-size-12 line-height-18\">\r\n");
      out.write("\t\t\t\t\t\t\t<span style=\"color: red\"></span>文件名称\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"font-size-9 line-height-18\">File Name</div>\r\n");
      out.write("\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-lg-8 padding-left-8 padding-right-0\" >\r\n");
      out.write("\t\t\t\t\t    <div class='input-group input-group-new'>\r\n");
      out.write("\t\t\t\t\t    <input type=\"text\" id=\"excelName\" maxlength=\"100\" class=\"form-control\"  >\r\n");
      out.write("\t\t\t\t\t    <div class='input-group-addon' style='padding:0px;'>\r\n");
      out.write("\t\t\t\t\t    <div id=\"excelImporter\" style='height:34px;'></div>\r\n");
      out.write("\t\t\t\t\t    </div>\r\n");
      out.write("\t\t\t\t\t    <div class='input-group-addon' id=\"downloadDiv\">\r\n");
      out.write("\t\t\t\t\t    <a href=\"javascript:void(0);\">下载导入模板</a>\r\n");
      out.write("\t\t\t\t\t    </div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class='clearfix'></div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class='clearfix'></div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"modal-footer\">\r\n");
      out.write("\t           \t<div class=\"col-xs-12 padding-leftright-8\" >\r\n");
      out.write("\t\t\t\t\t<div class=\"input-group\">\r\n");
      out.write("\t\t\t\t\t\t<span class=\"input-group-addon modalfootertip\" >\r\n");
      out.write("\t\t\t\t\t\t\t<!-- <i class='glyphicon glyphicon-info-sign alert-info'></i><p class=\"alert-info-message\"></p> -->\r\n");
      out.write("\t\t\t\t\t\t</span>\r\n");
      out.write("\t                    <span class=\"input-group-addon modalfooterbtn\">\r\n");
      out.write("\t\t                   <button  type=\"button\" class=\"btn btn-primary padding-top-1 padding-bottom-1\" data-dismiss=\"modal\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"font-size-12\">关闭</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"font-size-9\">Close</div>\r\n");
      out.write("\t\t\t\t\t\t\t</button>\r\n");
      out.write("\t                    </span>\r\n");
      out.write("\t               \t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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

  private boolean _jspx_meth_c_005fforEach_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /WEB-INF/views/material/stock/stock_main.jsp(106,12) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/material/stock/stock_main.jsp(106,12) '${materialTypeEnum}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${materialTypeEnum}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/views/material/stock/stock_main.jsp(106,12) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("item");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t  \t\t\t\t\t<option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write('"');
          out.write(' ');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</option>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
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
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fchoose_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_005fchoose_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fchoose_005f0.setParent(null);
    int _jspx_eval_c_005fchoose_005f0 = _jspx_th_c_005fchoose_005f0.doStartTag();
    if (_jspx_eval_c_005fchoose_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t");
        if (_jspx_meth_c_005fwhen_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t");
        if (_jspx_meth_c_005fotherwise_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fchoose_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fchoose_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_005fwhen_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fwhen_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
    // /WEB-INF/views/material/stock/stock_main.jsp(141,11) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fwhen_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${accessDepartment!=null && fn:length(accessDepartment) > 0}", java.lang.Boolean.class, (PageContext)_jspx_page_context, _jspx_fnmap_0, false)).booleanValue());
    int _jspx_eval_c_005fwhen_005f0 = _jspx_th_c_005fwhen_005f0.doStartTag();
    if (_jspx_eval_c_005fwhen_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t");
        if (_jspx_meth_c_005fforEach_005f1(_jspx_th_c_005fwhen_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fwhen_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fwhen_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fwhen_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f0);
    // /WEB-INF/views/material/stock/stock_main.jsp(142,11) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/material/stock/stock_main.jsp(142,11) '${accessDepartment}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${accessDepartment}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/views/material/stock/stock_main.jsp(142,11) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setVar("type");
    int[] _jspx_push_body_count_c_005fforEach_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f1 = _jspx_th_c_005fforEach_005f1.doStartTag();
      if (_jspx_eval_c_005fforEach_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${type.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\"\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
          if (_jspx_meth_c_005fif_005f0(_jspx_th_c_005fforEach_005f1, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f1))
            return true;
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${erayFns:escapeStr(type.dprtname)}", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_1, false));
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t</option>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t");
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
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f1);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f1);
    // /WEB-INF/views/material/stock/stock_main.jsp(144,13) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.jgdm eq type.id }", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("selected='selected'");
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

  private boolean _jspx_meth_c_005fotherwise_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_005fotherwise_005f0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _005fjspx_005ftagPool_005fc_005fotherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_005fotherwise_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fotherwise_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
    int _jspx_eval_c_005fotherwise_005f0 = _jspx_th_c_005fotherwise_005f0.doStartTag();
    if (_jspx_eval_c_005fotherwise_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"\">暂无组织机构 No Organization</option>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fotherwise_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fotherwise_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f2.setParent(null);
    // /WEB-INF/views/material/stock/fieldmaterial_main.jsp(38,12) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f2.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/material/stock/fieldmaterial_main.jsp(38,12) '${materialTypeEnum}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${materialTypeEnum}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/views/material/stock/fieldmaterial_main.jsp(38,12) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f2.setVar("item");
    int[] _jspx_push_body_count_c_005fforEach_005f2 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f2 = _jspx_th_c_005fforEach_005f2.doStartTag();
      if (_jspx_eval_c_005fforEach_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t  \t\t\t\t\t<option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write('"');
          out.write(' ');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</option>\r\n");
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
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f2);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fchoose_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f1 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_005fchoose_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fchoose_005f1.setParent(null);
    int _jspx_eval_c_005fchoose_005f1 = _jspx_th_c_005fchoose_005f1.doStartTag();
    if (_jspx_eval_c_005fchoose_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t");
        if (_jspx_meth_c_005fwhen_005f1(_jspx_th_c_005fchoose_005f1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t");
        if (_jspx_meth_c_005fotherwise_005f1(_jspx_th_c_005fchoose_005f1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fchoose_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fchoose_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f1);
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f1 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_005fwhen_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fwhen_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f1);
    // /WEB-INF/views/material/stock/fieldmaterial_main.jsp(70,11) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fwhen_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${accessDepartment!=null && fn:length(accessDepartment) > 0}", java.lang.Boolean.class, (PageContext)_jspx_page_context, _jspx_fnmap_0, false)).booleanValue());
    int _jspx_eval_c_005fwhen_005f1 = _jspx_th_c_005fwhen_005f1.doStartTag();
    if (_jspx_eval_c_005fwhen_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t");
        if (_jspx_meth_c_005fforEach_005f3(_jspx_th_c_005fwhen_005f1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fwhen_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fwhen_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f1);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fwhen_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f3 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f3.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f1);
    // /WEB-INF/views/material/stock/fieldmaterial_main.jsp(71,11) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f3.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/material/stock/fieldmaterial_main.jsp(71,11) '${accessDepartment}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${accessDepartment}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/views/material/stock/fieldmaterial_main.jsp(71,11) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f3.setVar("type");
    int[] _jspx_push_body_count_c_005fforEach_005f3 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f3 = _jspx_th_c_005fforEach_005f3.doStartTag();
      if (_jspx_eval_c_005fforEach_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${type.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\"\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
          if (_jspx_meth_c_005fif_005f1(_jspx_th_c_005fforEach_005f3, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f3))
            return true;
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${erayFns:escapeStr(type.dprtname)}", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_1, false));
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t</option>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f3.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f3.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f3);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f3, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f3)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f3);
    // /WEB-INF/views/material/stock/fieldmaterial_main.jsp(73,13) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.jgdm eq type.id }", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
    if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("selected='selected'");
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

  private boolean _jspx_meth_c_005fotherwise_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_005fotherwise_005f1 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _005fjspx_005ftagPool_005fc_005fotherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_005fotherwise_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fotherwise_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f1);
    int _jspx_eval_c_005fotherwise_005f1 = _jspx_th_c_005fotherwise_005f1.doStartTag();
    if (_jspx_eval_c_005fotherwise_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"\">暂无组织机构 No Organization</option>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fotherwise_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fotherwise_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f1);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f4 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f4.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f4.setParent(null);
    // /WEB-INF/views/material/stock/assage_main.jsp(56,6) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f4.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/material/stock/assage_main.jsp(56,6) '${materialTypeEnum}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${materialTypeEnum}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/views/material/stock/assage_main.jsp(56,6) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f4.setVar("item");
    int[] _jspx_push_body_count_c_005fforEach_005f4 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f4 = _jspx_th_c_005fforEach_005f4.doStartTag();
      if (_jspx_eval_c_005fforEach_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t<option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write('"');
          out.write(' ');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</option>\r\n");
          out.write("\t\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f4.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f4[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f4.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f4.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f4);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fchoose_005f2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f2 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_005fchoose_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005fchoose_005f2.setParent(null);
    int _jspx_eval_c_005fchoose_005f2 = _jspx_th_c_005fchoose_005f2.doStartTag();
    if (_jspx_eval_c_005fchoose_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t");
        if (_jspx_meth_c_005fwhen_005f2(_jspx_th_c_005fchoose_005f2, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t");
        if (_jspx_meth_c_005fotherwise_005f2(_jspx_th_c_005fchoose_005f2, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fchoose_005f2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fchoose_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f2);
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f2 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_005fwhen_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005fwhen_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f2);
    // /WEB-INF/views/material/stock/assage_main.jsp(88,7) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fwhen_005f2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${accessDepartment!=null && fn:length(accessDepartment) > 0}", java.lang.Boolean.class, (PageContext)_jspx_page_context, _jspx_fnmap_0, false)).booleanValue());
    int _jspx_eval_c_005fwhen_005f2 = _jspx_th_c_005fwhen_005f2.doStartTag();
    if (_jspx_eval_c_005fwhen_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t");
        if (_jspx_meth_c_005fforEach_005f5(_jspx_th_c_005fwhen_005f2, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fwhen_005f2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fwhen_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f2);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fwhen_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f5 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f5.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f2);
    // /WEB-INF/views/material/stock/assage_main.jsp(90,8) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f5.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/material/stock/assage_main.jsp(90,8) '${accessDepartment}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${accessDepartment}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/views/material/stock/assage_main.jsp(90,8) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f5.setVar("type");
    int[] _jspx_push_body_count_c_005fforEach_005f5 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f5 = _jspx_th_c_005fforEach_005f5.doStartTag();
      if (_jspx_eval_c_005fforEach_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${type.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\"\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t");
          if (_jspx_meth_c_005fif_005f2(_jspx_th_c_005fforEach_005f5, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f5))
            return true;
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${erayFns:escapeStr(type.dprtname)}", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_1, false));
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t</option>\r\n");
          out.write("\t\t\t\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f5.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f5[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f5.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f5.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f5);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f5, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f5)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f5);
    // /WEB-INF/views/material/stock/assage_main.jsp(92,10) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.jgdm eq type.id }", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f2 = _jspx_th_c_005fif_005f2.doStartTag();
    if (_jspx_eval_c_005fif_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("selected='selected'");
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

  private boolean _jspx_meth_c_005fotherwise_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_005fotherwise_005f2 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _005fjspx_005ftagPool_005fc_005fotherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_005fotherwise_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005fotherwise_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f2);
    int _jspx_eval_c_005fotherwise_005f2 = _jspx_th_c_005fotherwise_005f2.doStartTag();
    if (_jspx_eval_c_005fotherwise_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t<option value=\"\">暂无组织机构 No Organization</option>\r\n");
        out.write("\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fotherwise_005f2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fotherwise_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f2);
    return false;
  }
}
