package sv.edu.udb.form;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
                

            }
        });


        rbt_consignar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });


        rbt_transferir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


            }
        });



    }
}


