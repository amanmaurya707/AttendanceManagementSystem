
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>staff records</title>
        <link rel="stylesheet" type="text/css" href="main.css">
    </head>
    
    
    <body>
         <%@include file="adminmenu.html"%>
   <div id="wrap">      
       <div><h1 align="center">staff records</h1></div>
       <br/>
        <div class="txtsearch">
       <form action="" method="get">
         
           <input type="text" name="q" placeholder="search here...">
        </form>
       </div>
       <br/>
       <div id="divone">
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
                        //data="select * from stafftbl where Staff_ID like '%"+query+"%' or Staff_Name like '%"+query+"%' or Subject like '%"+query+"%' or Dept like '%"+query+"%' or Dob like '%"+query+"%' or Address like '%"+query+"%' or Gmail like '%"+query+"%' or PhoneNumber like '%"+query+"%' or Gender like '%"+query+"%'";

                        data="select * from stafftbl where Staff_ID like '%"+query+"%' or Staff_Name like '%"+query+"%' or Subject like '%"+query+"%' or Dept like '%"+query+"%' or Dob like '%"+query+"%' or Address like '%"+query+"%' or Gmail like '%"+query+"%' or Gender like '%"+query+"%'";
                   
                    }
                    else
                    {
                       
                     data="select * from stafftbl";
                    }
                    
                    rs=stmt.executeQuery(data);
                    while(rs.next())
                    {
                    
                %>
                <tr>
                    <td> <%=rs.getString("Staff_ID")%></td>
                    <td> <%=rs.getString("Staff_Name")%></td> 
                     <td> <%=rs.getString("Subject")%></td>
                      <td> <%=rs.getString("Dept")%></td>      
                       <td>   <%=rs.getString("DOB")%></td> 
                                    
                       <!--Date dt=rs.getDate("DOB");
                        
                        SimpleDateFormat formater=new SimpleDateFormat("dd-MM-yyyy");
                        String dates=formater.format(dt);
                       out.print(dates);-->
                      
                 
                       <td> <%=rs.getString("Address")%></td>
                          <td> <%=rs.getString("Gmail")%></td>
                            <td> <%=rs.getString("PhoneNumber")%></td>
                            <td> <%=rs.getString("Gender")%></td>
                       
                </tr>
                <%
                    }
                    %>
                    
            </tbody>
        </table>
                 
                    
       </div><!-- for pdf--> 
       
          <br><br/>
                    <button onclick="myFun('divone')" style="background-color: white;display: block;height: 40px;width: 80px;margin-left: auto;margin-right: auto">
		get PDF
	</button>
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
