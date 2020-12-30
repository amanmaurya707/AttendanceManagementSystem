
<%@page import="java.sql.*"%>
<!--server side code-->

<% 
String id=request.getParameter("txtid");
String name=request.getParameter("txtname");
String email=request.getParameter("txtemail");
String dob=request.getParameter("dob");
String address=request.getParameter("txtaddress");
String phoneno=request.getParameter("txtphoneno");

String gender=request.getParameter("gender");

            Connection conn=null;
            //Statement stmt=null;
            PreparedStatement pstmt=null;
            ResultSet rs=null;
            Class.forName("org.apache.derby.jdbc.ClientDriver").newInstance();
            conn=DriverManager.getConnection("jdbc:derby://localhost:1527/mydb", "aman","aman");

if(id!=null&&name!=null&&email!=null&&dob!=null&&address!=null&&phoneno!=null&&gender!=null)
{
   try
   {
    //conn=DriverManager.getConnection("jdbc:derby://localhost:1527/rawdb", "aman","aman");
    String query="update Admintbl set Admin_Name=?,Dob=?,Address=?,Gmail=?,PhoneNumber=?,Gender=? where Admin_Id='"+id+"'";//start here from 1,2,3,4 positions
    pstmt=conn.prepareStatement(query);//assign prepared statements
  //  out.println("here 1");
  //  pstmt.setString(1,a);
    pstmt.setString(1,name);
   ;
  
    pstmt.setString(2,dob);
    
    pstmt.setString(3,address);
    pstmt.setString(4,email);
    pstmt.setString(5,phoneno);
    pstmt.setString(6,gender);
     //out.println("here 5");
    pstmt.executeUpdate();
    response.sendRedirect("view_admin_profile.jsp");
   }
   catch(Exception ex)
   {
       out.println("error occurs:"+ex);
   }
}


%>