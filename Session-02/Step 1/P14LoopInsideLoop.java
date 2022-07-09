//project 14

import javax.swing.JOptionPane;

public class P14LoopInsideLoop {
    public static void main (String[] args) {
        int columns;
        int lines;
        char symbole;
        columns = Integer.parseInt(JOptionPane.showInputDialog("number of columns ?"));
        lines = Integer.parseInt(JOptionPane.showInputDialog("number of lines ?"));
        symbole = (JOptionPane.showInputDialog("symbol ?")).charAt(0);
        for (int i = 0 ; i < lines ; i++) {
            for (int j = 0 ; j < columns ; j++) {
                System.out.print(symbole);
            }
            System.out.printf("\n");
        }
    }
    
}
