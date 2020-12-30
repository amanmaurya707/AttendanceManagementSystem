package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class adminhome_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
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
      out.write("    <div id=\"wrap\">\n");
      out.write("         \n");
      out.write("  ");
 
      
out.println("<h1 align=center><font color=orange>welcome admin</font></h1><br><br>");
out.println("<h2 align=center><font color=green>you are successfully login!!!</font></h2>");
//out.println("login at:"+session.getAttribute("username"));
  
      out.write("\n");
      out.write("  \n");
      out.write("        \n");
      out.write("    </div>\n");
      out.write(" \n");
      out.write("   ");
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
