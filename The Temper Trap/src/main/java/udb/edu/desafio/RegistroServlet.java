package udb.edu.desafio;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import modelo.Conexion_db;
import java.sql.*;
import java.io.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
@WebServlet(name = "/RegistroA", value = "/Registroingreso")
public class RegistroServlet extends HttpServlet {
    Conexion_db cx = new Conexion_db();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String usuario = request.getParameter("usuario");
        String password = request.getParameter("password");
        String telefono = request.getParameter("telefono");
        String correo = request.getParameter("correo");
        if (registro(usuario, password, telefono, correo, correo)) {
            response.getWriter().println("Registro Exitoso");
            response.sendRedirect("login.jsp");
        }else
        {
            response.getWriter().println("Error al registrar");
        }
    }
    private boolean registro(String usuario, String password, String telefono, String correo, String direccion) {
        Connection con;
        PreparedStatement stmt;
        ResultSet rs;
        String sql = "INSERT INTO clientes (User, Contraseña, Telefono, Correo) VALUES (?, ?, ?, ?)";
        con = cx.Conectar();
        try {
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            stmt.setString(1, usuario);
            stmt.setString(2, password);
            stmt.setString(3, telefono);
            stmt.setString(4, correo);
            stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
