package calculador;

import java.util.Scanner;

public class calculadora
{
    public static void main(String[] args)
    {

        calculadorBasica cBasica = new calculadorBasica();
        calculadorAvanzada cAvanzada = new calculadorAvanzada();
        Scanner scanner = new Scanner(System.in);


        while (true)
        {
            System.out.println("\nSeleccione una opción:");
            System.out.println("1. Calculadora Básica");
            System.out.println("2. Calculadora Avanzada");
            System.out.println("3. Salir");
            int opcion = scanner.nextInt();

            if (opcion == 1)
            {
                System.out.println("\nSeleccione una operación:");
                System.out.println("1. Suma");
                System.out.println("2. Resta");
                System.out.println("3. Multiplicación");
                System.out.println("4. División");
                int operacion = scanner.nextInt();

                System.out.print("Ingrese el primer número: ");
                double num1 = scanner.nextDouble();
                System.out.print("Ingrese el segundo número: ");
                double num2 = scanner.nextDouble();

                switch (operacion)
                {
                    case 1:
                        System.out.println("Resultado de la suma: " + cBasica.suma(num1, num2));
                        break;
                    case 2:
                        System.out.println("Resultado de la resta: " + cBasica.resta(num1, num2));
                        break;
                    case 3:
                        System.out.println("Resultado de la multiplicación: " + cBasica.multiplicacion(num1, num2));
                        break;
                    case 4:
                        try {
                            System.out.println("Resultado de la división: " + cBasica.division(num1, num2));
                        } catch (ArithmeticException e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    default:
                        System.out.println("Opción no válida.");
                }

            } else if (opcion == 2)
            {
                System.out.println("\nSeleccione una operación:");
                System.out.println("1. Potencia");
                System.out.println("2. Opuesto");
                System.out.println("3. Factorial");
                int operacion = scanner.nextInt();

                switch (operacion)
                {
                    case 1:
                        System.out.print("Ingrese la base: ");
                        double base = scanner.nextDouble();
                        System.out.print("Ingrese el exponente: ");
                        double exponente = scanner.nextDouble();
                        System.out.println("Resultado de la potencia: " + cAvanzada.potencia(base, exponente));
                        break;
                    case 2:
                        System.out.print("Ingrese el número: ");
                        double numero = scanner.nextDouble();
                        System.out.println("Opuesto del número: " + cAvanzada.opuesto(numero));
                        break;
                    case 3:
                        System.out.print("Ingrese un número entero no negativo: ");
                        int num = scanner.nextInt();
                        try {
                            System.out.println("Resultado del factorial: " + cAvanzada.factorial(num));
                        } catch (IllegalArgumentException e)
                        {
                            System.out.println(e.getMessage());
                        }
                        break;
                    default:
                        System.out.println("Opción no válida.");
                }

            }
            else if (opcion == 3)
            {
                System.out.println("Saliendo...");
                break;
            } else {
                System.out.println("Opción no válida.");
            }
        }


    }
}

