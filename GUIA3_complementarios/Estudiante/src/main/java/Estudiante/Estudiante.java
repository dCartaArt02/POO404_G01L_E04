package Estudiante;

public class Estudiante {
    private String nombre;
    private int edad;
    private String direccion;
    private String[] materias;

    public Estudiante(String nombre, int edad, String direccion) {
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
        this.materias = new String[5]; // Array para almacenar las 5 materias
    }

    public void ingresarMaterias(String[] materias) {
        if (materias.length == 5) {
            this.materias = materias;
        } else {
            System.out.println("Debes ingresar exactamente 5 materias.");
        }
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Dirección: " + direccion);
        System.out.println("Materias: ");
        for (String materia : materias) {
            System.out.println(" - " + materia);
        }
    }
}
