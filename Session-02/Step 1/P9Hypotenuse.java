//project 9

import javax.swing.JOptionPane;
 
public class P9Hypotenuse {
    public static void main (String[] args) {

        double a,b;          
        a = Integer.parseInt(JOptionPane.showInputDialog("entrez a"));
        b = Integer.parseInt(JOptionPane.showInputDialog("entrez b"));        
        JOptionPane.showMessageDialog(null,"hypotenuse = "+Math.sqrt(a*a+b*b));        

    }
    
}
