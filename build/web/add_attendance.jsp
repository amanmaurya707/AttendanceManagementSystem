
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.sql.Date"%>
<%-- 
    Document   : addnew
    Created on : Mar 16, 2019, 4:47:50 AM
    Author     : amankumar
--%>

<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>






<% 
String id=request.getParameter("txtid");
String name=request.getParameter("txtname");
String sclass=request.getParameter("txtclass");

String dept=request.getParameter("txtdept");
String date=request.getParameter("txtdate");
String status=request.getParameter("txtstatus");


Connection conn=null;
PreparedStatement pstmt=null;
/*Statement stmt=null;


boolean flag=true;
ResultSet rs=null;*/
if(id!=null&&name!=null&&sclass!=null&&dept!=null&&date!=null&&status!=null)
{
   try
   {
       Class.forName("org.apache.derby.jdbc.ClientDriver").newInstance();
    conn=DriverManager.getConnection("jdbc:derby://localhost:1527/mydb", "aman","aman");
    String data="insert into attendancetbl(Student_Id,Student_Name,Class,Dept,Date,Status) values(?,?,?,?,?,?)";
   
    
    pstmt=conn.prepareStatement(data);//assign prepared statements
    pstmt.setString(1,id);
    pstmt.setString(2,name);
    pstmt.setString(3,sclass);
    pstmt.setString(4,dept);
   
    pstmt.setString(5,date);
      
    pstmt.setString(6,status);
  
    pstmt.executeUpdate();
    //out.print("successfully insert!!!!ok");
    response.sendRedirect("view_attendance_by_staff.jsp");
     }


   
   catch(Exception ex)
   {
       out.println("error occurs:"+ex);
   }
}

%>

