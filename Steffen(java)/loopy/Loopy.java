import java.util.*;
import java.util.Scanner.*;
import java.lang.*;
import java.util.regex.Pattern;
public class Loopy{
   public static void main(String[] args){
      int counter=0;
      Scanner input = new Scanner(System.in);
      StringBuilder str = new StringBuilder(input.nextLine());
      
      while(str.toString().length()>0){
         if(str.toString().charAt(0)==' '){
            counter++;
         }
         System.out.println(str);
         str.deleteCharAt(0);
         System.out.println( counter );
      }// end while
      
      System.out.println("counter= " + counter);
      System.out.println("After the while loop");
      System.out.println("--------------------");
      System.out.println();//blank line
   } //end main
}
      
