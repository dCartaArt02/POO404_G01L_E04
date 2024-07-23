package sv.edu.udb.auxiliares;
import sv.edu.udb.escritura.pantalla;
public class mandaPantalla {
    public static void main(String args[]) {
        pantalla primera = new pantalla();
        primera.conSalto("Esto es un renglon CON salto de linea");
        primera.conSalto("Esta línea tambien tiene salto");
        primera.sinSalto("Linea Continua");
        primera.sinSalto("Linea Continua");
        primera.conSalto("Esta linea si tiene salto!");
        primera.sinSalto("Termina sin salto");
        System.out.println(" Se termina el uso de funciones");
    }
}
