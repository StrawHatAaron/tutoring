import java.util.*;


public class array{
   public static void main(String[] args){
   
      Random integer = new Random(); 
      
      int[] bigLarryArray = new int[10];
      
      for( int i = 0; i<10; i++){
         bigLarryArray[i]= integer.nextInt(1000);
      }
      System.out.println("ALL EVEN INDEX OF THE ARRAY");
      System.out.println(bigLarryArray[0]);
      System.out.println(bigLarryArray[2]);
      System.out.println(bigLarryArray[4]);
      System.out.println(bigLarryArray[6]);
      System.out.println(bigLarryArray[8]);
      
   
   
      System.out.println("ALL EVEN NUMBERS");
      for( int k = 0; k<10; k++){
         if(bigLarryArray[k]%2==0){
            System.out.println(bigLarryArray[k]);
         }
      }
      
      System.out.println("ALL ELEMENTS IN REVERSE ORDER");
      for( int g = 9; g>-1; g--){
         bigLarryArray[g] =integer.nextInt(1000);
         System.out.println(bigLarryArray[g]);
      }
      System.out.println("Only the first and last element");
      System.out.println(bigLarryArray[0]);
      System.out.println(bigLarryArray[9]);
   
   }
   
}

