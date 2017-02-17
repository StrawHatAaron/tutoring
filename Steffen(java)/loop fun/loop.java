import java.util.*;
public class loop{
   public static void main (String[] args){
      for(int k=1; k<=12; k++){
         for(int i=1; i<=12; i++){
            System.out.printf( i*k + "    ");
         }
         System.out.println("Multiplication table total for number " + k);
      }
   }
}