import javax.swing.JOptionPane;
public class RojoProbabilidad
{
    public static void main(String[]args)
    {
        double random = Math.random();
        if (random<0.3)

        {
            System.out.println("La bola es azul");
            JOptionPane.showMessageDialog(null,"Felicidades\n Tiene 10% de descuento");
        }
        else if (random<0.5)
        {
            System.out.println("La bola es verde");
            JOptionPane.showMessageDialog(null,"Felicidasdes \nTienes 5% de descuento");
        }
        else
        {
            System.out.println("La bola es blanca");
            JOptionPane.showMessageDialog(null,"No hay descuento :C");
        }
    }
}
