<%@page import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<title></title>
	<link rel="stylesheet" type="text/css" href="style.css">
	<link rel="stylesheet" type="text/css" href="jquery-ui.min.css">
        <script type="text/javascript" language="javascript" src="formvalid.js"></script>
</head>
<!--<body>-->
<%@include file="staffmenu.html"%>     
   <div id="wrap">    
    
<h1>edit attendance</h1>

    <%
            Connection conn=null;
            Statement stmt=null;
            PreparedStatement pstmt=null;
            ResultSet rs=null;
            Class.forName("org.apache.derby.jdbc.ClientDriver").newInstance();
            conn=DriverManager.getConnection("jdbc:derby://localhost:1527/mydb", "aman","aman");
        %>
        <form action="edit_attendance.jsp" method="get" onsubmit="return myFunction()" name="forms">
    
     <%
           stmt=conn.createStatement();
           String uid=request.getParameter("u");
           String data="select * from attendancetbl where Student_Id='"+uid+"'";
           
           rs=stmt.executeQuery(data);
           boolean flag=false;
           while(rs.next())
              
           {
               String id=rs.getString(1);
               if(id.equals(uid))
               {
                   flag=true;
               }
               
           
    
   if(flag)
   {
       %> 
     <span id="msgid" style="color:red"></span>   
     <input type="text" name="txtid" placeholder="id" id="id" onkeyup="myFunction()" value='<%=rs.getString("Student_Id")%>'>
    
        <span id="msgname" style="color:red"></span>
	<input type="text" name="txtname" placeholder="full name" id="name" onkeyup="myFuntion()" value='<%=rs.getString("Student_Name")%>'> 
        
     
       <span id="msgclass" style="color:red"></span>
	<input type="text" name="txtclass" placeholder="class" id="class" onkeyup="myFunction()" value='<%=rs.getString("Class")%>'>
        
        <span id="msgdept" style="color:red"></span>
        <input type="text" name="txtdept" placeholder="department" id="dept" onkeyup="myFuntion()" value='<%=rs.getString("Dept")%>'>
        
   
	
              
        <span id="msgdate" style="color:red"></span>
        <input type="text" name="date" id="datepicker" placeholder="dd-mm-yyyy" onkeyup="myFunction()" value='<%=rs.getString("Date")%>'><!-- do not repeat id-->

       
    <span id="msgstatus" style="color:red"></span>
        <input type="text" name="txtstatus" placeholder="status(present/absent)" id="status" onkeyup="myFuntion()" value='<%=rs.getString("Status")%>'>
        
<br>


<!--
<input type="submit" value="submit"><br/>
<a href="">back</a>
-->

  <%
      break;
      }

                }
            %>
           
              
             <input type="submit" value="submit"/>
            <br/><br/>
            <a href="staffmenu.html">Back</a>   
            
            <script type="text/javascript" src="jquery-3.3.1.min.js"></script>
<script type="text/javascript" src="jquery-ui.min.js"></script>
<script type="text/javascript">
	$(document).ready(function () {
		$('#datepicker').datepicker({
			dateFormat:"dd-mm-yy",
			changeMonth:true,
			changeYear:true
		});
	});
</script>
      

</form>
</div>

   
<%@include file="footer.html"%>
</body>
</html>


