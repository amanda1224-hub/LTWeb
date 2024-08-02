/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

package control;

import dao.DAO;
import entity.Account;
import entity.HopDong;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.text.SimpleDateFormat;

/**
 *
 * @author Admin
 */
@WebServlet(name="DatPhongControl", urlPatterns={"/datphong"})
public class DatPhongControl extends HttpServlet {
   
    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        HttpSession session = request.getSession();
        Account a = (Account) session.getAttribute("acc");
        if(a == null){
            request.getRequestDispatcher("Login.jsp").forward(request, response);
            
        }else{
            String mess1 ="";
            String mess2 ="";
            String tenKH = request.getParameter("name");
            String sdtKH = request.getParameter("phoneNumber");
            String emailKH = request.getParameter("email");
            String citizenKH = request.getParameter("citizen");
            String checkin = request.getParameter("checkin");
            String checkout = request.getParameter("checkout");
            String idphong = request.getParameter("idphong");

            int idKH = a.getId();
            if(check(checkin) == false){
                mess1 ="Vui lòng điền đúng định dạng DD/MM/YYY ";
                request.setAttribute("mess1", mess1);
                request.setAttribute("tenKH", tenKH);
                request.setAttribute("sdtKH", sdtKH);
                request.setAttribute("emailKH", emailKH);
                request.setAttribute("citizenKH", citizenKH);
                request.setAttribute("checkout", checkout);
                request.setAttribute("idphong", idphong);
                request.getRequestDispatcher("ThongTinClient.jsp").forward(request, response);
            }else if(check(checkout) == false){
                mess2 ="Vui lòng điền đúng định dạng DD/MM/YYY ";
                request.setAttribute("mess2", mess2);
                request.setAttribute("tenKH", tenKH);
                request.setAttribute("sdtKH", sdtKH);
                request.setAttribute("emailKH", emailKH);
                request.setAttribute("citizenKH", citizenKH);
                request.setAttribute("checkin", checkin);
                request.setAttribute("idphong", idphong);
                request.getRequestDispatcher("ThongTinClient.jsp").forward(request, response);
            }else{
                
                DAO dao = new DAO();
                dao.DatPhong(idKH, idphong, tenKH, sdtKH, emailKH, citizenKH, checkin, checkout);
                response.sendRedirect("home");
            }
        }
        
        
    } 
    public static boolean check(String s){
        //05-05-2002
        if(s.length() != 10) return false;
        if(s.charAt(2)!='-' || s.charAt(5) !='-') return false;
        String[] arr = s.split("-");
        Integer a = Integer.parseInt(arr[0]);
        if(a > 12) return false;
        for(String x : arr){
            for(int i = 0; i < x.length(); i++){
                if(!Character.isDigit(x.charAt(i))) return false;
            }
        }
        return true;
    }
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
     * Handles the HTTP <code>GET</code> method.
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
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
