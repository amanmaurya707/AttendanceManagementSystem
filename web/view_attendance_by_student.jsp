
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
        <%@include file="studentmenu.html"%>
       <div id="wrap">      
       <h1 align="center">attendance records</h1>
       <br/>
       <div class="txtsearch">
       <form action="" method="get">
         
           <input type="text" name="q" placeholder="search here...">
        </form>
            </div>
            <br/>
            <div align="center">
                 <table align="center">
            <thead>
            <tr>
                <th>Student Id</th>
                 <th>Student Name</th>
                  <th>Class</th>
                  <th>Dept</th>
                   <th>Date</th>
                  <th>Status</th>
                  
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
                    String query=request.getParameter("q");
                    String data;
                    if(query!=null)
                    {
                        data="select * from attendancetbl where Student_ID like '%"+query+"%' or Student_Name like '%"+query+"%' or Class like '%"+query+"%' or Dept like '%"+query+"%' or Date like '%"+query+"%' or Status like '%"+query+"%'";
                    }
                    else
                    {
                       
                     data="select * from attendancetbl";
                    }
                    
                    //String data="select * from attendancetbl";
                    rs=stmt.executeQuery(data);
                    while(rs.next())
                    {
                    
                %>
                <tr>
                    <td> <%=rs.getString("Student_ID")%></td>
                    <td> <%=rs.getString("Student_Name")%></td> 
                     <td> <%=rs.getString("Class")%></td>
                      <td> <%=rs.getString("Dept")%></td>
                       <td><%=rs.getString("Date")%></td> 
                      
                        <td> <%=rs.getString("Status")%></td>
                        
                </tr>
                <%
                    }
                    %>
     
            </tbody>
        </table>
            </div>
       
       </div>
       
      
                  
                    <%@include file="footer.html"%>
    </body>
</html>
