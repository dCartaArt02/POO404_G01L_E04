package AnimalesEdgardo;

class Hamster extends Animal {
    private int cantidadPulgas;

    public Hamster(String nombre, int edad, String alimento, int cantidadPulgas)
    {
        super(nombre, edad, alimento);
        this.cantidadPulgas = cantidadPulgas;
    }

    public int getCantidadPulgas()
    {
        return cantidadPulgas;
    }

    public void setCantidadPulgas(int cantidadPulgas)
    {
        this.cantidadPulgas = cantidadPulgas;
    }


    public void mostrarDatos()
    {
        super.mostrarDatos();
        System.out.println("Cantidad de pulgas: " + cantidadPulgas);
    }
}
