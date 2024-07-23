package AnimalesEdgardo;

class Gallo extends Animal
{
    private String colorPlumas;

    public Gallo(String nombre, int edad, String alimento, String colorPlumas)
    {
        super(nombre, edad, alimento);
        this.colorPlumas = colorPlumas;
    }

    public String getColorPlumas()
    {
        return colorPlumas;
    }

    public void setColorPlumas(String colorPlumas)
    {
        this.colorPlumas = colorPlumas;
    }


    public void mostrarDatos()
    {
        super.mostrarDatos();
        System.out.println("Color de plumas: " + colorPlumas);
    }
}
