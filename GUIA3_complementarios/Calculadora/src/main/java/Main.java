import calculadora.basica;
import calculadora.avanzada;
public class Main {
    public static void main(String[] args) {
        // Crear instancias de las calculadoras
        CalculadoraBasica cbasica = new CalculadoraBasica();
        CalculadoraAvanzada cavanzada = new CalculadoraAvanzada();

        // Pruebas con la Calculadora Basica
        System.out.println("Suma: " + cbasica.suma(5, 3));
        System.out.println("Resta: " + cbasica.resta(5, 3));
        System.out.println("Multiplicación: " + cbasica.multiplicacion(5, 3));
        System.out.println("División: " + cbasica.division(5, 3));

        // Pruebas con la Calculadora Avanzada
        System.out.println("Potencia: " + cavanzada.potencia(2, 3));
        System.out.println("Opuesto: " + cavanzada.opuesto(2));
        System.out.println("Factorial: " + cavanzada.factorial(4));
    }
}
