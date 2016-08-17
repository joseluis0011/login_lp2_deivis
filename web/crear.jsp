<%-- 
    Document   : crear
    Created on : 23/06/2016, 09:32:07 AM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>floreria estelita</title>
        <link href="Estilos/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="Estilos/css/estilos.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
    <center>
        <h1 class="text-center">AGREGAR PRODUCTOS</h1>
    </center>  
    <div class="crear">

        <center>
            <form class="form-horizontal" method="get" action="ci">
                <div class="form-group">
                    <label  class="letra col-sm-4 control-label"> <strong>Nombre Producto </strong></label>
                    <div class="col-sm-4">
                        <input type="text" required="" name="nombre" id="nombre" class="a form-control">             
                    </div>
                </div>
                <div class="form-group">
                    <label class="letra col-sm-4 control-label">Descripcion</label>
                    <div class="col-sm-4">    
                        <input type="text" required="" name="descripcion" id="descripcion" class="a form-control">             
                    </div>
                </div>
                <div class="form-group">
                    <label class="letra col-sm-4 control-label">Unidades</label>
                    <div class="col-sm-4">
                        <input type="number" required="" name="unidad" id="unidad" class="a form-control">             
                    </div>
                </div>
                <div class="form-group">
                    <label class="letra col-sm-4 control-label">Precio</label>
                    <div class="col-sm-4">
                        <input type="number" required="" name="precio" id="precio" class="a form-control">             
                    </div>
                </div>
                <div class="botones1">
                    <input type="hidden" name="op" id="op" value="3">
                    <input type="submit" name="boton" id="boton" value="Enviar" class="btn bg-primary">
                </div>

                <div class="botones2">
                    <a href="Listar.jsp"><button class="btn bg-primary" type="button" >volver</button></a>

                </div>


            </form>
        </center>
    </div>
</body>
</html>


