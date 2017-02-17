public class Parity
{
   public static void main(String[] args)
   {
      String input = "1111111";
      int onBits = 0;
      int offBits = 0;
      
      for( int i =0; i < input.length();i++)
      {
         
         if (input.charAt(i)=='1')
         {
            onBits++;
         }
         else//character must be 0
         {
            offBits++;
         }
      }//end for
      System.out.println("onBits = " + onBits);  
      System.out.println("offBits = " + offBits);
   }//end main
}