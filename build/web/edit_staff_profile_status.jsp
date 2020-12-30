<%@page import="java.sql.*"%>
<!--server side code-->

<% 
String id=request.getParameter("txtid");
String name=request.getParameter("txtname");
String email=request.getParameter("txtemail");
String dob=request.getParameter("dob");
String address=request.getParameter("txtaddress");
String phoneno=request.getParameter("txtphoneno");
String dept=request.getParameter("txtdept");
String subject=request.getParameter("txtsubject");
String gender=request.getParameter("gender");
//Connection conn=null;
//PreparedStatement pstmt=null;
            Connection conn=null;
            //Statement stmt=null;
            PreparedStatement pstmt=null;
            ResultSet rs=null;
            Class.forName("org.apache.derby.jdbc.ClientDriver").newInstance();
            conn=DriverManager.getConnection("jdbc:derby://localhost:1527/mydb", "aman","aman");

if(id!=null&&name!=null&&email!=null&&dob!=null&&address!=null&&phoneno!=null&&dept!=null&&subject!=null&&gender!=null)
{
   try
   {
    //conn=DriverManager.getConnection("jdbc:derby://localhost:1527/rawdb", "aman","aman");
    String query="update Stafftbl set Staff_Name=?,Subject=?,Dept=?,Dob=?,Address=?,Gmail=?,PhoneNumber=?,Gender=? where Staff_Id='"+id+"'";//start here from 1,2,3,4 positions
    pstmt=conn.prepareStatement(query);//assign prepared statements
  //  out.println("here 1");
  //  pstmt.setString(1,a);
    pstmt.setString(1,name);
    // out.println("here 2");
    pstmt.setString(2,subject);
    // out.println("here 3");
    pstmt.setString(3,dept);
     //out.println("here 4");
    pstmt.setString(4,dob);
    
    pstmt.setString(5,address);
    pstmt.setString(6,email);
    pstmt.setString(7,phoneno);
    pstmt.setString(8,gender);
     //out.println("here 5");
    pstmt.executeUpdate();
    response.sendRedirect("view_staff_profile.jsp");
   }
   catch(Exception ex)
   {
       out.println("error occurs:"+ex);
   }
}
/*else
{
    out.println("please fill full details");
}*/

%>