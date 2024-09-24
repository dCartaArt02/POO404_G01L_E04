package modelo;

public class Usuarios {
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String telefono) {
        Telefono = telefono;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public Usuarios(String nombre) {
        this.nombre = nombre;
        this.correo = correo;
        this.Telefono = Telefono;
        this.Direccion = Direccion;
    }

    String nombre;
    String correo;
    String Telefono;
    String Direccion;
}
