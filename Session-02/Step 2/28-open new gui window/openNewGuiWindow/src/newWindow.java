import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class newWindow {
    
    JFrame frame = new JFrame();
    JLabel label = new JLabel("hello this is a new window");

    newWindow() {

        label.setBounds(0,0,500,200);
        label.setFont(new Font(null, Font.PLAIN, 40));
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(1000,800);
        frame.setLayout(null);
        frame.add(label);

        frame.setVisible(true);
    }
}
