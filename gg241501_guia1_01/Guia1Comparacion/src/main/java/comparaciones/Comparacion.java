package comparaciones;

import javax.swing.*;

public class Comparacion {
    public static void main(String [] argd){
        String primernunero, segundonumero, resultado = "";
        int numero1, numero2;
        System.out.println("PROGRAMA PARA USAR OPEREADORES RELACIONALES EN JAVA");

        primernunero= JOptionPane.showInputDialog("ESCRIBA EL PRIMER NUMERO");
        numero1 = Integer.parseInt(primernunero);

        segundonumero = JOptionPane.showInputDialog("INGRESE EL SEGUNDO NUMERO");
        numero2 = Integer.parseInt(segundonumero);

        if (numero1 == numero2){
            resultado = resultado +numero1 +" ES IGUAL A " +numero2+" ,";
        }
        if (numero1 != numero2){
            resultado = resultado +numero1 +" ES DISTINTO A "+ numero2+"," ;
        }
        if (numero1 > numero2){
            resultado = resultado +numero1 +" ES MAYOR A "+ numero2+" ," ;
        }
        if (numero1 < numero2){
            resultado = resultado +numero1 +" ES MENOR A "+ numero2+" ," ;
        }
        if (numero1 >= numero2){
            resultado = resultado +numero1 +" ES MAYOR O IGUAL A "+ numero2 +" ,";
        }
        if (numero1 <= numero2){
            resultado = resultado +numero1 +" ES MENOR O IGUAL A "+ numero2 +" ,";
        }

        JOptionPane.showConfirmDialog(null,resultado,"RESULTADOS DE LA COMPARACION...", JOptionPane.INFORMATION_MESSAGE);
    }
}
