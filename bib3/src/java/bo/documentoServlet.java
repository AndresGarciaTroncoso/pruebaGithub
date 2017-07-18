/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo;

import java.text.SimpleDateFormat;
import java.text.ParseException;
import entity.Documento;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.Locale;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author andre
 */
@WebServlet(name = "documentoServlet", urlPatterns = {"/documentoServlet"})
public class documentoServlet extends HttpServlet {

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

                if (request.getParameter("delete") != null) {

                    try {
                        int id = Integer.parseInt(request.getParameter("delete"));

                        dao.documentoDAO gestionDocumento = new dao.documentoDAO();
                        if (gestionDocumento.getDocumentoById(id) != null) {
                            if (gestionDocumento.delete(gestionDocumento.getDocumentoById(id))) {
                                request.getRequestDispatcher("listadoDocumento.jsp").forward(request, response);
                            } else {
                                out.println("Ocurrio un error");
                            }
                        } else {
                            out.println("Ocurrio un error");
                        }
                    } catch (Exception e) {
                        out.println("Ocurrio un error :" + e.getMessage());
                    }

                } else {

                    DateFormat formato = new SimpleDateFormat("yyyy-MM-dd");

                    dao.autorDAO gestionAutor = new dao.autorDAO();
                    dao.editorialDAO gestionEditorial = new dao.editorialDAO();
                    dao.edicionDAO gestionEdicion = new dao.edicionDAO();
                    dao.tipoDAO gestionTipo = new dao.tipoDAO();
                    dao.categoriaDAO gestionCategoria = new dao.categoriaDAO();

                    String titulo = "";
                    Date anio = new Date();
                    int iautor = 0;
                    int ieditorial = 0;
                    int iedicion = 0;
                    int itipo = 0;
                    int icategoria = 0;

                    if (request.getParameter("titulo") != null) {
                        titulo = request.getParameter("titulo");
                    } else {
                        throw new Exception("Ingresar el Titulo");
                    }

                    if (request.getParameter("ddlAutor") != null) {
                        iautor = Integer.parseInt(request.getParameter("ddlAutor"));
                    } else {
                        throw new Exception("Ingresar Autor");
                    }

                    if (request.getParameter("publicacion") != null) {
                        anio = formato.parse(request.getParameter("publicacion"));
                    } //{anio = request.getParameter("publicacion");
                    else {
                        throw new Exception("Ingresar año de publicacion");
                    }

                    if (request.getParameter("ddlEditorial") != null) {
                        ieditorial = Integer.parseInt(request.getParameter("ddlEditorial"));
                    } else {
                        throw new Exception("Ingresar Editorial");
                    }

                    if (request.getParameter("ddlTipo") != null) {
                        itipo = Integer.parseInt(request.getParameter("ddlTipo"));
                    } else {
                        throw new Exception("Ingresar Tipo");
                    }

                    if (request.getParameter("ddlEdicion") != null) {
                        iedicion = Integer.parseInt(request.getParameter("ddlEdicion"));
                    } else {
                        throw new Exception("Ingresar Edicion");
                    }

                    if (request.getParameter("ddlCategoria") != null) {
                        icategoria = Integer.parseInt(request.getParameter("ddlCategoria"));
                    } else {
                        throw new Exception("Ingresar Categoria");
                    }

                    entity.Autor autor = new entity.Autor();
                    if (gestionAutor.getAutorById(iautor) != null) {
                        autor = gestionAutor.getAutorById(iautor);
                    }

                    entity.Editorial editorial = new entity.Editorial();
                    if (gestionEditorial.getEditorialById(ieditorial) != null) {
                        editorial = gestionEditorial.getEditorialById(ieditorial);
                    }

                    entity.Edicion edicion = new entity.Edicion();
                    if (gestionEdicion.getEdicionById(iedicion) != null) {
                        edicion = gestionEdicion.getEdicionById(iedicion);
                    }

                    entity.Tipo tipo = new entity.Tipo();
                    if (gestionTipo.getTipoById(itipo) != null) {
                        tipo = gestionTipo.getTipoById(itipo);
                    }

                    entity.Categoria categoria = new entity.Categoria();
                    if (gestionCategoria.getCategoriaById(icategoria) != null) {
                        categoria = gestionCategoria.getCategoriaById(icategoria);
                    }

                    entity.Documento nuevoDocumento = new Documento();

                    nuevoDocumento.setEdicion(edicion);
                    nuevoDocumento.setEditorial(editorial);
                    nuevoDocumento.setTipo(tipo);
                    nuevoDocumento.setEditorial(editorial);
                    nuevoDocumento.setTipo(tipo);
                    nuevoDocumento.setAutor(autor);
                    nuevoDocumento.setCategoria(categoria);
                    nuevoDocumento.setTitulo(titulo);
                    nuevoDocumento.setAnoPublicacion(anio);

                    /*entity.Documento nuevoDocumento = new entity.Documento(edicion, editorial, tipo, autor, categoria, titulo, anio);*/
                    dao.documentoDAO documentoDAO = new dao.documentoDAO();

                    if (documentoDAO.add(nuevoDocumento)) {
                        request.getRequestDispatcher("agregarDocumento.jsp").forward(request, response);//cambiar de pag
                    } else //out.println("ocurrio un error con el ingreso");    
                    {
                        request.getRequestDispatcher("Error.jsp").forward(request, response);
                    }

                }

            } catch (Exception e) {
                out.println("Ocurrio un error :" + e.getMessage());
            }

            /*aqui hay que mostrar los datos en la grilla y despues pasarlos por parametro igual que el crear*/
            if (request.getParameter("btnSubmit").equals("Actualizar")) {
                int id;
                String nombre = "";

                try {
                    
                    id = Integer.parseInt(request.getParameter("txtId"));
                    
                    dao.documentoDAO gestionDocumento = new dao.documentoDAO();
                    
                    entity.Documento nuevo = new entity.Documento();
                     
                    if (gestionDocumento.getDocumentoById(id) != null) {
                        nuevo = gestionDocumento.getDocumentoById(id);
                        nuevo.setTitulo(request.getParameter("titulo"));

                        if (gestionDocumento.update(nuevo)) {
                            request.getRequestDispatcher("listadoDocumento.jsp").forward(request, response);
                        }
                    }

                } catch (Exception e) {
                    out.println(e.getMessage());
                }
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
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
        protected void doGet
        (HttpServletRequest request, HttpServletResponse response)
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
        protected void doPost
        (HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            processRequest(request, response);
        }

        /**
         * Returns a short description of the servlet.
         *
         * @return a String containing servlet description
         */
        @Override
        public String getServletInfo
        
            () {
        return "Short description";
        }// </editor-fold>

    }
