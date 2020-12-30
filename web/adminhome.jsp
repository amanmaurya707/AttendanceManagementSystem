<!DOCTYPE html>

<html>
<head>
	<title></title>
	<link rel="stylesheet" type="text/css" href="mystyle.css">
</head>

<body>
	

		<div id="header">
					
                                            <h1>(AMS)Attendance Management System</h1>

		</div>

		<div id="menu">
		<ul>
			<li><a href="#">admin home</a></li>
			<li><a href="#">profile</a>
                       
                            <ul id="childmenu">
                                <li><a href="view_admin_profile.jsp">view profile</a></li>
                                
                                <li><a href="change_admin_profile.jsp">change profile</a></li>
                            </ul>
                        </li>

		
                        <li>
                            <a href="#">faculty</a>
                            <ul  id="childmenu">
                                <li><a href="view_faculty.jsp">view all faculty</a></li>
                                <li><a href="register_staff.jsp">add faculty</a></li>
                                <li><a href="remove_faculty.jsp">remove faculty</a></li>
                                <li><a href="update_faculty.jsp">update faculty </a></li>
                            </ul>
                        </li>
                        
			<li><a href="#">student</a>
                            <ul  id="childmenu"><li><a href="view_student.jsp">view all student</a></li>
                                <li><a href="register_student.jsp">add student</a></li>
                                <li><a href="remove_student.jsp">remove student</a></li>
                                <li><a href="update_student.jsp">update student</a></li>
                            </ul><!--create pdf or display studnet records-->
                        </li>
			<li><a href="login.html">logout</a></li>
		</ul>		
            </div>

    <div id="wrap">
         
  <% 
      
out.println("<h1 align=center><font color=orange>welcome admin</font></h1><br><br>");
out.println("<img src='./images/admindashboard_1.jpg' style='width:100%'>");

//out.println("login at:"+session.getAttribute("username"));
  %>
  
        
    </div>
 
   
</body>
</html>