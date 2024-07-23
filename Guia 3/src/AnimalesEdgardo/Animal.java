package AnimalesEdgardo;

public class Animal {
    // Propiedades comunes de todos los animales
    private String nombre;
    private int edad;
    private String alimento;

    // Constructor de la clase Animal
    public Animal(String nombre, int edad, String alimento) {
        this.nombre = nombre;
        this.edad = edad;
        this.alimento = alimento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento)
    {
        this.alimento = alimento;
    }
    public void mostrarDatos()
    {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Alimento: " + alimento);
    }
    public static void main(String[] args)
    {
        Gallo gallo = new Gallo("TIlin", 2, "Granos", "Rojo");
        Perro perro = new Perro("Max", 3, "Croquetas", "Marrón");
        Gato gato = new Gato("chino", 1, "Atún", "Verde");
        Hamster hamster = new Hamster("rami", 1, "Semillas", 5);

        gallo.mostrarDatos();
        System.out.println();
        perro.mostrarDatos();
        System.out.println();
        gato.mostrarDatos();
        System.out.println();
        hamster.mostrarDatos();
    }
}