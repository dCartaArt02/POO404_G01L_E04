package empresa;
import javax.swing.*;

public class Desarrollador extends Empleado {
    private double horasExtras;

    public Desarrollador(String nombre, double salarioBase, double horasExtras) {
        super(nombre, salarioBase);
        this.horasExtras = horasExtras;
    }

    @Override
    public double calcularSalario() {
        double tarifaHoraExtra = 50.0; // Ejemplo de tarifa por hora extra
        return super.calcularSalario() + (horasExtras * tarifaHoraExtra);
    }

    @Override
    public void mostrarInfo(JTextArea textArea) {
        textArea.append("Nombre: " + nombre + "\n");
        textArea.append("Salario Base: " + super.calcularSalario() + "\n");
        textArea.append("Horas Extras: " + horasExtras + "\n");
        textArea.append("Salario Total: " + calcularSalario() + "\n");
    }
}