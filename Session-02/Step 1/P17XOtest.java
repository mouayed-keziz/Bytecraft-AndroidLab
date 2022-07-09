//project 17

//import java.util.Random;
import javax.swing.JOptionPane;

public class P17XOtest {
    public static void main (String[] args) {
        String matrixString = " 7   8   9 \n 4   5   6 \n 1   2   3";
        char X = 'x';char O = 'o';       
        int PlayerInput ;
          
        for (int i = 0 ; i < 4 ; i++) {
            do {
                PlayerInput = Integer.parseInt(JOptionPane.showInputDialog(matrixString));
            } while (PlayerInput < 1 || PlayerInput > 9);
            matrixString = matrixString.replace(Integer.toString(PlayerInput).charAt(0),X);
            do {
                PlayerInput = Integer.parseInt(JOptionPane.showInputDialog(matrixString));
            } while (PlayerInput < 1 || PlayerInput > 9);
            matrixString = matrixString.replace(Integer.toString(PlayerInput).charAt(0),O);
        }
        
        for (int i = 0 ; i < 9 ; i++) if (matrixString.charAt((4*i)+1) != X && matrixString.charAt((4*i)+1) != O) matrixString = matrixString.replace(matrixString.charAt((4*i)+1), X);            
        String winner = "nobody wins"; //1-X    2-O   3-nobody
        
        if (matrixString.charAt( 1) == X && matrixString.charAt( 5) == X && matrixString.charAt( 8) == X) winner = "winner is X";
        if (matrixString.charAt(13) == X && matrixString.charAt(17) == X && matrixString.charAt(21) == X) winner = "winner is X";
        if (matrixString.charAt(25) == X && matrixString.charAt(29) == X && matrixString.charAt(33) == X) winner = "winner is X";
        if (matrixString.charAt( 1) == X && matrixString.charAt(13) == X && matrixString.charAt(25) == X) winner = "winner is X";
        if (matrixString.charAt( 5) == X && matrixString.charAt(17) == X && matrixString.charAt(29) == X) winner = "winner is X";
        if (matrixString.charAt( 8) == X && matrixString.charAt(21) == X && matrixString.charAt(33) == X) winner = "winner is X";
        if (matrixString.charAt( 1) == X && matrixString.charAt(17) == X && matrixString.charAt(33) == X) winner = "winner is X";
        if (matrixString.charAt( 8) == X && matrixString.charAt(17) == X && matrixString.charAt(25) == X) winner = "winner is X";
        if (matrixString.charAt( 1) == O && matrixString.charAt( 5) == O && matrixString.charAt( 8) == O) winner = "winner is O";
        if (matrixString.charAt(13) == O && matrixString.charAt(17) == O && matrixString.charAt(21) == O) winner = "winner is O";
        if (matrixString.charAt(25) == O && matrixString.charAt(29) == O && matrixString.charAt(33) == O) winner = "winner is O";
        if (matrixString.charAt( 1) == O && matrixString.charAt(13) == O && matrixString.charAt(25) == O) winner = "winner is O";
        if (matrixString.charAt( 5) == O && matrixString.charAt(17) == O && matrixString.charAt(29) == O) winner = "winner is O";
        if (matrixString.charAt( 8) == O && matrixString.charAt(21) == O && matrixString.charAt(33) == O) winner = "winner is O";
        if (matrixString.charAt( 1) == O && matrixString.charAt(17) == O && matrixString.charAt(33) == O) winner = "winner is O";
        if (matrixString.charAt( 8) == O && matrixString.charAt(17) == O && matrixString.charAt(25) == O) winner = "winner is O";
    
        JOptionPane.showMessageDialog(null,matrixString+"  "+winner);
    } 
}

