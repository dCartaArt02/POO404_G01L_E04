import javax.swing.JOptionPane;
public class pruebaTiempo1 extends tiempo1 {
    public static void main(String args[]) {
        tiempo1 tiempo = new tiempo1();
        String salida = "La hora universal inicial es: "+
                tiempo.aStringUniversal() + "\nLa hora estándar inicial es: "+
                tiempo.aStringEstandar();
        tiempo.establecerHora( 13, 27, 6 );
        salida += "\n\nLa hora universal después de establecerHora es: " +
                tiempo.aStringUniversal() +
"\nLa hora estándar después de establecerHora es: " + tiempo.aStringEstandar();
// establecer tiempo con valores inválidos; anexar hora actualizada a salida
        tiempo.establecerHora( 99, 99, 99 );
        salida += "\n\nDespués de intentar ajustes inválidos: " +
"\nHora universal: " + tiempo.aStringUniversal() +
"\nHora estándar: " + tiempo.aStringEstandar();
        JOptionPane.showMessageDialog( null, salida,
                "Prueba de la clase Tiempo1", JOptionPane.INFORMATION_MESSAGE );
        System.exit( 0 );
    }
}
