<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ page import="java.math.BigDecimal" %>
<%@ page import="modelo.Producto_comida" %>
<%@ page import="modelo.ComidaDao" %>
<%@ page import="modelo.Conexion_db" %>

<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">

    <title>JSP - Hello World</title>
</head>
<div class="container">
    <h1>Productos del Menú</h1>

    <%

        ComidaDao comidaDao = new ComidaDao();
        List<Producto_comida> productos = comidaDao.lista();

    %>
    <div class="row">
        <%
            for (Producto_comida producto : productos) {
        %>
        <div class="col-md-4">
            <div class="card mb-4">
                <div class="card-body">
                    <h5 class="card-title"><%= producto.getNombre() %></h5>
                    <p class="card-text">Descripción: <%= producto.getDescripcion() %></p>
                    <p class="card-text">Precio: $<%= producto.getPrecio() %></p>
                </div>
            </div>
        </div>
        <%
            }
        %>
    </div>

</div>

<a href="hello-servlet">Hello Servlet</a>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
</body>
</html>