/*


if (matrixString.charAt((4*1)-3) == X && matrixString.charAt((4*2)-3) == X && matrixString.charAt((4*3)-3) == X) winner = "winner is X";
if (matrixString.charAt((4*4)-3) == X && matrixString.charAt((4*5)-3) == X && matrixString.charAt((4*6)-3) == X) winner = "winner is X";
if (matrixString.charAt((4*7)-3) == X && matrixString.charAt((4*8)-3) == X && matrixString.charAt((4*9)-3) == X) winner = "winner is X";
if (matrixString.charAt((4*1)-3) == X && matrixString.charAt((4*4)-3) == X && matrixString.charAt((4*7)-3) == X) winner = "winner is X";
if (matrixString.charAt((4*2)-3) == X && matrixString.charAt((4*5)-3) == X && matrixString.charAt((4*8)-3) == X) winner = "winner is X";
if (matrixString.charAt((4*3)-3) == X && matrixString.charAt((4*6)-3) == X && matrixString.charAt((4*9)-3) == X) winner = "winner is X";
if (matrixString.charAt((4*1)-3) == X && matrixString.charAt((4*5)-3) == X && matrixString.charAt((4*9)-3) == X) winner = "winner is X";
if (matrixString.charAt((4*3)-3) == X && matrixString.charAt((4*5)-3) == X && matrixString.charAt((4*7)-3) == X) winner = "winner is X";
if (matrixString.charAt((4*1)-3) == O && matrixString.charAt((4*2)-3) == X && matrixString.charAt((4*3)-3) == O) winner = "winner is O";
if (matrixString.charAt((4*4)-3) == O && matrixString.charAt((4*5)-3) == X && matrixString.charAt((4*6)-3) == O) winner = "winner is O";
if (matrixString.charAt((4*7)-3) == O && matrixString.charAt((4*8)-3) == X && matrixString.charAt((4*9)-3) == O) winner = "winner is O";
if (matrixString.charAt((4*1)-3) == O && matrixString.charAt((4*4)-3) == X && matrixString.charAt((4*7)-3) == O) winner = "winner is O";
if (matrixString.charAt((4*2)-3) == O && matrixString.charAt((4*5)-3) == X && matrixString.charAt((4*8)-3) == O) winner = "winner is O";
if (matrixString.charAt((4*3)-3) == O && matrixString.charAt((4*6)-3) == O && matrixString.charAt((4*9)-3) == O) winner = "winner is O";
if (matrixString.charAt((4*1)-3) == O && matrixString.charAt((4*5)-3) == O && matrixString.charAt((4*9)-3) == O) winner = "winner is O";
if (matrixString.charAt((4*3)-3) == O && matrixString.charAt((4*5)-3) == O && matrixString.charAt((4*7)-3) == O) winner = "winner is O";


        if (matrixString.charAt(1) == X && matrixString.charAt(2) == X && matrixString.charAt(3) == X) winner = "winner is X";
        if (matrixString.charAt(4) == X && matrixString.charAt(5) == X && matrixString.charAt(6) == X) winner = "winner is X";
        if (matrixString.charAt(7) == X && matrixString.charAt(8) == X && matrixString.charAt(9) == X) winner = "winner is X";
        if (matrixString.charAt(1) == X && matrixString.charAt(4) == X && matrixString.charAt(7) == X) winner = "winner is X";
        if (matrixString.charAt(2) == X && matrixString.charAt(5) == X && matrixString.charAt(8) == X) winner = "winner is X";
        if (matrixString.charAt(3) == X && matrixString.charAt(6) == X && matrixString.charAt(9) == X) winner = "winner is X";
        if (matrixString.charAt(1) == X && matrixString.charAt(5) == X && matrixString.charAt(9) == X) winner = "winner is X";
        if (matrixString.charAt(3) == X && matrixString.charAt(5) == X && matrixString.charAt(7) == X) winner = "winner is X";
        if (matrixString.charAt(1) == O && matrixString.charAt(2) == X && matrixString.charAt(3) == O) winner = "winner is O";
        if (matrixString.charAt(4) == O && matrixString.charAt(5) == X && matrixString.charAt(6) == O) winner = "winner is O";
        if (matrixString.charAt(7) == O && matrixString.charAt(8) == X && matrixString.charAt(9) == O) winner = "winner is O";
        if (matrixString.charAt(1) == O && matrixString.charAt(4) == X && matrixString.charAt(7) == O) winner = "winner is O";
        if (matrixString.charAt(2) == O && matrixString.charAt(5) == X && matrixString.charAt(8) == O) winner = "winner is O";
        if (matrixString.charAt(3) == O && matrixString.charAt(6) == O && matrixString.charAt(9) == O) winner = "winner is O";
        if (matrixString.charAt(1) == O && matrixString.charAt(5) == O && matrixString.charAt(9) == O) winner = "winner is O";
        if (matrixString.charAt(3) == O && matrixString.charAt(5) == O && matrixString.charAt(7) == O) winner = "winner is O";
*/
