import javax.swing.*;
//import java.awt.*;



public class myFrame extends JFrame {
    
    myPanel panel;

    myFrame() {

        panel = new myPanel();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setAlwaysOnTop(true);
        

        this.add(panel);
        this.pack();
        this.setVisible(true);
    }

    
}
