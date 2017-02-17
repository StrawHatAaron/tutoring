import java.util.*;
public class arithimetic{
   public static void main (String[] args){
      int sum=0;
      //int nSer=0;
      System.out.println("How many number are in your series?");
      Scanner ser2 = new Scanner(System.in);
      double mean=0;
      Scanner ser = new Scanner(System.in);
      int s = ser.nextInt();
      int a[]=new int[s];
      for(int nSer =0; nSer <= s-1; nSer++){
         System.out.println("please enter number " + nSer + " of the series");
         a[nSer] = ser2.nextInt();
         sum = sum + a[nSer];
      } 
      mean=sum/s;
      System.out.println("the mean of the numbers are " + mean);
   }
}