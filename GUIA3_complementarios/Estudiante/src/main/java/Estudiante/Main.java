package Estudiante;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            // Pedir los datos personales del estudiante
            System.out.print("Ingresa el nombre del estudiante: ");
            String nombre = scanner.nextLine();

            System.out.print("Ingresa la edad del estudiante: ");
            int edad = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            System.out.print("Ingresa la dirección del estudiante: ");
            String direccion = scanner.nextLine();

            // Crear el objeto Estudiante
            Estudiante estudiante = new Estudiante(nombre, edad, direccion);

            // Ingresar las materias
            String[] materias = new String[5];
            for (int i = 0; i < 5; i++) {
                System.out.print("Ingresa la materia " + (i + 1) + ": ");
                materias[i] = scanner.nextLine();
            }
            estudiante.ingresarMaterias(materias);

            // Mostrar la información del estudiante
            estudiante.mostrarInformacion();

            scanner.close();
        }
    }
