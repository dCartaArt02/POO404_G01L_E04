package empresa;
import java.util.Scanner;

public class Empresa {
    public static void main(String[] args) {
        // Crear instancias de empleados
        Empleado empleado1 = new Empleado("Juan Perez", 30000);
        Gerente gerente1 = new Gerente("Ana Martinez", 50000, 15000);
        Desarrollador desarrollador1 = new Desarrollador("Carlos Gomez", 40000, 10);
        Vendedor vendedor1 = new Vendedor("Laura Torres", 25000, 5000);

        // Crear un scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Menú de selección
        while (true) {
            System.out.println("Seleccione el nombre del empleado para ver la información:");
            System.out.println("1. Juan Perez");
            System.out.println("2. Ana Martinez");
            System.out.println("3. Carlos Gomez");
            System.out.println("4. Laura Torres");
            System.out.println("5. Salir");
            System.out.print("Ingrese el número correspondiente: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer del scanner

            switch (opcion) {
                case 1:
                    empleado1.mostrarInfo();
                    break;
                case 2:
                    gerente1.mostrarInfo();
                    break;
                case 3:
                    desarrollador1.mostrarInfo();
                    break;
                case 4:
                    vendedor1.mostrarInfo();
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    scanner.close();
                    return; // Salir del programa
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
            }
            System.out.println(); // Espacio para separar la información
        }
    }
}
