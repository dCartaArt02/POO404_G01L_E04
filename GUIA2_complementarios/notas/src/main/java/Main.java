import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar la nota del alumno
        System.out.print("Ingresa la nota del alumno: ");
        double nota = scanner.nextDouble();

        // Evaluar la nota
        if (nota >= 7.0) {
            System.out.println("El alumno ha aprobado la materia.");
        } else if (nota >= 6.5 && nota < 7.0) {
            System.out.println("El alumno tiene la posibilidad de realizar un examen de suficiencia.");
        } else {
            System.out.println("El alumno no ha aprobado la materia.");
        }

        scanner.close();
    }
}
