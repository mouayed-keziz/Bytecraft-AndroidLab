import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class myPanel extends JPanel implements ActionListener {

    final int PANEL_WIDTH = 500;
    final int PANEL_HEIGHT = 500;
    Image player;
    Image background;
    Timer timer;
    int xVelocity = 10;
    int yVelocity = 7;
    int x = 0;
    int y = 0;

    myPanel() {
        this.setPreferredSize(new Dimension(PANEL_WIDTH,PANEL_HEIGHT));
        this.setBackground(Color.black);
        background = new ImageIcon("test.jpg").getImage();
        
        player = new ImageIcon("test2.png").getImage();
        timer = new Timer(1, this);
        timer.start();
    }

    public void paint(Graphics g) {

        super.paint(g);     //this will paint background

        Graphics2D g2d = (Graphics2D) g;
        
        g2d.drawImage(background, 0, 0, null);

        g2d.drawImage(player, x, y, null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (x >= PANEL_WIDTH-player.getWidth(null) || x < 0) {
            xVelocity = xVelocity * (-1);
        }
        if (y >= PANEL_HEIGHT-player.getWidth(null) || y < 0) {
            yVelocity = yVelocity * (-1);
        }
        x = x + xVelocity;
        y = y + yVelocity;
        repaint();
    }

}
