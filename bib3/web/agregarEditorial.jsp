<%-- 
    Document   : AgregarCategoria
    Created on : 12-05-2017, 20:13:16
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
        <title>JSP Page</title>
        
        
        
    </head>
    <body>
        <h1>Agregar Editorial</h1>
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
        <form action="editorialServlet" method="get" >
            
            <table border="0">
                
                    <tr>
                        <td>Id Editorial</td>
                        <td><input type="text" name="idEditorial" id="idEditorial" required class="form-control"></td>
                    </tr>
                    <tr>
                        <td>Nombre Editorial</td>
                        <td><input type="text" name="nombreEditorial" id="nombreEditorial" required class="form-control"></td>
                    </tr>
                
                    <td><input type="submit" name="btnCrear" class="btn btn-success"> </td>
                    
                    <tr>
                        <td>combo categoria :</td>
                        <td><select name="ddlCategoria" class="form-control">
                                <option>Seleccione...</option>
                                <%                                    try {

                                        dao.editorialDAO editDAO = new dao.editorialDAO();

                                        for (entity.Editorial tmp : editDAO.getList()) {
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
                    </tr>
                    
            </table>
                    
        </form>
        
    </body>
</html>
