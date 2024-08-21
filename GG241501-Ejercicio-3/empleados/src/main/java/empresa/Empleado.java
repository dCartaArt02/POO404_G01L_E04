package empresa;
import javax.swing.JTextArea;

public class Empleado {
    protected String nombre;
    protected double salarioBase;

    public Empleado(String nombre, double salarioBase) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    public double calcularSalario() {
        return salarioBase;
    }

    public void mostrarInfo(JTextArea textArea) {
        textArea.append("Nombre: " + nombre + "\n");
        textArea.append("Salario: " + calcularSalario() + "\n");
    }
}