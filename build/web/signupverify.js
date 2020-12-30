function myFun()
{
	var username=document.getElementById("username").value;
        var password=document.getElementById("password").value;
         var rpassword=document.getElementById("rpassword").value;
          var email=document.getElementById("email").value;
         var phoneno=document.getElementById("phoneno").value;
          //var email=document.getElementById("email").value;
      
       alert("your name is"+username);
	var pattern=/^[A-Z a-z 0-9 .]+$/
        //for username
        
	if(username=="")
	{
         
		document.getElementById("msgname").innerHTML="**please fill username";
		return false;
	}
        
	if(username.length<3)
	{
		document.getElementById("msgname").innerHTML="**length must be atleast 3 character";
		return false;
	}
	if(username.length>20)
	{
		document.getElementById("msgname").innerHTML="**length must be less than 20 characeter";
		return false;
	}
	if(!username.match(pattern))
	{
		false;
	}
      
        //for password
           if(password=="")
        {
            
            //alert("msg2 work");
            document.getElementById("msgpassword").innerHTML="** please fill password";
            return false;
        }
      
      if(password.length<5)
        {
            document.getElementById("msgpassword").innerHTML="** password length must be greater than 5 character";
            return false;
        }
        if(password.length>20)
        {
            document.getElementById("msgpassword").innerHTML="** password length must be less than 20 character";
            return false;
        }
        //for retype password
        if(password!=rpassword)
        {
             document.getElementById("msgrpassword").innerHTML="** password are not same";
            return false;
        }
        //for email
       
        if(email=="")
        {
         document.getElementById("msgemail").innerHTML="** please fill email";
            return false;
        }
        //for phoneno
       
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
        alert("welcome on this site!!!");
}