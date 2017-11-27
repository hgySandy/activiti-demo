package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(4);
    _jspx_dependants.add("/common/global.jsp");
    _jspx_dependants.add("/common/global-taglibs.jsp");
    _jspx_dependants.add("/common/meta.jsp");
    _jspx_dependants.add("/common/include-base-styles.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_set_var_value_nobody.release();
    _jspx_tagPool_c_if_test.release();
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t<title>《Activiti实战》示例第13章-登录系统</title>\n");
      out.write("\t");
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      if (_jspx_meth_c_set_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\tvar ctx = '");
      out.print(request.getContextPath() );
      out.write("';\n");
      out.write("</script>");
      out.write('\n');
      out.write('	');
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html;charset=UTF-8\"/>\r\n");
      out.write("<meta http-equiv=\"Cache-Control\" content=\"no-store\"/>\r\n");
      out.write("<meta http-equiv=\"Pragma\" content=\"no-cache\"/>\r\n");
      out.write("<meta http-equiv=\"Expires\" content=\"0\"/>");
      out.write("\n");
      out.write("    ");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/css/bootstrap.min.css\" type=\"text/css\"/>\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/css/bootstrap-responsive.min.css\" type=\"text/css\"/>\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/css/style.css\" type=\"text/css\"/>");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body style=\"margin-top: 3em;\">\n");
      out.write("\t<center>\n");
      out.write("\t");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write('\n');
      out.write('	');
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t<div style=\"width: 600px\">\n");
      out.write("\t\t<h2>第13章—《流程查询与跟踪》配套示例</h2>\n");
      out.write("\t\t<form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/user/logon\" method=\"get\">\n");
      out.write("\t\t\t<table>\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<td width=\"80\">用户名：</td>\n");
      out.write("\t\t\t\t\t<td><input id=\"username\" name=\"username\" style=\"width: 100px\" /></td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<td>密码：</td>\n");
      out.write("\t\t\t\t\t<td><input id=\"password\" name=\"password\" type=\"password\" style=\"width: 100px\" /></td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<td>&nbsp;</td>\n");
      out.write("\t\t\t\t\t<td>\n");
      out.write("\t\t\t\t\t\t<button type=\"submit\" class=\"btn btn-primary\">登录系统</button>\n");
      out.write("\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t</table>\n");
      out.write("\t\t</form>\n");
      out.write("\n");
      out.write("\t\t<div class=\"row\">\n");
      out.write("\t\t\t<h5>登录失败时请用终端进入");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("项目目录执行：<br/><code>mvn antrun:run -Pinit-db</code></h5>\n");
      out.write("\t\t\t<hr />\n");
      out.write("            <h4 class=\"text-info\">用户与角色列表（密码：000000）</h4>\n");
      out.write("            <table class=\"table table-hover\">\n");
      out.write("                <thead>\n");
      out.write("                <tr>\n");
      out.write("                    <th>#</th>\n");
      out.write("                    <th>用户名</th>\n");
      out.write("                    <th>角色</th>\n");
      out.write("                    <th>部门</th>\n");
      out.write("                </tr>\n");
      out.write("                </thead>\n");
      out.write("                <tbody>\n");
      out.write("                <tr>\n");
      out.write("                    <td>1</td>\n");
      out.write("                    <td>henry</td>\n");
      out.write("                    <td>系统管理员</td>\n");
      out.write("                    <th>IT部</th>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>2</td>\n");
      out.write("                    <td>bill</td>\n");
      out.write("                    <td>总经理</td>\n");
      out.write("                    <td>总经理室</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>3</td>\n");
      out.write("                    <td>jenny</td>\n");
      out.write("                    <td>人事经理</td>\n");
      out.write("                    <td>人事部</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr class=\"success\">\n");
      out.write("                    <td>4</td>\n");
      out.write("                    <td>kermit</td>\n");
      out.write("                    <td>部门经理</td>\n");
      out.write("                    <td>市场部</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr class=\"success\">\n");
      out.write("                    <td>5</td>\n");
      out.write("                    <td>eric</td>\n");
      out.write("                    <td>销售人员</td>\n");
      out.write("                    <td>市场部</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr class=\"success\">\n");
      out.write("                    <td>6</td>\n");
      out.write("                    <td>tom</td>\n");
      out.write("                    <td>销售人员</td>\n");
      out.write("                    <td>市场部</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr class=\"info\">\n");
      out.write("                    <td>7</td>\n");
      out.write("                    <td>andy</td>\n");
      out.write("                    <td>普通职员</td>\n");
      out.write("                    <td>业务部</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr class=\"info\">\n");
      out.write("                    <td>8</td>\n");
      out.write("                    <td>amy</td>\n");
      out.write("                    <td>普通职员</td>\n");
      out.write("                    <td>业务部</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr class=\"danger\">\n");
      out.write("                    <td>9</td>\n");
      out.write("                    <td>tony</td>\n");
      out.write("                    <td>财务人员</td>\n");
      out.write("                    <td>财务部</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr class=\"danger\">\n");
      out.write("                    <td>10</td>\n");
      out.write("                    <td>lily</td>\n");
      out.write("                    <td>出纳员</td>\n");
      out.write("                    <td>财务部</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>11</td>\n");
      out.write("                    <td>thomas</td>\n");
      out.write("                    <td>后勤人员</td>\n");
      out.write("                    <td>后勤部</td>\n");
      out.write("                </tr>\n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("\t    </div>\n");
      out.write("\t</div>\n");
      out.write("\t</center>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_set_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent(null);
    _jspx_th_c_set_0.setVar("ctx");
    _jspx_th_c_set_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
    return false;
  }

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty param.error}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t<h2 id=\"error\" class=\"alert alert-error\">用户名或密码错误！！！</h2>\n");
        out.write("\t");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty param.timeout}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t<h2 id=\"error\" class=\"alert alert-error\">未登录或超时！！！</h2>\n");
        out.write("\t");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }
}
