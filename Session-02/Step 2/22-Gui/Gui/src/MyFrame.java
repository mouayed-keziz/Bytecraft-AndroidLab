import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
    
        MyFrame(){
            this.setSize(420, 420);//sets x and y diensions of our frame
            this.setTitle("JFrame title goes here");
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//exit out of application
            //by default its (JFrame.HIDE_ON_CLOSE)
            //(JFrame.DO_NOTHING_ON_CLOSE) cant exit the frame
            this.setResizable(false);//prevent frame from being resized       
            this.setVisible(true);//make frame visible

            ImageIcon image = new ImageIcon("logo.jpg");
            this.setIconImage(image.getImage()); 
            this.getContentPane().setBackground(new Color(123,50,250));//change the background to green
            //color.black    new Color(123,50,250)    new Color(0xFFFFFF)

            //MyFrame frame = new MyFrame();//if we want to make changes in the class
            //new MyFrame();//if we dont want to make changes in the class
        }
}
