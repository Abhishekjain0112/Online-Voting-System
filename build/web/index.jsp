<html>
<head>
    <link href="css/style.css" rel="stylesheet" type="text/css">
    <title> Digitel Vote Bank</title>
    <link href="fontawesome-free-5.0.7/web-fonts-with-css/css/fontawesome.min.css" 
       rel="stylesheet">        
 <link href="fontawesome-free-5.0.7/web-fonts-with-css/css/fontawesome-all.min.css" 
       rel="stylesheet">  
    
 <script type="text/javascript"  >
  function abc()
     { 
	       
       var  voter=f1.voterid.value;

        var aadhar=f1.aadharno.value;
       //  alert("Welcome-----------------------");
        
        if(aadhar==="")
           {alert("Aadhar Number cant be left blank");
    //      doucument.getElementsByClassName("aadharno").fouse();
   //       doucument.getElementsByClassName("aadharno").select();
          
            return false;          }
           
                     
           
	 if(voter==="")
           {
               alert("Voter id cant be left blank");
                 return false;     
           }   
	if( voter==""||aadhar=="")		// document.write("addhar="+aadhar+"         voter = "+voter);
        {       return false;  
         }
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
           <li> <a href="">Home</a>  </li>    
           <li> <a href="registration.jsp">Registration</a>  </li>    
           <li> <a href=""> Contact</a>  </li>    
           <li> <a href=""> About</a>  </li>    
           <li> <a href=""> HELP!!</a>  </li>    
          </ul>
    
    </div>

    <div class="loginform">
    
     <form name="f1" method="post" action="Voterlogin">
     
           <div class="table">
           
               <table >
               <tr>
                <th>Voter Id </th>
                   <td> <input type="text" id="voterid" name="voterid"> </td>
                   </tr>
                                   <tr></tr> <tr></tr> <tr></tr> <tr></tr> 
                    <tr>

             <th>Aadhar Number</th>
                   <td> <input type="text" id="aadharno" name="aadharno"> </td>
                   </tr>       
                   <br>
                <tr>
               <td></td>
                <td> <input type="submit"  value="Go For Vote"  name="voteindex" onclick="return abc();"> </td>   
                </tr>
                </td>
<!--                <td>
              <button type=submit class=btn btn-default aria-label=Left Align><i class='fa fa-times' aria-hidden='true'></i>	</button>
                    </tr>-->
                
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