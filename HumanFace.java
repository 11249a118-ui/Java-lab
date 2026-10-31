
import java.applet.Applet;
import java.awt.*;

public class HumanFace extends Applet
{
    public void paint(Graphics g)
    {
        // Draw face
        g.setColor(Color.YELLOW);
        g.fillOval(100, 50, 200, 220);

        // Draw eyes
        g.setColor(Color.BLACK);
        g.fillOval(145, 110, 20, 20);
        g.fillOval(235, 110, 20, 20);

        // Draw nose
        g.drawLine(200, 135, 185, 180);
        g.drawLine(185, 180, 205, 180);

        // Draw mouth
        g.setColor(Color.RED);
        g.drawArc(160, 190, 80, 40, 180, 180);

        // Draw text
        g.setColor(Color.BLUE);
        g.setFont(new Font("Arial", Font.BOLD, 18));
        g.drawString("Human Face", 145, 310);
    }
}
