<%--
  Created by IntelliJ IDEA.
  User: Yugoa
  Date: 10/14/2024
  Time: 8:30 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <title>Etiquetas JSTL</title>
</head>
<body>
<div class="container">
    <div class="row">
        &nbsp;
    </div>
    <div class="panel panel-primary">
        <div class="panel-heading">Resultado de verambito</div>
        <div class="panel-body">
            <p>${variableDePagina}</p>
            <p><c:out value="${variableDeSesion}"/></p>
            <p><c:out value="${variableDeAplicacion}"/><br></p>
            <p><c:out value="${cuatro}"/></p>
        </div>
    </div>
</div>
</body>
</html>
