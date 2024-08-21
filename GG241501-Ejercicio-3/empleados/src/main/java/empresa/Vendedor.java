package empresa;
import javax.swing.*;

public class Vendedor extends Empleado {
    private double comision;

    public Vendedor(String nombre, double salarioBase, double comision) {
        super(nombre, salarioBase);
        this.comision = comision;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + comision;
    }

    @Override
    public void mostrarInfo(JTextArea textArea) {
        textArea.append("Nombre: " + nombre + "\n");
        textArea.append("Salario Base: " + super.calcularSalario() + "\n");
        textArea.append("Comisión: " + comision + "\n");
        textArea.append("Salario Total: " + calcularSalario() + "\n");
    }
}