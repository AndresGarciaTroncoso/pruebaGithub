package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class agregarEjemplar_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <!-- Latest compiled and minified CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("\n");
      out.write("        <!-- jQuery library -->\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Latest compiled JavaScript -->\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("        \n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        \n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Agregar Ejemplar</h1>\n");
      out.write("        <nav class=\"navbar navbar-inverse\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <div class=\"navbar-header\">\n");
      out.write("                    <a class=\"navbar-brand\" href=\"#\">Administrar Colección</a>\n");
      out.write("                </div>\n");
      out.write("                <ul class=\"nav navbar-nav\">\n");
      out.write("                    <li class=\"active\"><a href=\"Home.jsp\">Home</a></li>\n");
      out.write("                    <li class=\"dropdown\"><a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">Agregar <span class=\"caret\"></span></a>\n");
      out.write("                        <ul class=\"dropdown-menu\">\n");
      out.write("                            <li><a href=\"agregarDocumento.jsp\">Agregar Documento</a></li>\n");
      out.write("                            <li><a href=\"agregarAutor.jsp\">Agregar Autor</a></li>\n");
      out.write("                            <li><a href=\"agregarEditorial.jsp\">Agregar Editorial</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                    <li><a href=\"listadoDocumento.jsp\">Mostrar Documentos</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("        <br></br>\n");
      out.write("        <br></br>\n");
      out.write("        <form action=\"ejemplarServlet\" method=\"post\">\n");
      out.write("            \n");
      out.write("            <section>\t\t\t\n");
      out.write("                    <table class=\"table table-striped\">\n");
      out.write("                            <tr>\n");
      out.write("                              <td>Documento:</td>\n");
      out.write("                              <td><select name=\"ddlDocumento\" class=\"form-control\">\n");
      out.write("                                <option>Seleccione...</option>\n");
      out.write("                                ");
                                    try {

                                        dao.documentoDAO docDAO = new dao.documentoDAO();

                                        for (entity.Documento tmp : docDAO.getList()) {
                                
      out.write("\n");
      out.write("                                <option value=\"");
      out.print( tmp.getIdDocumento() );
      out.write('"');
      out.write('>');
      out.print( tmp.getTitulo() );
      out.write("</option>\n");
      out.write("                                ");

                                        }
                                    } catch (Exception e) {
                                        out.println(e.getMessage());
                                    }

                                
      out.write("\n");
      out.write("                                </select>\n");
      out.write("                            </td>\n");
      out.write("                            </tr>\n");
      out.write("\n");
      out.write("                            <tr>\n");
      out.write("                              <td>Ubicacion:</td>\n");
      out.write("                              <td><select name=\"ddlUbicacion\" class=\"form-control\">\n");
      out.write("                                <option>Seleccione...</option>\n");
      out.write("                                ");
                                    try {

                                        dao.ubicacionDAO ubiDAO = new dao.ubicacionDAO();

                                        for (entity.Ubicacion tmp : ubiDAO.getList()) {
                                
      out.write("\n");
      out.write("                                <option value=\"");
      out.print( tmp.getIdUbicacion() );
      out.write('"');
      out.write('>');
      out.print( tmp.getNombreUbic() );
      out.write("</option>\n");
      out.write("                                ");

                                        }
                                    } catch (Exception e) {
                                        out.println(e.getMessage());
                                    }

                                
      out.write("\n");
      out.write("                                </select>\n");
      out.write("                                </td>\n");
      out.write("                              <td><div></div></td>\n");
      out.write("                            </tr>\n");
      out.write("\n");
      out.write("                            <tr>\n");
      out.write("                            <td>Estado: </td>\n");
      out.write("                              <td><select name=\"ddlEstado\" class=\"form-control\">\n");
      out.write("                                <option>Seleccione...</option>\n");
      out.write("                                ");
                                    try {

                                        dao.estadoDAO estDAO = new dao.estadoDAO();

                                        for (entity.Estado tmp : estDAO.getList()) {
                                
      out.write("\n");
      out.write("                                <option value=\"");
      out.print( tmp.getIdEstado() );
      out.write('"');
      out.write('>');
      out.print( tmp.getNombreEstado() );
      out.write("</option>\n");
      out.write("                                ");

                                        }
                                    } catch (Exception e) {
                                        out.println(e.getMessage());
                                    }

                                
      out.write("\n");
      out.write("                                </select>\n");
      out.write("                                </td>\n");
      out.write("                              <td><td><input type=\"idejemplar\"id=\"idejemplar\" name=\"idejemplar\" class=\"form-control\"/></td></td>\n");
      out.write("                              <td></td>\n");
      out.write("                              <td></td>\n");
      out.write("                              <td> <p id=\"demo\"></p> </td>\n");
      out.write("                            </tr>\n");
      out.write("\n");
      out.write("                            <tr>\n");
      out.write("                              <td></td>\n");
      out.write("                              <td></td>\n");
      out.write("                              <td></td>\n");
      out.write("                              <td></td>\n");
      out.write("                              <td>                              \n");
      out.write("                              </td>\n");
      out.write("                            </tr>\n");
      out.write("\n");
      out.write("                            <tr>\n");
      out.write("                            <td></td>                            \n");
      out.write("                            <td>\n");
      out.write("                            </td>\n");
      out.write("                            </td>\n");
      out.write("                            <td></td>\n");
      out.write("                            \n");
      out.write("\n");
      out.write("                    </table>\t\t\t\n");
      out.write("\n");
      out.write("            </section>\n");
      out.write("\n");
      out.write("            <span6>\n");
      out.write("                        <input type=\"submit\" value=\"Agregar Documento\" class=\"btn btn-primary\" >\n");
      out.write("\n");
      out.write("            </span6>\n");
      out.write("            \n");
      out.write("        </form>\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
