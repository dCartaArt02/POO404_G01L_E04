public class arboles {
    //Constructor sin parametros
    public arboles() {
        System.out.println("Un árbol genérico");
    }
    //Constructors con un parámetro string
    public arboles(String tipo) {
        System.out.println("Un árbol tipo " + tipo);
    }
    //Constructor con un parámetro int
    public arboles(int altura) {
        System.out.println("Un árbol de " + altura + " metros");
    }
    //Constructor con dos parametros uno int y el otro string
    public arboles(int altura,String tipo) {
        System.out.println("Un " + tipo + " de " + altura + " metros");
    }
    public static void main(String args[]) {
        arboles arbol1 = new arboles(4);//Objeto1
        arboles arbol2 = new arboles("Roble");//Objeto2
        arboles arbol3 = new arboles();//Objeto3
        arboles arbol4 = new arboles(5,"Pino");//Ojeto4
    }
}
