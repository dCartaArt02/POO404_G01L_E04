import java.util.*;
public class nuevoFor
{
    public  static  void main(String[]args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el numero de empleados: ");
        int NumEmpleados = scanner.nextInt();
        int[] sueldos = new int[NumEmpleados];
       for(int a = 0; a < NumEmpleados; a++)
        {
            int sueldo;
            do {
                System.out.println("Ingrese el sueldo del empleado " + (a + 1) + ":");
                sueldo = scanner.nextInt();
                if (sueldo < 0) {
                    System.out.println("Error no se pueden ingresar datos negativos");
                }
            }while (sueldo<0);
        }

    }
}
