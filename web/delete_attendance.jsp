<%@page import="java.sql.*"%>
<%
    String Id=request.getParameter("d");
    try
    {
        
   Connection conn=DriverManager.getConnection("jdbc:derby://localhost:1527/mydb", "aman","aman");
   Statement stmt=conn.createStatement();
   stmt.executeUpdate("delete from attendancetbl where Student_Id ='"+Id+"'");
   response.sendRedirect("view_attendance_by_staff.jsp");
        
    }
    catch(Exception ex)
    {
        out.println("error"+ex);
    }
%>