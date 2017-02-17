import java.util.Scanner;
public class Sales
{
    
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      final int SALESPEOPLE = 5;
      int[] sales = new int[SALESPEOPLE];
      int sum;
      
      for (int i=0; i < sales.length; i++)
      {
         System.out.print("Enter sales for salesperson " + i + ": ");
         sales[i] = scan.nextInt();
      }
      System.out.println("\nSalesperson Sales"); System.out.println("--------------------"); sum = 0;
      for (int i=0; i < sales.length; i++)
      {
         System.out.println("\t " + i + "\t\t\t" + sales[i]); sum += sales[i];
      }
      System.out.println("\nTotal sales: " + sum); }
}