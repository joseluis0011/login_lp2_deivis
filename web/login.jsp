<%-- 
    Document   : login
    Created on : 08/07/2016, 07:17:46 AM
    Author     : garcia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <title>examen final</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="Estilos/css/estilos.css" rel="stylesheet" type="text/css"/>
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <script src="js/jquery-1.12.3.min.js" type="text/javascript"></script>
        <link href="css/login.css" rel="stylesheet" type="text/css"/>
    </head>

    <body>


    <center>



             
     <div id="caja">
       
         <form name="login">  
            <label>usuario</label><br>


            <input name="id" type="text"><br>
            <label>Password: </label><br>

            <input name="pass"type="password"><br>

            <br><input type="button" value="ENTRAR"onClick="pasuser(this.form)">
    </form><br>

         </div>

     


    </center>

    <script >

        function pasuser(form) {
            if (form.id.value == "deyvis") {
                if (form.pass.value == "garcia") {
                    location.href = 'crear.jsp';
                } else {
                    alert("comtraseña incorrecta")
                }
            } else {
                alert("usuario incorrecto")
            }
        }

    </script>
</body>


</html>





















