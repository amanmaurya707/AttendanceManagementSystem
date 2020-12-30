package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class register_005fuser_005froles_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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

      out.write("\n");
      out.write("\n");
      out.write("<!--server side code-->\n");
      out.write("\n");
 
String name=request.getParameter("txtname");

String password=request.getParameter("txtpass");
String rpassword=request.getParameter("txtrpass");

String email=request.getParameter("txtemail");
String phoneno=request.getParameter("txtphoneno");
String usertype=request.getParameter("ddluser");


            Connection conn=null;
            //Statement stmt=null;
            PreparedStatement pstmt=null;
            //ResultSet rs=null;
            Class.forName("org.apache.derby.jdbc.ClientDriver").newInstance();
            conn=DriverManager.getConnection("jdbc:derby://localhost:1527/mydb", "aman","aman");

if(name!=null&&password!=null&&rpassword!=null&&email!=null&&phoneno!=null&&usertype!=null)
{
   try
   {
    String query="insert into registertbl(username,password,usertype,gmail,phonenumber) values(?,?,?,?,?)";
    pstmt=conn.prepareStatement(query);//assign prepared statements
 
    pstmt.setString(1,name);
  
  
    pstmt.setString(2,password);
    
    pstmt.setString(3,usertype);
    pstmt.setString(4,email);
    pstmt.setString(5,phoneno);
    
     //out.println("here 5");
    pstmt.executeUpdate();
    response.sendRedirect("register_user.html");
    
      out.write("\n");
      out.write("    <script>alert(\"successfully inserted\");</script>\n");
      out.write("    ");

   }
   catch(Exception ex)
   {
       out.println("error occurs:"+ex);
   }
}
else
{
RequestDispatcher rd=request.getRequestDispatcher("register_user.html");
rd.include(request, response);

      out.write("\n");
      out.write("<script>alert(\"something went wrong\");</script>\n");


}



      out.write('\n');
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
