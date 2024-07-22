import java.lang.Integer;
import javax.swing.JOptionPane;
import java.util.*;

public class notaAlumno
{
    public static void main(String[]args)
    {
        String Nombre;
        String nota;
        double NotaNece = 7.0;
        double primer1 = 0;
        double DerechoAex = 6.50;
        Nombre =JOptionPane.showInputDialog("ingrese el nombre del alumno");
        nota = JOptionPane.showInputDialog("Ingrese la nota del alumno");
        primer1 = Double.parseDouble(nota);
        if (primer1 >= NotaNece)
        {

            JOptionPane.showMessageDialog(null,"Hola! "+Nombre+ " Tiene la nota necesaria para aprobar "+nota);
        }
        else
        {
            if (primer1 >= DerechoAex)
            {
                JOptionPane.showMessageDialog(null, "Hola! "+Nombre+" Tiene derecho a subir su nota con un examen " + nota);
            }
            else {
                if (primer1 < NotaNece) {
                    JOptionPane.showMessageDialog(null, "Hola! "+Nombre+" No tiene la nota necesaria para aprobar " + nota);
                }
            }
        }
    }
}
