<%-- 
    Document   : Listar
    Created on : 22-jun-2016, 10:09:32
    Author     : FIA-LAB1D6
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="DTO.ProductoDTO" %>
<jsp:useBean id="lista" scope="session" class="java.util.ArrayList"/>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
         <script src="Estilos/js/bootstrap.min.js" type="text/javascript"></script>
        <link href="Estilos/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="Estilos/css/materialize.min.css" rel="stylesheet" type="text/css"/>
        <script src="Estilos/js/materialize.min.js" type="text/javascript"></script>
        <script src="Estilos/js/jquery-1.12.3.min.js" type="text/javascript"></script>
        <script src="Estilos/js/util.js" type="text/javascript"></script>
        <jsp:useBean class="DAO.ProductoDAO" id="prod"></jsp:useBean>
        <%  List<ProductoDTO> u = new ArrayList<>();%>
    </head>
    <body>
        <div>
            <center><h1 class="text-center">LISTA DE PEDIDOS</h1></center>
            <br>
            <% u = prod.readAll();
                for (int i = 0; i < u.size(); i++) {%>
            <div style="display: none;" class="alert alert-danger" id="myAlert">
                <a href="ci?op=2&id=<%= u.get(i).getIdproducto()%>" id="eliminar" role="button" class="waves-effect btn waves-light"style="background: #76ff03">Eliminar</a>
                <a href="Listar.jsp" role="button" class="waves-effect btn waves-light" style="background: #76ff03">NO</a>
                <strong>ADVERTENCIA!!!</strong> ¿ESTAS SEGURO DE ELIMINAR ESTE PRODUCTO?
            </div>
            <%}%>
            <br>

            <a href="<%= request.getContextPath()%>/ci?op=4" class="btn btn-mini btn-primary"  role="button">Agregar Producto</a>                      

            <table class="highlight responsive-table centered">
                <thead>
                    <tr>
                        <th>CODIGO PRODUCTO</th>
                        <th>NOMBRE PRODUCTO</th>
                        <th>DESCRIPCION</th>
                        <th>UNIDADES</th>
                        <th>PRECIO</th>
                        <th colspan="2">OPERACIONES</th>
                    </tr>
                </thead>
                <tbody>
                    <% u = prod.readAll();
                        for (int i = 0; i < u.size(); i++) {%>

                    <tr>
                        <td><%= u.get(i).getIdproducto()%></td>
                        <td><%= u.get(i).getNombreproducto()%></td>
                        <td><%= u.get(i).getDescripcionproducto()%></td>
                        <td><%= u.get(i).getCantidadproducto()%></td>
                        <td><%= u.get(i).getPrecioproducto()%></td> 
                        <td><a href="ci?op=5&id=<%= u.get(i).getIdproducto()%>" role="button" class="btn panel-primary " style="background: red">EDITAR</a></td>
                        <td><a role="button" class="waves-effect btn waves-light eliminar2"style="background: #536dfe">ELIMINAR</a></td>

                    </tr>

                    <%}%>

                </tbody>
            </table>
        </div>            
    </body>
</html>
