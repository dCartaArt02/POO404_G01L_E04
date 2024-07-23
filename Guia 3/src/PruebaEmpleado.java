import javax.swing.JOptionPane;
public class PruebaEmpleado {
    public static void main(String[] args)
    {
        Empleado emp= new Empleado();
        Profesor pro=new Profesor();
        JOptionPane.showMessageDialog(null,"clase empleado");
        emp.ingresoDatos();
        emp.mostrarDatos();
        JOptionPane.showMessageDialog(null,"clase profesor");
        pro.ingreso2();
        pro.mostrar2();
    }
}
