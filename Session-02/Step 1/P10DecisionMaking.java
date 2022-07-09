//project 10

import javax.swing.JOptionPane;

public class P10DecisionMaking {
    public static void main (String[] args) {

        int age = Integer.parseInt(JOptionPane.showInputDialog("How old are you ?"));
        JOptionPane.showMessageDialog(null,"you was born is "+(2022-age));
        if (age == 75) {
            JOptionPane.showMessageDialog(null,"so old");
        }
        else if (age >= 18) {
            JOptionPane.showMessageDialog(null,"adult");
        }
        else if (age <= 13) {
            JOptionPane.showMessageDialog(null,"young");
        }
        else {
            JOptionPane.showMessageDialog(null,"teenager");
        }
    }
}
