package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.SimpleDateFormat;
import java.sql.*;

public final class view_005fstudent_005fprofile_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/studentmenu.html");
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
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"main.css\">\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title></title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"mystyle.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("      \n");
      out.write("  \n");
      out.write("\t\t<div id=\"header\">\n");
      out.write("\t\t\t\t\t<h1>(AMS)Attendance Management System</h1>\n");
      out.write("\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t\t<div id=\"menu\">\n");
      out.write("\t\t<ul>\n");
      out.write("\t\t\t<li><a href=\"#\">student home</a></li>\n");
      out.write("\t\t\t<li><a href=\"#\">profile</a>\n");
      out.write("                       \n");
      out.write("                            <ul id=\"childmenu\">\n");
      out.write("                                <li><a href=\"view_student_profile.jsp\">view profile</a></li>\n");
      out.write("                               \n");
      out.write("                                <li><a href=\"change_student_profile.jsp\">change profile</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                              \n");
      out.write("                        </li>\n");
      out.write("\n");
      out.write("                        \n");
      out.write("\t\t\t\n");
      out.write("                        \n");
      out.write("                        <li><a href=\"#\">attendance</a>\n");
      out.write("                            <ul  id=\"childmenu\"><li><a href=\"view_attendance_by_student.jsp\">view attendance</a></li></ul><!--create pdf or display student records-->\n");
      out.write("                        </li>\n");
      out.write("\t\t\t<li><a href=\"login.html\">logout</a></li>\n");
      out.write("\t\t</ul>\t\t\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\t\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("       <div id=\"wrap\">      \n");
      out.write("       <h1 align=\"center\">student profile </h1>\n");
      out.write("       <br/>\n");
      out.write("       <div class=\"txtsearch\">\n");
      out.write("           <div>\n");
      out.write("               <img src=\"images/student.png\">\n");
      out.write("           </div>\n");
      out.write("       <form action=\"\" method=\"get\">\n");
      out.write("           \n");
      out.write("           \n");
      out.write("             <input type=\"text\" name=\"q\" placeholder=\"view profile by id...\">\n");
      out.write("        </form>\n");
      out.write("       </div>\n");
      out.write("       <br/>\n");
      out.write("           <table align=\"center\">\n");
      out.write("       \n");
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
                    boolean flag=false;
                    if(query!=null)
                    {
                        
                        data="select * from studenttbl where Student_ID like '%"+query+"%' ";
                   
                  
                    
                    rs=stmt.executeQuery(data);
                    while(rs.next())
                    {
                    String id=rs.getString(1);
                    if(query.equals(id))
                    {
                        flag=true;
                    }
                    if(flag)
                    {
                
      out.write("\n");
      out.write("                \n");
      out.write("                 <tr> <td>Student Id</td>  <td> ");
      out.print(rs.getString("Student_ID"));
      out.write("</td></tr>\n");
      out.write("                 <tr> <td>Student Name</td>  <td> ");
      out.print(rs.getString("Student_Name"));
      out.write("</td> </tr>\n");
      out.write("                 \n");
      out.write("                  <tr> <td>Class</td>  <td> ");
      out.print(rs.getString("Class"));
      out.write("</td></tr>\n");
      out.write("                   <tr> <td>Dept</td>  <td> ");
      out.print(rs.getString("Dept"));
      out.write("</td>  </tr>    \n");
      out.write("                     <tr> <td>DOB</td> <td>   ");
      out.print(rs.getString("DOB"));
      out.write("</td></tr> \n");
      out.write("                       \n");
      out.write("                      \n");
      out.write("                      <tr><td>Address</td>  <td> ");
      out.print(rs.getString("Address"));
      out.write("</td></tr>\n");
      out.write("                        <tr><td>Email</td>  <td> ");
      out.print(rs.getString("Gmail"));
      out.write("</td></tr>\n");
      out.write("                        <tr><td>Phone Number</td>    <td> ");
      out.print(rs.getString("PhoneNumber"));
      out.write("</td><tr>\n");
      out.write("                          <tr><td>Gender</td>  <td> ");
      out.print(rs.getString("Gender"));
      out.write("</td></tr>\n");
      out.write("                       \n");
      out.write("               \n");
      out.write("                ");

                    }
                   
                    
                        }       
         }

                
      out.write("\n");
      out.write("                             \n");
      out.write("                    \n");
      out.write("                   \n");
      out.write("                    \n");
      out.write("            </tbody>\n");
      out.write("        </table>\n");
      out.write("       \n");
      out.write("       \n");
      out.write("     \n");
      out.write("       </div>\n");
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
      out.write("    </body>\n");
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
