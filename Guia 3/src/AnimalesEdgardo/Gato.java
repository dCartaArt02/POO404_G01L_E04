package AnimalesEdgardo;

class Gato extends Animal
{
    private String colorOjos;

    public Gato(String nombre, int edad, String alimento, String colorOjos)
    {
        super(nombre, edad, alimento);
        this.colorOjos = colorOjos;
    }

    public String getColorOjos()
    {
        return colorOjos;
    }

    public void setColorOjos(String colorOjos)
    {
        this.colorOjos = colorOjos;
    }


    public void mostrarDatos()
    {
        super.mostrarDatos();
        System.out.println("Color de ojos: " + colorOjos);
    }
}

