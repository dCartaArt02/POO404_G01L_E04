package ejercicio2;
import java.util.*;
public class Capturadatos
{
    public static void main (String []argumentos)
    {
        Scanner reader = new Scanner((System.in));
        String nombre= "";
        int edad;
        System.out.println("Beinvenido a intelliJ IDEA IDE XD");
        System.out.println("Ingrese su nombre:");
        nombre=reader.nextLine();
        System.out.println("ingrese su edad: ");
        edad=reader.nextInt();

        System.out.print("Usted se llama " + nombre + " y su edad es " +edad+ " años ");

    }
}
