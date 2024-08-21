package empresa;

public class Vendedor extends Empleado {
    private double comision;

    public Vendedor(String nombre, double salarioBase, double comision) {
        super(nombre, salarioBase);
        this.comision = comision;
    }

    // Sobrecargar el método calcularSalario para que retorne el salarioBase + comision
    @Override
    public double calcularSalario() {
        return super.calcularSalario() + comision;
    }

    // Sobrecargar el método mostrarInfo para mostrar la información adicional del vendedor
    @Override
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario Base: " + super.calcularSalario());
        System.out.println("Comisión: " + comision);
        System.out.println("Salario Total: " + calcularSalario());
    }
}