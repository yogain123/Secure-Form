package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("  <head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("  <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write(" <!-- Latest compiled and minified CSS -->\r\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js\"></script>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css\">\r\n");
      out.write("\r\n");
      out.write("<!-- Optional theme -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css\">\r\n");
      out.write("\r\n");
      out.write("<!-- Latest compiled and minified JavaScript -->\r\n");
      out.write("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js\"></script>\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"http://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.4.0/css/font-awesome.min.css\">\r\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/angularjs/1.5.0/angular.js\"></script>\r\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/angular-ui-router/0.2.18/angular-ui-router.js\"></script>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"resources/css/style.css\" />\r\n");
      out.write("  <link rel=\"shortcut icon\" href=\"data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABAAAAAQCAMAAAAoLQ9TAAAAMFBMVEX////98PPhLE7aACbbACn75ur63eLpZH3xobDXABTdDTP3yNH++friNlflRGLuiJvCDqpKAAAAYUlEQVQYlcWOuQHEMAzDaD3+JFn7bxv5rskGQQWiIqDaClV3LRo8DhVxuo2ISGDOxSzDmtrZ0wD0JbxnCQY1fBqE8xVUWNa4RucXPOv7Tu1D7vGiJVUhOtP/Aa69m5ne/QBkcgQ+cNNcFgAAAABJRU5ErkJggg==\">\r\n");
      out.write("    \r\n");
      out.write("  </head>\r\n");
      out.write("\r\n");
      out.write("  <body data-ng-app=\"app\">\r\n");
      out.write("      <div class=\"wrapper\">\r\n");
      out.write("      <header data-ng-include=\"'resources/jsp/nav.jsp'\"></header>\r\n");
      out.write("      <div class=\"wrapper1\">\r\n");
      out.write("          <div data-ui-view></div>\r\n");
      out.write("      </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <footer data-ng-include=\"'resources/jsp/footer.jsp'\"></footer>\r\n");
      out.write("  <script src=\"resources/javascript/app.js\"></script>\r\n");
      out.write("  <script src=\"resources/javascript/formService.js\"></script>\r\n");
      out.write("  <script src=\"resources/javascript/displayCtrl.js\"></script>\r\n");
      out.write("  <script src=\"resources/javascript/aboutCtrl.js\"></script>\r\n");
      out.write("  <script src=\"resources/javascript/homeCtrl.js\"></script>\r\n");
      out.write("  </body>\r\n");
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
}
