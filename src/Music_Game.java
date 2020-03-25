import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.JButton;

public class Music_Game extends JFrame {

    Image icon = Toolkit.getDefaultToolkit().getImage("images/Icon.PNG");
    Image background = Toolkit.getDefaultToolkit().getImage("images/Background.PNG");
    Image pop = Toolkit.getDefaultToolkit().getImage("images/pop.PNG");

    double x = 100;
    double y = 275;

    private Music_Game(){
        super("music game");
        setLayout(new FlowLayout());

       // JButton button = new JButton("Start gaming");
        //button.addActionListener(this);
        // add(button);
    }

    public void paint(Graphics g) {
        if (x < 1070) {
            g.drawImage(background, 0, 0, null);
            g.drawImage(icon, (int) x, (int) y, null);
            x = x + 10;
        }
        else {
            g.drawImage(background, 0, 0, null);
            g.drawImage(pop, (int) x, (int) y, null);
        }
    }


    void launchFrame() {
        setSize(1300,600);
        setResizable(true);
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
        Music_Game game=new Music_Game();
        game.launchFrame();
    }
/*
    @Override
    public void actionPerformed(ActionEvent e) {
        launchFrame();
        System.out.println("Game launched");
    }

 */
}