import javax.swing.JFrame;

public class myFrame extends JFrame{
    dragPanel dragpanel = new dragPanel();
    
    
    myFrame() {
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("drag and drop demo by mouayed");
        this.setSize(600,600);
        
        this.add(dragpanel);
        this.setVisible(true);
    }
}
