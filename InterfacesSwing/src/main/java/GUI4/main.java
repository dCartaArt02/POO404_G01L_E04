package GUI4;
import javax.swing.*;

public class main extends JFrame{

    /**creates a new instance of main*/
     public main() {
         JLabel lblHolga=new JLabel("hola");
         add(lblHolga);
         this.setSize( 200, 200);
         this.setTitle("JFrame");
         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         this.setVisible(true);
     }


    public static void main(String[] args) {
        System.out.println("Hola");
    }

}
