public class PumpkinTest
{
   public static void main(String[] args)
   {
      GraphicsFrame gf=new GraphicsFrame();
      Pumpkin p1= new Pumpkin();
      Pumpkin p2= new Pumpkin("Crazy", "oblong", "blue", 50.00f, 9.99f, 50, 50, 100);  
      Pumpkin p3= new Pumpkin("Crazy", "oblongB", "blue", 50.00f, 9.99f, 50, 50, 100);       
      Pumpkin p4= new Pumpkin("Crazy", "oblong", "blue", 50.00f, 9.99f, 100, 100, 100);
      System.out.println(p1.getShape());
      
      p2.yellBoo();
      gf.add(p1);
      gf.add(p2);
      gf.add(p3);
      gf.add(p4);
   
      System.out.println(p1.toString());
      System.out.println("------------");
      System.out.println(p2.toString());
      System.out.println("------------");
      System.out.println(p3.toString());
      System.out.println("------------");
      System.out.println(p4.toString());
   
   
      //System.out.println(d2);
   }
}