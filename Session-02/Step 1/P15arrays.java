//project 15

import javax.swing.JOptionPane;

public class P15arrays {
    public static void main (String[] args) {
        //int[] H = {3,2,1,45,10,18,-2,15,-67,11,33};
        int N = Integer.parseInt(JOptionPane.showInputDialog("number of elements ?"));
        int[] T = new int[N];
        for (int i = 0; i < N; i++) {
            T[i] = Integer.parseInt(JOptionPane.showInputDialog("element numbre "));  
            System.out.println(i+"  "+T[i]);     
        }
        int max = T[0]; 
        int min = T[0];
        for (int i = 0; i < T.length; i++) {
            if (max < T[i]) max = T[i];
            if (min > T[i]) min = T[i];
        }

        JOptionPane.showMessageDialog(null, "max = "+max+"\nmin = "+ min);
    }
}
// max of array
