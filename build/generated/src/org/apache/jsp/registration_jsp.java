package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registration_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("    <title> Digitel Vote Bank</title>\r\n");
      out.write("    \r\n");
      out.write("    <script>\r\n");
      out.write("        function check()\r\n");
      out.write("        {\r\n");
      out.write("            \r\n");
      out.write("            var name,email,state,city,voterid,aadhar,address,number;\r\n");
      out.write("            \r\n");
      out.write("            name=f2.name.value;\r\n");
      out.write("            email=f2.email.value;\r\n");
      out.write("            state=f2.state.value;\r\n");
      out.write("            city=f2.city.value;\r\n");
      out.write("            voterid=f2.voterid.value;\r\n");
      out.write("            aadhar=f2.aadhar.value;\r\n");
      out.write("            address=f2.address.value;\r\n");
      out.write("            number=f2.mobile.value;\r\n");
      out.write("            \r\n");
      out.write("            if(aadhar==\"\")\r\n");
      out.write("            {  alert(\"Aadhar can not be left blank\");\r\n");
      out.write("                 return false;  }\r\n");
      out.write("            \r\n");
      out.write("            if(name==\"\")\r\n");
      out.write("            {  alert(\"Name can not be left blank\");\r\n");
      out.write("                 return false;  }\r\n");
      out.write("           if(email==\"\")\r\n");
      out.write("            {  alert(\"Email can not be left blank\");\r\n");
      out.write("                 return false;  }\r\n");
      out.write("           \r\n");
      out.write("           if(state==\"\")\r\n");
      out.write("            {  alert(\"State can not be left blank\");\r\n");
      out.write("                 return false;  }\r\n");
      out.write("           \r\n");
      out.write("                   if(city==\"\")\r\n");
      out.write("            {  alert(\"City can not be left blank\");\r\n");
      out.write("                 return false;  }\r\n");
      out.write("           \r\n");
      out.write("                    if(voterid==\"\")\r\n");
      out.write("            {  alert(\"Voterid can not be left blank\");\r\n");
      out.write("                 return false;  }\r\n");
      out.write("             \r\n");
      out.write("               if(address==\"\")\r\n");
      out.write("            {  alert(\"Address can not be left blank\");\r\n");
      out.write("                 return false;  }\r\n");
      out.write("                  \r\n");
      out.write("                     if(mobile==\"\")\r\n");
      out.write("            {  alert(\"Mobile can not be left blank\");\r\n");
      out.write("                 return false;  }\r\n");
      out.write("                                            \r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("    </script>\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    \r\n");
      out.write("<header>\r\n");
      out.write("<!--\r\n");
      out.write("    <div class=\"logo\">\r\n");
      out.write("    <img src=\"img/img1.jpg\">\r\n");
      out.write("    </div>\r\n");
      out.write("-->\r\n");
      out.write("   <div class=\"row\">\r\n");
      out.write("     <ul class=\"main\">\r\n");
      out.write("           <li> <a href=\"index.jsp\">Home</a>  </li>    \r\n");
      out.write("           <li> <a href=\"registration.jsp\">Registration</a>  </li>    \r\n");
      out.write("           <li> <a href=\"\"> Contact </a>  </li>    \r\n");
      out.write("           <li> <a href=\"\"> About</a>  </li>    \r\n");
      out.write("           <li> <a href=\"\"> HELP!!</a>  </li>    \r\n");
      out.write("          </ul>\r\n");
      out.write("    \r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"loginform\">\r\n");
      out.write("    \r\n");
      out.write("     <form name=\"f2\" method=\"post\" action=\"registration\">\r\n");
      out.write("     \r\n");
      out.write("           <div class=\"table\">\r\n");
      out.write("           \r\n");
      out.write("               <table >\r\n");
      out.write("                   \r\n");
      out.write("                 <tr>\r\n");
      out.write("                   <th>NAME </th>\r\n");
      out.write("                   <td> <input type=\"text\" name=\"name\"> </td>\r\n");
      out.write("                   </tr>\r\n");
      out.write("                   <tr>\r\n");
      out.write("  \r\n");
      out.write("                <tr>\r\n");
      out.write("                   <th>Gender </th>\r\n");
      out.write("                <font color=\"blue\">     <td> \r\n");
      out.write("                       Male <input type=\"radio\" value=\"Male\"  name=\"gender\">\r\n");
      out.write("                       Female <input type=\"radio\" value=\"Female\"  name=\"gender\">\r\n");
      out.write("                    \r\n");
      out.write("                   </td>   </font>\r\n");
      out.write("                   \r\n");
      out.write("                </tr>\r\n");
      out.write("                   <tr>\r\n");
      out.write("       \r\n");
      out.write("                       \r\n");
      out.write("                   <tr>\r\n");
      out.write("                   <th>Email </th>\r\n");
      out.write("                   <td> <input type=\"text\" name=\"email\"> </td>\r\n");
      out.write("                   </tr>\r\n");
      out.write("                   <tr>\r\n");
      out.write("\r\n");
      out.write("                 <tr>\r\n");
      out.write("                   <th>State </th>\r\n");
      out.write("                   <td> <input type=\"text\" name=\"state\"> </td>\r\n");
      out.write("                   </tr>\r\n");
      out.write("                   <tr>       \r\n");
      out.write("                       \r\n");
      out.write("                   <tr>\r\n");
      out.write("                   <th>CITY </th>\r\n");
      out.write("                   <td> <input type=\"text\" name=\"city\"> </td>\r\n");
      out.write("                   </tr>\r\n");
      out.write("                   <tr>\r\n");
      out.write("\r\n");
      out.write("                   \r\n");
      out.write("                   <tr>\r\n");
      out.write("                   \r\n");
      out.write("                       <th>Voter Id </th>\r\n");
      out.write("                   <td> <input type=\"text\" name=\"voterid\"> </td>\r\n");
      out.write("                   </tr>\r\n");
      out.write("                   <tr>\r\n");
      out.write("                       \r\n");
      out.write("             <th>Aadhar Number</th>\r\n");
      out.write("                   <td> <input type=\"text\" name=\"aadhar\"> </td>\r\n");
      out.write("                   </tr>       \r\n");
      out.write("                   \r\n");
      out.write("                   <tr>\r\n");
      out.write("                   <th>Address </th>\r\n");
      out.write("                   <td> <input type=\"text\" name=\"address\"> </td>\r\n");
      out.write("                   </tr>\r\n");
      out.write("                   <tr>\r\n");
      out.write("\r\n");
      out.write("                    \r\n");
      out.write("<!--            <tr>\r\n");
      out.write("                   <th>Date Of Birth </th>\r\n");
      out.write("                   <td> <input type=\"date\" name=\"dob\" > </td>\r\n");
      out.write("                   </tr>\r\n");
      out.write("                   <tr>-->\r\n");
      out.write("           \r\n");
      out.write("                           \r\n");
      out.write("            <tr>\r\n");
      out.write("                   <th>Contect Number</th>\r\n");
      out.write("                   <td> <input type=\"text\" name=\"mobile\" > </td>\r\n");
      out.write("                   </tr>\r\n");
      out.write("                   <tr>\r\n");
      out.write("                    <td><input type=\"hidden\" name=\"votevalue\" value=\"0\"> </td>   \r\n");
      out.write("                       \r\n");
      out.write("                <tr>\r\n");
      out.write("               <td></td>\r\n");
      out.write("               <td> <input type=\"submit\"  value=\"Register\" name=\"registration\" onclick=\"return check();\"> </td>   \r\n");
      out.write("                </tr>                  \r\n");
      out.write("\r\n");
      out.write("                     \r\n");
      out.write("                       \r\n");
      out.write("                \r\n");
      out.write("                   \r\n");
      out.write("                \r\n");
      out.write("                <!--\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("               <tr>\r\n");
      out.write("                <th> Password</th>\r\n");
      out.write("                <td> <input type=\"password\" name=\"upass\"> </td>   \r\n");
      out.write("                </tr>\r\n");
      out.write("-->\r\n");
      out.write("               </table>        \r\n");
      out.write("          </div>     \r\n");
      out.write("    </form>\r\n");
      out.write("    </div>\r\n");
      out.write("<div class=\"logo\">\r\n");
      out.write("    <img src=\"img/img2.jpg\">\r\n");
      out.write("    </div>\r\n");
      out.write("</header>\r\n");
      out.write("    \r\n");
      out.write("</body>\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
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
