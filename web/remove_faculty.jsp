
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" type="text/css" href="main.css">
    </head>
    
    
    <body>
         <%@include file="adminmenu.html"%>
   <div id="wrap">      
       <h1 align="center">delete  staff records</h1>
        <table align="center">
            <thead>
            <tr>
                <th>Staff Id</th>
                 <th>Staff Name</th>
                  <th>Subject</th>
                  <th>Dept</th>
                   <th>DOB</th>
                  <th>Address</th>
                  <th>Gmail</th>
                  <th>Phone Number</th>
                  <th>Gender</th>
                  <th>Action</th>
            </tr>
            </thead>
            <tbody>
               
                <%
                    Connection conn=null;
                    Statement stmt=null;
                    ResultSet rs=null;
                    Class.forName("org.apache.derby.jdbc.ClientDriver").newInstance();
                    conn=DriverManager.getConnection("jdbc:derby://localhost:1527/mydb","aman","aman");
                    //out.println("connected ");
                    stmt=conn.createStatement();
                    String data="select * from stafftbl";
                    rs=stmt.executeQuery(data);
                    while(rs.next())
                    {
                    
                %>
                <tr>
                    <td> <%=rs.getString("Staff_ID")%></td>
                    <td> <%=rs.getString("Staff_Name")%></td> 
                     <td> <%=rs.getString("Subject")%></td>
                      <td> <%=rs.getString("Dept")%></td>
                     <td> <%=rs.getString("DOB")%> </td> 
                          
                        <td> <%=rs.getString("Address")%></td>
                          <td> <%=rs.getString("Gmail")%></td>
                            <td> <%=rs.getString("PhoneNumber")%></td>
                            <td> <%=rs.getString("Gender")%></td>
                        <td> 
                            <span style="padding-right:20px"><a href='delete_faculty.jsp?d=<%=rs.getString("Staff_ID")%>'>Delete</a></span>
                        </td>
                </tr>
                <%
                    }
                    %>
                    
            </tbody>
        </table>
              
	</div>  
                    <%@include file="footer.html"%>
    </body>
    
</html>
