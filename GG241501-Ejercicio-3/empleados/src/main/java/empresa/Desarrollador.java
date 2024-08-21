package empresa;

public class Desarrollador extends Empleado {
    private double horasExtras;

    // Constructor que inicializa nombre, salarioBase y horasExtras
    public Desarrollador(String nombre, double salarioBase, double horasExtras) {
        super(nombre, salarioBase);
        this.horasExtras = horasExtras;
    }

    // Sobrecargar el método calcularSalario para que retorne el salarioBase + (horasExtras * tarifaHoraExtra)
    @Override
    public double calcularSalario() {
        double tarifaHoraExtra = 50.0; // Tarifa fija por hora extra
        return super.calcularSalario() + (horasExtras * tarifaHoraExtra);
    }

    // Sobrecargar el método mostrarInfo para mostrar la información adicional del desarrollador
    @Override
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario Base: " + super.calcularSalario());
        System.out.println("Horas Extras: " + horasExtras);
        System.out.println("Salario Total: " + calcularSalario());
    }
}