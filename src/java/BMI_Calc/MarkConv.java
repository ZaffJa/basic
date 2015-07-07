/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BMI_Calc;

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
@WebServlet(name = "MarkConv", urlPatterns = {"/MarkConv"})
public class MarkConv extends HttpServlet {

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
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet MarkConv</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet MarkConv at " + request.getContextPath() + "</h1>");
            
            double mark = Double.parseDouble(request.getParameter("markTextBox"));
            int point = 0;
            String grade = "",status = "";
            
            if(mark>89 && mark<101){
                grade = "A";
                point = 4;
            }
            else if(mark>79 && mark<90){
                grade = "B";
                point = 3;
            }
            else if(mark>69 && mark<80){
                grade = "C";
                point = 2;
            }
            else if(mark>59 && mark<70){
                grade = "D";
                point = 1;
            }
            else if(mark<59){
                grade = "F";
                point = 1;
            }
            
            if(mark >= 60) status = "Pass!";
            else if (mark < 60) status = "Fail!";
            else if(mark < 0 || mark > 100) status = "Invalid input!!";
            
            out.printf("Average : %.2f <br>", mark);
                if(request.getParameter("gradCheckBox")!= null){
                    out.println("Grade : " + grade + "<br>");
                }
                if(request.getParameter("pointCheckBox")!= null){
                    out.println("Point : " + point + "<br>");
                }
            out.println("Result : " + status + "<br>");
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
