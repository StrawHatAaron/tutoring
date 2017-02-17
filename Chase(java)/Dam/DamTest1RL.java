/*
 * Name:       Rob Lapkass
 *
 * Course:     CS-12, Fall 2016
 *
 * Date:       11/07/16
 *
 * Filename:   DamTest1RL.java
 *
 * Purpose:    Test program for student Dam class, should resemble 
 *             test code in my DamCT. This is just for first week's tests.
 *             This file MUST be able to run standalone in a fresh directory.
 *
 *             INSTRUCTIONS: change DamCT to DamFL by doing global find-replace,
 *             then run this file and carefully inspect incremental results
 */

import java.util.Scanner;

public class DamTest1RL {

   // main method is the unit test code/driver for this class
   // this code will be used to test student Dam class
   //
   
   public static void main(String [] args) {
   
      // these will be the tester dams
      DamCT testDam, defaultDam;
      
      String testStr;
      CS12Date testDate;
      
      message("Unit test code for class DamCT", true);
   
      // test all constructor forms ---------------------------------    
      message("Testing all 4 constructor forms... use toString() AND print() to display...\n", false);    
      
      testDam = new DamCT();
      System.out.println(testDam);  // use toString()
      testDam.print("dam created from default constructor: make sure ALL defaults are set correctly");
      pause();
      
      testDam = new DamCT("dam 2", 1963, 500000, 1000000, 200, 100, new CS12Date(1, 1, 2000));
      System.out.println(testDam);  // use toString()
      testDam.print("dam created from full constructor: make sure ALL values as specified");
      pause();
   
      testDam = new DamCT("dam 3", 1986);
      System.out.println(testDam);  // use toString()
      testDam.print("dam created from name/year constructor: should show ALL defaults EXCEPT name/year");
      pause();
      
      testDam = new DamCT("dam 4", 100000.0);
      System.out.println(testDam);  // use toString()
      testDam.print("dam created from name/capacity constructor: should show ALL defaults EXCEPT name/capacity");
      pause();
        
      // test all accessors and mutators --------------------------- 
      message("Testing all accessors and mutators...", true);
      message("Prompt for each instance variable using its prompting set(), which uses set() internally\n" +
              "then echo it back out using its get()\n", false);
      
      testDam = new DamCT();
      testDam.print("Starting point is a new default DamCT");
      pause();
      
      testDam.setName(false);
      message("get: name should be set to:\t\t" + testDam.getName() + "\n", false);
      
      testDam.setYear(false);
      message("get: year should be set to:\t\t" + testDam.getYear() + "\n", false);
      
      testDam.setDate(false);
      message("get: date should be set to:\t\t" + testDam.getDate() + "\n", false);
      
      testDam.setCapacity(false);
      message("get: capacity should be set to:\t" + testDam.getCapacity() + "\n", false);
        
      testDam.setStorage(false);
      message("get: storage should be set to:\t" + testDam.getStorage() + "\n", false);
               
      testDam.setInflow(false);
      message("get: inflow should be set to:\t" + testDam.getInflow() + "\n", false);
      
      testDam.setOutflow(false);
      message("get: outflow should be set to:\t" + testDam.getOutflow() + "\n", false);
      
      testDam.print("Updated dam state is:");
      pause();
      
      // test equality ----------------------------------------------
      message("Testing for equality...", true);      
      
      message("Any Dam should equal itself:\t\t\t" + testDam.equals(testDam), false);
    
      defaultDam = new DamCT();
      message("Any two DIFFERENT Dams should NOT be equal:\t" + testDam.equals(defaultDam), false);
      
      testStr = "test string";
      testDate = new CS12Date();
      message("A Dam and a String should NOT be equal:\t\t" + testDam.equals(testStr), false);
      message("A Dam and a CS12Date should NOT be equal:\t" + testDam.equals(testDate), false);
      
      message("", false);
      message("End unit test code for class DamCT", true);
           
   } // end main
  
   //-------------------------------------------------------------------------------------------------------------
   
   // You may feel free to add these methods, or ones similar to these, to your own Utils
   // (just make yours public not private)
   
   // display related methods -------------------------------------------------
   
   // utility method which prints a specified spacer N times
   private static void spacer(char ch, int n) {
      for (int i=0; i < n; i++) {
         System.out.print(ch);
      }
      System.out.println();
   }
   
   // just a shortcut to printing a bounded message
   private static void message(String msg) {
      message(msg, true);
   }
   
   // print a message with or without surrounding bounding box
   private static void message(String msg, boolean box) {
      if (!box) {
         System.out.println(msg);
      }
      else {
         spacer('=', msg.length());
         System.out.println(msg);
         spacer('=', msg.length());
      }
   }

   // execution related methods ------------------------------------------------
    
   // pauses execution until any key is pressed, specific prompt
   private static void pause(String message) {
      // ignores any returned value
      readString(message);    // update with own Utils version if desired, but add boolean input
      System.out.println();   // add a blank line
   }
    
   // pauses execution until any key is pressed, generic prompt
   private static void pause() {
      pause("Press <Enter> to continue... ");
   }
    
   // get a String value (standalone, cmd-line only version)
   // update with own Utils version if desired, but add boolean input
   private static String readString(String prompt) {
    
      // set up data and objects
      String data;
      Scanner input = new Scanner(System.in);
   
      System.out.print(prompt);
      data = input.nextLine();
      
      return data;
   }
	 	 
} // end class