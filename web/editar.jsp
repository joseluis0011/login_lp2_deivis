<%-- 
    Document   : editar
    Created on : 23/06/2016, 05:42:19 PM
    Author     : user
--%>

<%@page import="DTO.ProductoDTO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="lista2" class="java.util.ArrayList" scope="session"/>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="Estilos/css/estilos1.css" rel="stylesheet" type="text/css"/>
       
        <link href="Estilos/css/materialize.min.css" rel="stylesheet" type="text/css"/>
        <script src="Estilos/js/materialize.min.js" type="text/javascript"></script>
        <script src="Estilos/js/jquery-1.12.3.min.js" type="text/javascript"></script>
        <title>floreria estelita</title>
    </head>
    <body>
    <center><h1>Modificar Productos</h1></center>

    <div id="caja2">
        <form method="get" action="ci">
            <%
                ProductoDTO p = new ProductoDTO();
                for (int i = 0; i < lista2.size(); i++) {
                    p = (ProductoDTO) lista2.get(i);
            %>
            <div class="form-group">
                <label class="lab" style="color: #000000">Nombre Producto</label>
                <input type="text" name="nombre" id="user" class="form-control" value="<%=p.getNombreproducto()%>">
            </div>
            <div class="form-group">
                <label class="lab"style="color: #000000">Descripcion del Producto</label>
                <input type="text" name="descripcion" id="pass" class="form-control" value="<%=p.getDescripcionproducto()%>">             
            </div>
            <div class="form-group">
                <label class="lab"style="color: #000000">Unidades</label>
                <input type="number" name="unidad" id="pass" class="form-control" value="<%=p.getCantidadproducto()%>">             
            </div>
            <div class="form-group">
                <label class="lab"style="color: #000000">Precio</label>
                <input type="number" name="precio" id="pass" class="form-control" value="<%=p.getPrecioproducto()%>">             
            </div>
            <input type="hidden" name="op" id="op" value="6">
            <input type="hidden" name="id" id="id" value="<%=p.getIdproducto()%>">
            <center>
                <div class="form-group buton">
                    <input type="submit" name="boton" id="boton" value="Enviar" class="waves-effect waves-light btn-large">
                    <a href="Listar.jsp"><button class="waves-effect waves-red btn-large" type="button" >Regresar</button></a>                    
                </div>
            </center>
            <%}%>
        </form>
    </div>
</body>
</html>
