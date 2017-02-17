/*
 * Name:    Chase Terry    
 * Course:  CS-12    
 * Date:    12/1/16    
 * Filename:UtilsCT   
 * Purpose: utilities file to aquire data
 */

import javax.swing.*;
import java.util.*;

public class UtilsCT {
 
   // promts for certain char, returns a character
   public static char readChar(String prompt, boolean guiFlag){ 
      char data='a';    
      String a=" ";
      
      // gui read char
      Scanner input = new Scanner(System.in); 
      if (guiFlag == true) {              
         a =( JOptionPane.showInputDialog(null, prompt)); 
         data = a.charAt(0); 
            
         while(a.length()<0){
            a = JOptionPane.showInputDialog(null, "please enter an charater >");
            data = a.charAt(0);
         }
      }
      
      // non gui read char
      else {         
         System.out.print(prompt);
         a = input.nextLine();
         data = a.charAt(0); 
           
         while(a.length()<1){
            System.out.println("please enter an integer >");
            a = input.nextLine();
            data = a.charAt(0);     
         }        
      }
      return data;
   }
  
   //pauses execution until any key is pressed, specific prompt
   public static void pause(String message) {
      //ignores any returned values
      readString(message, false);
      System.out.println();   //blank line
   }
   
   //pauses execution until any key is pressed, generic prompt
   public static void pause() {
      pause("Press <Enter> to continue...");    
   }
   
   // promts for certain string, returns a string
   public static String readString(String message, boolean guiFlag){ 
      String data="a";
      
      //gui read String  
      if (guiFlag == true) {              
         data =( JOptionPane.showInputDialog(null, message));
      }
      
      // non gui read String
      else { 
         Scanner input = new Scanner(System.in);        
         System.out.print(message);
        
         data = input.nextLine();      
      }
      return data;
   }
   
   public static double readDouble(String prompt, boolean guiFlag){ 
      String data="";
      double num=0;
      boolean failed = true;
      int count = 0;
      boolean check = false;
      
      //data and objects
      Scanner input = new Scanner(System.in);  
      if (guiFlag == true) {              
         while(failed==true){
            try{
               if(check==false){
                  data = JOptionPane.showInputDialog(null, prompt);
                  check=true;
               }
               else{
                  data = JOptionPane.showInputDialog(null, prompt);
               }
               num = Double.parseDouble(data);
               failed= false;
            }
            catch (NumberFormatException nfe){
                  
            }
         }          
         return num;
      } 
        
      else { 
         System.out.print(prompt);        
         while(!input.hasNextDouble()){
            System.out.print("please enter an decimal number >");
            data = input.nextLine();
         } 
         data = input.next();       
      }
      check = false;
      return Double.parseDouble(data); 
   }
      
   public static int readInt(String prompt, boolean guiFlag){ 
      String data="";
      String a="";
      int num=0;
      boolean failed = true;
      int count = 0;
      boolean check = false;
      
      //data and objects
      Scanner input = new Scanner(System.in);  
      if (guiFlag == true) {              
         while(failed==true){
            try{
               if(check==false){
                  a = JOptionPane.showInputDialog(null, prompt);
                  check=true;
               }
               else{
                  a = JOptionPane.showInputDialog(null, "please enter an integer");
               }
               num = Integer.parseInt(a);
               failed= false;
            }
            catch (NumberFormatException nfe){
                  
            }
         }          
         return num;
      }
         
      else { 
         System.out.print(prompt);        
         while(!input.hasNextInt()){
            System.out.print("please enter an integer >");
            a = input.nextLine();
            data = a;
         } 
         data = input.next();       
      }
      check = false;
      return Integer.parseInt(data);
      
   }
 
 
   public static int randomInt(int maxSpeed ,int minSpeed) {
       // data declarations
      Scanner scan = new Scanner(System.in);
      Random rand = new Random();
      
      int num1;
      num1 = rand.nextInt(maxSpeed - minSpeed + 1) + minSpeed;
      return num1;
   }
 
   //method to read two int values and calculae age
   public static int getAge(CS12Date dateBd, CS12Date dateRef) {
    
      int age=0;
      int monthBd, dayBd, yearBd;
      int monthRef, dayRef, yearRef;
      
      monthBd = dateBd.getMonth();
      dayBd = dateBd.getDay();
      yearBd = dateBd.getYear();
      
      monthRef = dateRef.getMonth();
      dayRef = dateRef.getDay();
      yearRef = dateRef.getYear();
      
      age = yearRef - yearBd;
      
      if (age < 0) {
         System.out.println("Error: proided birthdate " + monthBd + "/" + dayBd + "/" + yearBd + " is after current day");
         return -1;
      }
      
      else if(monthRef > monthBd){
      
      }
      
      else if(monthRef < monthBd) {
         if(yearRef == yearBd) {
            System.out.println("Error: proided birthdate " + monthBd + "/" + dayBd + "/" + yearBd + " is after current day");
         }
         age--;
      }
      
      else {
         if(dayRef > dayBd) {
              
         }
          
         else if(dayRef < dayBd) {
            if(yearRef == yearBd) {
               System.out.println("Error: proided birthdate " + monthBd + "/" + dayBd + "/" + yearBd + " is after current day");
            } 
            age--;
         }    
          
         else {  
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
    

    
   // returns today's date as a CS12Date (NO CHANGES NEEDED)
   public static CS12Date today() {
    
      return new CS12Date();
        
   }

       
} // end class