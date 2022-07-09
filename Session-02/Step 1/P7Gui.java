//project 7

import javax.swing.JOptionPane;

public class P7Gui {
    public static void main (String[] args) {
        String name = JOptionPane.showInputDialog("what is your name");
        
        String TMP = JOptionPane.showInputDialog("How old are you");
        int age = Integer.parseInt(TMP);

        age = Integer.parseInt(JOptionPane.showInputDialog("How old are you"));
        
        JOptionPane.showMessageDialog(null,"your name is "+name);
        JOptionPane.showMessageDialog(null,"you was born in "+(2021-age));
        JOptionPane.showConfirmDialog(null, "did dou like this gui", "confirmation box", 0);
    }
    
}


//Gui : graphical user interface