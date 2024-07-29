import javax.swing.*;

public class Main extends JFrame
{
    public Main()
    {
        JLabel hola = new JLabel("Hola");
        add(hola);
        this.setSize(200,300);
        this.setTitle("JFRAME");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    public static void main(String[] args)
    {
        new Main();



    }
}