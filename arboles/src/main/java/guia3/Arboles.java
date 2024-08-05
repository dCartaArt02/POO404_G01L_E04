package guia3;

public class Arboles {

    public Arboles(){
        System.out.println("un arbol generico");
    }
    public Arboles(String tipo){
        System.out.println("un arbol tipo ["+tipo+"].");
    }

    public Arboles(int altura){
        System.out.println("una arbol de ["+altura+"] metros");
    }

    public Arboles(int altura, String tipo){
        System.out.println("un ["+tipo+"] de ["+altura+"] metros");
    }

    public static void main(String [] args){
        Arboles arbol1 = new Arboles(4);
        Arboles arbol2 = new Arboles("roble");
        Arboles arbol3 = new Arboles();
        Arboles arbol4 = new Arboles(5, "pino");
    }

}
