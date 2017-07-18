<%-- 
    Document   : AgregarColeccion
    Created on : 07-05-2017, 14:21:25
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
        <title>JSP Page</title>
        
    </head>
    <body>
        <h1>Agregar Documento</h1>
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
        <form action="documentoServlet" method="post">
            
            <section>			
                    <table class="table table-striped">
                            <tr>
                              <td>Titulo: </td>
                              <td><input type="text"id="titulo" name="titulo" required class="form-control"/></td>
                              <td><input type="expanded" style="width:21px;height:20px; visibility:hidden"></td>
                              <td>Autor:</td>
                              <td><select name="ddlAutor" class="form-control">
                                <option>Seleccione...</option>
                                <%                                    try {

                                        dao.autorDAO autDAO = new dao.autorDAO();

                                        for (entity.Autor tmp : autDAO.getList()) {
                                %>
                                <option value="<%= tmp.getIdAutor() %>"><%= tmp.getNombreAutor() %></option>
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
                              <td>Año de publicacion: </td>
                              <td><input type="date" id="publicacion" name="publicacion" required class="form-control" pattern="[0-9{4}-[0-9]{2}-[0-9]{2}"/></td>
                              <td></td>
                              <td>Editorial:</td>
                              <td><select name="ddlEditorial" class="form-control">
                                <option>Seleccione...</option>
                                <%                                    try {

                                        dao.editorialDAO editoDAO = new dao.editorialDAO();

                                        for (entity.Editorial tmp : editoDAO.getList()) {
                                %>
                                <option value="<%= tmp.getIdEditorial() %>"><%= tmp.getNombreEditorial() %></option>
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
                            <td>Tipo: </td>
                              <td><select name="ddlTipo" class="form-control">
                                <option>Seleccione...</option>
                                <%                                    try {

                                        dao.tipoDAO tipDAO = new dao.tipoDAO();

                                        for (entity.Tipo tmp : tipDAO.getList()) {
                                %>
                                <option value="<%= tmp.getIdTipo() %>"><%= tmp.getNombreTipo() %></option>
                                <%
                                        }
                                    } catch (Exception e) {
                                        out.println(e.getMessage());
                                    }

                                %>
                                </select>
                                </td>
                              <td></td>
                              <td>Edición: </td>
                              <td><select name="ddlEdicion" class="form-control">
                                <option>Seleccione...</option>
                                <%                                    try {

                                        dao.edicionDAO ediciDAO = new dao.edicionDAO();

                                        for (entity.Edicion tmp : ediciDAO.getList()) {
                                %>
                                <option value="<%= tmp.getIdEdicion() %>"><%= tmp.getNroEdicion() %></option>
                                <%
                                        }
                                    } catch (Exception e) {
                                        out.println(e.getMessage());
                                    }

                                %>
                                </select>
                                </td>
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
                            <td>Categoría: </td>                            
                            <td><select name="ddlCategoria" class="form-control">
                                <option>Seleccione...</option>
                                <%                                    try {

                                        dao.categoriaDAO cateDAO = new dao.categoriaDAO();

                                        for (entity.Categoria tmp : cateDAO.getList()) {
                                %>
                                <option value="<%= tmp.getIdCategoria() %>"><%= tmp.getNombreCat() %></option>
                                <%
                                        }
                                    } catch (Exception e) {
                                        out.println(e.getMessage());
                                    }

                                %>
                                </select>
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
