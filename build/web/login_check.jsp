<%-- 
    Document   : login_check
    Created on : Dec 18, 2018, 8:08:38 PM
    Author     : aman
--%>

<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>login varification</title>
    </head>
    <body>
        <%
            String username=request.getParameter("txtusername");
            String password=request.getParameter("txtpassword");
            try
            {
                Class.forName("org.apache.derby.jdbc.ClientDriver");
                Connection conn=DriverManager.getConnection("jdbc:derby://localhost:1527/mydb", "aman", "aman");
                Statement stmt=conn.createStatement();
                String query="select * from registertbl";
                ResultSet rs=stmt.executeQuery(query);
                boolean flag=false;
               String usertype="";
             while(rs.next())
             {
                 String user=rs.getString(1);
                  String pass=rs.getString(2);
                 //  String usertype=rs.getString(3);
                 if(username.equals(user)&&password.equals(pass))
                 {
                     flag=true;
                     usertype=rs.getString(3);
                 }
              }
             if(flag)
             {
                 if(usertype.equals("admin"))
                 {
                 RequestDispatcher rd1=request.getRequestDispatcher("adminhome.jsp");//adminmenu.html
                 rd1.include(request, response);
                 /*HttpSession hs=request.getSession(true);//new
                 if(hs.isNew())
                 {
                     hs.setAttribute("username", username);
                 }
                 session.setAttribute("username", username);*/
                 RequestDispatcher rd2=request.getRequestDispatcher("footer.html");
                 rd2.include(request, response);
                 }
                 if(usertype.equals("student"))
                 {
                     RequestDispatcher rd1=request.getRequestDispatcher("studenthome.jsp");//studentmenu.html
                     rd1.include(request,response);
                     RequestDispatcher rd2=request.getRequestDispatcher("footer.html");
                     rd2.include(request, response);
                 }
                 if(usertype.equals("staff"))
                {
                    //
                    RequestDispatcher rd1=request.getRequestDispatcher("staffhome.jsp");//facultymenu.html
                    rd1.include(request, response);
                    RequestDispatcher rd2=request.getRequestDispatcher("footer.html");
                    rd2.include(request, response);
                    
                }
             }
             else
             {
                  out.println("invalid username and password");
                RequestDispatcher rd=request.getRequestDispatcher("login.html");
                //response.sendRedirect("login.html");
                rd.include(request, response);
               
             }
            }
            catch(Exception e)
            {
                out.println("exception occur:"+e);
            }
         
         %>
    </body>
</html>
