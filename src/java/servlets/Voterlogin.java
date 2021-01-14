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
import javax.servlet.http.HttpSession;

/**
 *
 * @author Abhishek
 */
public class Voterlogin extends HttpServlet {

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
            out.println("<title>Servlet Voterlogin</title>");            
            out.println("</head>");
            out.println("<body>");
            
            
            String voterid,name;
            long aadhar;
            
            voterid=request.getParameter("voterid");
            aadhar=Integer.parseInt(request.getParameter("aadharno"));
            
            if(voterid.equals("admin") && aadhar==123)
            {
                            HttpSession session =request.getSession(true);
                           session.setAttribute("sname",voterid);
              response.sendRedirect("Admin.jsp");
            
            }
            
            
            VoterDAO vd =new VoterDAO();
            
            if(vd.loginByAadhar(voterid, aadhar))
            {
                Voter v=new Voter();
                v=vd.searchByVoterId(voterid);
                  if(v!=null)
                  {
                       int votevalue;
                       votevalue=v.getVotevalue();
                       name=v.getName();
                    String address=v.getAddress();
                       if(votevalue==0)
                        {
                            HttpSession session =request.getSession(true);
                           session.setAttribute("svoterid",voterid);
                           session.setAttribute("saadhar",aadhar);
                           session.setAttribute("sname",name);
                           session.setAttribute("saddress",address);
                           response.sendRedirect("votevalue.jsp");
                           out.println("<h1> You Are READY TO VOTE  Plz Vote For India <h1>");
                        }
                        else
                       {  response.sendRedirect("GoBack.jsp");
                           out.println("<h1>YOU Already Voted  <h1>");          
                         
                       }
                  
                  
                  }
                  else
                          out.println("<h1> Voternumber search null <h1>");
        
                      
                      
                      
            out.println("<h1>  YOU SUCCESFULY LOGIN VOTER ID= "+ voterid+"AADHAR= "+ aadhar +"   </h1>");
              
            }
            else
            {   HttpSession session1 =request.getSession(true);
                out.println("<h1> PLZ CHECK THE CODE VOTER ID= "+ voterid+"AADHAR= "+ aadhar +"   </h1>");
         
              response.sendRedirect("index.jsp");
              
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
