package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import Model.Party;
import Dao.*;
import java.util.List;

public final class votevalue_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

    
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



      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("<head>\r\n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("    <title> Digitel Vote Bank</title>\r\n");
      out.write("    \r\n");
      out.write("    <!-- font-awesome icons -->\r\n");
      out.write("<link href=\"css/font-awesome.css\" rel=\"stylesheet\"> \r\n");
      out.write("<!-- //font-awesome icons -->\r\n");
      out.write("  <!-- web-fonts -->\r\n");
      out.write("<link href='//fonts.googleapis.com/css?family=Roboto+Condensed:400,300,300italic,400italic,700,700italic' rel='stylesheet' type='text/css'>\r\n");
      out.write("<link href='//fonts.googleapis.com/css?family=Lovers+Quarrel' rel='stylesheet' type='text/css'>\r\n");
      out.write("<link href='//fonts.googleapis.com/css?family=Offside' rel='stylesheet' type='text/css'> \r\n");
      out.write("<!-- web-fonts -->    \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("    \r\n");
      out.write("<header>\r\n");
      out.write("<!--\r\n");
      out.write("    <div class=\"logo\">\r\n");
      out.write("    <img src=\"img/img1.jpg\">\r\n");
      out.write("    </div>\r\n");
      out.write("--><h1 style=\"background-attachment:fixed\"   >Vote Your Candidate </h1>\r\n");
      out.write("   <div class=\"row\">\r\n");
      out.write("     <ul class=\"main\">\r\n");
      out.write("           <li> <a href=\"\"> ");
      out.print( name );
      out.write("</a>  </li>    \r\n");
      out.write("           <li> <a href=\"registration.jsp\">\r\n");
      out.write("               Voter id ");
      out.print( voterid );
      out.write("</a>  </li>    \r\n");
      out.write("           <li> <a href=\"\">Aadhar no=");
      out.print( aadhar);
      out.write(" </a>  </li>    \r\n");
      out.write("           <li> <a href=\"\"> About</a>  </li>    \r\n");
      out.write("           <li> <a href=\"\"> HELP!!</a>  </li>    \r\n");
      out.write("          </ul>\r\n");
      out.write("    \r\n");
      out.write("    </div>\r\n");
      out.write("<center>\r\n");
      out.write("    <div class=\"partytable\">\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("</center>    \r\n");
      out.write("<div class=\"logo\">\r\n");
      out.write("    <img src=\"img/img2.jpg\">\r\n");
      out.write("    </div>\r\n");
      out.write("          ");

          Mylist=npd.searchAllParty();
          
      out.write("\r\n");
      out.write("           \r\n");
      out.write("           <center>\r\n");
      out.write("               <h1>Party Name</h1> \r\n");
      out.write("           \r\n");
      out.write("    \r\n");
      out.write("                   <table border=\"7\" bgcolor=\"lightgreen\" >\r\n");
      out.write("                       <tr>\r\n");
      out.write("                           <th>Sr no.</th>\r\n");
      out.write("                           <th>Candidate Name</th>\r\n");
      out.write("                           <th>Party Name</th>\r\n");
      out.write("                           <th>VOTE<th>\r\n");
      out.write("                       </tr>    \r\n");
      out.write("                       \r\n");
      out.write("           ");

           for(Party p:Mylist)
           {
                   out.println("<form action=voteButton method=post>");  
           
      out.write("\r\n");
      out.write("           \r\n");
      out.write("           \r\n");
      out.write("         <tr>\r\n");
      out.write("         <font size=\"20\"  colour=\"pink\">     \r\n");
      out.write("           <td> <input type=\"text\" name=\"cnumber\" value=\"");
      out.print( p.getNumber());
      out.write("\" readonly> </td> \r\n");
      out.write("           \r\n");
      out.write("           <td> <input type=\"text\" name=\"cname\" value=\"");
      out.print( p.getCandidatename() );
      out.write("\"   readonly> </td> \r\n");
      out.write("         \r\n");
      out.write("           <td> <input type=\"text\" name=\"partyname\" value=\"");
      out.print( p.getPartyname() );
      out.write("\"   readonly> </td> \r\n");
      out.write("          \r\n");
      out.write("      \r\n");
      out.write("           ");

           out.println("<td> "); 
         //   out.println("<button type=submit class=btn btn-default aria-label=Left Align><i class='fa fa-times' aria-hidden='true'></i>	</button>");   
      out.println("<button  type=submit ><img src=img/vote1.jpg /></button>");   
       // out.println("<button  type=submit ><i class=fa fa-hand-pointer></i></button>");   
    
       //    out.println("<input type=submit value=VOTE 	>");   
         
           
              out.println("</td>");
           out.println("</tr>");
                 out.println("</form>"); 
           
        }
           
      out.write("                       \r\n");
      out.write("                   </table>\r\n");
      out.write("                     \r\n");
      out.write("                   \r\n");
      out.write("          \r\n");
      out.write("                  </font>       \r\n");
      out.write("               \r\n");
      out.write("               \r\n");
      out.write("           </center>\r\n");
      out.write("           \r\n");
      out.write("           \r\n");
      out.write("</header>\r\n");
      out.write("    \r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
