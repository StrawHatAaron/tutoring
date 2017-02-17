/*
 * Name:       
 *
 * Course:     
 *
 * Date:       
 *
 * Filename:   
 *
 * Purpose:    Starter CS-12 utilities file.
 *             This class is a collection of useful utility methods
 *              which are called statically:    UtilsFL.method()
 *
 *             THIS FILE RELIES UPON HAVING CS12Date.java IN LOCAL DIRECTORY
 */

import javax.swing.*;
import java.util.*;
public class UtilsCT {
   final private int MONTH;
   final private int DAY;
   final private int YEAR;
   final private String TEXT;
   final private int AGE;


   public UtilsCT(){
      MONTH=1;
      DAY=1;
      YEAR=1;
      this.TEXT = "Empty object";
      AGE=1;
   
   }
         
   public UtilsCT(int m, int d, int y, String text){
      MONTH=m;
      DAY=d;
      YEAR=y;
      this.TEXT = text;
      AGE=2016-y;
   }   

   public int getAge(){
      int a = AGE;
      return a;
   }
   
   //public static String printAge(){
      //System.out.println(age);
   //}
    //---------------------------------------------------------------------------
    // user input methods, by datatype
    //---------------------------------------------------------------------------
    
   //A method to read one int value, using either a command-line Scanner or a GUI popup dialog. After this, 
   //no more direct set-up of Scanner ever again – this is code reuse!
   public static int readInt(int i){
      System.out.println("What is the in value youd like to store?");
      Scanner scan = new Scanner(System.in);
      i = scan.nextInt();
      return i; 
   }
    
   
   public static int readInt(String prompt, boolean guiFlag) {
        // TODO: add a second boolean input argument for a "guiMode",
        //         then wrap an if-else around the existing Scanner input
        //       if F, get input as shown from Scanner (command line)
        //       if T, get input from JOptionPane (popup GUI)
        
        //data and objects
      Scanner input = new Scanner(System.in); 
      int bdMonth, bdDay, bdYear, data;
      bdMonth = 0;
      bdDay = 0;
      bdYear = 0;
      String outStr;
      int dateBd = 0;
      int age = 0;
      
      
      if (guiFlag == true) {         
         data = Integer.parseInt( JOptionPane.showInputDialog(null, "Enter birthday " +prompt + " : "));  
      }
      else {    
         System.out.print("Enter Birthday "+prompt+" : ");
         data = input.nextInt();           
      }
      return data;
   }
   
   public static int getAge(CS12Date dateBd, CS12Date dateToday) {
      int age= dateToday.getYear()- dateBd.getYear();
      int year = dateToday.getYear()-dateBd.getYear();
      int month =dateToday.getDay()-dateBd.getDay();
      int day= dateToday.getDay()-dateBd.getDay();
      if(year<=-1){
         System.out.println("ERROR: provided birthdate "+dateDisplay(dateBd)+" is after current date.");
         age=-1;
      }
      else if(month<=0){
         if(day<0){
            age = age -1;
         }
      }
      return age;     
   } 
   
   public static int getAge(CS12Date dateBd) {
      int age;
      CS12Date dateToday = today();
      // calls overloaded version of same method (above), with TODAY as the reference date
      age = getAge(dateBd, dateToday);  
      return age;
        
   } // end 1-input overloaded version
    
   //public static
    //---------------------------------------------------------------------------
    // date-related methods 
    //---------------------------------------------------------------------------
    
    // returns today's date as a CS12Date (NO CHANGES NEEDED)
   public static CS12Date today() {
    
      return new CS12Date();
        
   }
   
   public static String dateDisplay(CS12Date bday){
      int month = bday.getMonth();
      int day= bday.getDay();
      int year= bday.getYear();
      String bd = Integer.toString(month)+"/"+Integer.toString(day)+"/"+Integer.toString(year);
      return bd;
   }
       
} // end class