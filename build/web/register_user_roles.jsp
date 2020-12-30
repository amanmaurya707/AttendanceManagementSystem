
<%@page import="java.sql.*"%>
<!--server side code-->

<% 
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
    %>
    <script>alert("successfully inserted");</script>
    <%
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
%>
<script>alert("something went wrong");</script>
<%

}


%>
