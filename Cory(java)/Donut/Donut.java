import java.awt.Graphics;
import java.awt.Color;
//import

public class Donut implements Drawable
{
   private String shape; // round, bar, twist
   private String filling;
   private String glaze; // regular, chocolate, maple, none
   private float percentRemaining;
   private int x, y; // position of donut
   
   
   public Donut()
   {
      shape = "round";
      filling = "none";
      glaze = "regular";
      percentRemaining = 100;
      x = 0;
      y = 0;
   }
   
   public Donut( String s, String f, String g, int px, int py )
   {
      shape = s;
      filling = f;
      glaze = g;
      percentRemaining = 100;
      x = px;
      y = py;
   }
   
   public String getShape(){ 
      return shape; }
   public float getPercentRemaining(){ 
      return percentRemaining; }
   
   public void takeBite()
   {
      if ( percentRemaining >= 20 )
      {
         percentRemaining = percentRemaining - 20;
      }
   }// end takeBite
   
   
   public void draw( Graphics g )
   {
      Color donutColor = Color.RED;
      
      switch( glaze )
      {
         case "none":
            donutColor = new Color( 203,138,40 );
            break;
           
         case "regular":
            donutColor = new Color( 200,135,30 );
            break;
         
         case "chocolate":
            donutColor = new Color( 75,42,4 );
            break;  
      }// end of switch
      
      g.setColor( donutColor );  
      
      if ( shape.equals( "round" )  )
      {
         g.fillOval( x,y, 50,50 );
         g.setColor( Color.WHITE );
         g.fillOval( x+16, y+16, 18,18);
      }
      else if ( shape.equals( "bar" ) )
      {
         g.fillRoundRect( x,y, 80, 25, 10,10 );
      }
      else if ( shape.equals( "twist" ) )
      {
         // draw twist shape
      }
   }
   
   
   public String toString()
   {
      return "shape = " + shape + "\r\n" +
              "filling = " + filling + "\r\n" +
              "glazed = " + glaze + "\r\n" +
              "Percent Remaining = " + percentRemaining;
   }
}