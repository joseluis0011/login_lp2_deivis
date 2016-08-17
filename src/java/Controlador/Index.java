/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import DAO.ProductoDAO;
import DTO.ProductoDTO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author FIA-LAB1D6
 */
public class Index extends HttpServlet {

    private ProductoDAO pro = new ProductoDAO();

    String pagina;

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
        PrintWriter out = response.getWriter();
        RequestDispatcher dispatcher;
        String pag;
        HttpSession session = request.getSession(true);
        ProductoDTO u;
        List<ProductoDTO> lis = new ArrayList<>();
        int op = Integer.parseInt(request.getParameter("op"));

        switch (op) {
            case 1:
                pag = "/Listar.jsp";

                session.setAttribute("lista", pro.readAll());
                dispatcher = getServletContext().getRequestDispatcher(pag);
                dispatcher.forward(request, response);
                break;

            case 2:
                int id = Integer.parseInt(request.getParameter("id"));
                if (pro.delete(id)) {
                    pag = "/Listar.jsp";
                    dispatcher = getServletContext().getRequestDispatcher(pag);
                    dispatcher.forward(request, response);
                } else {
                    pag = "ci?op=1";
                    dispatcher = getServletContext().getRequestDispatcher(pag);
                    dispatcher.forward(request, response);
                }
                break;

            case 3:
                String nombreproducto = request.getParameter("nombre");
                String descripcionproducto = request.getParameter("descripcion");
                int cantidadproducto = Integer.parseInt(request.getParameter("unidad"));
                double precioproducto = Double.parseDouble(request.getParameter("precio"));
                ProductoDTO p = new ProductoDTO(nombreproducto, descripcionproducto, cantidadproducto, precioproducto);
                int y = pro.create(p);
                pag = "/ci?op=1";
                dispatcher = getServletContext().getRequestDispatcher(pag);
                dispatcher.forward(request, response);
                break;
            case 4:
                pag = "/crear.jsp";
                dispatcher = getServletContext().getRequestDispatcher(pag);
                dispatcher.forward(request, response);
                break;

            case 5:
                int idproducto = Integer.parseInt(request.getParameter("id"));
                session.setAttribute("lista2", pro.read(idproducto));
                pag = "/editar.jsp";
                dispatcher = getServletContext().getRequestDispatcher(pag);
                dispatcher.forward(request, response);
                break;
            case 6:
                int idproducto1 = Integer.parseInt(request.getParameter("id"));
                String nombreproducto1 = request.getParameter("nombre");
                String descripcionproducto1 = request.getParameter("descripcion");
                int cantidadproducto1 = Integer.parseInt(request.getParameter("unidad"));
                double precioproducto1 = Double.parseDouble(request.getParameter("precio"));
                
                u = new ProductoDTO(idproducto1,nombreproducto1,descripcionproducto1,cantidadproducto1,precioproducto1);
                y = pro.update(u);
                pag = "/ci?op=1";
                dispatcher = getServletContext().getRequestDispatcher(pag);
                dispatcher.forward(request, response);
                break;
                
        }
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
