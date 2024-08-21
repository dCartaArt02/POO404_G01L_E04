package empresa;

public class Gerente extends Empleado {
    private double bono;

    // Constructor que inicializa nombre, salarioBase y bono
    public Gerente(String nombre, double salarioBase, double bono) {
        super(nombre, salarioBase);
        this.bono = bono;
    }

    // Sobrecargar el método calcularSalario para que retorne el salarioBase + bono
    @Override
    public double calcularSalario() {
        return super.calcularSalario() + bono;
    }

    // Sobrecargar el método mostrarInfo para mostrar la información adicional del gerente
    @Override
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario Base: " + super.calcularSalario());
        System.out.println("Bono: " + bono);
        System.out.println("Salario Total: " + calcularSalario());
    }
}