/*
 * Name:    Chase Terry    
 *
 * Course:  CS12    
 *
 * Date:    11/30/16    
 *
 * Filename:UtilsCT   
 *
 * Purpose:    Starter CS-12 utilities file.
 *             This class is a collection of useful utility methods
 *              which are called statically:    UtilsFL.method()
 *
 */
/t
import javax.swing.*;
import java.util.*;

public class UtilsCT {

   /*public static int readChar(char prompt, boolean guiFlag){ 
      String data;    
        //data and objects
      Scanner input = new Scanner(System.in); 
     
       
         
      if (guiFlag == true) {              
         data = Integer.parseInt( JOptionPane.showInputDialog(null, prompt));           
      }
      
      else {         
         System.out.print(prompt);
         data = input.nextInt();             
      }
    
      return data;
      
   }*/
        
    //A method to read one int value, using either a command-line Scanner or a GUI popup dialog 
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
         //data = JOptionPane.showInputDialog(null, prompt);
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
         System.out.println(prompt);        
         while(!input.hasNextInt()){
            System.out.println("please enter an integer >");
            a = input.nextLine();
            data = a;
            //System.out.println(data);
         } 
         data = input.next();       
      }
      check = false;
      return Integer.parseInt(data);
      
   }
    
    //method to read two int values and calculae age
   public static int getAge(CS12Date dateBd, CS12Date dateRef) {
    
      int age=0;
      int monthBd, dayBd, yearBd, datBd;
      int monthRef, dayRef, yearRef;
      
      monthBd = dateBd.getMonth();
      dayBd = dateBd.getDay();
      yearBd = dateBd.getYear();
      
      monthRef = dateRef.getMonth();
      dayRef = dateRef.getDay();
      yearRef = dateRef.getYear();
        
      if(yearRef < yearBd) {
         age = -1;
         System.out.println("Error: proided birthdate " + monthBd + "/" + dayBd + "/" + yearBd + " is after current day");
      }        
      else if((yearRef >= yearBd)&&(monthRef == monthBd)&&(dayBd == dayRef)){
         age = (yearRef - yearBd);
      }       
      else if((yearRef == yearBd)&&(monthRef == monthBd)&&(dayBd == dayRef)){
         age = 0;
      }                
      else if((yearRef == yearBd) && (monthRef < monthBd)) {
         age = -1;
         System.out.println("Error: proided birthdate " + monthBd + "/" + dayBd + "/" + yearBd + " is after current day");    
      }       
      else if((monthRef == monthBd) && (yearRef == yearBd) && (dayRef < dayBd)) {
         age = -1;
         System.out.println("Error: proided birthdate " + monthBd + "/" + dayBd + "/" + yearBd + " is after current day");
      }
      else if((yearRef == yearBd) && monthBd < monthRef) {
         age = yearRef - yearBd;
      }        
      else if((monthBd == monthRef) && (dayBd < dayRef)) {
         age = yearRef - yearBd;
      }        
      else{
         age = (yearRef - yearBd)-1;
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