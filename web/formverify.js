function myFunction()
{
        var id=document.getElementById("id").value;
        //alert("id is"+id);
       
	var name=document.getElementById("name").value;
        
        var email=document.getElementById("email").value;
        
        var dob=document.getElementById("datepicker").value;
          var address=document.getElementById("address").value;
        var phoneno=document.getElementById("phoneno").value;
        
        var dept=document.getElementById("dept").value;
              
        var year=document.getElementById("class").value;
        
        var gender=document.forms.gender;
       // alert("gender"+gender);
        //var password=document.getElementById("password").value;
      //  document.getElementById("message2").innerHTML="ur password is:"+b;
       // alert("press ok to continue!!!");
	var namepattern=/^[A-Z a-z .]+$/
        
        var datepattern=/^([0-9]{2})-([0-9]{2})-([0-9]{4})$/;
        //for id
     if(id=="")
     {
            
            //alert("msg2 work");
            document.getElementById("msgid").innerHTML="** please fill id";
            return false;
       }
      
     else if(id.length<2)
        {
            document.getElementById("msgid").innerHTML="** id length must be greater than 2 character";
            return false;
        }
      else  if(id.length>20)
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
	if(name.match(namepattern))
	{
		true;
	}
        else{
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
            document.getElementById("msdob").innerHTML="** please fill date";
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
       if(address<5)
       {
            document.getElementById("msgaddress").innerHTML="** length must be atleast 5 characters ";
            return false;
       }
        if(address>100)
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
       
       
       //for dept
       if(dept=="")
       {
                  document.getElementById("msgdept").innerHTML="** please fill department";
            return false;
           
       }
       if(dept<2)
       {
                  document.getElementById("msgdept").innerHTML="** department must be atleast 2 characters";
            return false;
       }
       if(dept>50)
       {
                  document.getElementById("msgdept").innerHTML="** department must be less than 50 characters";
            return false;
       }
       
       //for subject
       
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
       
      
}