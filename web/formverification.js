

function myFunction()
{
        var id=document.getElementById("id").value;
        //alert("id is"+id);
       
	var name=document.getElementById("name").value;
        
        var email=document.getElementById("email").value;
        
       var dob=document.getElementById("datepicker").value;
          var address=document.getElementById("address").value;
      var phoneno=document.getElementById("phoneno").value;
   
        
        
    
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
            document.getElementById("msgid").innerHTML="** id length must be atleast 2 character";
            return false;
        }
        if(id.length>20)
        {
            document.getElementById("msgid").innerHTML="** id length must be less than 20 character";
            return false;
        }
     
        
        //for username
        
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
        
        //for email
           if(email=="")
        {
            
            //alert("msg2 work");
            document.getElementById("msgemail").innerHTML="** please fill email";
            return false;
        }
     
     
    
        //alert(""welcome on this site);
       
       //for dob
       if(dob=="")
       {
            document.getElementById("msgdob").innerHTML="** please fill date";
            return false;
       }
       
        if(!dob.match(datepattern))
       {
         
           document.getElementById("msgdob").innerHTML="** please enter valid date";
            return false;
       }
       
       
        //for address
         if(address=="")
       {
             document.getElementById("msgaddress").innerHTML="** please fill address";
            return false;
       }
      if(address.length<5)
       {
            document.getElementById("msgaddress").innerHTML="** length must be atleast 5 characters ";
            return false;
       }  
      if(address.length>100)
       {
            document.getElementById("msgaddress").innerHTML="** length must be less than 100 characters ";
            return false;
       }
      
     
       //for mobile number
       
    if(phoneno=="")
       {
                       document.getElementById("msgphoneno").innerHTML="** please fill mobile number";
            return false;
       }
       if(isNaN(phoneno))
       {
                 document.getElementById("msgphoneno").innerHTML="** only numeric value are allowed";
            return false;
       }
       if(phoneno.length<10)
       {
                            document.getElementById("msgphoneno").innerHTML="** mobile no. must be 10 digit";
            return false;
            
            
       }
       if(phoneno.length>10)
       {
                            document.getElementById("msgphoneno").innerHTML="** mobile no. must be 10 digit";
            return false;
       }
     
    
      
      
               
}