package sv.edu.udb.form;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame {
    private String[][] cuentas = {
            { "1", "400" },
            { "2", "200" },
            { "4", "500" }
    };
    private int Cuentaseleccionada = -1;

    private JLabel lbl_img;
    private JLabel lbl_mensaje;
    private JTextField txt_numerocuenta;
    private JPanel Main_panel;
    private JButton btn_aceptar;
    private JButton btn_cancelar;

    public Login(String title) {
        super(title);
        setContentPane(Main_panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setPreferredSize(new Dimension(500,200));
        this.setLocationRelativeTo(getParent());

        btn_aceptar.setPreferredSize(new Dimension(175,40));
        btn_cancelar.setPreferredSize(new Dimension(120,40));

        pack();
        setLocationRelativeTo(null);
        setResizable(false);

        btn_aceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Numerocuenta = txt_numerocuenta.getText();
                boolean Cuentahallada = false;

                try {

                    int NumeroCuenta = Integer.parseInt(Numerocuenta);


                    for (int i = 0; i < cuentas.length; i++) {

                        if (cuentas[i][0] != null && Integer.parseInt(cuentas[i][0]) == NumeroCuenta) {
                            Cuentaseleccionada = i;
                            Cuentahallada = true;
                            JOptionPane.showMessageDialog(null,"Registro exitoso, bienvenido","SUCCESS",JOptionPane.INFORMATION_MESSAGE);

                            Opciones frameopciones = new Opciones(Numerocuenta,cuentas,Cuentaseleccionada);
                            frameopciones.setVisible(true);

                            dispose();
                            break;
                        }
                    }
                    if (!Cuentahallada) {
                        JOptionPane.showMessageDialog(null, "La cuenta no existe", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (NumberFormatException exception) {

                    JOptionPane.showMessageDialog(null, "Ingrese valores válidos", "Error", JOptionPane.ERROR_MESSAGE);
                }

            }
        });
        btn_cancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txt_numerocuenta.setText("");
            }
        });
    }
    public static void main(String[] args) {
        JFrame frame = new Login("ingreso a cuenta bancaria");
        frame.setVisible(true);
    }
}
