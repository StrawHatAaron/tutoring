import java.util.*;
public class p1{
   public static void main (String[] args){
      double d, e;
      Scanner in = new Scanner(System.in); 
      System.out.println("enter a dollar amount");
      d = in.nextDouble(); 
      do{
         if(d < 0){
            System.out.println("That is a negitive amount of " + d + "$");
            e=d*0.91;
            System.out.println("that is " + e + " in euros");   
            System.out.println("Enter another dollar amount");
            d = in.nextDouble(); 
         }
         else if(d==0){
            System.exit(0);
         }
         else{
            System.out.println("That is a amount of " + d + "$");
            e=d*0.91;
            System.out.println("that is " + e + " in euros");   
            System.out.println("Enter another dollar amount");
            d = in.nextDouble(); 
         }
      }while(d!=0.0);
   }
}