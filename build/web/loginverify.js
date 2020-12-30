function myFun()
{
	var username=document.getElementById("username").value;
        var password=document.getElementById("password").value;

	var pattern=/^[A-Z a-z 0-9 .]+$/
        //for username
        
	if(username=="")
	{
         
		document.getElementById("message1").innerHTML="**please fill username";
		return false;
	}
        
	if(username.length<3)
	{
		document.getElementById("message1").innerHTML="**length must be atleast 3 character";
		return false;
	}
	if(username.length>20)
	{
		document.getElementById("message1").innerHTML="**length must be less than 20 characeter";
		return false;
	}

           if(password=="")
        {
            
            //alert("msg2 work");
            document.getElementById("message2").innerHTML="** please fill password";
            return false;
        }
      
      if(password.length<5)
        {
            document.getElementById("message2").innerHTML="** password length must be greater than 5 character";
            return false;
        }
        if(password.length>20)
        {
            document.getElementById("message2").innerHTML="** password length must be less than 20 character";
            return false;
        }
        
        alert("welcome on this site !!!");
       
}