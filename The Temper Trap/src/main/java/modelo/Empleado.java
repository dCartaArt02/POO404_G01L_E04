package modelo;

public class Empleado {
    private String nombre;
    private String apellido;
    private String correo;
    private float salario;
    private String puesto;
    private int id;


    public Empleado(String nombre, String apellido, String correo, float salario, String puesto, int id) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.salario = salario;
        this.puesto = puesto;
        this.id = id;
    }


    public Empleado() {

    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}