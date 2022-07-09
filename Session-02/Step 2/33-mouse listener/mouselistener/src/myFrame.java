import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class myFrame extends JFrame implements MouseListener {

    JLabel label;
    
    myFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800,800);
        this.setLayout(null);

        label = new JLabel();
        label.setBounds(0,0,100,100);
        label.setBackground(Color.red);
        label.setOpaque(true);
        
        label.addMouseListener(this);

        this.add(label);
        this.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        
        System.out.println("you clicked");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
        System.out.println("you pressed");
        label.setBackground(Color.green);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
        System.out.println("you released");
        label.setBackground(Color.yellow);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
        System.out.println("mouse entered");
        label.setBackground(Color.blue);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
        System.out.println("mouse exited");
        label.setBackground(Color.red);
    }
}
