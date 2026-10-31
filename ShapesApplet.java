import java.applet.Applet;
import java.awt.Graphics;

public class ShapesApplet extends Applet {
    public void paint(Graphics g) {

        // Draw Rectangle
        g.drawRect(50, 50, 100, 60);
        g.drawString("Rectangle", 65, 130);

        // Draw Circle
        g.drawOval(200, 50, 80, 80);
        g.drawString("Circle", 220, 150);

        // Draw Line
        g.drawLine(50, 200, 150, 200);
        g.drawString("Line", 90, 220);

        // Draw Triangle
        g.drawLine(250, 200, 200, 280);
        g.drawLine(250, 200, 300, 280);
        g.drawLine(200, 280, 300, 280);
        g.drawString("Triangle", 225, 300);
    }
}
