package empresa;
import java.util.Scanner;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Empresa extends JFrame {
    private JComboBox<String> comboBoxEmpleados;
    private JTextArea textAreaInfo;

    // Instancias de empleados
    private Empleado empleado1 = new Empleado("Juan Perez", 30000);
    private Gerente gerente1 = new Gerente("Ana Martinez", 50000, 15000);
    private Desarrollador desarrollador1 = new Desarrollador("Carlos Gomez", 40000, 10);
    private Vendedor vendedor1 = new Vendedor("Laura Torres", 25000, 5000);

    public Empresa() {
        // Configuración básica de la ventana
        setTitle("Gestión de Empleados");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Crear componentes
        JLabel labelSeleccion = new JLabel("Seleccione un empleado:");
        comboBoxEmpleados = new JComboBox<>(new String[] {"Juan Perez", "Ana Martinez", "Carlos Gomez", "Laura Torres"});
        textAreaInfo = new JTextArea(10, 40);
        textAreaInfo.setEditable(false); // Para que el área de texto sea solo de lectura
        JButton buttonMostrar = new JButton("Mostrar Información");

        // Añadir un ActionListener al botón
        buttonMostrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarInfoEmpleado();
            }
        });

        // Configurar diseño de la interfaz gráfica
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.add(labelSeleccion, BorderLayout.NORTH);
        panel.add(comboBoxEmpleados, BorderLayout.CENTER);
        panel.add(buttonMostrar, BorderLayout.SOUTH);

        // Añadir componentes al JFrame
        add(panel, BorderLayout.NORTH);
        add(new JScrollPane(textAreaInfo), BorderLayout.CENTER);
    }

    private void mostrarInfoEmpleado() {
        String seleccion = (String) comboBoxEmpleados.getSelectedItem();
        textAreaInfo.setText(""); // Limpiar el área de texto

        // Mostrar la información del empleado seleccionado
        if (seleccion.equals("Juan Perez")) {
            empleado1.mostrarInfo(textAreaInfo);
        } else if (seleccion.equals("Ana Martinez")) {
            gerente1.mostrarInfo(textAreaInfo);
        } else if (seleccion.equals("Carlos Gomez")) {
            desarrollador1.mostrarInfo(textAreaInfo);
        } else if (seleccion.equals("Laura Torres")) {
            vendedor1.mostrarInfo(textAreaInfo);
        }

        // Mostrar un JOptionPane con la información del empleado
        JOptionPane.showMessageDialog(this, textAreaInfo.getText(), "Información del Empleado", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Empresa().setVisible(true);
            }
        });
    }
}