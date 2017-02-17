//idk what fucking number it was but I know it was near the beggining when we did this one.  
import java.util.*;
public class pro{
   public static void main (String[] args){
      Random random = new Random(); 
      int number = 1 + random.nextInt(10);
      //***right under here***
      //Is where I switched the && from a || operator
      while(number != 5 && number != 7){
         number = 1 + random.nextInt(10);
      }
      System.out.println("The number is " + number);
   }
}
//what is wrong with the program the code is intended to
// generate random numbers until it is equal to 5 or 7