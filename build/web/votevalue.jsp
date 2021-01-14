<%@page import="java.util.ArrayList"%>
<%@page import="Model.Party"%>
<%@page import="Dao.*"%>
<%@page import="java.util.List"%>


<%
    
  response.addHeader("pragma","no-cache");
  response.addHeader("cache-control","no-store");
      
  String  name=(String)session.getAttribute("sname");

  String  address=(String)session.getAttribute("saddress");
  String  voterid=(String)session.getAttribute("svoterid");
  String  aadhar=session.getAttribute("saadhar").toString();
  
    if(address==null)
      response.sendRedirect("index.jsp");
   else if(name==null)
      response.sendRedirect("index.jsp");
  else if(aadhar==null)
      response.sendRedirect("index.jsp");
    
     List<Party> Mylist=new ArrayList<Party>();
NewPartyDAO npd=new NewPartyDAO();


%>

<html>
    
    
<head>
<link href="css/style.css" rel="stylesheet" type="text/css">
    <title> Digitel Vote Bank</title>
    
    <!-- font-awesome icons -->
<link href="css/font-awesome.css" rel="stylesheet"> 
<!-- //font-awesome icons -->
  <!-- web-fonts -->
<link href='//fonts.googleapis.com/css?family=Roboto+Condensed:400,300,300italic,400italic,700,700italic' rel='stylesheet' type='text/css'>
<link href='//fonts.googleapis.com/css?family=Lovers+Quarrel' rel='stylesheet' type='text/css'>
<link href='//fonts.googleapis.com/css?family=Offside' rel='stylesheet' type='text/css'> 
<!-- web-fonts -->    


</head>




<body>
    
<header>
<!--
    <div class="logo">
    <img src="img/img1.jpg">
    </div>
--><h1 style="background-attachment:fixed"   >Vote Your Candidate </h1>
   <div class="row">
     <ul class="main">
           <li> <a href=""> <%= name %></a>  </li>    
           <li> <a href="registration.jsp">
               Voter id <%= voterid %></a>  </li>    
           <li> <a href="">Aadhar no=<%= aadhar%> </a>  </li>    
           <li> <a href=""> About</a>  </li>    
           <li> <a href=""> HELP!!</a>  </li>    
          </ul>
    
    </div>
<center>
    <div class="partytable">

    </div>
    
</center>    
<div class="logo">
    <img src="img/img2.jpg">
    </div>
          <%
          Mylist=npd.searchAllParty();
          %>
           
           <center>
               <h1>Party Name</h1> 
           
    
                   <table border="7" bgcolor="lightgreen" >
                       <tr>
                           <th>Sr no.</th>
                           <th>Candidate Name</th>
                           <th>Party Name</th>
                           <th>VOTE<th>
                       </tr>    
                       
           <%
           for(Party p:Mylist)
           {
                   out.println("<form action=voteButton method=post>");  
           %>
           
           
         <tr>
         <font size="20"  colour="pink">     
           <td> <input type="text" name="cnumber" value="<%= p.getNumber()%>" readonly> </td> 
           
           <td> <input type="text" name="cname" value="<%= p.getCandidatename() %>"   readonly> </td> 
         
           <td> <input type="text" name="partyname" value="<%= p.getPartyname() %>"   readonly> </td> 
          
      
           <%
           out.println("<td> "); 
         //   out.println("<button type=submit class=btn btn-default aria-label=Left Align><i class='fa fa-times' aria-hidden='true'></i>	</button>");   
      out.println("<button  type=submit ><img src=img/vote1.jpg /></button>");   
       // out.println("<button  type=submit ><i class=fa fa-hand-pointer></i></button>");   
    
       //    out.println("<input type=submit value=VOTE 	>");   
         
           
              out.println("</td>");
           out.println("</tr>");
                 out.println("</form>"); 
           
        }
           %>                       
                   </table>
                     
                   
          
                  </font>       
               
               
           </center>
           
           
</header>
    
</body>

</html>