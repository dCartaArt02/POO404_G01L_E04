package sv.edu.udb;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Persona extends JFrame {
    private JLabel lblId;
    private JLabel lblNombre;
    private JLabel lblEdad;
    private JLabel lblTelefono;
    private JLabel lblSexo;
    private JTextField txtId;
    private JTextField txtNombre;
    private JTextField txtEdad;
    private JTextField txtTelefono;
    private JComboBox comboBox1;
    private JButton btnObtenerDatos;
    private JButton btnLimpiar;
    private JPanel pnlPersona;
    private JScrollPane jscroll;
    private JTable tblDatos;
    DefaultTableModel modelo = null;

    public Persona(String title) {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(pnlPersona);
        this.setMinimumSize(new Dimension(600,350));
        this.setLocationRelativeTo(getParent());

        Object [][] data = null;
        String []colums = {
                "Id", "Nombre", "Edad", "Telefono", "Sexo"
        };

        modelo = new DefaultTableModel(data, colums);
        tblDatos.setModel(modelo);

        btnObtenerDatos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnObtenerDatos();
            }
        });
        btnLimpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnLimpiar();
            }
        });
    }
    private void btnLimpiar() {
        txtId.setText("");
        txtNombre.setText("");
        txtTelefono.setText("");
        txtEdad.setText("");
        comboBox1.setSelectedIndex(0);
    }

    private void btnObtenerDatos() {
        String id;
        String nombre;
        String edad;
        String telefono;
        String sexo;

        id = txtId.getText();
        nombre = txtNombre.getText();
        edad = txtEdad.getText();
        telefono = txtTelefono.getText();
        sexo = comboBox1.getSelectedItem().toString();

        JOptionPane.showMessageDialog(null, "Datos del persona: \n ID:" +id+
                "\n nombres: "+nombre+" \n Edad:"+edad+"\n Telefono: "+telefono+
                "\n Sexo: "+sexo);

        Object [] newRow = {id,nombre,edad,telefono,sexo};
        modelo.addRow(newRow);
    }
    public static void main(String[] args) {
        JFrame frame = new Persona("Ingreso de Datos");
        frame.setVisible(true);
    }
}
