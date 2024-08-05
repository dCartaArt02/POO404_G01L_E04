
import java.util.*;
import java.util.Scanner;

public class Controlif {
    public static void main (String [] args){
        int var1, var2;
        Scanner leer = new Scanner (System.in);

        System.out.println("ingrese un prime numero:");
        var1 = leer.nextInt();

        System.out.println("ingrese un segundo valor numero:");
        var2 = leer.nextInt();

        if(var1 == var2){
            System.out.println("los numeros ["+var1+"] , ["+var2+"] son iguales");

        }
        else {
            System.out.println("los numeros ["+var1+"] , ["+var2+"] no son iguales");
        }
    }
}

