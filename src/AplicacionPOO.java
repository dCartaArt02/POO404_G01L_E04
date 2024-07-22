import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class alumno {
    private String nombre;
    private String apellido;


    public alumno(String nombre, String apellido, String carnet) {
        this.nombre = nombre;
        this.apellido = apellido;

    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

}
    public class AplicacionPOO
    {
        public static void main(String[]args)
        {
            Scanner scanner = new Scanner(System.in);
            Map <String, alumno> Mapeaalumnos = new HashMap<>();
            int Opcion;
            String carnet;
            String nombre;
            String apellido;
            do
            {
                System.out.println("Lista de alumnos Udb");
                System.out.println("\n1. Ingreso de estudiante ");
                System.out.println("\n2. Ver estudiante ");
                System.out.println("\n3. Buscar estudiante ");
                System.out.println("\n4. Salir");

                Opcion = scanner.nextInt();
                scanner.nextLine();
                switch (Opcion)
                {
                    case 1:
                        System.out.println("Ingrese el carnet del estudiante");
                        carnet = scanner.nextLine();
                        System.out.println("Ingrese el nombre del estudiante");
                        nombre = scanner.nextLine();
                        System.out.println("Ingrese el apellido del estudiante");
                        apellido = scanner.nextLine();
                        alumno alumno = new alumno (nombre,apellido,carnet);

                        Mapeaalumnos.put(carnet,alumno);
                        System.out.println("Estudiante ingresado");
                        break;
                    case 2:
                        System.out.println("Ingrese el carnet del estudiante que quiere ver");
                        carnet = scanner.nextLine();
                        alumno = Mapeaalumnos.get(carnet);
                        if (alumno != alumno)
                        {
                            System.out.println("Nombre: " +alumno.getNombre());
                            System.out.println("Apellido: " + alumno.getApellido());
                        }
                        else
                        {
                            System.out.println("No se encontro estudiante con ese carnet "+carnet);
                        }
                        break;
                    case 3:
                        System.out.println("Ingrese el carnet del estudiante a buscar");
                        carnet = scanner.nextLine();
                        alumno = Mapeaalumnos.get(carnet);
                        if (alumno != null)
                        {
                            System.out.println("Estudiante encontrado");
                            System.out.println("Nombre: "+alumno.getNombre());
                            System.out.println("Apellido "+alumno.getApellido());
                        }
                        else
                        {
                            System.out.println("No se encontro estudiante con ese carnet");
                        }
                        break;
                    case 4:
                        System.out.println("Saliendo del prgrama");
                        break;
                    default:
                        System.out.println("Opcion invalida intetelo denuevo");
                        break;

                }
            }
            while (Opcion != 4);



        }
    }
