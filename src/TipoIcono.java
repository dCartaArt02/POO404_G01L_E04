import javax.swing.JOptionPane;
public class TipoIcono
{
    public static void main(String[]args)
    {
        JOptionPane.showMessageDialog(null,"Informacion","mensaje de informacion",JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,"Advertencia","mensaje de advertencia",JOptionPane.WARNING_MESSAGE);
        JOptionPane.showMessageDialog(null,"Error","Mensaje de Error",JOptionPane.ERROR_MESSAGE);
        JOptionPane.showMessageDialog(null,"Sin icono","Mensaje de texto plano",JOptionPane.PLAIN_MESSAGE);

    }
}
