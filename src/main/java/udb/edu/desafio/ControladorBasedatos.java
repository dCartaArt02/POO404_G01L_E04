package udb.edu.desafio;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import modelo.ComidaDao;
import modelo.Producto_comida;

@WebServlet(name = "ControladorBd", value = "/Controladorbd")
public class ControladorBasedatos extends HttpServlet {
    ComidaDao Cd = new ComidaDao();
    List <Producto_comida> Producto = new ArrayList<Producto_comida>();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String accion = request.getParameter("accion");
        Producto = Cd.lista();

    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String accion = request.getParameter("accion");
        request.setAttribute("producto", Producto);
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }

}
