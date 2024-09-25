package udb.edu.desafio;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import modelo.EmpleadoDao;

@WebServlet (name = "/Validar", value = "/login")
public class ValidarControlador extends HttpServlet {
    EmpleadoDao empleadoDao = new EmpleadoDao();
    String accion;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nombre = request.getParameter("txtnombre");
        String contraseña = request.getParameter("txtpassword");


        if (empleadoDao != null) {
            HttpSession session = request.getSession();
            session.setAttribute("usuario", empleadoDao);
            response.sendRedirect("index.jsp");
        } else {
            request.setAttribute("error", "Nombre de usuario o contraseña incorrectos.");
            request.getRequestDispatcher("login.jsp").forward(request, response);

        }
    }
}
