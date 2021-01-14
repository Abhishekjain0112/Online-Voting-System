/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import Dao.VoterDAO;
import Model.Voter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Abhishek
 */
public class registration extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try  {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet registration</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet registration at " + request.getContextPath() + "</h1>");
          
            String voterid,name,email,gender,city,address,state;
            int votevalue;
            long mobile,aadhar;
            
            
            voterid=request.getParameter("voterid");
            name=request.getParameter("name");
            email=request.getParameter("email");
            gender=request.getParameter("gender");
            city=request.getParameter("city");
             state=request.getParameter("state");
            address=request.getParameter("address");
            votevalue=Integer.parseInt(request.getParameter("votevalue"));
            mobile=Long.parseLong(request.getParameter("mobile"));
            aadhar=Long.parseLong(request.getParameter("aadhar"));
            
        // out.println("<h1> name  " +  "   "+ name +"   "+ email +"   "+ gender+ "   "+city+"   "+address+"   "+state+"   "+voterid+"   "+ votevalue+ "   "+mobile+ "   "+aadhar+     " </h1>");
             
            Voter v =new Voter();
            VoterDAO vd=new VoterDAO();
                  
           v.setAadhar(aadhar);
           v.setVoterid(voterid);
           v.setName(name);
           v.setEmail(email);
           v.setGender(gender);
           v.setState(state);
           v.setCity(city);
           v.setAddress(address);
           v.setMobile(mobile);
           v.setVotevalue(votevalue);
   
    if(vd.insertVoter(v))
    {
         response.sendRedirect("regis.jsp");
            out.println("<h1>VOTER Register</h1>");
    
    }
   else
    {
      out.println("<h1> VOTER  CANT BE   Register</h1>");
    
    }
            
            
            out.println("</body>");
            out.println("</html>");
        }
       catch(Exception e)
       {
       out.println(e);
       }
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
