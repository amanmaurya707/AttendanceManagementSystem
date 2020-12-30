
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>attendance records</title>
        <link rel="stylesheet" type="text/css" href="main.css">
    </head>
    
    <body>
        <%@include file="staffmenu.html"%>
       <div id="wrap">      
       <h1 align="center">attendance records</h1>
       <br/>
       <div class="txtsearch">
       <form action="" method="get">
           
             <input type="text" name="q" placeholder="search here...">
        </form>
       </div>
       <br/>
       <div id="divthree">
        <table align="center">
            <thead>
            <tr>
                <th>Student Id</th>
                 <th>Student Name</th>
                  <th>Class</th>
                  <th>Dept</th>
                   <th>Date</th>
                  <th>Status</th>
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
                        <td> <span style="padding-right:20px"><a href='update_attendance.jsp?u=<%=rs.getString("Student_ID")%>'>Edit</a></span>
                            <a href='delete_attendance.jsp?d=<%=rs.getString("Student_ID")%>'>Delete</a>
                        </td>
                </tr>
                <%
                    }
                    %>
     
            </tbody>
        </table>
           </div>
                        <!-- for pdf--> 
       
          <br><br/>
        <button onclick="myFun('divthree')" style="background-color: white;display: block;height: 40px;width: 80px;margin-left: auto;margin-right: auto">
		get PDF
	</button>
          <a href="view_attendance_by_student.jsp"></a>
       </div>
                    <%@include file="footer.html"%>
                    
                                     
          <script type="text/javascript">
	
	function myFun(paravalue)
	{
		var backup=document.body.innerHTML;
		var divcontent=document.getElementById(paravalue).innerHTML;

		document.body.innerHTML=divcontent;
		window.print();
		document.body.innerHTML=backup;

	}
</script>
    </body>
</html>
