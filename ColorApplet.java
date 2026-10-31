import java.applet.Applet;
import java.awt.*;

public class ColorApplet extends Applet {
    public void paint(Graphics g) {

        // Draw red rectangle
        g.setColor(Color.RED);
        g.drawRect(50, 50, 150, 80);

        // Draw blue oval
        g.setColor(Color.BLUE);
        g.drawOval(250, 50, 120, 80);

        // Display bold message
        g.setColor(Color.BLACK);
        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.drawString("Java Applets are fun!", 80, 200);
    }
}
