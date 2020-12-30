package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.SimpleDateFormat;
import java.sql.*;

public final class view_005fstudent_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>student records</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"main.css\">\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("         ");
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
      out.write("\n");
      out.write("   <div id=\"wrap\">      \n");
      out.write("       <h1 align=\"center\">student records</h1>\n");
      out.write("         <br/>\n");
      out.write("        <div class=\"txtsearch\">\n");
      out.write("       <form action=\"\" method=\"get\">\n");
      out.write("         \n");
      out.write("           <input type=\"text\" name=\"q\" placeholder=\"search here...\">\n");
      out.write("        </form>\n");
      out.write("       </div>\n");
      out.write("       <br/>\n");
      out.write("       <div id=\"divtwo\">\n");
      out.write("        <table align=\"center\">\n");
      out.write("            <thead>\n");
      out.write("            <tr>\n");
      out.write("                <th>Student Id</th>\n");
      out.write("                 <th>Student Name</th>\n");
      out.write("                  <th>Class</th>\n");
      out.write("                  <th>Dept</th>\n");
      out.write("                   <th>DOB</th>\n");
      out.write("                  <th>Address</th>\n");
      out.write("                  <th>Gmail</th>\n");
      out.write("                  <th>Phone Number</th>\n");
      out.write("                  <th>Gender</th>\n");
      out.write("                  \n");
      out.write("            </tr>\n");
      out.write("            </thead>\n");
      out.write("            <tbody>\n");
      out.write("               \n");
      out.write("                ");

                    Connection conn=null;
                    Statement stmt=null;
                    ResultSet rs=null;
                    Class.forName("org.apache.derby.jdbc.ClientDriver").newInstance();
                    conn=DriverManager.getConnection("jdbc:derby://localhost:1527/mydb","aman","aman");
                    //out.println("connected ");
                    stmt=conn.createStatement();
                    
                    String query=request.getParameter("q");
                    String data;
                    if(query!=null)
                    {
                        data="select * from studenttbl where Student_ID like '%"+query+"%' or Student_Name like '%"+query+"%' or Class like '%"+query+"%' or Dept like '%"+query+"%' or Dob like '%"+query+"%' or Address like '%"+query+"%' or Gmail like '%"+query+"%' or Gender like '%"+query+"%'";
                   
                    }
                    else
                    {
                       
                     data="select * from studenttbl";
                    }
                    
                    //String data="select * from studenttbl";
                    rs=stmt.executeQuery(data);
                    while(rs.next())
                    {
                    
                
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td> ");
      out.print(rs.getString("Student_ID"));
      out.write("</td>\n");
      out.write("                    <td> ");
      out.print(rs.getString("Student_Name"));
      out.write("</td> \n");
      out.write("                     <td> ");
      out.print(rs.getString("Class"));
      out.write("</td>\n");
      out.write("                      <td> ");
      out.print(rs.getString("Dept"));
      out.write("</td>\n");
      out.write("                     \n");
      out.write("                        <td>");
      out.print(rs.getString("DOB"));
      out.write("</td>\n");
      out.write("                                \n");
      out.write("                        <td> ");
      out.print(rs.getString("Address"));
      out.write("</td>\n");
      out.write("                          <td> ");
      out.print(rs.getString("Gmail"));
      out.write("</td>\n");
      out.write("                            <td> ");
      out.print(rs.getString("PhoneNumber"));
      out.write("</td>\n");
      out.write("                            <td> ");
      out.print(rs.getString("Gender"));
      out.write("</td>\n");
      out.write("                       \n");
      out.write("                </tr>\n");
      out.write("                ");

                    }
                    
      out.write("\n");
      out.write("                    \n");
      out.write("            </tbody>\n");
      out.write("        </table>\n");
      out.write("       </div>    \n");
      out.write("                    <!-- for pdf--> \n");
      out.write("       \n");
      out.write("          <br><br/>\n");
      out.write("        <button onclick=\"myFun('divtwo')\" style=\"background-color: white;display: block;height: 40px;width: 80px;margin-left: auto;margin-right: auto\">\n");
      out.write("\t\tget PDF\n");
      out.write("\t</button>\n");
      out.write("\t</div>  \n");
      out.write("                    ");
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
      out.write("                    \n");
      out.write("          <script type=\"text/javascript\">\n");
      out.write("\t\n");
      out.write("\tfunction myFun(paravalue)\n");
      out.write("\t{\n");
      out.write("\t\tvar backup=document.body.innerHTML;\n");
      out.write("\t\tvar divcontent=document.getElementById(paravalue).innerHTML;\n");
      out.write("\n");
      out.write("\t\tdocument.body.innerHTML=divcontent;\n");
      out.write("\t\twindow.print();\n");
      out.write("\t\tdocument.body.innerHTML=backup;\n");
      out.write("\n");
      out.write("\t}\n");
      out.write("</script>\n");
      out.write("    </body>\n");
      out.write("    \n");
      out.write("</html>\n");
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
