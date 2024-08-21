package utilidades;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;

public class ingresoDatos extends JFrame {

    private JPanel Ingresopnl;
    private JLabel img;
    private JTextField nombrefield;
    private JLabel nombre;
    private JLabel apellido;
    private JTextField apellidofield;
    private JComboBox combosexo;
    private JButton saludarButton;
    private JTextField DDMMAATextField;

    public ingresoDatos(String title) {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(Ingresopnl);
        this.setSize(600,500);
        this.setLocationRelativeTo(null);
        combosexo.addItem("Masculino");
        combosexo.addItem("Femenino");
       

        saludarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre = nombrefield.getText();
                String apellido = apellidofield.getText();
                String sexo = (String) combosexo.getSelectedItem();
                String fechanacimientoCD = DDMMAATextField.getText();

              
    }

        public static void main (String[]args){
            JFrame frame = new ingresoDatos("Ingreso datos");
            frame.setVisible(true);

    }
}



