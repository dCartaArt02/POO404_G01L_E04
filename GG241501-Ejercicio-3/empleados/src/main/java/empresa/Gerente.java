package empresa;
import javax.swing.*;

public class Gerente extends Empleado {
    private double bono;

    public Gerente(String nombre, double salarioBase, double bono) {
        super(nombre, salarioBase);
        this.bono = bono;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + bono;
    }

    @Override
    public void mostrarInfo(JTextArea textArea) {
        textArea.append("Nombre: " + nombre + "\n");
        textArea.append("Salario Base: " + super.calcularSalario() + "\n");
        textArea.append("Bono: " + bono + "\n");
        textArea.append("Salario Total: " + calcularSalario() + "\n");
    }
}