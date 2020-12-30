package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_005fstudent_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/adminmenu.html");
    _jspx_dependants.add("/footer.html");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t<title></title>\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"jquery-ui.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"main.css\">\n");
      out.write("        <script type=\"text/javascript\" language=\"javascript\" src=\"formverify.js\"></script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    ");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t<title></title>\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"mystyle.css\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\t\n");
      out.write("\n");
      out.write("\t\t<div id=\"header\">\n");
      out.write("\t\t\t\t\t\n");
      out.write("                                            <h1>attendance management system</h1>\n");
      out.write("\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t\t<div id=\"menu\">\n");
      out.write("\t\t<ul>\n");
      out.write("\t\t\t<li><a href=\"#\">admin home</a></li>\n");
      out.write("\t\t\t<li><a href=\"#\">profile</a>\n");
      out.write("                       \n");
      out.write("                            <ul>\n");
      out.write("                                <li><a href=\"view_admin_profile.jsp\">view profile</a></li>\n");
      out.write("                                \n");
      out.write("                                <li><a href=\"change_admin_profile.jsp\">change profile</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                              \n");
      out.write("                        </li>\n");
      out.write("\n");
      out.write("\t\t\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"#\">faculty</a>\n");
      out.write("                            <ul>\n");
      out.write("                                <li><a href=\"view_faculty.jsp\">view all faculty</a></li>\n");
      out.write("                                <li><a href=\"register_staff.jsp\">add faculty</a></li>\n");
      out.write("                                <li><a href=\"remove_faculty.jsp\">remove faculty</a></li>\n");
      out.write("                                <li><a href=\"update_faculty.jsp\">update faculty </a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                        \n");
      out.write("\t\t\t<li><a href=\"#\">student</a>\n");
      out.write("                            <ul><li><a href=\"view_student.jsp\">view all student</a></li>\n");
      out.write("                                <li><a href=\"register_student.jsp\">add student</a></li>\n");
      out.write("                                <li><a href=\"remove_student.jsp\">remove student</a></li>\n");
      out.write("                                <li><a href=\"update_student.jsp\">update student</a></li>\n");
      out.write("                            </ul><!--create pdf or display studnet records-->\n");
      out.write("                        </li>\n");
      out.write("\t\t\t<li><a href=\"login.html\">logout</a></li>\n");
      out.write("\t\t</ul>\t\t\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("  <!--  <div id=\"wrap\">\n");
      out.write("        \n");
      out.write("    </div>-->\n");
      out.write("</body>\n");
      out.write("</html>");
      out.write(" \n");
      out.write("    \n");
      out.write("   <div id=\"wrap\">    \n");
      out.write("    \n");
      out.write("<h1 align=\"center\">add Student</h1>\n");
      out.write("<form action=\"add_student.jsp\" method=\"get\" onsubmit=\"return myFunction()\" name=\"forms\">\n");
      out.write("     <span id=\"msgid\" style=\"color:red\"></span>   \n");
      out.write("     <input type=\"text\" name=\"txtid\" placeholder=\"id\" id=\"id\" onkeyup=\"myFunction()\">\n");
      out.write("    \n");
      out.write("        <span id=\"msgname\" style=\"color:red\"></span>\n");
      out.write("\t<input type=\"text\" name=\"txtname\" placeholder=\"full name\" id=\"name\" onkeyup=\"myFuntion()\"> \n");
      out.write("        \n");
      out.write("        <span id=\"msgemail\" style=\"color:red\"></span>\n");
      out.write("        <input type=\"email\" name=\"txtemail\" placeholder=\"email\" id=\"email\" onkeyup=\"myFunction()\">\n");
      out.write("        \n");
      out.write("        <span id=\"msgdob\" style=\"color:red\"></span>\n");
      out.write("        <input type=\"text\" name=\"dob\" id=\"datepicker\" placeholder=\"dd-mm-yyyy(dob)\" onkeyup=\"myFunction()\"><!-- do not repeat id-->\n");
      out.write("\n");
      out.write("        <span id=\"msgaddress\" style=\"color:red\"></span>\n");
      out.write("\t<input type=\"text\" name=\"txtaddress\" placeholder=\"your address\" id=\"address\" onkeyup=\"myFunction()\">\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <span id=\"msgphoneno\" style=\"color:red\"></span>\n");
      out.write("\t<input type=\"text\" name=\"txtphoneno\" placeholder=\"phone number\" id=\"phoneno\" onkeyup=\"myFunction()\">\n");
      out.write("        \n");
      out.write("        <span id=\"msgdept\" style=\"color:red\"></span>\n");
      out.write("        <input type=\"text\" name=\"txtdept\" placeholder=\"department\" id=\"dept\" onkeyup=\"myFuntion()\">\n");
      out.write("        \n");
      out.write("        <span id=\"msgclass\" style=\"color:red\"></span>\n");
      out.write("\t<input type=\"text\" name=\"txtclass\" placeholder=\"class\" id=\"class\" onkeyup=\"myFunction()\">\n");
      out.write("\t\n");
      out.write("        <div><span id=\"msggender\" style=\"color:red\"></span></div>\n");
      out.write("        <label class=\"gender\">gender :</label>\n");
      out.write("        <input type=\"radio\" id=\"male\" name=\"gender\" value=\"male\" checked=\"checked\"/><label>male</label>\n");
      out.write("        <input type=\"radio\" id=\"female\" name=\"gender\" value=\"female\"/><label>female</label>\n");
      out.write("        \n");
      out.write("<br>\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\" src=\"jquery-3.3.1.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"jquery-ui.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\t$(document).ready(function () {\n");
      out.write("\t\t$('#datepicker').datepicker({\n");
      out.write("\t\t\tdateFormat:\"dd-mm-yy\",\n");
      out.write("\t\t\tchangeMonth:true,\n");
      out.write("\t\t\tchangeYear:true\n");
      out.write("\t\t});\n");
      out.write("\t});\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<input type=\"submit\" value=\"submit\"><br/>\n");
      out.write("<a href=\"\">back</a>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    \n");
      out.write("\n");
      out.write("</form>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("   \n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("        \t<link rel=\"stylesheet\" type=\"text/css\" href=\"mystyle.css\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<div id=\"footer\">\n");
      out.write("\t\t\t\t<p id=\"bottom\">@copyright by aman:2018-19</p>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("  ");
      out.write("\n");
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
}
