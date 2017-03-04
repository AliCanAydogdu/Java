
//  OlympicRings.java  


import javax.swing.JApplet;
import java.awt.*;

public class OlympicRings extends JApplet
{
   public void paint (Graphics page)
   {
      final int DIAMETER = 50;

      setBackground (Color.lightGray);

      page.setColor (Color.blue);
      page.drawOval (30, 40, DIAMETER, DIAMETER);
      page.setColor (Color.yellow);
      page.drawOval (60, 70, DIAMETER, DIAMETER);
      page.setColor (Color.black);
      page.drawOval (90, 40, DIAMETER, DIAMETER);
      page.setColor (Color.green);
      page.drawOval (120, 70, DIAMETER, DIAMETER);
      page.setColor (Color.red);
      page.drawOval (150, 40, DIAMETER, DIAMETER);
   }
}
