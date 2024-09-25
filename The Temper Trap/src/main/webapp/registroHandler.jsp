

<%@page import="javax.sql.*" %>
<%@ page import="java.sql.*" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Registrin</title>
</head>
<body>

<%
  String nombre = request.getParameter("nombre");
  String correo = request.getParameter("correo");
  String telefono = request.getParameter("telefono");
  String Direccion = request.getParameter("Direccion");


      String url = "jdbc:mysql://localhost:3306/rapigo";
      String user = "root";
      String pass = "Carta.345617";
      Connection Con = null;
      PreparedStatement statement = null;
      ResultSet rs = null;

      try {
        Con = DriverManager.getConnection(url,user,pass);
        String sql ="INSERT INTO usuarios (nombre, correo, telefono, Direccion) VALUES (?, ?, ?, ?)";
        statement = Con.prepareStatement(sql);
        statement.setString(1, nombre);
        statement.setString(2, correo);
        statement.setString(3, telefono);
        statement.setString(4, Direccion);
        statement.executeUpdate();
        response.sendRedirect("login.jsp");
        rs = statement.executeQuery();
      } catch (SQLException e) {
        throw new RuntimeException(e);
      }finally {
        if (statement != null) try {
          statement.close();
        } catch (SQLException e) {
        }
        if (Con != null) try {
          Con.close();
        } catch (SQLException e) {
        }
      }
  %>

</body>
</html>
