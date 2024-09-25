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
</head>
<body>

<% String error = (String) request.getAttribute("error"); %>
<% if (error != null) { %>
<div style="color: red;"><%= error %></div>
<% } %>
<form action="login" method="post">
    <input type="hidden" name="accion" value="ingresar">

    <input type="text" name="txtnombre" required>
    <br>

    <input type="password" name="txtpassword" required>
    <br>
    <button type="submit">Ingresar</button>
</form>
<h1>AAAAAAAAAAAAAAAAAAAAA</h1>
</body>
</html>
