public class StatsTest
{
// starting the main method
   public static void main(String[] args)
   {
      double[] data = {23,84,57,92,125};
   
   
      Stats s1= new Stats(data);
   
      System.out.println( s1.mean() );
      System.out.println( s1.stdDev() );
      System.out.println( s1.toString() );
   
   }
}