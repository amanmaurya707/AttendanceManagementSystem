<%@page import="java.sql.*"%>
<!--server side code-->

<% 
String id=request.getParameter("txtid");
String name=request.getParameter("txtname");
String sclass=request.getParameter("txtclass");
String dept=request.getParameter("txtdept");
String date=request.getParameter("date");
String status=request.getParameter("txtstatus");

            Connection conn=null;
            //Statement stmt=null;
            PreparedStatement pstmt=null;
            ResultSet rs=null;
            Class.forName("org.apache.derby.jdbc.ClientDriver").newInstance();
            conn=DriverManager.getConnection("jdbc:derby://localhost:1527/mydb", "aman","aman");

if(id!=null&&name!=null&&sclass!=null&&dept!=null&&date!=null&&status!=null)
{
   try
   {
    //conn=DriverManager.getConnection("jdbc:derby://localhost:1527/rawdb", "aman","aman");
    String query="update attendancetbl set Student_Name=?,Class=?,Dept=?,Date=?,Status=? where Student_Id='"+id+"'";//start here from 1,2,3,4 positions
    pstmt=conn.prepareStatement(query);//assign prepared statements
  //  out.println("here 1");
  //  pstmt.setString(1,a);
    pstmt.setString(1,name);
    // out.println("here 2");
    pstmt.setString(2,sclass);
    // out.println("here 3");
    pstmt.setString(3,dept);
     //out.println("here 4");
    pstmt.setString(4,date);
    
    pstmt.setString(5,status);
    
    pstmt.executeUpdate();
    response.sendRedirect("view_attendance_by_staff.jsp");
   }
   catch(Exception ex)
   {
       out.println("error occurs:"+ex);
   }
}


%>