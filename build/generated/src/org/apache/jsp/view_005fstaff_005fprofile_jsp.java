package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.SimpleDateFormat;
import java.sql.*;

public final class view_005fstaff_005fprofile_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/staffmenu.html");
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"main.css\">\r\n");
      out.write("    </head>\r\n");
      out.write("    \r\n");
      out.write("    <body>\r\n");
      out.write("        ");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title></title>\n");
      out.write("       \n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"mystyle.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("     \t\n");
      out.write("\t\t<div id=\"header\">\n");
      out.write("\t\t\t\t\t<h1>attendance management system</h1\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t\t<div id=\"menu\">\n");
      out.write("\t\t<ul>\n");
      out.write("\t\t\t<li><a href=\"#\">faculty home</a></li>\n");
      out.write("\t\t\t<li><a href=\"#\">profile</a>\n");
      out.write("                       \n");
      out.write("                            <ul>\n");
      out.write("                                <li><a href=\"view_staff_profile.jsp\">view profile</a></li>\n");
      out.write("                              \n");
      out.write("                                <li><a href=\"change_staff_profile.jsp\">change profile</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                              \n");
      out.write("                        </li>\n");
      out.write("\n");
      out.write("\t\t\t<li>\n");
      out.write("                            <a href=\"#\">attendance</a>\n");
      out.write("                            <ul>\n");
      out.write("                                <li><a href=\"view_attendance_by_staff.jsp\">view attendance</a></li>\n");
      out.write("                                <li><a href=\"enter_attendance.jsp\">enter attendance</a></li>\n");
      out.write("                                 \n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                        \n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<li><a href=\"login.html\">logout</a></li>\n");
      out.write("\t\t</ul>\t\t\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\t\n");
      out.write("     \n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\r\n");
      out.write("       <div id=\"wrap\">      \r\n");
      out.write("       <h1 align=\"center\">staff profile </h1>\r\n");
      out.write("       <br/>\r\n");
      out.write("       <div class=\"txtsearch\">\r\n");
      out.write("           <div>\r\n");
      out.write("               <img src=\"images/staff.jpg\">\r\n");
      out.write("           </div>\r\n");
      out.write("       <form action=\"\" method=\"get\">\r\n");
      out.write("           \r\n");
      out.write("             <input type=\"text\" name=\"q\" placeholder=\"view profile by id...\">\r\n");
      out.write("        </form>\r\n");
      out.write("       </div>\r\n");
      out.write("       <br/>\r\n");
      out.write("           <table align=\"center\">\r\n");
      out.write("       \r\n");
      out.write("            <tbody>\r\n");
      out.write("               \r\n");
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
                        
                        data="select * from stafftbl where Staff_ID like '%"+query+"%' ";
                   
                  
                    
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
                
      out.write("\r\n");
      out.write("                \r\n");
      out.write("                 <tr> <td>Staff Id</td>  <td> ");
      out.print(rs.getString("Staff_ID"));
      out.write("</td></tr>\r\n");
      out.write("                 <tr> <td>Staff Name</td>  <td> ");
      out.print(rs.getString("Staff_Name"));
      out.write("</td> </tr>\r\n");
      out.write("                 \r\n");
      out.write("                  <tr> <td>Subject</td>  <td> ");
      out.print(rs.getString("Subject"));
      out.write("</td></tr>\r\n");
      out.write("                   <tr> <td>Dept</td>  <td> ");
      out.print(rs.getString("Dept"));
      out.write("</td>  </tr>    \r\n");
      out.write("                     <tr> <td>DOB</td> <td>   ");
      out.print(rs.getString("DOB"));
      out.write("</td></tr> \r\n");
      out.write("                       \r\n");
      out.write("                      \r\n");
      out.write("                      <tr><td>Address</td>  <td> ");
      out.print(rs.getString("Address"));
      out.write("</td></tr>\r\n");
      out.write("                        <tr><td>Email</td>  <td> ");
      out.print(rs.getString("Gmail"));
      out.write("</td></tr>\r\n");
      out.write("                        <tr><td>Phone Number</td>    <td> ");
      out.print(rs.getString("PhoneNumber"));
      out.write("</td><tr>\r\n");
      out.write("                          <tr><td>Gender</td>  <td> ");
      out.print(rs.getString("Gender"));
      out.write("</td></tr>\r\n");
      out.write("                       \r\n");
      out.write("               \r\n");
      out.write("                ");

                    }
                   
                    
                        }       
         }

                
      out.write("\r\n");
      out.write("                             \r\n");
      out.write("                    \r\n");
      out.write("                   \r\n");
      out.write("                    \r\n");
      out.write("            </tbody>\r\n");
      out.write("        </table>\r\n");
      out.write("       \r\n");
      out.write("       \r\n");
      out.write("     \r\n");
      out.write("       </div>\r\n");
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
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
