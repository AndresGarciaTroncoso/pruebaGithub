/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo;

import entity.Documento;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author andre
 */
@WebServlet(name = "ejemplarServlet", urlPatterns = {"/ejemplarServlet"})
public class ejemplarServlet extends HttpServlet {

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
            
           try {
               
                    dao.documentoDAO gestionDocumento = new dao.documentoDAO();
                    dao.ubicacionDAO gestionUbicacion = new dao.ubicacionDAO();
                    dao.estadoDAO gestionEstado = new dao.estadoDAO();
                    
                    int idocumento = 0;
                    int iubicacion = 0;
                    int iestado = 0;
                    
                    
                    if (request.getParameter("ddlDocumento") != null) {
                        idocumento = Integer.parseInt(request.getParameter("ddlDocumento"));
                    } else {
                        throw new Exception("Ingresar Documento");
                    }
                    
                    if (request.getParameter("ddlUbicacion") != null) {
                        iubicacion = Integer.parseInt(request.getParameter("ddlUbicacion"));
                    } else {
                        throw new Exception("Ingresar Ubicacion");
                    }

                    if (request.getParameter("ddlEstado") != null) {
                        iestado = Integer.parseInt(request.getParameter("ddlEstado"));
                    } else {
                        throw new Exception("Ingresar Tipo");
                    }                   

                    entity.Documento documento = new entity.Documento();
                    if (gestionDocumento.getDocumentoById(idocumento)!= null) {
                        documento = gestionDocumento.getDocumentoById(idocumento);
                    }

                    entity.Ubicacion ubicacion = new entity.Ubicacion();
                    if (gestionUbicacion.getUbicacionById(iubicacion) != null) {
                        ubicacion = gestionUbicacion.getUbicacionById(iubicacion);
                    }

                    entity.Estado estado = new entity.Estado();
                    if (gestionEstado.getEstadoById(iubicacion) != null) {
                        estado = gestionEstado.getEstadoById(iubicacion);
                    }

                    entity.Ejemplar nuevoEjemplar = new entity.Ejemplar();

                    
                    nuevoEjemplar.setDocumento(documento);
                    nuevoEjemplar.setUbicacion(ubicacion);
                    nuevoEjemplar.setEstado(estado);

                    
                    dao.ejemplarDAO ejemplarDAO = new dao.ejemplarDAO();

                    if (ejemplarDAO.add(nuevoEjemplar)) {
                        request.getRequestDispatcher("agregarEjemplar.jsp").forward(request, response);//cambiar de pag
                    } else //out.println("ocurrio un error con el ingreso");    
                    {
                        request.getRequestDispatcher("Error.jsp").forward(request, response);
                    }

                }catch (Exception e) {
                out.println("Ocurrio un error :" + e.getMessage());
            }
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
