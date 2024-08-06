package sv.edu.udb.util;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;

public class Persona extends JFrame{
    private JPanel panel1;
    private JTextField txtid;
    private JTextField txtnombre;
    private JTextField txtedad;
    private JTextField txtTelefono;
    private JComboBox cmbsexo;
    private JButton limpiarButton;
    private JButton obtenerDatosButton;
    private JTable tbldatos;
    DefaultTableModel modelo=null;

    public Persona(String title)
{
    super   (title);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setContentPane(panel1);
    this.setMinimumSize(new Dimension (600,500));
    this.setLocationRelativeTo(getParent());
    Object [][] data = null;
    String[] colums =
    {
        "id", "Nombres", "Edad","Telefono","Sexo"
    };
    modelo = new DefaultTableModel(data,colums);
    tbldatos.setModel(modelo);

    obtenerDatosButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            btnObtenerDatos();

        }
    });
    limpiarButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            btnlimpiar();
        }
    });
    tbldatos.addComponentListener(new ComponentAdapter() {
    });
    tbldatos.addComponentListener(new ComponentAdapter() {
    });
    tbldatos.addContainerListener(new ContainerAdapter() {
    });
}
private void btnlimpiar()
    {
        txtid.setText("");
        txtnombre.setText("");
        txtedad.setText("");
        txtTelefono.setText("");
        cmbsexo.setSelectedIndex(0);
    }
private void   btnObtenerDatos()
    {
        String id;
        String nombres;
        String edad;
        String telefono;
        String Sexo;

        id = txtid.getText();
        nombres = txtnombre.getText();
        edad = txtedad.getText();
        telefono = txtTelefono.getText();
        Sexo = cmbsexo.getActionCommand();

        JOptionPane.showMessageDialog(null,"Datos Obtenidos: \n ID " +id+ "\n nombres: " +nombres+ "\n Edad: " +edad+ " \n Telefono: "+telefono+ "\n Sexo " +Sexo);
        Object[] newRow =
                {
                        id, nombres, edad, telefono, Sexo
                };
        modelo.addRow(newRow);
        tbldatos.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
            }
        });
    }

    private void  tblObtenerDatos(MouseEvent e)
    {
        int fila = tbldatos.rowAtPoint(e.getPoint());
        int columa = tbldatos.columnAtPoint(e.getPoint());
        if ((fila > -1) && (columa > -1))
        {
            txtid.setText(modelo.getValueAt(fila,0).toString());
            txtnombre.setText(modelo.getValueAt(fila,1).toString());
            txtedad.setText(modelo.getValueAt(fila,2).toString());
            txtTelefono.setText(modelo.getValueAt(fila, 3).toString());
            cmbsexo.setSelectedItem(modelo.getValueAt(fila,4).toString());
        }
    }

public static void main(String[]args)
{
    JFrame frame = new Persona("Ingreso de datos");
    frame.setVisible(true);
}
    private void createUIComponents() {

    }

}
