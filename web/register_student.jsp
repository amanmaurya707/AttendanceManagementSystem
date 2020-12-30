<!DOCTYPE html>
<html>
<head>
	<title></title>
	<link rel="stylesheet" type="text/css" href="style.css">
	<link rel="stylesheet" type="text/css" href="jquery-ui.min.css">
        <link rel="stylesheet" type="text/css" href="main.css">
        <script type="text/javascript" language="javascript" src="formverify.js"></script>
</head>
<body>
    <%@include file="adminmenu.html"%> 
    
   <div id="wrap">    
    
<h1 align="center">add Student</h1>
<form action="add_student.jsp" method="get" onsubmit="return myFunction()" name="forms">
     <span id="msgid" style="color:red"></span>   
     <input type="text" name="txtid" placeholder="id" id="id" onkeyup="myFunction()">
    
        <span id="msgname" style="color:red"></span>
	<input type="text" name="txtname" placeholder="full name" id="name" onkeyup="myFuntion()"> 
        
        <span id="msgemail" style="color:red"></span>
        <input type="email" name="txtemail" placeholder="email" id="email" onkeyup="myFunction()">
        
        <span id="msgdob" style="color:red"></span>
        <input type="text" name="dob" id="datepicker" placeholder="dd-mm-yyyy(dob)" onkeyup="myFunction()"><!-- do not repeat id-->

        <span id="msgaddress" style="color:red"></span>
	<input type="text" name="txtaddress" placeholder="your address" id="address" onkeyup="myFunction()">
        
        
        <span id="msgphoneno" style="color:red"></span>
	<input type="text" name="txtphoneno" placeholder="phone number" id="phoneno" onkeyup="myFunction()">
        
        <span id="msgdept" style="color:red"></span>
        <input type="text" name="txtdept" placeholder="department" id="dept" onkeyup="myFuntion()">
        
        <span id="msgclass" style="color:red"></span>
	<input type="text" name="txtclass" placeholder="class" id="class" onkeyup="myFunction()">
	
        <div><span id="msggender" style="color:red"></span></div>
        <label class="gender">gender :</label>
        <input type="radio" id="male" name="gender" value="male" checked="checked"/><label>male</label>
        <input type="radio" id="female" name="gender" value="female"/><label>female</label>
        
<br>

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

<input type="submit" value="submit"><br/>
<a href="">back</a>



    

</form>
</div>

   
<%@include file="footer.html"%>
</body>
</html>