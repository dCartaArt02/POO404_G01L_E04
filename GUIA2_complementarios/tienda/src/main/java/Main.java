import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el monto de la compra
        System.out.print("Ingresa el monto de la compra: ");
        double montoCompra = scanner.nextDouble();

        // Solicitar el color de la bolita
        System.out.print("Ingresa el color de la bolita (roja, verde, blanca): ");
        String colorBolita = scanner.next().toLowerCase();

        // Inicializar el monto del descuento
        double descuento = 0.0;

        // Determinar el descuento basado en el color de la bolita
        switch (colorBolita) {
            case "roja":
                descuento = montoCompra * 0.10;
                break;
            case "verde":
                descuento = montoCompra * 0.05;
                break;
            case "blanca":
                descuento = 0.0;
                break;
            default:
                System.out.println("Color de bolita no válido.");
                scanner.close();
                return;
        }

        // Calcular el monto final
        double montoFinal = montoCompra - descuento;

        // Mostrar el resultado
        if (descuento > 0) {
            System.out.printf("Se aplica un descuento de %.2f. El monto final a pagar es: %.2f\n", descuento, montoFinal);
        } else {
            System.out.println("No se aplica descuento. Gracias por participar.");
            System.out.printf("El monto final a pagar es: %.2f\n", montoCompra);
        }

        scanner.close();
    }
}
