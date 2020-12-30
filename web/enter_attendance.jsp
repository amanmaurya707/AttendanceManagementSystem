
<!DOCTYPE html>
<html>
<head>
	<title></title>
	<link rel="stylesheet" type="text/css" href="style.css">
	<link rel="stylesheet" type="text/css" href="jquery-ui.min.css">
        <script type="text/javascript" language="javascript" src="formvalid.js"></script>
</head>
<body>
    <%@include file="staffmenu.html"%>     
   <div id="wrap">    
    
<h1>enter attendance</h1>
<form action="add_attendance.jsp" method="get" onsubmit="return myFunction()" name="forms">
     <span id="msgid" style="color:red"></span>   
     <input type="text" name="txtid" placeholder="id" id="id" onkeyup="myFunction()">
    
        <span id="msgname" style="color:red"></span>
	<input type="text" name="txtname" placeholder="full name" id="name" onkeyup="myFuntion()"> 
        
        
         <span id="msgclass" style="color:red"></span>
	<input type="text" name="txtclass" placeholder="class" id="class" onkeyup="myFunction()">
        
        <span id="msgdept" style="color:red"></span>
        <input type="text" name="txtdept" placeholder="department" id="dept" onkeyup="myFuntion()">
	
        <span id="msgdate" style="color:red"></span>
        <input type="text" name="txtdate" id="datepicker" placeholder="dd-mm-yyyy" onkeyup="myFunction()"><!-- do not repeat id-->

        <span id="msgstatus" style="color:red"></span>   
     <input type="text" name="txtstatus" placeholder="status (present/absent)" id="status" onkeyup="myFunction()">
        
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
<a href="staffmenu.html">back</a>



    

</form>
</div>

   
<%@include file="footer.html"%>
</body>
</html>