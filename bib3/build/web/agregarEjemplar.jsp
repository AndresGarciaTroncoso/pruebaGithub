<%-- 
    Document   : agregarEjemplar
    Created on : 19-06-2017, 14:23:50
    Author     : andre
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <!-- Latest compiled and minified CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

        <!-- jQuery library -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

        <!-- Latest compiled JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Agregar Ejemplar</h1>
        <nav class="navbar navbar-inverse">
            <div class="container-fluid">
                <div class="navbar-header">
                    <a class="navbar-brand" href="#">Administrar Colección</a>
                </div>
                <ul class="nav navbar-nav">
                    <li class="active"><a href="Home.jsp">Home</a></li>
                    <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Agregar <span class="caret"></span></a>
                        <ul class="dropdown-menu">
                            <li><a href="agregarDocumento.jsp">Agregar Documento</a></li>
                            <li><a href="agregarAutor.jsp">Agregar Autor</a></li>
                            <li><a href="agregarEditorial.jsp">Agregar Editorial</a></li>
                        </ul>
                    </li>
                    <li><a href="listadoDocumento.jsp">Mostrar Documentos</a></li>
                </ul>
            </div>
        </nav>
        <br></br>
        <br></br>
        <form action="ejemplarServlet" method="post">
            
            <section>			
                    <table class="table table-striped">
                            <tr>
                              <td>Documento:</td>
                              <td><select name="ddlDocumento" class="form-control">
                                <option>Seleccione...</option>
                                <%                                    try {

                                        dao.documentoDAO docDAO = new dao.documentoDAO();

                                        for (entity.Documento tmp : docDAO.getList()) {
                                %>
                                <option value="<%= tmp.getIdDocumento() %>"><%= tmp.getTitulo() %></option>
                                <%
                                        }
                                    } catch (Exception e) {
                                        out.println(e.getMessage());
                                    }

                                %>
                                </select>
                            </td>
                            </tr>

                            <tr>
                              <td>Ubicacion:</td>
                              <td><select name="ddlUbicacion" class="form-control">
                                <option>Seleccione...</option>
                                <%                                    try {

                                        dao.ubicacionDAO ubiDAO = new dao.ubicacionDAO();

                                        for (entity.Ubicacion tmp : ubiDAO.getList()) {
                                %>
                                <option value="<%= tmp.getIdUbicacion() %>"><%= tmp.getNombreUbic() %></option>
                                <%
                                        }
                                    } catch (Exception e) {
                                        out.println(e.getMessage());
                                    }

                                %>
                                </select>
                                </td>
                              <td><div></div></td>
                            </tr>

                            <tr>
                            <td>Estado: </td>
                              <td><select name="ddlEstado" class="form-control">
                                <option>Seleccione...</option>
                                <%                                    try {

                                        dao.estadoDAO estDAO = new dao.estadoDAO();

                                        for (entity.Estado tmp : estDAO.getList()) {
                                %>
                                <option value="<%= tmp.getIdEstado() %>"><%= tmp.getNombreEstado() %></option>
                                <%
                                        }
                                    } catch (Exception e) {
                                        out.println(e.getMessage());
                                    }

                                %>
                                </select>
                                </td>
                              <td><td><input type="idejemplar"id="idejemplar" name="idejemplar" class="form-control"/></td></td>
                              <td></td>
                              <td></td>
                              <td> <p id="demo"></p> </td>
                            </tr>

                            <tr>
                              <td></td>
                              <td></td>
                              <td></td>
                              <td></td>
                              <td>                              
                              </td>
                            </tr>

                            <tr>
                            <td></td>                            
                            <td>
                            </td>
                            </td>
                            <td></td>
                            

                    </table>			

            </section>

            <span6>
                        <input type="submit" value="Agregar Documento" class="btn btn-primary" >

            </span6>
            
        </form>
        
    </body>
</html>
