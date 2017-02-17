public class DrawDonuts
{
   public static void main(String[] args)
   {
      GraphicsFrame gf=new GraphicsFrame();
      
      Donut d1 = new Donut();
      Donut d2= new Donut("bar","none","regular",200,300);
      
      
      gf.add(d1);
      gf.add(d2);
   }
}