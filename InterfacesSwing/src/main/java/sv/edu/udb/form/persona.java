package sv.edu.udb.form;
import javax.swing.*;
import java.awt.*;
public class persona extends JFrame{
    private JTextField txtId;
    private JTextField txtNombre;
    private JTextField textField3;
    private JTextField textField4;
    private JComboBox comboBox1;
    private JButton obtenerDatosButton;
    private JButton limpiarButton;
    private JLabel lblNombre; 
    private JLabel lblId; private
    JPanel pnlPersona;

    /* * * Constructor con Pametro para inicializar el JFrame creado */

    public persona(String title) { super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(pnlPersona);
        this.setMinimumSize(new Dimension(600, 500));
        this.setLocationRelativeTo(getParent()); }

    public static void main(String[] args) {
        JFrame frame = new persona("Ingreso de Datos"); frame.setVisible(true); }

}
