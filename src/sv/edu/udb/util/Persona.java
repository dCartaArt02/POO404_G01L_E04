package sv.edu.udb.util;

import sv.edu.udb.datos.PersonaDatos;
import  sv.edu.udb.beans.PersonaBeans;
import sv.edu.udb.datos.OcupacionesDatos;

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
    private JTextField FechaField;
    private JComboBox cmbOcupacion;
    private JButton eliminarButton;
    DefaultTableModel modelo=null;
    PersonaBeans personaBeans = null;
    PersonaDatos personaDatos = new PersonaDatos();
    OcupacionesDatos OcupacionesDatos = new OcupacionesDatos();

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
    modelo=personaDatos.selectPersona();
    tbldatos.setModel(modelo);
    cmbOcupacion.setModel(OcupacionesDatos.selectOcupaciones());
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
    eliminarButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            btnEliminarDatos();
        }
    });
}
public void btnEliminarDatos()
{
    personaDatos.delete(Integer.parseInt(txtid.getText()));
    btnlimpiar();
    modelo = personaDatos.selectPersona();
    tbldatos.setModel(modelo);
}
private void btnlimpiar()
    {
        txtid.setText("");
        txtnombre.setText("");
        txtedad.setText("");
        txtTelefono.setText("");
        cmbsexo.setSelectedIndex(0);
        cmbOcupacion.setSelectedIndex(0);
        FechaField.setText("");
        obtenerDatosButton.setText("Guardar");
    }
private void   btnObtenerDatos()
    {
       int id;
        String nombres;
        int edad;
        String telefono;
        String Sexo;
        int iDOcupacion;
        String fechaNacimiento;
        if (txtid.getText().isEmpty())
        {
            id = 0;
        }else
        {
            id = Integer.parseInt(txtid.getText());
        }
        nombres = txtnombre.getText();
        edad = Integer.parseInt(txtedad.getText());
        telefono = txtTelefono.getText();
        Sexo = cmbsexo.getSelectedItem().toString();
        iDOcupacion = OcupacionesDatos.getIdOcupacion(cmbOcupacion.getSelectedItem().toString());
        fechaNacimiento = FechaField.getText();
        personaBeans = new PersonaBeans(id,nombres,edad,telefono,Sexo,iDOcupacion,fechaNacimiento);
        if (obtenerDatosButton.getText().equals("Guardar"))
        {
            personaDatos.insert(personaBeans);
        } else if (obtenerDatosButton.getText().equals("editar")) {
            personaDatos.update(personaBeans);
        }
        modelo=personaDatos.selectPersona();
        tbldatos.setModel(modelo);
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
            cmbOcupacion.setSelectedItem(modelo.getValueAt(fila,5).toString());
            FechaField.setText(modelo.getValueAt(fila,6).toString());
            obtenerDatosButton.setText("Editar");
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
