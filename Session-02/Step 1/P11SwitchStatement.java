//project 11

import javax.swing.JOptionPane;

public class P11SwitchStatement { 
    public static void main (String[] args) {
        String Today = JOptionPane.showInputDialog("What is today");
        
        switch (Today) {
            case "sunday":
                JOptionPane.showMessageDialog(null,"it is the first day of the week");
                break;

            case "monday":
                JOptionPane.showMessageDialog(null,"it is the second day of the week");
                break;

            case "tuesday":
                JOptionPane.showMessageDialog(null,"it is the third day of the week");                
                break;

            case "wednesday":
                JOptionPane.showMessageDialog(null,"it is the fourth day of the week");  
                break;

            case "thursday":
                JOptionPane.showMessageDialog(null,"it is the fifth day of the week");
                break;

            case "friday":
                JOptionPane.showMessageDialog(null,"it is the sixeth day of the week");
                break;

            case "saturday":
                JOptionPane.showMessageDialog(null,"it is the seventh day of the week");
                break;
        
            default:
                JOptionPane.showMessageDialog(null,"your input wasn't a day");
                break;
        }
    }    
}
