package ejercicios_complementario;
import java.util.Scanner;

public class Mostrar
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        // Crear un objeto Estudiante con datos personales
        System.out.print("Ingrese el nombre del estudiante: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese la edad del estudiante: ");
        int edad = scanner.nextInt();
        scanner.nextLine();  // Consumir la nueva línea después del entero
        System.out.print("Ingrese el ID del estudiante: ");
        String idEstudiante = scanner.nextLine();

        Estudiante2 estudiante = new Estudiante2(nombre, edad, idEstudiante);

        // Llamar al método para ingresar materias
        estudiante.ingresarMaterias();

        // Llamar al método para mostrar toda la información
        estudiante.mostrarInformacion();
    }
}
