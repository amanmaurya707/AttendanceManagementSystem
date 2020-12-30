function myFunction()
{
        
       
	var name=document.getElementById("name").value;
  var password=document.getElementById("password").value;
  var rpassword=document.getElementById("rpassword").value;
        //alert("id is"+name);
        
        var email=document.getElementById("email").value;
        
  
        var phoneno=document.getElementById("phoneno").value;
      
        
       // alert("press ok to continue!!!");
	var namepattern=/^[A-Z a-z 0-9 .]+$/
        
      
   
        
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
		/*//true;
	}
        else{*/
            document.getElementById("msgname").innerHTML="** only alphanumeric are allowed";
		return false;
        }
//pass

       if(password=="")
        {
            
            //alert("msg2 work");
            document.getElementById("msgpass").innerHTML="** please fill password";
            return false;
        }
      
      if(password.length<5)
        {
            document.getElementById("msgpass").innerHTML="** password length must be greater than 5 character";
            return false;
        }
        if(password.length>20)
        {
            document.getElementById("msgpass").innerHTML="** password length must be less than 20 character";
            return false;
        }
        //confirm pass
        if(password!=rpassword)
        {
          document.getElementById("msgrpass").innerHTML="** password are not same";
            return false;
        }
        
       // alert("welcome on this site!!!");


        //for email
           if(email=="")
        {
            
            //alert("msg2 work");
            document.getElementById("msgemail").innerHTML="** please fill email";
            return false;
        }
     
      
        //alert(""welcome on this site);
       
       
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