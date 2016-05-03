package Servlet;

import M3.Factory;
import M3.UtenteCliente;
import M3.UtenteGenerico;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Alessandro Argiolas 49062
 */

public class Login extends HttpServlet {

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

            HttpSession session = request.getSession(true);
                
                if(request.getParameter("Submit") != null) {
                    
                    String username = request.getParameter("Username");
                    String password = request.getParameter("Password");

                    ArrayList<UtenteGenerico> listaUtentiGenerici = Factory.getInstance().getListaUtentiGenerici();
                    for(UtenteGenerico u : listaUtentiGenerici)
                    {
                        if(u.getUsername().equals(username) && u.getPassword().equals(password)) {
                            session.setAttribute("loggedIn", true);
                        
                            if(u instanceof UtenteCliente) {
                                request.setAttribute("UtenteCliente", true);
                                request.setAttribute("Cliente", u);
                                request.setAttribute("Venditori", Factory.getInstance().getListaVenditori());
                                request.getRequestDispatcher("/cliente.html").forward(request, response);
                            }
                            else {
                                request.setAttribute("Venditore", u);
                                request.setAttribute("UtenteVenditore", true);
                                request.setAttribute("Clienti", Factory.getInstance().getListaClienti());
                                request.getRequestDispatcher("/venditore.html").forward(request, response);  
                            }
                        }
                        
                    }
                }
                
            request.getRequestDispatcher("M3/login.jsp").forward(request, response);
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
