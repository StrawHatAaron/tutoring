import java.util.Scanner;
public class Compass
{
   public static void main(String[] args)
   {
      double degree = 0;
      Scanner in = new Scanner(System.in);
      degree = in.nextDouble ();
   
      if(degree<=22.5 || (degree>337.5 && degree<360))
      {
         System.out.println("E");
      }
      else if(degree<=67.5 && degree>22.5)
      {
         System.out.println("SE");
      }
      else if(degree<=112.5 && degree>67.5)
      {
         System.out.println("S");
      }
      else if(degree<=157.5 && degree>112.5)
      {
         System.out.println("SW");
      }
      else if(degree<=202.5 && degree>157.5)
      {
         System.out.println("W");
      }
      else if(degree<=247.5 && degree>202.5)
      {
         System.out.println("NW");
      }
      else if(degree<=292.5 && degree>247.5)
      {
         System.out.println("N");
      }
      else if(degree<=337.5 && degree>292.5)
      {
         System.out.println("NE");
      }
      
      else
      {
         System.out.println("Enter a number between 0-360");
      }
   
   }
 
}
