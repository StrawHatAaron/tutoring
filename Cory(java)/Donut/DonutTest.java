public class DonutTest
{
   public static void main(String[] args)
   {
      Donut d1 = new Donut();
      Donut d2 = new Donut( "bar", "none", "regular" );
      
      System.out.println( d1.getShape() + " " + d1.getPercentRemaining() );
   
      System.out.println( d1 );
      System.out.println( "--------------------" );
      System.out.println( d2 );
     
     
      d2.takeBite(); 
      d2.takeBite();
      d2.takeBite(); 
      d2.takeBite();
      //d2.takeBite(); 
      //d2.takeBite();
      //d2.takeBite(); 
      //d2.takeBite();
      System.out.println( d2 ); 
      
   }
}