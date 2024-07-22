import  javax.swing.*;
public class SenteciaIF
{
    public static void  main(String[]args)
    {
        String datos;
        double sueldo, afp=0, isss, totalre, nsueldo,renta;
        datos = JOptionPane.showInputDialog("Ingrese el sueldo del empleado(a)");
        sueldo = Double.parseDouble(datos);
        if (sueldo>300)
        {
            afp = (sueldo*0.0625);
        }
        JOptionPane.showMessageDialog(null, "Este empleado tiene un sueldo de " + sueldo+ " y el descuento del AFP es " +afp);
        datos=(String) JOptionPane.showInputDialog(null, "Ingrese el sexo: \n Si es masculino (M)\nSi es femenino(F)", "Sexo del empleado ",JOptionPane.QUESTION_MESSAGE,null, new Object[]{"M","F"},"F");
            if(datos=="M")
            {
                isss=sueldo*0.03;
                renta=sueldo*0.10;
                totalre=afp+isss+renta;
                nsueldo =sueldo -totalre;
                JOptionPane.showMessageDialog(null,"A este empleado se le detiene " +isss + " en concepto de ISSS \n Ademas se le retiene:"+renta+"En concepto de renta\nLo que hace un total de "+totalre+"\nY su nuevo sueldo es de: "+nsueldo);
            }
    }
}
