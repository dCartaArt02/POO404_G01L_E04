package Comparaciones;
import javax.swing.JOptionPane;
public class Comparacion
{
    public static void main(String[] args)
    {
        String Primernumero, Segundonumero, Resultado;
        int numero1, numero2;
        System.out.println("Programa para usar operadores relacionales en java");
        Primernumero = JOptionPane.showInputDialog("Escriba el primer entero:");
        Segundonumero = JOptionPane.showInputDialog("Escriba el segundo entero:");

        numero1 = Integer.parseInt(Primernumero);
        numero2 = Integer.parseInt(Segundonumero);
        Resultado= "";
        if (numero1 == numero2)
        {
            Resultado= Resultado +numero1+ " igual que " + numero2;
        }
        if (numero1 != numero2)
        {
            Resultado= Resultado +numero1+ " distinto de " + numero2;
        }
        if (numero1 > numero2)
        {
            Resultado= Resultado + "\n" + +numero1+ " > " + numero2;
        }
        if (numero1 < numero2)
        {
            Resultado= Resultado + "\n" + +numero1+ " < " + numero2;
        }
        if (numero1 >= numero2)
        {
            Resultado= Resultado + "\n" + +numero1+ " >= " + numero2;
        }
        if (numero1 <= numero2)
        {
            Resultado= Resultado + "\n" + +numero1+ " <= " + numero2;
        }
        JOptionPane.showMessageDialog(null, Resultado, "Resultado de la comparacion",JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
