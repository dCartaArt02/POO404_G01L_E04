package Captura;
import javax.swing.JOptionPane;
public class Datos
{
    public static void main(String[] args)
    {
        String nombre;
        String edad;
        nombre = JOptionPane.showInputDialog("ingrese su nombre");
        edad = JOptionPane.showInputDialog("ingrese su edad");

        JOptionPane.showMessageDialog(null, "Los resultados son \nque su nombre es " +nombre+ "\n y su edad es " +edad+ " años ");
    }
}
