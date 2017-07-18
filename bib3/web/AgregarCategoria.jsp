<%-- 
    Document   : AgregarCategoria
    Created on : 12-05-2017, 20:13:16
    Author     : andre
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Agregar Categoria</h1>
        
        <form action="CateServlet" method="get" >
            
            <table border="0">
                
                    <tr>
                        <td>id</td>
                        <td><input type="text" name="idcat" id="idcat"></td>
                    </tr>
                    <tr>
                        <td>nombre categoria</td>
                        <td><input type="text" name="nomcat" id="nomcat"></td>
                    </tr>
                
                    <td><input type="submit" name="btnCrear"> </td>
                    
                    <tr>
                        <td>combo categoria :</td>
                        <td><select name="ddlCuota">
                                <option>Seleccione...</option>
                                <%                                    try {

                                        dao.categoriaDAO cateDAO = new dao.categoriaDAO();

                                        for (entity.Categoria tmp : cateDAO.getList()) {
                                %>
                                <option value="<%= tmp.getIdCategoria()%>"><%= tmp.getNombreCat()%></option>
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
