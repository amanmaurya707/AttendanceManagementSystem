<%-- 
    Document   : newjsp
    Created on : Dec 4, 2018, 7:04:12 PM
    Author     : aman
--%>

<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            try{
            String name=request.getParameter("txtname");
            String dob=request.getParameter("dob");
            Class.forName("org.apache.derby.jdbc.ClientDriver").newInstance();
            Connection conn=DriverManager.getConnection("jdbc:derby://localhost:1527/rawdb","aman","aman");
            out.println("connected successfully");
            PreparedStatement pstmt=conn.prepareStatement("insert into rawinfo(name,dob) values(?,?)");//work
            pstmt.setString(1,name);
            pstmt.setString(2,dob);
            pstmt.executeUpdate();
            out.println("successfully inserted ");
            /*  Statement stmt=conn.createStatement();
           stmt.executeUpdate("insert into rawinfo values('"+name+"','"+dob+"')");//work
           out.println("sucess123");
            */
            }
            catch(Exception e){
            out.println("see this"+e);}
          
            %>
    </body>
</html>
