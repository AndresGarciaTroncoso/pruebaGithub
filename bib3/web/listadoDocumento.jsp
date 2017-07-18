<%-- 
    Document   : listadoDocumento
    Created on : 12-06-2017, 14:20:11
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
        <table class="table table-striped">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Titulo</th>
                    <th>anio publicacion</th>
                    <th>Eliminar</th>
                    <th>Actualizar</th>
                </tr>
            </thead>
            <tbody>
                
                 <%
                    try
                    {
                        
                    dao.documentoDAO docDAO = new dao.documentoDAO();
                    
                    for(entity.Documento tmp: docDAO.getList())
                    {
                 %>
                
                <tr>
                    <td><%= tmp.getIdDocumento() %>  </td>
                    <td><%= tmp.getTitulo() %></td>
                    <td><%= tmp.getAnoPublicacion() %></td>
                    <td><a href="documentoServlet?delete=<%= tmp.getIdDocumento() %>"><button type="button" class="btn btn-danger btn-xs">Eliminar</button></a></td>
                    <td><a href="updateDocumento.jsp?update=<%= tmp.getIdDocumento() %>"><button type="button" class="btn btn-info btn-xs">Update</button></a></td>
                </tr>
                
                 <%
                     }
                    }catch(Exception e)
                    {
                        out.println(e.getMessage());
                    }
                      
                 %>
            </tbody>
        </table>

        
        
        
    </body>
</html>
