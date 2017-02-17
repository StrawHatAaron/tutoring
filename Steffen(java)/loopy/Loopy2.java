import java.util.*;
import java.util.Scanner.*;
import java.lang.*;
import java.util.regex.Pattern;
public class Loopy2{
   public static void main(String[] args){
      int pd=0, qm=0, cm=0, em=0, n=0;
      Scanner input = new Scanner(System.in);
      StringBuilder str = new StringBuilder(input.nextLine());
      //while(str.toString().length()>0){
      for(int i=0; str.toString().length()>0; str.deleteCharAt(0)){
         if(str.toString().charAt(0)=='.'){
            pd++;
         }
         else if(str.toString().charAt(0)==','){
            cm++;
         }
         else if(str.toString().charAt(0)=='?'){
            qm++;
         }
         else if(str.toString().charAt(0)=='!'){
            em++;
         }
         else{
            System.out.println();
         }
      }// end for
      System.out.println("question mark counter= " + qm);
      System.out.println("exclamation mark= " + em);
      System.out.println("comma counter= " + cm);
      System.out.println("period counter= " + pd);
      System.out.println("After the for loop");
      System.out.println("--------------------");
      System.out.println();//blank line
   } //end main
}