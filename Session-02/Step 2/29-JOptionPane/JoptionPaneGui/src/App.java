import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        
        JOptionPane.showMessageDialog(null,"this is nothing", "title", JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null,"this is nothing", "title", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,"this is nothing", "title", JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null,"this is nothing", "title", JOptionPane.WARNING_MESSAGE);
        JOptionPane.showMessageDialog(null,"this is nothing", "title", JOptionPane.ERROR_MESSAGE);
        int answer = JOptionPane.showConfirmDialog(null, "this is nothing", "pepe popow", JOptionPane.YES_NO_OPTION);
        System.out.println(answer);
        String name = JOptionPane.showInputDialog("what is your name");
        System.out.println(name);
        JOptionPane.showOptionDialog(null, "you are awseome","secret message", JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE, null, null, 0);
    }
}
