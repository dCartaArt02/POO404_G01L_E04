package udb.edu.desafio;
import java.io.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import jakarta.validation.Valid;
import modelo.Conexion_db;
import modelo.Empleado;


@WebServlet (name = "/Validar", value = "/ingreso")
public class ValidarControlador extends HttpServlet {

    String accion;
    Conexion_db con = new Conexion_db();
    Connection cx;
    PreparedStatement stmt;
    ResultSet rs;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nombre = request.getParameter("txtnombre");
        String contraseña = request.getParameter("txtpassword");
        if (validar(nombre,contraseña)) {
            response.getWriter().print("Bienvenido " + nombre);
            response.sendRedirect("index.jsp");
        } else {
            response.getWriter().println("Usuario o contraseña incorrectos");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        }
    public boolean validar (String usuario, String contraseña) {
        Empleado Em = new Empleado();
        String sql = "select * from empleados where User = ? and contraseña = ?";
        try{
            cx=con.Conectar();
            stmt=con.Conectar().prepareStatement(sql);
            stmt.setString(1, usuario );
            stmt.setString(2,contraseña);
            rs=stmt.executeQuery();
            return rs.next();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    }

