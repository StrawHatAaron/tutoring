/*
 * Name:    Chase Terry
 * Course:  CS-12 Fall
 * Date:    10/2/16
 * Filename:CS12DateClientCT
 * Purpose: Using CS12Date on a Client server
 */
 
import java.util.Scanner;

public class CS12DateClientCT {

   public static void main(String [] args) {
   
      Scanner input = new Scanner(System.in);
      
      //declarations
      int month, day, year, dateNumber;
      
      boolean result;
      
      //DECLARATIONS OF OBJECT CS12Date
      CS12Date today= new CS12Date();
      CS12Date myBday = new CS12Date(11, 01); //3) my birthday using print() method
      CS12Date halloween = new CS12Date(10, 31, 2016);//5) halloween using m/d/y constructor
      CS12Date christmas = new CS12Date();//6) christmas using setDate() method
      christmas.setDate(12, 25, 2016); 
              
      //1) explicit and implicit print
      System.out.println("1a) Today explicitly with toString() is: " + today.toString());
      System.out.println("1b) Today implicitly is: " + today);
      System.out.println();
      //2) today's date using using print() method      
      today.print("2) This is the Date Today");
      System.out.println();
      myBday.print("3) My Birthday is ");
      System.out.println();
      //4) days after using nextDate() and laterDate() methods
      myBday.nextDate();
      myBday.nextDate();
      myBday.nextDate();
      System.out.println("4a) Three days later using nextDate(): " + myBday);
      myBday.laterDate(7);
      System.out.println("4b) One week later using laterDate(): " + myBday);
      System.out.println();
      halloween.print("5) Halloween using m/d/y constructor");
      System.out.println();
      System.out.println("6) Christmas using setDate() method: " + christmas);
      System.out.println();    
      //7) my birthday using set() method
      System.out.print("This years birthday month > ");
      month = input.nextInt();
      System.out.print("This years birthday day > ");
      day = input.nextInt();
      System.out.print("This years birthday year > ");
      year = input.nextInt();
      myBday.setMonth(9);
      myBday.setDay(18);
      myBday.setYear(2016);
      myBday.print("7) My birthday this year was");
      System.out.println();
      //8) day of year using getDateNum() method
      dateNumber = myBday.getDateNum();
      System.out.println("8) My brithday this year was " + myBday + 
           " and was day number: " + dateNumber);
      System.out.println();
      //9) checking if today is my birthday using equals() method 
      result = today.equals(myBday);
      System.out.println("9) Is today " + today + " my birthday " + myBday +
                        "?: " + result);
      System.out.println();
      //10) reprinting this years birthday using accessors 
      month = 0;
      day = 0;
      year = 0;
      myBday.getMonth();
      myBday.getDay();
      myBday.getYear();
      System.out.println("10) This years birthday is still: " + myBday.getMonth() + "-"
                        + myBday.getDay() + "-" + myBday.getYear());
       
   } // end main
     
} // end