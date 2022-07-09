import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class myFrame extends JFrame implements KeyListener {
    
    JLabel label;

    myFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(null);
        this.setResizable(false);

        this.addKeyListener(this);
        
        label = new JLabel();
        label.setBounds(0, 0, 100, 100);
        label.setBackground(Color.red);
        label.setOpaque(true);

        this.add(label);
        this.setVisible(true);
    }








    @Override
    public void keyTyped(KeyEvent e) {
        
        switch(e.getKeyChar()) {
            case 'q' : label.setLocation(label.getX()-10, label.getY());
                break;
            case 'd' : label.setLocation(label.getX()+10, label.getY());
                break;
            case 's' : label.setLocation(label.getX(), label.getY()+10);
                break;
            case 'z' : label.setLocation(label.getX(), label.getY()-10);
                break;
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        
        switch(e.getKeyCode()) {
            case 37 : label.setLocation(label.getX()-10, label.getY());
                break;
            case 39 : label.setLocation(label.getX()+10, label.getY());
                break;
            case 40 : label.setLocation(label.getX(), label.getY()+10);
                break;
            case 38 : label.setLocation(label.getX(), label.getY()-10);
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        
        //System.out.print(e.getKeyChar());
        //System.out.println("you released key char : "+e.getKeyChar());
        System.out.println("you released key code : "+e.getKeyCode());
    }
}
