/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import Dao.FinalVoteDAO;
import Dao.NewPartyDAO;
import Dao.VoterDAO;
import Model.FinalVote;
import Model.Party;
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
public class voteButton extends HttpServlet {

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
            out.println("<title>Servlet voteButton</title>");            
            out.println("</head>");
            out.println("<body>");

            String partyname,cname,name,voterid;
            long aadhar;
            
            partyname=request.getParameter("partyname");
            cname=request.getParameter("cname");
            
            HttpSession session=request.getSession();
             name=session.getAttribute("sname").toString();
 // address=session.getAttribute("saddress").toString();
             voterid=session.getAttribute("svoterid").toString();
             aadhar= Long.parseLong(session.getAttribute("saadhar").toString());
            
        /*    out.println("<h1>Servlet name =" + name + " ------vid = " +voterid+""
                    + "-----partname =" + partyname + ""
                    + ""
                    + "------Candidate name=" + cname + "</h1>");
          */
             
        FinalVoteDAO fd =new FinalVoteDAO();
       // NewPartyDAO npd =new NewPartyDAO();
        FinalVote fv=new FinalVote();
       VoterDAO vd=new VoterDAO();
        
        fv.setAddhar(aadhar);
        fv.setVoterid(voterid);
        fv.setName(name);
        fv.setPartyname(partyname);
        fv.setCandidatename(cname);
        
        if(fd.insertIntoFinalvote(fv))  //to insert the information in the final table of data base
        {
                out.println("<h1>  ------Insert To Final Value------" + voterid + "</h1>");  
        
            
          if(fd.updatePartyVote(partyname)) //Total vote in party table ++ increment as per the party name he votes 
          {
           if(vd.UpdateVoterNumber(voterid))   // Vote value of user increment by ++;
           {
               out.println("<h1>  ------------UPDATE" + cname + "</h1>");  
              session.invalidate();
                session=null;
               response.sendRedirect("Thankyou.jsp");
           }
          
          } 
        
        }
        else
                out.println("<h1>  XXXXXXXXXXXXXXXXXXXXXXXXXXXX</h1>");  
        
        
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
