package utilidades;

public class bisiesto {
    public static boolean bisiesto(int año) {

        if (año % 4 == 0) {
            if (año % 100 == 0) {
                return año % 400 == 0;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        // Pruebas del método esBisiesto
        int[] años = {1900, 2001, 2024, 2025};
        for (int año : años) {
            System.out.println("El año " + año + " es bisiesto: " + bisiesto(año));
        }
    }
}
