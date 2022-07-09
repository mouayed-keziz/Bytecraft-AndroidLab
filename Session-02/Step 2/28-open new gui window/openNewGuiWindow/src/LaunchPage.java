import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.*;

public class LaunchPage implements ActionListener{
    
    JFrame frame = new JFrame();
    JButton mybutton = new JButton("new window");
    

    LaunchPage() {

        mybutton.setBounds(100, 150, 100, 50);
        mybutton.setFocusable(false);
        mybutton.addActionListener(this);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.add(mybutton);

        frame.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == mybutton) {

            frame.dispose();
            newWindow mywindow = new newWindow();
        }
    }
}
