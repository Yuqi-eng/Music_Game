import java.awt.*;
import javax.swing.*;

public class Music_Game extends JFrame {

    Image icon = Toolkit.getDefaultToolkit().getImage("images/Icon.PNG");
    Image background = Toolkit.getDefaultToolkit().getImage("images/Background.PNG");

    double x = 100;
    double y = 275;

    public void paint(Graphics g) {
        System.out.println("A pic is drawn.");
        g.drawImage(background, 0, 0, null);
        g.drawImage(icon, (int)x, (int)y, null);

        x  = x + 10;
    }


    void launchFrame() {
        setSize(1300,600);
        setLocation(50,50);
        setVisible(true);

        while(true) {
            repaint();
            try {
                Thread.sleep(40);
            }catch(Exception e) {
                e.printStackTrace();
            }

        }
    }

    public static void main(String[] args) {
        System.out.println("Game launched");
        Music_Game game=new Music_Game();
        game.launchFrame();
    }

}