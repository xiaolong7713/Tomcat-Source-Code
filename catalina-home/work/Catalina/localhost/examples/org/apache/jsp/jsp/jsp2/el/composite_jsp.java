/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/@VERSION@
 * Generated at: 2017-11-18 16:18:23 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jsp.jsp2.el;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class composite_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/WEB-INF/jsp/example-taglib.tld", Long.valueOf(1510585990000L));
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fmy_005fvalues_0026_005fstring_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fmy_005fvalues_0026_005fdouble_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fmy_005fvalues_0026_005flong_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fmy_005fvalues_0026_005fstring_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fmy_005fvalues_0026_005fdouble_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fmy_005fvalues_0026_005flong_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fmy_005fvalues_0026_005fstring_005fnobody.release();
    _005fjspx_005ftagPool_005fmy_005fvalues_0026_005fdouble_005fnobody.release();
    _005fjspx_005ftagPool_005fmy_005fvalues_0026_005flong_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("  <head>\n");
      out.write("    <title>JSP 2.0 Expression Language - Composite Expressions</title>\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("    <h1>JSP 2.0 Expression Language - Composite Expressions</h1>\n");
      out.write("    <hr>\n");
      out.write("    This example illustrates EL composite expressions. Composite expressions\n");
      out.write("    are formed by grouping together multiple EL expressions. Each of them is\n");
      out.write("    evaluated from left to right, coerced to String, all those strings are\n");
      out.write("    concatenated, and the result is coerced to the expected type.\n");
      out.write("\n");
      out.write("    ");
      jsp2.examples.ValuesBean values = null;
      values = (jsp2.examples.ValuesBean) _jspx_page_context.getAttribute("values", javax.servlet.jsp.PageContext.PAGE_SCOPE);
      if (values == null){
        values = new jsp2.examples.ValuesBean();
        _jspx_page_context.setAttribute("values", values, javax.servlet.jsp.PageContext.PAGE_SCOPE);
      }
      out.write("\n");
      out.write("\n");
      out.write("    <blockquote>\n");
      out.write("      <code>\n");
      out.write("        <table border=\"1\">\n");
      out.write("          <thead>\n");
      out.write("        <td><b>EL Expression</b></td>\n");
      out.write("        <td><b>Type</b></td>\n");
      out.write("        <td><b>Result</b></td>\n");
      out.write("      </thead>\n");
      out.write("      <tr>\n");
      out.write("        <td>${'hello'} wo${'rld'}</td>\n");
      out.write("        <td>String</td>\n");
      out.write("        <td>");
      org.apache.jasper.runtime.JspRuntimeLibrary.handleSetPropertyExpression(_jspx_page_context.findAttribute("values"), "stringValue", "${'hello'} wo${'rld'}", _jspx_page_context, null);
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${values.stringValue}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</td>\n");
      out.write("      </tr>\n");
      out.write("      <tr>\n");
      out.write("        <td>${'hello'} wo${'rld'}</td>\n");
      out.write("        <td>String</td>\n");
      out.write("        <td>");
      if (_jspx_meth_my_005fvalues_005f0(_jspx_page_context))
        return;
      out.write("</td>\n");
      out.write("      </tr>\n");
      out.write("      <tr>\n");
      out.write("        <td>${1+2}.${220}</td>\n");
      out.write("        <td>Double</td>\n");
      out.write("        <td>");
      org.apache.jasper.runtime.JspRuntimeLibrary.handleSetPropertyExpression(_jspx_page_context.findAttribute("values"), "doubleValue", "${1+2}.${220}", _jspx_page_context, null);
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${values.doubleValue}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</td>\n");
      out.write("      </tr>\n");
      out.write("      <tr>\n");
      out.write("        <td>${1+2}.${220}</td>\n");
      out.write("        <td>Double</td>\n");
      out.write("        <td>");
      if (_jspx_meth_my_005fvalues_005f1(_jspx_page_context))
        return;
      out.write("</td>\n");
      out.write("      </tr>\n");
      out.write("      <tr>\n");
      out.write("        <td>000${1}${7}</td>\n");
      out.write("        <td>Long</td>\n");
      out.write("        <td>");
      org.apache.jasper.runtime.JspRuntimeLibrary.handleSetPropertyExpression(_jspx_page_context.findAttribute("values"), "longValue", "000${1}${7}", _jspx_page_context, null);
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${values.longValue}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</td>\n");
      out.write("      </tr>\n");
      out.write("      <tr>\n");
      out.write("        <td>000${1}${7}</td>\n");
      out.write("        <td>Long</td>\n");
      out.write("        <td>");
      if (_jspx_meth_my_005fvalues_005f2(_jspx_page_context))
        return;
      out.write("</td>\n");
      out.write("      </tr>\n");
      out.write("      <!--\n");
      out.write("         Undefined values are to be coerced to String, to be \"\",\n");
      out.write("         https://issues.apache.org/bugzilla/show_bug.cgi?id=47413\n");
      out.write("       -->\n");
      out.write("      <tr>\n");
      out.write("        <td>${undefinedFoo}hello world${undefinedBar}</td>\n");
      out.write("        <td>String</td>\n");
      out.write("        <td>");
      org.apache.jasper.runtime.JspRuntimeLibrary.handleSetPropertyExpression(_jspx_page_context.findAttribute("values"), "stringValue", "${undefinedFoo}hello world${undefinedBar}", _jspx_page_context, null);
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${values.stringValue}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</td>\n");
      out.write("      </tr>\n");
      out.write("      <tr>\n");
      out.write("        <td>${undefinedFoo}hello world${undefinedBar}</td>\n");
      out.write("        <td>String</td>\n");
      out.write("        <td>");
      if (_jspx_meth_my_005fvalues_005f3(_jspx_page_context))
        return;
      out.write("</td>\n");
      out.write("      </tr>\n");
      out.write("      <tr>\n");
      out.write("        <td>${undefinedFoo}${undefinedBar}</td>\n");
      out.write("        <td>Double</td>\n");
      out.write("        <td>");
      org.apache.jasper.runtime.JspRuntimeLibrary.handleSetPropertyExpression(_jspx_page_context.findAttribute("values"), "doubleValue", "${undefinedFoo}${undefinedBar}", _jspx_page_context, null);
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${values.doubleValue}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</td>\n");
      out.write("      </tr>\n");
      out.write("      <tr>\n");
      out.write("        <td>${undefinedFoo}${undefinedBar}</td>\n");
      out.write("        <td>Double</td>\n");
      out.write("        <td>");
      if (_jspx_meth_my_005fvalues_005f4(_jspx_page_context))
        return;
      out.write("</td>\n");
      out.write("      </tr>\n");
      out.write("      <tr>\n");
      out.write("        <td>${undefinedFoo}${undefinedBar}</td>\n");
      out.write("        <td>Long</td>\n");
      out.write("        <td>");
      org.apache.jasper.runtime.JspRuntimeLibrary.handleSetPropertyExpression(_jspx_page_context.findAttribute("values"), "longValue", "${undefinedFoo}${undefinedBar}", _jspx_page_context, null);
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${values.longValue}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</td>\n");
      out.write("      </tr>\n");
      out.write("      <tr>\n");
      out.write("        <td>${undefinedFoo}${undefinedBar}</td>\n");
      out.write("        <td>Long</td>\n");
      out.write("        <td>");
      if (_jspx_meth_my_005fvalues_005f5(_jspx_page_context))
        return;
      out.write("</td>\n");
      out.write("      </tr>\n");
      out.write("    </table>\n");
      out.write("      </code>\n");
      out.write("    </blockquote>\n");
      out.write("  </body>\n");
      out.write("</html>\n");
      out.write("\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_my_005fvalues_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  my:values
    examples.ValuesTag _jspx_th_my_005fvalues_005f0 = (examples.ValuesTag) _005fjspx_005ftagPool_005fmy_005fvalues_0026_005fstring_005fnobody.get(examples.ValuesTag.class);
    _jspx_th_my_005fvalues_005f0.setPageContext(_jspx_page_context);
    _jspx_th_my_005fvalues_005f0.setParent(null);
    // /jsp/jsp2/el/composite.jsp(49,12) name = string type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_my_005fvalues_005f0.setString((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${'hello'} wo${'rld'}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
    int _jspx_eval_my_005fvalues_005f0 = _jspx_th_my_005fvalues_005f0.doStartTag();
    if (_jspx_th_my_005fvalues_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fmy_005fvalues_0026_005fstring_005fnobody.reuse(_jspx_th_my_005fvalues_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fmy_005fvalues_0026_005fstring_005fnobody.reuse(_jspx_th_my_005fvalues_005f0);
    return false;
  }

  private boolean _jspx_meth_my_005fvalues_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  my:values
    examples.ValuesTag _jspx_th_my_005fvalues_005f1 = (examples.ValuesTag) _005fjspx_005ftagPool_005fmy_005fvalues_0026_005fdouble_005fnobody.get(examples.ValuesTag.class);
    _jspx_th_my_005fvalues_005f1.setPageContext(_jspx_page_context);
    _jspx_th_my_005fvalues_005f1.setParent(null);
    // /jsp/jsp2/el/composite.jsp(59,12) name = double type = double reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_my_005fvalues_005f1.setDouble(((java.lang.Double) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${1+2}.${220}", java.lang.Double.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false)).doubleValue());
    int _jspx_eval_my_005fvalues_005f1 = _jspx_th_my_005fvalues_005f1.doStartTag();
    if (_jspx_th_my_005fvalues_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fmy_005fvalues_0026_005fdouble_005fnobody.reuse(_jspx_th_my_005fvalues_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fmy_005fvalues_0026_005fdouble_005fnobody.reuse(_jspx_th_my_005fvalues_005f1);
    return false;
  }

  private boolean _jspx_meth_my_005fvalues_005f2(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  my:values
    examples.ValuesTag _jspx_th_my_005fvalues_005f2 = (examples.ValuesTag) _005fjspx_005ftagPool_005fmy_005fvalues_0026_005flong_005fnobody.get(examples.ValuesTag.class);
    _jspx_th_my_005fvalues_005f2.setPageContext(_jspx_page_context);
    _jspx_th_my_005fvalues_005f2.setParent(null);
    // /jsp/jsp2/el/composite.jsp(69,12) name = long type = long reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_my_005fvalues_005f2.setLong(((java.lang.Long) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("000${1}${7}", java.lang.Long.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false)).longValue());
    int _jspx_eval_my_005fvalues_005f2 = _jspx_th_my_005fvalues_005f2.doStartTag();
    if (_jspx_th_my_005fvalues_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fmy_005fvalues_0026_005flong_005fnobody.reuse(_jspx_th_my_005fvalues_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fmy_005fvalues_0026_005flong_005fnobody.reuse(_jspx_th_my_005fvalues_005f2);
    return false;
  }

  private boolean _jspx_meth_my_005fvalues_005f3(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  my:values
    examples.ValuesTag _jspx_th_my_005fvalues_005f3 = (examples.ValuesTag) _005fjspx_005ftagPool_005fmy_005fvalues_0026_005fstring_005fnobody.get(examples.ValuesTag.class);
    _jspx_th_my_005fvalues_005f3.setPageContext(_jspx_page_context);
    _jspx_th_my_005fvalues_005f3.setParent(null);
    // /jsp/jsp2/el/composite.jsp(83,12) name = string type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_my_005fvalues_005f3.setString((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${undefinedFoo}hello world${undefinedBar}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
    int _jspx_eval_my_005fvalues_005f3 = _jspx_th_my_005fvalues_005f3.doStartTag();
    if (_jspx_th_my_005fvalues_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fmy_005fvalues_0026_005fstring_005fnobody.reuse(_jspx_th_my_005fvalues_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fmy_005fvalues_0026_005fstring_005fnobody.reuse(_jspx_th_my_005fvalues_005f3);
    return false;
  }

  private boolean _jspx_meth_my_005fvalues_005f4(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  my:values
    examples.ValuesTag _jspx_th_my_005fvalues_005f4 = (examples.ValuesTag) _005fjspx_005ftagPool_005fmy_005fvalues_0026_005fdouble_005fnobody.get(examples.ValuesTag.class);
    _jspx_th_my_005fvalues_005f4.setPageContext(_jspx_page_context);
    _jspx_th_my_005fvalues_005f4.setParent(null);
    // /jsp/jsp2/el/composite.jsp(93,12) name = double type = double reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_my_005fvalues_005f4.setDouble(((java.lang.Double) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${undefinedFoo}${undefinedBar}", java.lang.Double.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false)).doubleValue());
    int _jspx_eval_my_005fvalues_005f4 = _jspx_th_my_005fvalues_005f4.doStartTag();
    if (_jspx_th_my_005fvalues_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fmy_005fvalues_0026_005fdouble_005fnobody.reuse(_jspx_th_my_005fvalues_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fmy_005fvalues_0026_005fdouble_005fnobody.reuse(_jspx_th_my_005fvalues_005f4);
    return false;
  }

  private boolean _jspx_meth_my_005fvalues_005f5(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  my:values
    examples.ValuesTag _jspx_th_my_005fvalues_005f5 = (examples.ValuesTag) _005fjspx_005ftagPool_005fmy_005fvalues_0026_005flong_005fnobody.get(examples.ValuesTag.class);
    _jspx_th_my_005fvalues_005f5.setPageContext(_jspx_page_context);
    _jspx_th_my_005fvalues_005f5.setParent(null);
    // /jsp/jsp2/el/composite.jsp(103,12) name = long type = long reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_my_005fvalues_005f5.setLong(((java.lang.Long) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${undefinedFoo}${undefinedBar}", java.lang.Long.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false)).longValue());
    int _jspx_eval_my_005fvalues_005f5 = _jspx_th_my_005fvalues_005f5.doStartTag();
    if (_jspx_th_my_005fvalues_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fmy_005fvalues_0026_005flong_005fnobody.reuse(_jspx_th_my_005fvalues_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fmy_005fvalues_0026_005flong_005fnobody.reuse(_jspx_th_my_005fvalues_005f5);
    return false;
  }
}
