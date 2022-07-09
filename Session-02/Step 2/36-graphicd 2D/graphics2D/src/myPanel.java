import javax.swing.*;
import java.awt.*;

public class myPanel extends JPanel{
    
    Image image;

    myPanel() {

        image = new ImageIcon("test.jpg").getImage();

        this.setPreferredSize(new Dimension(500,500));
    }

    @Override
    public void paint(Graphics g) {

        Graphics2D g2d = (Graphics2D) g;

        g2d.drawImage(image,0,0,null);
        
        g2d.setPaint(Color.red);
        g2d.setStroke(new BasicStroke(10));

        g2d.drawLine(0, 0, 500, 500);
        g2d.drawRect(140, 140, 220, 220);
        
        g2d.setPaint(Color.lightGray);
        g2d.fillRect(140, 140, 220, 220);
        
        g2d.setPaint(Color.black);
        g2d.drawOval(200, 200, 100, 100);

        g2d.setPaint(Color.white);
        g2d.fillOval(200, 200, 100, 100);

        int[] xpoints = {150,250,350};
        int[] ypoints = {300,150,300};
        g2d.drawPolygon(xpoints, ypoints, 3);
        g2d.setPaint(Color.MAGENTA);
        g2d.fillPolygon(xpoints, ypoints, 3);

        g2d.setPaint(Color.black);
        g2d.drawArc(210, 210, 80, 80, 0, 180);
        g2d.drawArc(210, 210, 80, 80, 0, -180);
        g2d.setPaint(Color.red);
        g2d.fillArc(210, 210, 80, 80, 0, 180);
        g2d.setPaint(Color.white);
        g2d.fillArc(210, 210, 80, 80, 0, -180);

        g2d.setPaint(Color.black);
        g2d.setFont(new Font("Ink Free", Font.BOLD, 50));
        g2d.drawString("you are a winner",60,50);

        

    }
}
