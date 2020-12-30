<!DOCTYPE html>

<html>
    <head>
        <title></title>
       
        <link rel="stylesheet" type="text/css" href="mystyle.css">
    </head>
    <body>
     	
		<div id="header">
					<h1>(AMS)Attendance Management System</h1
		</div>

		<div id="menu">
		<ul>
			<li><a href="#">faculty home</a></li>
			<li><a href="#">profile</a>
                       
                            <ul  id="childmenu">
                                <li><a href="view_staff_profile.jsp">view profile</a></li>
                              
                                <li><a href="change_staff_profile.jsp">change profile</a></li>
                            </ul>
                              
                        </li>

			<li>
                            <a href="#">attendance</a>
                            <ul  id="childmenu">
                                <li><a href="view_attendance_by_staff.jsp">view attendance</a></li>
                                <li><a href="enter_attendance.jsp">enter attendance</a></li>
                                 
                            </ul>
                        </li>
                        
			
			<li><a href="login.html">logout</a></li>
		</ul>		
	</div>

	
     
	    <div id="wrap">
         
  <% 
out.println("<h1 align=center><font color=orange>welcome staff</font></h1><br><br>");
out.println("<img src='./images/admindashboard_1.jpg' style='width:100%'>");
  %>
  
        
    </div>
 
  
        
        
    </body>
</html>
