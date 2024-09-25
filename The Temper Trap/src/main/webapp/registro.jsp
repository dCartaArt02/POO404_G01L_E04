
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
    <meta charset="UTF-8">
</head>
<body>
<h1>Registro de Usuario</h1>
<form method="post" action="registroHandler.jsp">
    Nombre: <input type="text" name="nombre" required><br>
    Email: <input type="email" name="correo" required><br>
    telefono: <input type="text" name="Telefono" required><br>
    Direccion <input type="text" name="Dirrecion" required > <br>

    <select name="rol">
        <option value="cliente">Cliente</option>
    </select><br>
    <input type="submit" value="Registrar">
</form>
</body>
</html>
