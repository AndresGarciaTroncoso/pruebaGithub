<%-- 
    Document   : updateDocumento
    Created on : 12-06-2017, 14:31:21
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
        <%
            entity.Documento documentoUDP = new entity.Documento();
            try
               
            {
                
                int id = 0;
                
                if(request.getParameter("update")!= null)
                    id = Integer.parseInt(request.getParameter("update"));
                
                dao.documentoDAO gestionDocumento = new dao.documentoDAO();
                documentoUDP = gestionDocumento.getDocumentoById(id);
                
                
            }catch(Exception e)
                    {
                        out.println(e.getMessage());
                    }            
            %>
        
        
        <form action="documentoServlet" method="post">
            <input type="text" name="id" placeholder="ID" value="<%= documentoUDP.getIdDocumento() %>" disabled="" class="form-control">
            <input type="hidden" name="txtId"  value="<%= documentoUDP.getIdDocumento() %>">
            <br>
            <input type="text" name="titulo" required placeholder="titulo" value="<%= documentoUDP.getTitulo() %>" class="form-control">
            <br>            
            <input type="submit" name="btnSubmit" value="Actualizar" class="btn btn-success">            
        </form>   
    </body>
</html>
