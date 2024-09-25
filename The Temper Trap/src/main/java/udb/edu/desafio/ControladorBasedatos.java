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
    ComidaDao comidaDao = new ComidaDao();
    List <Producto_comida> Producto = new ArrayList<Producto_comida>();
    String accion;
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ComidaDao comidaDao = new ComidaDao();
        List<Producto_comida> productos = comidaDao.lista();
        request.setAttribute("productos", productos);
        request.getRequestDispatcher("index.jsp").forward(request, response);
        switch (accion)
        {
            case "p":
                request.getRequestDispatcher("index.jsp").forward(request, response);
                break;

        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

}
