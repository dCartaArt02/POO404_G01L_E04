package ejercicios_complementario;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Estudiante2{

    private String nombre;
    private int edad;
    private String idEstudiante;
    private List<String> materias;


    public Estudiante2(String nombre, int edad, String idEstudiante) {
        this.nombre = nombre;
        this.edad = edad;
        this.idEstudiante = idEstudiante;
        this.materias = new ArrayList<>();
    }


    public void ingresarMaterias() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese 5 materias que cursa el estudiante:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Materia " + (i + 1) + ": ");
            String materia = scanner.nextLine();
            this.materias.add(materia);
        }
    }


    public void mostrarInformacion() {
        System.out.println("Datos Personales del Estudiante:");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Edad: " + this.edad);
        System.out.println("ID Estudiante: " + this.idEstudiante);
        System.out.println("Materias:");
        for (int i = 0; i < materias.size(); i++) {
            System.out.println((i + 1) + ". " + this.materias.get(i));
        }
    }
}
