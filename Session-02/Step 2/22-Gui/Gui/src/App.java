import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.Border;




public class App {
    public static void main(String[] args) throws Exception {
        int input = JOptionPane.showConfirmDialog(null, "1 : frame/label : yes\n2 : frame/panel : no");
        if (input == 0) {
        
        ImageIcon icon = new ImageIcon("logo.jpg");                             //for icon and label
        Border border = BorderFactory.createLineBorder(Color.white, 3);         //boeder for the label

        JLabel label = new JLabel();                                            //create the label
        label.setBackground(Color.black);                                       //set background of the label to (black)
        
        label.setIcon(icon);                                                    //set icon of the label to (icon)
        label.setHorizontalAlignment(JLabel.CENTER);                            //canter the label horizentally
        label.setVerticalAlignment(JLabel.CENTER);                              //center the label vertically
//      label.setBounds(0,0,500,330);                                           //set x,y (position) and size width,height (size)

        label.setText("Keziz Mouayed");                                         //add text to the label
        label.setForeground(Color.white);
        label.setFont(new Font("MV Boli", Font.PLAIN, 45));                     //change the font (name , style , size)
        label.setHorizontalTextPosition(JLabel.CENTER);                         //center the text horizentally
        label.setVerticalTextPosition(JLabel.TOP);                              //center the text vertically
        label.setIconTextGap(-100);                                             //distance between the txt and icon ("+":farther    "-":closer)

        label.setBorder(border);                                                //add the border created (border) to the label

        JFrame frame = new JFrame();                                            //creat new frame
        frame.setTitle("GUI Project pre alpha 1.0.0");                          // name the frame
        frame.setSize(800, 600);                                                //set the size of the frame
        frame.setResizable(true);                                               //set the ability of the user to change size to true
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);                   //end the programme when the window is closed
        frame.add(label);                                                       //add the label created (label) to the frame
        frame.getContentPane().setBackground(Color.black);                      //set the color of the background of the contentpane of the frame to (black)
        frame.setVisible(true);                                                 //the frame is visible to the user
        frame.setIconImage(icon.getImage());                                    //set the icon of the frame to (icon.getImage())
        
        }


//-------------------------------------------------------------------------------------------

        else if (input == 1) {
        
        ImageIcon icon = new ImageIcon("test doesnt exist");

        JLabel redLabel = new JLabel();                                         //create label for the red panel
        redLabel.setText("RED LABEL");                                          //add text to the label created
        redLabel.setForeground(Color.white);                                    //set font color of the text in the label to white
        redLabel.setFont(new Font("MV Boli", Font.PLAIN, 10));                  //change font of the text in  the label
        redLabel.setIcon(icon);                                                 //add icon to the label
        redLabel.setVerticalAlignment(JLabel.BOTTOM);                           //put the label in the buttom of the panel
        redLabel.setHorizontalAlignment(JLabel.LEFT);                           //put the label in the left off the panel
//      redLabel.setBounds(0, 0, 75, 75);                                       //set position and size of the label manually

        JPanel bluePanel = new JPanel();                                        //create panel
        bluePanel.setBackground(Color.blue);                                    //set backround color for the panel
        bluePanel.setBounds(100, 350, 250, 250);                                //set position and size of the panel manually

        JPanel redPanel = new JPanel();                                         //create panel
        redPanel.setBackground(Color.red);                                      //set backgroundd color for the panel
        redPanel.setBounds(100, 100, 250, 250);                                 //set position and size of the panel manually
        redPanel.setLayout(null);                                               //dont use a layout manager (set it to default)
        redPanel.add(redLabel);                                                 //add the label created to this panel

        JPanel yellowPanel = new JPanel();                                      //create panel
        yellowPanel.setBackground(Color.yellow);                                //set background color for the panel
        yellowPanel.setBounds(350, 350, 250, 250);                              //set position and size of the panel manually 

        JPanel greenPanel = new JPanel();                                       //create panem
        greenPanel.setBackground(Color.green);                                  //set background color for the panel
        greenPanel.setBounds(350, 100, 250, 250);                               //set posiiton and size of the panel manually
        
        JFrame frame = new JFrame("GUI panels");                                //create the frame and name it
        frame.setResizable(true);                                               //set the ability of the user to resize the frame to true
        frame.setSize(720,720);                                                 //change the size of the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);                   //exit the programe when the frame is closed
        frame.setLayout(null);                                                  //dont use a layout manager (set it to default)
        frame.setVisible(true);                                                 //the frame is visible for the user

        frame.add(bluePanel);                                                   //add first panel to the frame
        frame.add(yellowPanel);                                                 //add second panel to the frame
        frame.add(redPanel);                                                    //add third panel to the frame
        frame.add(greenPanel);                                                  //add fourth panel to the frame
        
        }
        else {
            JOptionPane.showMessageDialog(null, "ok see you");
        }
    }
}


