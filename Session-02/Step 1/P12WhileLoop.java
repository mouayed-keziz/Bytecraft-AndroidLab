//project 12

import javax.swing.JOptionPane;

public class P12WhileLoop {
    public static void main (String[] args) {

        
        String input = "Hello World";
        while (!(input.charAt(0) == 'q'  || input.charAt(0) == 'Q')) {
            input = JOptionPane.showInputDialog("'q' or 'Q' to quit");
        }
    }

}


