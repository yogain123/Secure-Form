package org.apache.jsp.resources.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <div class=\"row\">\r\n");
      out.write("        <form role=\"form\" data-ng-controller=\"homeCtrl\" name=\"MyForm\" data-ng-submit=\"submittedForm()\" novalidate>\r\n");
      out.write("          <div>\r\n");
      out.write("            <div class=\"col-md-6\" style=\"background-color:#FFFFFF;\">\r\n");
      out.write("                  <div class=\"form-group\">\r\n");
      out.write("                    <label for=\"FirstName\"><font color=\"#000000\">FirstName</font><font color=\"red\">*</font>:\r\n");
      out.write("                    </label>\r\n");
      out.write("                    <br>\r\n");
      out.write("                    <input type=\"text\" data-ng-model=\"list.fname\" style=\"border:2px solid #2B2B2B;border-radius:5px\" id=\"fname\" placeholder=\"Enter your first name\" name=\"fname\" data-ng-required=\"true\">\r\n");
      out.write("                    <span class=\"help-block\" data-ng-show=\"(submitted || MyForm.fname.$touched)&&MyForm.fname.$error.required && MyForm.fname.$invalid\"><font color=\"#FF5B37\"><strong>\r\n");
      out.write("                      Your first name is required.</strong></font></span>\r\n");
      out.write("                  </div>\r\n");
      out.write("\r\n");
      out.write("                  <div class=\"form-group\">\r\n");
      out.write("                    <label for=\"LastName\"><font color=\"#000000\">LastName</font><font color=\"red\">*</font>:\r\n");
      out.write("                    </label>\r\n");
      out.write("                    <br>\r\n");
      out.write("                    <input type=\"text\" data-ng-model=\"list.lname\" style=\"border:2px solid #2B2B2B;border-radius:5px\" id=\"lname\" placeholder=\"Enter your last name\" name=\"lname\" data-ng-required=\"true\">\r\n");
      out.write("                    <span class=\"help-block\" data-ng-show=\"(submitted || MyForm.lname.$touched)&&MyForm.lname.$error.required && MyForm.lname.$invalid\"><font color=\"#FF5B37\"><strong>Your last name is required.</strong></font></span>\r\n");
      out.write("                  </div>\r\n");
      out.write("\r\n");
      out.write("                  <div class=\"form-group\">\r\n");
      out.write("                    <label for=\"DOB\"><font color=\"#000000\">Date of Birth</font><font color=\"red\">*</font>:\r\n");
      out.write("                    </label>\r\n");
      out.write("                    <br>\r\n");
      out.write("                    <input type=\"text\" data-ng-model=\"list.date\" style=\"border:2px solid #2B2B2B;border-radius:5px\" id=\"date\" placeholder=\"MM/DD/YYYY\"\r\n");
      out.write("                    name=\"dob\" data-ng-pattern=\"/^(0?[1-9]|1[012])\\/(0?[1-9]|[12][0-9]|3[01])\\/((19\\d{2})|([2-9]\\d{3}))$/\" data-ng-required=\"true\">\r\n");
      out.write("                    <span class=\"help-block\" data-ng-show=\"(submitted || MyForm.dob.$touched) && MyForm.dob.$error.required\"> <font color=\"#FF5B37\"><strong>Please enter your date of birth.</strong></font></span>\r\n");
      out.write("                    <span class=\"help-block\" data-ng-show=\"MyForm.dob.$error.pattern\"><font color=\"#FF5B37\"><strong>Incorrect Format.</strong></font></span>\r\n");
      out.write("                  </div>\r\n");
      out.write("\r\n");
      out.write("                  <div class=\"form-group\">\r\n");
      out.write("                    <label for=\"Address1\"><font color=\"#000000\">AddressLine1</font><font color=\"red\">*</font>:\r\n");
      out.write("                    </label>\r\n");
      out.write("                    <br>\r\n");
      out.write("                    <input type=\"text\" data-ng-model=\"list.addressline1\" style=\"border:2px solid #2B2B2B;border-radius:5px\" id=\"address1\" style=\"height: 100px\"\r\n");
      out.write("                    name=\"address1\" data-ng-required=\"true\">\r\n");
      out.write("                    <span class=\"help-block\" data-ng-show=\"(submitted || MyForm.address1.$touched) && MyForm.address1.$error.required && MyForm.address1.$invalid\"><font color=\"#FF5B37\"><strong>Please enter your address.</strong></font></span>\r\n");
      out.write("                  </div>\r\n");
      out.write("\r\n");
      out.write("                  <div class=\"form-group\">\r\n");
      out.write("                    <label for=\"City\"><font color=\"#000000\">City</font><font color=\"red\">*</font>:\r\n");
      out.write("                    </label>\r\n");
      out.write("                    <br>\r\n");
      out.write("                    <input type=\"text\" data-ng-model=\"list.city\" style=\"border:2px solid #2B2B2B;border-radius:5px\" id=\"city\" placeholder=\"Enter your city\"\r\n");
      out.write("                    name=\"city\" data-ng-required=\"true\">\r\n");
      out.write("                    <span class=\"help-block\" data-ng-show=\"(submitted ||MyForm.city.$touched)&& MyForm.city.$invalid && MyForm.city.$error.required\"><font color=\"#FF5B37\"><strong>Please enter your city.</strong></font></span>\r\n");
      out.write("                  </div>\r\n");
      out.write("\r\n");
      out.write("                  <div class=\"form-group\">\r\n");
      out.write("                    <label for=\"country\"><font color=\"#000000\">Country</font><font color=\"red\">*</font>:\r\n");
      out.write("                    </label>\r\n");
      out.write("                    <br>\r\n");
      out.write("                    <select data-ng-model=\"list.selectedCountry\" name=\"country\" data-ng-options=\"x for x in countries\" style=\"border:2px solid #2B2B2B;border-radius:5px\" data-ng-required=\"true\">\r\n");
      out.write("                      <option value=\"\">Select a country</option>\r\n");
      out.write("                    </select>\r\n");
      out.write("                    <span class=\"help-block\" data-ng-show=\"(submitted || MyForm.country.$touched) && MyForm.country.$error.required && MyForm.country.$invalid\"><font color=\"#FF5B37\"><strong>Please enter your country.</strong></font></span>\r\n");
      out.write("                  </div>\r\n");
      out.write("\r\n");
      out.write("                  <div class=\"form-group\">\r\n");
      out.write("                    <label for=\"Phone\"><font color=\"#000000\">Phone:</font>\r\n");
      out.write("                    </label>\r\n");
      out.write("                    <br>\r\n");
      out.write("                    <input type=\"text\" data-ng-model=\"list.phone\" style=\"border:2px solid #2B2B2B;border-radius:5px\" id=\"phone\" name=\"phone\" placeholder=\"Enter your phone number\" data-ng-pattern=\"/^[789]\\d{9}$/\" maxlength=\"10\">\r\n");
      out.write("                    <span class=\"help-block\" data-ng-show=\"MyForm.phone.$dirty && MyForm.phone.$error.pattern\"><font color=\"#FF5B37\"><strong>Please enter a valid phone number.</strong></font></span>\r\n");
      out.write("                  </div>\r\n");
      out.write("\r\n");
      out.write("                  <div class=\"form-group\">\r\n");
      out.write("                    <label for=\"AD\"><font color=\"#000000\">Appointment Date</font><font color=\"red\">*</font>:\r\n");
      out.write("                    </label>\r\n");
      out.write("                    <br>\r\n");
      out.write("                    <input type=\"text\"  data-ng-model=\"list.appdate\" style=\"border:2px solid #2B2B2B;border-radius:5px\" name=\"appdate\" id=\"Adate\" data-ng-required=\"true\" data-ng-pattern=\"/^(0?[1-9]|1[012])\\/(0?[1-9]|[12][0-9]|3[01])\\/((19\\d{2})|([2-9]\\d{3}))$/\" placeholder=\"MM/DD/YYYY\">\r\n");
      out.write("                    <span class=\"help-block\" data-ng-show=\"(submitted || MyForm.appdate.$touched) && MyForm.appdate.$error.required\"> <font color=\"#FF5B37\"><strong>Please enter your appointment date.</strong></font></span>\r\n");
      out.write("                    <span class=\"help-block\" data-ng-show=\"MyForm.appdate.$error.pattern\"><font color=\"#FF5B37\"><strong>Incorrect Format.</strong></font></span>\r\n");
      out.write("                  </div>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div>\r\n");
      out.write("            <div class=\"col-md-6\" style=\"background-color:#FFFFFF ;\">\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                  <label for=\"MiddleName\"><font color=\"#000000\">MiddleName:</font>\r\n");
      out.write("                  </label>\r\n");
      out.write("                  <br>\r\n");
      out.write("                  <input type=\"text\" data-ng-model=\"list.mname\" name=\"mname\" style=\"border:2px solid #2B2B2B;border-radius:5px\" id=\"MiddleName\" placeholder=\"Enter your middle name\" >\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                  <label for=\"gender\"><font color=\"#000000\">Gender</font><font color=\"red\">*</font>:\r\n");
      out.write("                  </label>\r\n");
      out.write("                  <br>\r\n");
      out.write("                  <select name=\"gender\" data-ng-model=\"list.selectedGender\" data-ng-options=\"x for x in gender\" style=\"border:2px solid #2B2B2B;border-radius:5px\" required>\r\n");
      out.write("                    <option value=\"\">Select your gender.</option>\r\n");
      out.write("                  </select>\r\n");
      out.write("                  <span class=\"help-block\" data-ng-show=\"(submitted || MyForm.gender.$touched) && MyForm.gender.$error.required && MyForm.gender.$invalid\"><font color=\"#FF5B37\"><strong>Please enter your gender.</strong></font>\r\n");
      out.write("                  </span>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                  <label for=\"Location\"><font color=\"#000000\">Location</font><font color=\"red\">*</font>:\r\n");
      out.write("                  </label>\r\n");
      out.write("                  <br>\r\n");
      out.write("                  <select  id=\"Location\" name=\"location\" data-ng-model=\"list.selectedLocation\" data-ng-options=\"x for x in locations\" style=\"border:2px solid #2B2B2B;border-radius:5px\" required>\r\n");
      out.write("                  <option value=\"\">Select your location.</option>\r\n");
      out.write("                  </select>\r\n");
      out.write("                  <span class=\"help-block\" data-ng-show=\"(submitted || MyForm.location.$touched) && MyForm.location.$error.required && MyForm.location.$invalid\"><font color=\"#FF5B37\"><strong>Please provide your location.</strong></font>\r\n");
      out.write("                  </span>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                  <label for=\"Address2\"><font color=\"#000000\">AddressLine2:</font>\r\n");
      out.write("                  </label>\r\n");
      out.write("                  <br>\r\n");
      out.write("                  <input type=\"text\" data-ng-model=\"list.addressline2\" style=\"border:2px solid #2B2B2B;border-radius:5px\" id=\"address2\">\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                  <label for=\"State\"><font color=\"#000000\">State</font><font color=\"red\">*</font>:\r\n");
      out.write("                  </label>\r\n");
      out.write("                  <br>\r\n");
      out.write("                  <select  id=\"State\"  data-ng-model=\"list.selectedState\" name=\"state\" data-ng-options=\"x for x in states\" style=\"border:2px solid #2B2B2B;border-radius:5px\" required>\r\n");
      out.write("                  <option value=\"\">Select your state.</option>\r\n");
      out.write("                  </select>\r\n");
      out.write("                  <span class=\"help-block\" data-ng-show=\"(submitted || MyForm.state.$touched) && MyForm.state.$error.required && MyForm.state.$invalid\"><font color=\"#FF5B37\"><strong>Please enter your state.</strong></font>\r\n");
      out.write("                  </span>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                  <label for=\"zip\"><font color=\"#000000\">Zip Code:</font>\r\n");
      out.write("                  </label>\r\n");
      out.write("                  <br>\r\n");
      out.write("                  <input type=\"text\" data-ng-model=\"list.zipcode1\" style=\"border:2px solid #2B2B2B;border-radius:5px\" id=\"zcode\" size=\"2\">-<input type=\"text\" data-ng-model=\"list.zipcode2\" style=\"border:2px solid #2B2B2B;border-radius:5px\" id=\"zcode\" size=\"8\">\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                  <label for=\"email\"><font color=\"#000000\">Email:</font>\r\n");
      out.write("                  </label>\r\n");
      out.write("                  <br>\r\n");
      out.write("                  <input type=\"email\" data-ng-model=\"list.email\" style=\"border:2px solid #2B2B2B;border-radius:5px\" id=\"email\" name=\"email\" placeholder=\"Enter email\">\r\n");
      out.write("                  <span data-ng-class=\"help-block\" data-ng-show=\"MyForm.email.$dirty && MyForm.email.$error.email\"><font color=\"#FF5B37\"><strong>Please enter a valid email.</strong></font></span>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!--<a id=\"button1\" ui-sref=\".display\">Submit</a>-->\r\n");
      out.write("                <input id=\"button1\" type=\"submit\" name=\"submit\" value=\"Submit\"/>\r\n");
      out.write("                <input id=\"button1\" type=\"button\" name=\"reset\" value=\"Reset\" data-ng-click=\"reset()\"/>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("          </form>\r\n");
      out.write("        </div>\r\n");
      out.write("     <!-- </div>-->\r\n");
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
