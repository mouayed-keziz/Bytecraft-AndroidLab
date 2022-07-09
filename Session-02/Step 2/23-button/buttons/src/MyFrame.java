import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class MyFrame extends JFrame {
    
    JButton button;
    JLabel label;

    MyFrame() {
        ImageIcon icon = new ImageIcon("Capture d’écran 2021-07-20 141306.png");
        
        label = new JLabel();
        label.setIcon(icon);
        label.setBounds(150, 250, 500, 190);
        label.setVisible(false);        

        button = new JButton();
        button.setBounds(100, 50, 500, 200);
        button.setText("press me");
        button.setFocusable(false);
        button.setIcon(icon);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Comic Sans", Font.BOLD, 25));
        button.setForeground(Color.black);
        button.setBackground(Color.lightGray);
        button.setBorder(BorderFactory.createEtchedBorder());
        //button.setEnabled(true);
        button.addActionListener(e -> pressAction());

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(800,300);
        this.setVisible(true);
        this.add(button);
        this.add(label);
    }

    private void pressAction() {
        System.out.println("button pressed");
        button.setEnabled(false);
        label.setVisible(true);
    }
}
