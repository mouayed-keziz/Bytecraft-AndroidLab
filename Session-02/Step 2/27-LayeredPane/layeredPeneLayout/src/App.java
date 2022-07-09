import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

public class App {
    public static void main(String[] args) throws Exception {
        
        JLabel label1 = new JLabel();
        label1.setOpaque(true);
        label1.setBackground(Color.red);
        label1.setBounds(50, 50, 200, 200);

        JLabel label2 = new JLabel();
        label2.setOpaque(true);
        label2.setBackground(Color.green);
        label2.setBounds(100, 100, 200, 200);

        JLabel label3 = new JLabel();
        label3.setOpaque(true);
        label3.setBackground(Color.blue);
        label3.setBounds(150, 150, 200, 200);

        JLayeredPane layeredpane = new JLayeredPane();
        layeredpane.setBounds(0, 0, 500, 400);
        layeredpane.add(label1, JLayeredPane.DEFAULT_LAYER);
        layeredpane.add(label2, JLayeredPane.DEFAULT_LAYER);
        layeredpane.add(label3, JLayeredPane.DRAG_LAYER);

        //layeredpane.add(label1, Integer.valueOf(0));
        
        JFrame frame = new JFrame("hello world");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
        frame.setSize(500,400);
        frame.setLayout(null);

        frame.add(layeredpane);

        frame.setVisible(true);


    }
}
