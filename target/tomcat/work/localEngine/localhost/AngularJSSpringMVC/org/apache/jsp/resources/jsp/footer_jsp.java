package org.apache.jsp.resources.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class footer_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!--<div class=\"container-fluid\">-->\r\n");
      out.write("  \r\n");
      out.write("  <div class=\"col-md-4\">\r\n");
      out.write("    \r\n");
      out.write("    <ul class=\"nav navbar-nav navbar-left\">\r\n");
      out.write("      <img src=\"https://upload.wikimedia.org/wikipedia/commons/thumb/f/f9/Unisys_logo.svg/200px-Unisys_logo.svg.png\" align=\"left\" width=\"100px\"/>\r\n");
      out.write("    </ul>\r\n");
      out.write("\r\n");
      out.write("  </div>\r\n");
      out.write("    \r\n");
      out.write("  <div class=\"col-md-4\" id=\"copy\">\r\n");
      out.write("    <p><font color=\"white\">Powered by Unisys LEIDA <br/>&copy;All rights reserved</font></p>\r\n");
      out.write("  </div>\r\n");
      out.write("    <div class=\"col-md-4\">\r\n");
      out.write("  <div class=\"social\">\r\n");
      out.write("      <ul>\r\n");
      out.write("        <font color=\"#5AD427\" size=\"3px\">Follow Us:</font><font color=\"#FF3B30\"><span class=\"glyphicon glyphicon-thumbs-up\"></span></font>\r\n");
      out.write("          <li>\r\n");
      out.write("            <a href=\"https://www.facebook.com/UnisysCorp/\">\r\n");
      out.write("              <i class=\"fa fa-lg fa-facebook\"></i>\r\n");
      out.write("            </a>\r\n");
      out.write("          </li>\r\n");
      out.write("          <li>\r\n");
      out.write("            <a href=\"https://twitter.com/unisyscorp\">\r\n");
      out.write("              <i class=\"fa fa-lg fa-twitter\"></i>\r\n");
      out.write("            </a>\r\n");
      out.write("          </li>\r\n");
      out.write("          <li>\r\n");
      out.write("            <a href=\"https://www.linkedin.com/company/unisys\">\r\n");
      out.write("              <i class=\"fa fa-lg fa-linkedin\"></i>\r\n");
      out.write("            </a>\r\n");
      out.write("        </li>\r\n");
      out.write("      </ul>\r\n");
      out.write("  </div>\r\n");
      out.write("  </div>\r\n");
      out.write("<!--</div>-->");
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
}
