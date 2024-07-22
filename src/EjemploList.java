import java.util.*;
public class EjemploList
{
    public static void main(String[]args)
    {
        ArrayList<String> listaPersona = new ArrayList<>();
        listaPersona.add("Marie curie");
        listaPersona.add("Benjamin Franklin");
        listaPersona.add("Marco Antonio");
        listaPersona.add(1,"Juan Murillo");
        System.out.println("Uso de ARRAYLIST");
        System.out.println("Contenido de lista persona: "+listaPersona+ "\n");
        int pos = listaPersona.indexOf("Benjamin Franklin");
        System.out.println("El indice de Benjamin Franklin es:"+pos);
        boolean check = listaPersona.isEmpty();
        System.out.println("Verificando si ArrrayList esta vacio: "+check);
        int size = listaPersona.size();
        System.out.println("El tamaño de lista persona es "+ size);
        boolean elemento = listaPersona.contains("Marco antonio");
        System.out.println("Verificando si 'Marco Antonio' esta incluido en listapersona: " +elemento);
        String item = listaPersona.get(0);
        System.out.println("El elemento con indice 0 es: " + item);
        System.out.println("\nRecuperando elementos del ArrayList con for");
        for (int i = 0; i < listaPersona.size(); i++)
        {
            System.out.println("Indice: "+i+"- Elemento"+listaPersona.get(i));
        }
        System.out.println("\nRecuperando elementos del ArrayList con FOREACH");
        for (String persona : listaPersona)
        {
            System.out.println("Elemento" + persona);
        }
    System.out.println("\nRecuperando elementos del ArrayList con ITERATOR");
        for (Iterator<String> it = listaPersona.iterator();it.hasNext();)
        {
            System.out.println("Elemento:"+it.next());
        }
        listaPersona.set(1, "Nikola Tesla");
        System.out.println("\n ArrraList desde de reemplazo: "+listaPersona);
        listaPersona.remove(0);
        System.out.println("\nArrayList despues de elminar elemento 0:"+listaPersona);
        String[] simpleArray = listaPersona.toArray(new  String[listaPersona.size()]);
        System.out.println("\nEl objeto Array creado es: "+Arrays.toString(simpleArray));

    }
}
