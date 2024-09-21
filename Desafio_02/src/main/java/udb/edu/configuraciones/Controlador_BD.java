package udb.edu.configuraciones;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import udb.edu.clases.Producto_BD;
import udb.edu.clases.Producto_comida;

@WebServlet(name = "Controlador_BDServlet", value = "/Controlador_BD-servlet")
public class Controlador_BD extends HttpServlet {
    Producto_BD P = new Producto_BD();
    List<Producto_comida> menus = new ArrayList<>();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nombre = request.getParameter("nombre");
        menus = P.listar();

        switch (nombre) {
            case "prueba":

                break;
            default:
                request.setAttribute("menus", menus);
                request.getRequestDispatcher("index.jsp").forward(request, response);
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public void destroy() {

    }
}
