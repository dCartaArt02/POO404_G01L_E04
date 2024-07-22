import  java.util.HashMap;
import  java.util.Iterator;
import java.util.Map;
import java.util.Set;
public class utilesEscolares
{
    public static void main(String[]args)
    {
        HashMap<Integer, String>hmap =new HashMap<Integer, String>();
        hmap.put(12,"Crayolas");
        hmap.put(2,"lapices");
        hmap.put(7,"Borradores");
        hmap.put(49,"Colores");
        hmap.put(3,"Boligrafos");
        System.out.println("Contenido de HashMap:");
        Set set = hmap.entrySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext())
        {
            Map.Entry mentry = (Map.Entry) iterator.next();
            System.out.println("Clave:" + mentry.getKey() + "-valor: " + mentry.getValue());
        }
            String var= hmap.get(2);
            System.out.println("\nValor asociado a clave 2:"+var);
            hmap.remove(3);
            System.out.println("\nHashMap después de eliminar elemento con clave 3:");
            Set set2 = hmap.entrySet();
            Iterator iterator2 = set2.iterator();
            while (iterator2.hasNext())
            {
                Map.Entry mentry2=(Map.Entry)iterator2.next();
                System.out.println("Clave"+mentry2.getKey()+"-valor"+mentry2.getValue());
            }

    }
}
