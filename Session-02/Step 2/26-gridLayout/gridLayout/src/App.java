import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.GridLayout;
public class App {
    public static void main(String[] args) throws Exception {
        
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,350);
        frame.setResizable(true);
        frame.setLayout(new GridLayout(3, 3, 10, 10));

        frame.add(new JButton("button \"1\""));
        frame.add(new JButton("button \"2\""));
        frame.add(new JButton("button \"3\""));
        frame.add(new JButton("button \"4\""));
        frame.add(new JButton("button \"5\""));
        frame.add(new JButton("button \"6\""));
        frame.add(new JButton("button \"7\""));
        frame.add(new JButton("button \"8\""));
        frame.add(new JButton("button \"9\""));
        frame.add(new JButton("button \"10\""));



        frame.setVisible(true);
    }
}
