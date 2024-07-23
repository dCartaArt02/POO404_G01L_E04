package AnimalesEdgardo;

class Perro extends Animal
{
    private String colorPelaje;

    public Perro(String nombre, int edad, String alimento, String colorPelaje)
    {
        super(nombre, edad, alimento);
        this.colorPelaje = colorPelaje;
    }

    public String getColorPelaje()
    {
        return colorPelaje;
    }

    public void setColorPelaje(String colorPelaje)
    {
        this.colorPelaje = colorPelaje;
    }


    public void mostrarDatos()
    {
        super.mostrarDatos();
        System.out.println("Color de pelaje: " + colorPelaje);
    }
}
