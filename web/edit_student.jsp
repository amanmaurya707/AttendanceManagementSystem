<%@page import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<title></title>
	<link rel="stylesheet" type="text/css" href="style.css">
	<link rel="stylesheet" type="text/css" href="jquery-ui.min.css">
        <script type="text/javascript" language="javascript" src="formverify.js"></script>
</head>
<!--<body>-->
    <%@include file="adminmenu.html"%>     
   <div id="wrap">    
    
<h1>edit student</h1>

    <%
            Connection conn=null;
            Statement stmt=null;
            PreparedStatement pstmt=null;
            ResultSet rs=null;
            Class.forName("org.apache.derby.jdbc.ClientDriver").newInstance();
            conn=DriverManager.getConnection("jdbc:derby://localhost:1527/mydb", "aman","aman");
        %>
        <form action="edit_student_status.jsp" method="get" onsubmit="return myFunction()" name="forms">
    
     <%
           stmt=conn.createStatement();
           String uid=request.getParameter("u");
           String data="select * from studenttbl where Student_Id='"+uid+"'";
           rs=stmt.executeQuery(data);
           while(rs.next())
           {
           %> 
    
   
     <span id="msgid" style="color:red"></span>   
     <input type="text" name="txtid" placeholder="id" id="id" onkeyup="myFunction()" value='<%=rs.getString("Student_Id")%>'>
    
        <span id="msgname" style="color:red"></span>
	<input type="text" name="txtname" placeholder="full name" id="name" onkeyup="myFuntion()" value='<%=rs.getString("Student_Name")%>'> 
        
        <span id="msgemail" style="color:red"></span>
        <input type="email" name="txtemail" placeholder="email" id="email" onkeyup="myFunction()" value='<%=rs.getString("gmail")%>'>
        
        <span id="msgdob" style="color:red"></span>
        <input type="text" name="dob" id="datepicker" placeholder="dd-mm-yyyy(dob)" onkeyup="myFunction()" value='<%=rs.getString("Dob")%>'><!-- do not repeat id-->

        <span id="msgaddress" style="color:red"></span>
	<input type="text" name="txtaddress" placeholder="your address" id="address" onkeyup="myFunction()" value='<%=rs.getString("Address")%>'>
        
        
        <span id="msgphoneno" style="color:red"></span>
	<input type="text" name="txtphoneno" placeholder="phone number" id="phoneno" onkeyup="myFunction()" value='<%=rs.getString("PhoneNumber")%>'>
        
        <span id="msgdept" style="color:red"></span>
        <input type="text" name="txtdept" placeholder="department" id="dept" onkeyup="myFuntion()" value='<%=rs.getString("Dept")%>'>
        
        <span id="msgclass" style="color:red"></span>
	<input type="text" name="txtclass" placeholder="class" id="class" onkeyup="myFunction()" value='<%=rs.getString("Class")%>'>
	
        <div><span id="msggender" style="color:red"></span></div>
        <label class="gender">gender :</label>
        <input type="radio" id="male" name="gender" value='<%=rs.getString("Gender")%>' checked="checked"/><label>male</label>
        <input type="radio" id="female" name="gender" value='<%=rs.getString("Gender")%>'/><label>female</label>
        
<br>


<!--
<input type="submit" value="submit"><br/>
<a href="">back</a>
-->

  <%
                }
            %>
           
              
             <button type="submit">Submit</button>
            <br/><br/>
            <a href="view_faculty.jsp">Back</a>   
            
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


