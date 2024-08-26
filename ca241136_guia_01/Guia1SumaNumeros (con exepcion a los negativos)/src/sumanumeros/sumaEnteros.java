package sumanumeros;
import javax.swing.JOptionPane;
 class sumaEnteros
 {
     public  static  void main (String[]args)
     {
         String Primernumero;
         String Segundonumero;
         int numero1, numero2, suma;

         System.out.println("Aplicacion para sumar 2 numeros enteros\n");
         Primernumero = JOptionPane.showInputDialog("Digite el primer numero");
         Segundonumero = JOptionPane.showInputDialog("Digite el segundo numero");
         numero1 = Integer.parseInt(Primernumero);
         numero2 = Integer.parseInt(Segundonumero);
         if (numero1 < 0)
         {
             JOptionPane.showMessageDialog(null, "No se pueden ingresar numeros negativos");
         }
         if (numero2 < 0)
         {
             JOptionPane.showMessageDialog(null, "No se pueden ingresar numeros negativos");
         }
        else {
             System.out.println("Los numeros ingresados son " + numero1 + " y " + numero2);
             suma = numero1 + numero2;
             JOptionPane.showMessageDialog(null, "La suma de " + numero1 + " y " + numero2 + " es de " + suma, "Resultado de la suma", JOptionPane.PLAIN_MESSAGE);

             System.exit(0);
         }
     }
}
