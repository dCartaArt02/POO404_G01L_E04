package sv.edu.udb.form;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Closeable;

public class Opciones extends JFrame {

    String txtnumeroCuentaRecibido;
    int cuentaseleccionadaRecibida;
    String[][] cuentasRecibidas;

    private JLabel lbl_numerocuentaactual;
    private JRadioButton rbt_consultarsaldo;
    private JRadioButton rbt_retiro;
    private JRadioButton rbt_consignar;
    private JRadioButton rbt_transferir;
    private JRadioButton rbt_salir;
    private JPanel Optionpanel;


    public Opciones(String text, String[][] cuentas, int Cuentaseleccionada) {
        this.txtnumeroCuentaRecibido = text;
        this.cuentasRecibidas = cuentas;
        this.cuentaseleccionadaRecibida = Cuentaseleccionada;

        setTitle("Menu Opciones");

        setContentPane(Optionpanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setPreferredSize(new Dimension(650, 300));
        this.setLocationRelativeTo(getParent());

        rbt_consultarsaldo.setPreferredSize(new Dimension(260, 20));
        rbt_retiro.setPreferredSize(new Dimension(140, 20));
        rbt_consignar.setPreferredSize(new Dimension(260, 20));
        rbt_transferir.setPreferredSize(new Dimension(140, 20));
        rbt_salir.setPreferredSize(new Dimension(50, 20));
        lbl_numerocuentaactual.setText(text);
        pack();
        setLocationRelativeTo(null);
        setResizable(false);

        rbt_consultarsaldo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (rbt_consultarsaldo.isSelected()) {
                    String Saldo = cuentasRecibidas[cuentaseleccionadaRecibida][1];
                    JOptionPane.showMessageDialog(null, "El saldo actual de la cuenta es [$" + Saldo + "]", "SALDO", JOptionPane.INFORMATION_MESSAGE);
                    rbt_consultarsaldo.setSelected(false);
                }

            }
        });


        rbt_retiro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (rbt_retiro.isSelected()) {
                    String cantidadstring = JOptionPane.showInputDialog(null,"Ingrese la cantidad a retirar:");

                    if(cantidadstring != null){

                        try{
                            String Saldo = cuentasRecibidas[cuentaseleccionadaRecibida][1];
                            double saldoint = Double.parseDouble(Saldo);

                            double cantidad = Double.parseDouble(cantidadstring);
                            double temp;
                            if(cantidad<=saldoint){
                                temp = saldoint-cantidad;
                                cuentasRecibidas[cuentaseleccionadaRecibida][1]= String.valueOf(temp);
                                JOptionPane.showMessageDialog(null,"Se han retirado [$"+cantidad+"] su saldo actual es [$"+temp+"]",
                                        "RETIRO EXITOSO", JOptionPane.INFORMATION_MESSAGE);
                                rbt_retiro.setSelected(false);
                            }else {
                                JOptionPane.showMessageDialog(null,"Fondos insuficientes","ADVERTENCIA",JOptionPane.WARNING_MESSAGE);
                                rbt_retiro.setSelected(false);
                            }

                        }catch (NumberFormatException exception){
                            JOptionPane.showMessageDialog(null, "El campo no es valido", "ERROR", JOptionPane.ERROR_MESSAGE);
                            rbt_retiro.setSelected(false);
                        }
                    }
                }

            }
        });

        rbt_consignar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(rbt_consignar.isSelected()){
                 String cantidad = JOptionPane.showInputDialog(null,"Ingrese la cantidad a consignar:");

                 if(cantidad != null){
                     try{

                         String saldo = cuentasRecibidas[cuentaseleccionadaRecibida][1];
                         double saldodouble = Double.parseDouble(saldo);


                         double cantidaddouble = Double.parseDouble(cantidad);
                         if(cantidaddouble<=saldodouble){
                             double tempsaldofinal = saldodouble+cantidaddouble;
                             cuentasRecibidas[cuentaseleccionadaRecibida][1]= String.valueOf(tempsaldofinal);
                             JOptionPane.showMessageDialog(null,"Se han consignado [$"+cantidaddouble+"] su saldo actual es [$"+tempsaldofinal);
                            rbt_consignar.setSelected(false);
                         }else {
                             JOptionPane.showMessageDialog(null,"Fondos insuficientes","ERROR",JOptionPane.ERROR_MESSAGE);
                             rbt_consignar.setSelected(false);
                         }

                     }catch (NumberFormatException exception){
                         JOptionPane.showMessageDialog(null,"Los datos ingresados no son validos","ERROR",JOptionPane.ERROR_MESSAGE);
                        rbt_consignar.setSelected(false);
                     }
                 }else{
                     JOptionPane.showMessageDialog(null,"El campo esta vacio","ADVERTENCIA",JOptionPane.WARNING_MESSAGE);
                 }
                }
            }
        });

        
        rbt_transferir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (rbt_transferir.isSelected()) {

                    String cuentadestinada = JOptionPane.showInputDialog(null, "Ingrese la cuenta a transferir");
                    String cantidadatrasferir = JOptionPane.showInputDialog(null, "Ingrese la cantidad a transferir");

                    if (cuentadestinada != null && cantidadatrasferir != null && !cuentadestinada.isEmpty() && !cantidadatrasferir.isEmpty()) {
                        try {

                            int cuentadestinoint = Integer.parseInt(cuentadestinada);
                            double cantidadatransferirint = Double.parseDouble(cantidadatrasferir);

                            boolean cuenta_encontrada = false;

                            for (int i = 0; i < cuentasRecibidas.length; i++) {
                                if (cuentasRecibidas[i][0].equals(cuentadestinada)) {
                                    cuenta_encontrada = true;

                                    double saldoInicial = Double.parseDouble(cuentasRecibidas[cuentaseleccionadaRecibida][1]);
                                    double saldoFinal = Double.parseDouble(cuentasRecibidas[i][1]);

                                    if (cantidadatransferirint <= saldoInicial) {
                                        saldoInicial -= cantidadatransferirint;
                                        saldoFinal += cantidadatransferirint;

                                        cuentasRecibidas[cuentaseleccionadaRecibida][1] = String.valueOf(saldoInicial);
                                        cuentasRecibidas[i][1] = String.valueOf(saldoFinal);

                                        JOptionPane.showMessageDialog(null, "Se han transferido [$" + cantidadatransferirint + "]" +
                                                " a la cuenta [" + cuentadestinoint + "]" +
                                                ". El saldo actual es [$" + saldoFinal + "]", "TRANSFERENCIA EXITOSA", JOptionPane.INFORMATION_MESSAGE);
                                    } else {
                                        JOptionPane.showMessageDialog(null, "Saldo insuficiente para la transferencia.", "ERROR", JOptionPane.ERROR_MESSAGE);
                                    }
                                    break;
                                }
                            }

                            if (!cuenta_encontrada) {
                                JOptionPane.showMessageDialog(null, "La cuenta destino no existe.", "ERROR", JOptionPane.ERROR_MESSAGE);
                            }

                        } catch (NumberFormatException exception) {
                            JOptionPane.showMessageDialog(null, "Ingrese valores válidos.", "ERROR", JOptionPane.ERROR_MESSAGE);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Por favor, complete ambos campos.", "ERROR", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        });
        rbt_salir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (rbt_salir.isSelected()) {
                    JOptionPane.showMessageDialog(null,"¿Esta seguro que desea salir del programa?",
                            "ADVERTENCIA",JOptionPane.WARNING_MESSAGE);
                    dispose();
                }
            }
        });
    }
}


