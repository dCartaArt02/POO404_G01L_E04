import javax.swing.JOptionPane;
public class Persona {
    //atributos
    private String nombre;
    private String apellido;
    private String edad;

    //contructor sin parametros
//se utiliza al instanciar el objeto
    public Persona() {
        nombre = "Rafael";
        apellido="Torres";
        edad="23";
    }
    //contructor con parametros
    public Persona(String nombre,String apellido,String edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
        //permite definor dator a los atributos
        public void ingresoDatos()
        {
            nombre  = JOptionPane.showInputDialog("Ingrese el nombre");
            apellido = JOptionPane.showInputDialog("Ingrese el apellido");
            edad = JOptionPane.showInputDialog("Ingrese edad");
        }
        //permite imprimir los valores de los atributos
    public void mostrarDatos()
    {
        System.out.println("Su nombre es "+nombre);
        System.out.println("Su Apellido es: "+apellido);
        System.out.println("Su edad es: " +edad);
        System.out.println("*******************************");
    }
    public static void main(String args[])
    {
        //instancia del objeto p2
        Persona obj1=new Persona();
        Persona obj2=new Persona("Manuel", "Valdez","25");
        obj1.mostrarDatos();
        obj1.ingresoDatos();
        obj1.mostrarDatos();
        obj2.mostrarDatos();
        obj1.apellido="Sanchez";
        obj1.mostrarDatos();
    }

}