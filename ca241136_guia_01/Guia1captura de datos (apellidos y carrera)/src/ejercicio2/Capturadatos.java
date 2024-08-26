package ejercicio2;
import java.util.*;
public class Capturadatos
{
    public static void main (String []argumentos)
    {
        Scanner reader = new Scanner((System.in));
        String nombre= "";
        int edad;
        String apellidos="";
        String carrera="";
        System.out.println("Beinvenido a intelliJ IDEA IDE XD");
        System.out.println("Ingrese su nombre:");
        nombre=reader.nextLine();
        System.out.println("Ingrese sus apellidos");
        apellidos=reader.nextLine();
        System.out.println("Ingrese la carrera que esta cursando: ");
        carrera=reader.nextLine();
        System.out.println("ingrese su edad: ");
        edad=reader.nextInt();

        System.out.print("Usted se llama " + nombre + " y sus apellidos son "+apellidos+" y tiene la edad de " +edad+ " años y esta cursando la carrera de " +carrera);

    }
}
