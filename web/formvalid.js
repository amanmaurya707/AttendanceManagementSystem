function myFunction()
{
        var id=document.getElementById("id").value;
        //alert("id is"+id);
       
	var name=document.getElementById("name").value;
         var year=document.getElementById("class").value;
         var dept=document.getElementById("dept").value;
        
        var date=document.getElementById("datepicker").value;
      
         var status=document.getElementById("status").value;
       

	var namepattern=/^[A-Z a-z .]+$/
        
        var datepattern=/^([0-9]{2})-([0-9]{2})-([0-9]{4})$/;
        //for id
     if(id=="")
     {
            
            //alert("msg2 work");
            document.getElementById("msgid").innerHTML="** please fill id";
            return false;
       }
      
      if(id.length<2)
        {
            document.getElementById("msgid").innerHTML="** id length must be greater than 2 character";
            return false;
        }
        if(id.length>20)
        {
            document.getElementById("msgid").innerHTML="** id length must be less than 20 character";
            return false;
        }
      
   
        
        //for name
        
	if(name=="")
	{
         
		document.getElementById("msgname").innerHTML="**please fill fullname";
		return false;
	}
        
	 if(name.length<5)
	{
		document.getElementById("msgname").innerHTML="**length must be atleast 5 character";
		return false;
	}
	 if(name.length>50)
	{
		document.getElementById("msgname").innerHTML="**length must be less than 50 characeter";
		return false;
	}
	if(!name.match(namepattern))
	{
	
            document.getElementById("msgname").innerHTML="** only alphabets are allowed";
		return false;
        }
       
       
          //for class
       
       if(year=="")
       {
           document.getElementById("msgclass").innerHTML="** please fill class";
            return false;
        
       }
         if(year.length<2)
       {
                  document.getElementById("msgclass").innerHTML="** class must be atleast 2 characters";
            return false;
       }
       if(year.length>50)
       {
                  document.getElementById("msgclass").innerHTML="** class must be less than 50 characters";
            return false;
       }
       
     
       
       
       
       //for dept
       if(dept=="")
       {
                  document.getElementById("msgdept").innerHTML="** please fill department";
            return false;
           
       }
       if(dept.length<2)
       {
                  document.getElementById("msgdept").innerHTML="** department must be atleast 2 characters";
            return false;
       }
       if(dept.length>50)
       {
                  document.getElementById("msgdept").innerHTML="** department must be less than 50 characters";
            return false;
       }
       
    
         //for date
       if(date=="")
       {
            document.getElementById("msgdate").innerHTML="** please fill date";
            return false;
       }
       if(!date.match(datepattern))
       {
             document.getElementById("msgdate").innerHTML="** please enter valid date";
            return false;
       }
      
      
      //for status
      //for dept
       if(status=="")
       {
                  document.getElementById("msgstatus").innerHTML="** please fill status";
            return false;
           
       }
       if(status.length<1)
       {
                  document.getElementById("msgstatus").innerHTML="** status length must be atleast 1 characters";
            return false;
       }
       if(status.length>20)
       {
                  document.getElementById("msgstatus").innerHTML="** status must be less than 20 characters";
            return false;
       }
}