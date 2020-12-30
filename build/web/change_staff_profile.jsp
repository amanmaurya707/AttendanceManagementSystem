
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
        <%@include file="staffmenu.html"%>
       <div id="wrap">      
       <h1 align="center">change staff profile </h1>
       <br/>
       <div class="txtsearch">
           <div>
               <img src="images/staff.jpg">
           </div>
       <form action="" method="get">
           
             <input type="text" name="q" placeholder="view profile by id...">
        </form>
       </div>
       <br/>
           <table align="center">
       
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
                %>
                
                 <tr> <td>Staff Id</td>  <td> <%=rs.getString("Staff_ID")%></td></tr>
                 <tr> <td>Staff Name</td>  <td> <%=rs.getString("Staff_Name")%></td> </tr>
                 
                  <tr> <td>Subject</td>  <td> <%=rs.getString("Subject")%></td></tr>
                   <tr> <td>Dept</td>  <td> <%=rs.getString("Dept")%></td>  </tr>    
                     <tr> <td>DOB</td> <td>   <%=rs.getString("DOB")%></td></tr> 
                       
                      
                      <tr><td>Address</td>  <td> <%=rs.getString("Address")%></td></tr>
                        <tr><td>Email</td>  <td> <%=rs.getString("Gmail")%></td></tr>
                        <tr><td>Phone Number</td>    <td> <%=rs.getString("PhoneNumber")%></td><tr>
                          <tr><td>Gender</td>  <td> <%=rs.getString("Gender")%></td></tr>
                                <tr style="align-items: center">  
            <div id="editdata"><td> <a href='edit_staff_profile.jsp?u=<%=rs.getString("Staff_ID")%>'>Edit</a></td></div>
                                
                              </tr>
               
                <%
                    }
                   
                    
                        }       
         }

                %>
                             
                    
                   
                    
            </tbody>
        </table>
       
       
     
       </div>
                    <%@include file="footer.html"%>
    </body>
</html>
