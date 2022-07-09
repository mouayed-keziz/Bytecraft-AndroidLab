import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

public class myFrame extends JFrame implements ActionListener{

    JButton button;
    JLabel label;
    
    myFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        //this.setResizable(true);

        button = new JButton("Pick a Color");
        button.addActionListener(this);

        label = new JLabel();
        label.setBackground(Color.white);
        label.setText("keziz mouayed");
        label.setFont(new Font("MV Boli", Font.PLAIN, 80));
        label.setOpaque(true);

        this.add(button);
        this.add(label);
        this.pack();
        this.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == button) {
            JColorChooser colorChooser = new JColorChooser();
            Color color = JColorChooser.showDialog(null, "pick a color if you want", Color.black);
            //label.setForeground(color);   
            label.setBackground(color);     
        }
    }
    
}
