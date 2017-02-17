import java.util.*;

public class Test{
   public static void main (String[] args){
      
      System.out.println("Input word: ");
      Scanner scan = new Scanner(System.in);
      String word = scan.nextLine(); 
      word = right2(word);
      System.out.println(word);
   
   public static String right2(String word){
      String s = word;
      if(word.length()>2){
         s= word.substring(word.length()-2) + word.substring(0,word.length()-2);
      }
      return s;
   }//end of rigth2   
}