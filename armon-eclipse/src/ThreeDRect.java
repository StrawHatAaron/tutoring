import java.awt.*;
public class ThreeDRect extends Frame
{
  public ThreeDRect()
  {
    setTitle("Drawing 3 D Rectangles");
    setSize(500, 500);
    setVisible(true);
  }
  public void paint(Graphics g)
  {
    g.setColor(Color.green);
    g.draw3DRect(60, 70, 150, 100, true);
    g.draw3DRect(240, 70, 150, 100, false);
 
    g.fill3DRect(60, 250, 150, 100, true);
    g.fill3DRect(240, 250, 150, 100, false);
  }
  public static void main(String args[])
  {
    new ThreeDRect();
  }
}