package sv.edu.udb.guia8;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "FormSumaServlet", urlPatterns = "/sumaServlet")
public class FormSumaServlet extends HttpServlet {

    protected void doPost(final HttpServletRequest request, final HttpServletRequest response)
        throws ServletException, IOException {
        final String num_1 = request.getParameter("Num1");
        final String num_2 = request.getParameter("Num2");
        try
        {
            final Double sum = sumNumbers(Double.valueOf(num_1),Double.valueOf(num_2));
            request.setAttribute("respuesta",sum);
            request
                    .getRequestDispatcher("index.jsp")
                    .forward(request, response);
        }catch (Exception e)
        {
            request
                    .getRequestDispatcher("index.jsp")
                    .forward(request,response);
        }
    }
    private Double sumNumbers(final Double num1,  final Double num2 )
    {
        return num1 + num2;
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}