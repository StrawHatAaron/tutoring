public class DrawPumpkins
{
   public static void main(String[] args)
   {
      GraphicsFrame gf=new GraphicsFrame();
      
      Pumpkin p1= new Pumpkin();
      Pumpkin p2= new Pumpkin("Evil", "oblong", "none", 50.00f, 9.99f, 50, 50, 100);   
      Pumpkin p3= new Pumpkin("Gohstly", "oblongB", "none", 50.00f, 9.99f, 150, 150, 100);
      gf.add(p1);
      gf.add(p2);
      gf.add(p3);
   }
}