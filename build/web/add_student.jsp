
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.sql.Date"%>

<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<% 
String id=request.getParameter("txtid");
String name=request.getParameter("txtname");
String email=request.getParameter("txtemail");
String dob=request.getParameter("dob");
String address=request.getParameter("txtaddress");
String phoneno=request.getParameter("txtphoneno");
String dept=request.getParameter("txtdept");
String sclass=request.getParameter("txtclass");
String gender=request.getParameter("gender");


Connection conn=null;
PreparedStatement pstmt=null;
Statement stmt=null;


boolean flag=true;
ResultSet rs=null;
if(id!=null&&name!=null&&email!=null&&dob!=null&&address!=null&&phoneno!=null&&dept!=null&&sclass!=null&&gender!=null)
{
   try
   {
       Class.forName("org.apache.derby.jdbc.ClientDriver").newInstance();
    conn=DriverManager.getConnection("jdbc:derby://localhost:1527/mydb", "aman","aman");
    String data="insert into studenttbl(Student_Id,Student_Name,Class,Dept,dob,Address,Gmail,PhoneNumber,Gender) values(?,?,?,?,?,?,?,?,?)";
    //out.print("work");
    //Date d=Date.valueOf(dob);
        stmt= conn.createStatement();
     rs = stmt.executeQuery("select * from studenttbl");

     while(rs.next())
     {
         String uid=rs.getString(1);
         if(id.equals(uid))
         {
             flag=false;
         }
         if(id==null)
         {
             break;
         }
     }
    //out.println("***this return"+flag);
     if(flag)
     {
    pstmt=conn.prepareStatement(data);//assign prepared statements
    pstmt.setString(1,id);
    pstmt.setString(2,name);
    pstmt.setString(3,sclass);
    pstmt.setString(4,dept);
   
    pstmt.setString(5,dob);
       // out.print("work3");
    pstmt.setString(6,address);
    pstmt.setString(7,email);
    pstmt.setString(8,phoneno);
    pstmt.setString(9,gender);
    pstmt.executeUpdate();
    //out.print("successfully insert!!!!ok");
    response.sendRedirect("view_student.jsp");
     }
      else
     {
      
         
         %>
            
         <script> alert("id is already exist try again!!!"); </script>
 
        <%
          //response.sendRedirect("register_staff.jsp");  
          
           RequestDispatcher rd1=request.getRequestDispatcher("register_student.jsp");
                //request.setAttribute("username", username);
                rd1.include(request, response);

                 
     }

   }
   catch(Exception ex)
   {
       out.println("error occurs:"+ex);
   }
}

%>

