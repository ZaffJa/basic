/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Survey;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author User
 */
@WebServlet(name = "SurveyDisplay", urlPatterns = {"/SurveyDisplay"})
public class SurveyDisplay extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            
            String name  = request.getParameter("tfName");
            String email = request.getParameter("tfEmail");
            String contact = request.getParameter("tfContactNum");
            String[] musicalPref = request.getParameterValues("musicalPref");
            String favouriteMusic = request.getParameter("favouriteMusic");
            String days = request.getParameter("Days");
            String listenToWarnaRadio = request.getParameter("ListenToWarnaRadio");
            String[] listenPref = request.getParameterValues("ListenPref");
            String addComment = request.getParameter("AdditionlComment");
            String newsLetter = request.getParameter("subscriber");
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet SurveyDisplay</title>");  
            out.println("<link rel=\"stylesheet\" type=\"text/css\" href=\"resources/css/bootstrap.css\"/>");
            out.println("</head>");
            out.println("<body>");
            out.println("<div class='col-md-6'>");
            out.println("<h1>Servlet SurveyDisplay at " + request.getContextPath() + "</h1>");
            out.println("<table class='table table-responsive'>");
            //Name
            out.println("<tr>");
            out.println("<td class=\"text-right\"> Name : </td>");
            out.println("<td>"+ name + "</td>");
            out.println("</tr>");
            //Email
            out.println("<tr>");
            out.println("<td class=\"text-right\"> E-mail : </td>");
            out.println("<td>"+ email + "</td>");
            out.println("</tr>");
            //Contact
            out.println("<tr>");
            out.println("<td class=\"text-right\"> Contact number : </td>");
            out.println("<td>"+ contact + "</td>");
            out.println("</tr>");
            //Music Pref
            out.println("<tr>");
            out.println("<td class=\"text-right\"> Musical Preferences : </td>");
            out.println("<td>");
            for(String a : musicalPref)
            {
                out.println(a + "<br>");
            }
            out.println("</td>");
            out.println("</tr>");
            //Favourite Music
            out.println("<tr>");
            out.println("<td class=\"text-right\"> Favourite Music : </td>");
            out.println("<td>"+ favouriteMusic + "</td>");
            out.println("</tr>");
            //Days
            out.println("<tr>");
            out.println("<td class=\"text-right\"> Days : </td>");
            out.println("<td>"+ days + "</td>");
            out.println("</tr>");
            //Listen to warna
            out.println("<tr>");
            out.println("<td class=\"text-right\"> Listen to WARNA Radio : </td>");
            out.println("<td>"+ listenToWarnaRadio + "</td>");
            out.println("</tr>");
            //Listen pref
            out.println("<tr>");
            out.println("<td class=\"text-right\"> Listen Preferences: </td>");
            out.println("<td>");
            for(String a : listenPref)
            {
                out.println(a + "<br>");
            }
            out.println("</td>");
            out.println("</tr>");
            //add comment
            out.println("<tr>");
            out.println("<td class=\"text-right\"> Additional Comments: </td>");
            out.println("<td>"+ addComment + "</td>");
            out.println("</tr>");
            //newsletter
            out.println("<tr>");
            out.println("<td class=\"text-right\"> Subscribe: </td>");
            out.println("<td>"+ newsLetter + "</td>");
                   
            out.println("</div>");                       
            out.println("</body>");
            out.println("</html>");
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