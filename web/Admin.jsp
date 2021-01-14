<%@page import="java.util.ArrayList"%>
<%@page import="Model.Party"%>
<%@page import="Dao.*"%>
<%@page import="java.util.List"%>
<%!
//HttpSession session=request.getSession();
 List<Party> Mylist=new ArrayList<Party>();
NewPartyDAO npd=new NewPartyDAO();
String name;//,address,voterid,aadhar;
int totalvote;
%>

<%
      response.addHeader("pragma","no-cache");
  response.addHeader("cache-control","no-store");
    

  name=session.getAttribute("sname").toString();

  if(name==null)
  {
    response.sendRedirect("index.jsp");
  }
      
      
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
-->
<h1  style="background-attachment:fixed">
   
    Vote Your Candidate </h1>
   <div class="row">
     <ul class="main">
           <li> <a href=""> <%= name %></a>  </li>    
           <li> <a href="registration.jsp">
            HOME   </a>  </li>    
           <li> <a href="index.jsp">Signout </a>  </li>    
           <li> <a href=""> About</a>  </li>    
           <li> <a href="">       <font color="Blue">   ONLY ADMIN ACCESSIBLITY</font> </a>  </li>    
          </ul>
    
    </div>
<center>
    <div class="vote">

    </div>
    
</center>    
<div class="logo">
    <img src="img/img2.jpg">
    </div>
          <%
          Mylist=npd.searchAllParty();
          %>
           
           <center>
               <h1>      <font color="pink">   Final Vote Information        </font>  </h1> 
           
    
                   <table border="7" bgcolor="lightgreen" >
                       <tr>
                           <th>Sr no.</th>
                           <th>Candidate Name</th>
                           <th>Party Name</th>
                           <th>TOTAL VOTES <th>
                               
                       </tr>    
                       
           <%
           for(Party p:Mylist)
           {
                   out.println("<form action=voteButton method=post>");  
           %>
           
           
         <tr>
           <td> <input type="text" name="cnumber" value="<%= p.getNumber()%>" readonly> </td> 
           
           <td> <input type="text" name="cname" value="<%= p.getCandidatename() %>"   readonly> </td> 
         
           <td> <input type="text" name="partyname" value="<%= p.getPartyname() %>"   readonly> </td> 
           <td> <input type="text" name="Total Vote" value="<%= p.getTvote() %>"   readonly> </td> 
          
          
      
           <%
           out.println("</tr>");
       }
           %>                       
                   </table>
                     
                   
          
                   <font color="RED"> ______________________________________________ </font>       
               
               
           </center>
           
           
</header>
    
</body>

</html>