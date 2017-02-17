import java.awt.Graphics;
import java.awt.Color;


public class Pumpkin implements Drawable
{
   private String name;
   private String shape;//round,oblong
   private String color;//orange, yellow, blue
   private float percentSpookiness;
   private float price;
   private int x,y;//position of the pumpkin
   private int percentRemaining;
   
   public Pumpkin()
   {
      name="Joel";
      shape="round";
      color="orange";
      percentSpookiness=100.0f;
      price= 0.0f;//Aaron, my idea here is for the program to figure out the radius of the drawn pumpkin and used it in price calc
      x=0;
      y=0;
      percentRemaining = 100;
   }
   
   public Pumpkin(String n, String s, String c, float pS, float p, int px,int py, int pr)
   {
      name=n;
      shape=s;
      color=c;
      percentSpookiness=100.0f;
      price=25.0f;
      x=px;
      y=py;
      percentRemaining=pr;
   }
   
   public String getName(){
      return name;}
   public String getShape(){
      return shape;}
   public String getColor(){
      return color;}
   public float getPercentSpookiness(){
      return percentSpookiness;}
   public float getPrice(){
      return price;}
   
   public void yellBoo()
   {
      if ( percentRemaining >= 20)
      {
         percentRemaining=percentRemaining-20;
      }
   }//end yellBoo
   
   public void draw(Graphics g)
   {
      Color pumpkinColor=Color.ORANGE;
      
      switch(color)
      {
         case"none":
            pumpkinColor = new Color(255,165,0);
            break;
            
         case"yellow":
            pumpkinColor = new Color(245,253,8);
            break;
            
         case"blue":
            pumpkinColor = new Color(0,0,255);
            break;
      
            
      }//end of switch
      g.setColor(pumpkinColor);
         
      if (shape.equals( "round" ))
      {
         g.setColor(Color.GREEN);
         g.fillRect(x+20,y, 10, 50);
         g.setColor(Color.ORANGE);
         g.fillOval(x,y+20,50,50);
         g.setColor(Color.RED);
         g.fillOval(x+10,y+25,10,20);
         g.fillOval(x+25,y+25,10,20);
         g.fillOval(x+15, y+55, 20, 10);
      }
      else if (shape.equals( "oblong" ))
      {
         g.setColor(Color.GREEN);
         g.fillRect(x+20,y-15, 3, 25);
         g.setColor(Color.ORANGE);
         g.fillOval(x,y,35,50);
         g.setColor(Color.RED);
         g.fillOval(x+15,y+5,10,20);
         g.fillOval(x+5,y+5,10,20);
         g.fillOval(x+5,y+30,20,10);
      }
      
      else if (shape.equals( "oblongB" ))
      {
         g.setColor(Color.GREEN);
         g.fillRect(x+20,y-15, 3, 25);
         g.setColor(Color.BLUE);
         g.fillOval(x,y,35,50);
         g.setColor(Color.RED);
         g.fillOval(x+15,y+5,10,20);
         g.fillOval(x+5,y+5,10,20);
         g.fillOval(x+5,y+30,20,10);
      }

      
   }
  
   public String toString()
   {
      return 
            "name ="+name + "\r\n"+
            "shape ="+shape +"\r\n" + 
            "color ="+color +"\r\n"+
            "percentSpookines =" + percentSpookiness + "\r\n"+ 
            "price =" + price + " dollars \r\n";
            
   }
}