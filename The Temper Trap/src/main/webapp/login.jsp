<%--
  Created by IntelliJ IDEA.
  User: Yugoa
  Date: 9/20/2024
  Time: 6:43 PM
  To change this template use File | Settings | File Templates.
--%>


<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
    <a class="navbar-brand" href="#">The Temper Trap</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarNav">
        <ul class="navbar-nav">
            <li class="nav-item active">
                <a class="nav-link" href="index.jsp">Home <span class="sr-only">(current)</span></a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="#">Features</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/login.jsp">login</a>
            </li>
            <li class="nav-item">
                <a class="nav-link disabled" href="#">Disabled</a>
            </li>
        </ul>
    </div>
</nav>

<% String error = (String) request.getAttribute("error"); %>
<% if (error != null) { %>
<div style="color: red;"><%= error %></div>
<% } %>

<div class="back">

    <div class="div-center">

        <div class="content">

            <h3>Inicio</h3>
            <hr />
            <form action="ingreso" method="post">
                <div class="form-group">
                    <label for="txtnombre">Usuario</label>
                    <input type="text" class="form-control" id="txtnombre" placeholder="Usuario" name="txtnombre">
                </div>
                <div class="form-group">
                    <label for="txtpassword">Contraseña</label>
                    <input type="password" class="form-control" id="txtpassword" placeholder="Contraseña" name="txtpassword">
                </div>
                <button type="submit" class="btn btn-primary">Login</button>
                <hr/>
                <a href="registro.jsp">Registro</a>
            </form>
            <style>
                body
                {
                    background-color: #0E071A;
                }
                .back {
                    .back {
                        background: #e2e2e2;
                        width: 100%;
                        position: absolute;
                        top: 0;
                        bottom: 0;
                    }

                    .div-center {
                        width: 400px;
                        height: 400px;
                        background-color: #fff;
                        position: absolute;
                        left: 0;
                        right: 0;
                        top: 0;
                        bottom: 0;
                        margin: auto;
                        max-width: 100%;
                        max-height: 100%;
                        overflow: auto;
                        padding: 1em 2em;
                        border-bottom: 2px solid #ccc;
                        display: table;
                    }

                    div.content {
                        display: table-cell;
                        vertical-align: middle;
                    }
                }
            </style>
        </div>
        </span>
    </div>

</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
</body>
</html>
