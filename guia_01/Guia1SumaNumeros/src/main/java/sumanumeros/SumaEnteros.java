package sumanumeros;
import javax.swing.*;
import java.util.*;
public class SumaEnteros {
    public static void main(String []args){

        String numero1 ;
        String numero2 ;

        int numero1int, numero2int;

        System.out.println("APLICACION PARA SUMAR DOS NUMEROS ENTEROS: :DDDDDDDD");
        Scanner leer = new Scanner(System.in);
        numero1=JOptionPane.showInputDialog("INGRESE EL PRIMER NUMERO");
        numero1int = Integer.parseInt(numero1);

        numero2=JOptionPane.showInputDialog("INGRESE EL SEGUNDO NUMERO");
        numero2int = Integer.parseInt(numero2);

        int suma;

        suma = (numero1int+numero2int);

        JOptionPane.showMessageDialog(null,"EL RESULTADO DE SUMAR ["+numero1+"] y ["+numero2+"] ES: ["+suma+"]");
    }
}
