<html>
<head>
<link href="css/style.css" rel="stylesheet" type="text/css">
    <title> Digitel Vote Bank</title>
    
    <script>
        function check()
        {
            
            var name,email,state,city,voterid,aadhar,address,number;
            
            name=f2.name.value;
            email=f2.email.value;
            state=f2.state.value;
            city=f2.city.value;
            voterid=f2.voterid.value;
            aadhar=f2.aadhar.value;
            address=f2.address.value;
            number=f2.mobile.value;
            
            if(aadhar=="")
            {  alert("Aadhar can not be left blank");
                 return false;  }
            
            if(name=="")
            {  alert("Name can not be left blank");
                 return false;  }
           if(email=="")
            {  alert("Email can not be left blank");
                 return false;  }
           
           if(state=="")
            {  alert("State can not be left blank");
                 return false;  }
           
                   if(city=="")
            {  alert("City can not be left blank");
                 return false;  }
           
                    if(voterid=="")
            {  alert("Voterid can not be left blank");
                 return false;  }
             
               if(address=="")
            {  alert("Address can not be left blank");
                 return false;  }
                  
                     if(mobile=="")
            {  alert("Mobile can not be left blank");
                 return false;  }
                                            
        }
        
        
    </script>
    
    
</head>
<body>
    
<header>
<!--
    <div class="logo">
    <img src="img/img1.jpg">
    </div>
-->
   <div class="row">
     <ul class="main">
           <li> <a href="index.jsp">Home</a>  </li>    
           <li> <a href="registration.jsp">Registration</a>  </li>    
           <li> <a href=""> Contact </a>  </li>    
           <li> <a href=""> About</a>  </li>    
           <li> <a href=""> HELP!!</a>  </li>    
          </ul>
    
    </div>

    <div class="loginform">
    
     <form name="f2" method="post" action="registration">
     
           <div class="table">
           
               <table >
                   
                 <tr>
                   <th>NAME </th>
                   <td> <input type="text" name="name"> </td>
                   </tr>
                   <tr>
  
                <tr>
                   <th>Gender </th>
                <font color="blue">     <td> 
                       Male <input type="radio" value="Male"  name="gender">
                       Female <input type="radio" value="Female"  name="gender">
                    
                   </td>   </font>
                   
                </tr>
                   <tr>
       
                       
                   <tr>
                   <th>Email </th>
                   <td> <input type="text" name="email"> </td>
                   </tr>
                   <tr>

                 <tr>
                   <th>State </th>
                   <td> <input type="text" name="state"> </td>
                   </tr>
                   <tr>       
                       
                   <tr>
                   <th>CITY </th>
                   <td> <input type="text" name="city"> </td>
                   </tr>
                   <tr>

                   
                   <tr>
                   
                       <th>Voter Id </th>
                   <td> <input type="text" name="voterid"> </td>
                   </tr>
                   <tr>
                       
             <th>Aadhar Number</th>
                   <td> <input type="text" name="aadhar"> </td>
                   </tr>       
                   
                   <tr>
                   <th>Address </th>
                   <td> <input type="text" name="address"> </td>
                   </tr>
                   <tr>

                    
<!--            <tr>
                   <th>Date Of Birth </th>
                   <td> <input type="date" name="dob" > </td>
                   </tr>
                   <tr>-->
           
                           
            <tr>
                   <th>Contect Number</th>
                   <td> <input type="text" name="mobile" > </td>
                   </tr>
                   <tr>
                    <td><input type="hidden" name="votevalue" value="0"> </td>   
                       
                <tr>
               <td></td>
               <td> <input type="submit"  value="Register" name="registration" onclick="return check();"> </td>   
                </tr>                  

                     
                       
                
                   
                
                <!--




               <tr>
                <th> Password</th>
                <td> <input type="password" name="upass"> </td>   
                </tr>
-->
               </table>        
          </div>     
    </form>
    </div>
<div class="logo">
    <img src="img/img2.jpg">
    </div>
</header>
    
</body>
    
    
</html>