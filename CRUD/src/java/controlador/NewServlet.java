/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import mundo.Computador;

/**
 *
 * @author Santiago
 */
@WebServlet(name = "NewServlet", urlPatterns = {"/NewServlet"})
public class NewServlet extends HttpServlet {

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
       
        //se recoge las variables del Pc y se guardan
        String nombre = request.getParameter("Equipo_Nombre");
        String placa = request.getParameter("Placa_Inventario");
        String serial = request.getParameter("Serial");
        
        String marca = request.getParameter("Marca");
        String referencia = request.getParameter("Referencia");
        
        Computador comp = new Computador(nombre, placa, serial, marca, referencia);
        
        //aqui s eutilizaria el objetocreadoa gusto, sea guardarlo en una BD o volverlos a mostrar en lapagica
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Respuesta del CRUD </title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<p>nombre del pc: ");
            out.println(comp.getEquipo_Nombre());
            out.println("<p>placa del inventario: ");
            out.println(comp.getPlaca_Inventario());
            out.println("<p>serial del pc: ");
            out.println(comp.getSerial());
            out.println("<p>Marca del pc: ");
            out.println(comp.getMarca());
            out.println("<p>Referencia del pc: ");
            out.println(comp.getReferencia());
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
