/*
 * Name:       Rob Lapkass
 *
 * Course:     CS-12
 *
 * Date:       10/20/16
 *
 * Filename:   UtilsTest1RL.java
 *
 * Purpose:    Test program for age algorithm correctness of PRGM10
 *             (instructor-provided).
 *             A series of test birthdates are provided, along with
 *             the expected age, and age results compared against expected.
 *
 *             This program has been generalized, so that it should work for either
 *             spring or fall semesters, just by toggling one flag.
 *
 *             =====================================================================
 *             INSTRUCTIONS: Do global replace of utility class name:
 *              in jGRASP use: Edit: Find/Replace
 *              or: Ctrl-F
 *              change UtilsCT ==> your Utils class name
 *             Then run this program and inspect pass/fail results.
 *             =====================================================================
 *             Do not make any other changes to this file - it must run as-provided!
 *             =====================================================================
 */

import java.util.Random;
import javax.swing.*;

public class UtilsTest1RL {

   public static void main(String [] args) {
      JFrame frame = new JFrame("Date");
      // declarations
      CS12Date bd, ref, now;
      int month, day, year;
      
      // semester flag, T = spring, F = fall
      boolean semFlag = false;
      
      // test program control settings
      boolean doAgeTests = true;
      
      // date initializations
      bd = new CS12Date();
      ref = new CS12Date();
      final int CURR_YEAR = bd.getYear();
      final int CURR_MONTH = bd.getMonth();
   
      // perform age tests
      if (doAgeTests) {
      
         // program output header
         System.out.println("=============================");
         System.out.println("       Age test results      ");
         System.out.println("(test driver client provided)");
         System.out.println("=============================");
      
         // test for birthdays BEFORE current date
         System.out.println("Birthdays BEFORE current date:");
         
         // BD a day before current date
         bd = UtilsCT.today();
         bd.priorDate(1);
         bd.setYear(CURR_YEAR - 30);
         test1(bd, 30);
             
         // BD a day before current date
         bd = UtilsCT.today();
         bd.priorDate(1);
         test1(bd, 0);
      
         // prior month, early day in month
         bd.setDate(priorMonth(semFlag), 1, CURR_YEAR - 35);
         test1(bd, 35);
             
         // prior month, early day in month, THIS year
         bd.setDate(priorMonth(semFlag), 9, CURR_YEAR);
         test1(bd, 0);            
         
         // prior month, late day in month
         bd.setDate(priorMonth(semFlag), 28, CURR_YEAR - 27);
         test1(bd, 27);
             
         // prior month, late day in month, THIS year
         bd.setDate(priorMonth(semFlag), 27, CURR_YEAR);
         test1(bd, 0);
         
         // this month, earlier day in month
         bd.setDate(CURR_MONTH, 1, CURR_YEAR - 82);
         test1(bd, 82);
             
         //this month, earlier day in month, THIS year
         bd.setDate(CURR_MONTH, 1, CURR_YEAR);
         test1(bd, 0);
        
         // test for birthdays AFTER current date
         System.out.println("\nBirthdays AFTER current date:");
         
         // tomorrow is BD
         bd = UtilsCT.today();
         bd.laterDate(1);
         bd.setYear(CURR_YEAR - 47);
         test1(bd, 47 - 1);
         
         // future month, early day in month
         bd.setDate(futureMonth(semFlag), 9, CURR_YEAR - 16);
         test1(bd, 16 - 1);
             
         // future month, early day in month
         bd.setDate(futureMonth(semFlag), 4, CURR_YEAR - 32);
         test1(bd, 32 - 1);
         
         // future month, late day in month
         bd.setDate(futureMonth(semFlag), 30, CURR_YEAR - 21);
         test1(bd, 21 - 1);
             
         // future month, late day in month
         bd.setDate(futureMonth(semFlag), 29, CURR_YEAR - 3);
         test1(bd, 3 - 1);
      
         // test for birthdays ON current date
         System.out.println("\nBirthdays ON current date:");
      
         // today, born today
         bd = UtilsCT.today();
         test1(bd, 0);
             
         // today, kids or teens
         bd = UtilsCT.today();
         bd.setYear(CURR_YEAR - 8);
         test1(bd, 8);
         
         // today, millenials
         bd = UtilsCT.today();
         bd.setYear(CURR_YEAR - 22);
         test1(bd, 22);
         
         // today, baby boomers
         bd = UtilsCT.today();
         bd.setYear(CURR_YEAR - 52);
         test1(bd, 52);
             
         // today, seniors
         bd = UtilsCT.today();
         bd.setYear(CURR_YEAR - 72);
         test1(bd, 72);
      
         // test for future dates
         System.out.println("\nBirthdays in FUTURE:");
         System.out.println("==> error message to user **generated by getAge()** must display for EACH future date\n");
      
         // tomorrow
         bd = UtilsCT.today();
         bd.nextDay();
         test1(bd, -1);
         
         // future date in a week or so
         bd = UtilsCT.today();
         bd.laterDate(10);
         test1(bd, -1);
         
         // future month this year, early date
         bd = UtilsCT.today();
         bd.setDate(futureMonth(semFlag), 1, CURR_YEAR);
         test1(bd, -1);
         
         // future month this year, late date
         bd = UtilsCT.today();
         bd.setDate(futureMonth(semFlag), 28, CURR_YEAR);
         test1(bd, -1);
         
         // future year, early month
         bd.setDate(2, 15, CURR_YEAR + 1);
         test1(bd, -1);
         
         // future year, late month
         bd.setDate(11, 9, CURR_YEAR + 2);
         test1(bd, -1);
         
         // test age on milestone dates
         System.out.println("\nPrior birthdays (dead or alive) on future milestone dates:");
      
         // George Washington 300th
         bd.setDate(2, 22, 1732);
         ref.setDate(2, 22, 2032);
         test2(bd, ref, 300, "George Washington 300th");
         ref.setDate(2, 21, 2032);
         test2(bd, ref, 299, "George Washington 300th, day before");            
      
         // instructor 65th
         bd.setDate(7, 18, 1963);
         ref.setDate(7, 18, 2028);
         test2(bd, ref, 65, "instructor 65th");
         ref.setDate(7, 17, 2028);
         test2(bd, ref, 64, "instructor 65th, day before");    
         
      } // end age tests
      
   } // end main
   
   //-----------------------------------------------------------------------------
   
   // generate a future month, depending upon whether spring or fall semester
   private static int futureMonth(boolean isSpring) {
   
      Random rand = new Random();
      int month;
      
      // spring or fall semester?
      if (isSpring) {
         month = rand.nextInt(7) + 6;   // June-Dec
      }
      else {
         month = 12;  // Dec only
      }
      
      return month;
   }
   
   // generate a prior month, depending upon whether spring or fall semester
   private static int priorMonth(boolean isSpring) {
   
      Random rand = new Random();
      int month;
      
      // spring or fall semester?
      if (isSpring) {
         month = rand.nextInt(3) + 1;   // Jan-Mar
      }
      else {
         month = rand.nextInt(9) + 1;   // Jan-Sept
      }
      
      return month;
   }

   //-----------------------------------------------------------------------------
   
   // test the single-input age form with a BD and an expected age
   private static void test1(CS12Date bd, int expectedAge) {
   
      // test the 1-input form (age as of TODAY)
      int age = UtilsCT.getAge(bd);
      
      // display test results
      //System.out.println("bd: " + bd + 
      //                   "\tas of: " + UtilsCT.today() +
      //                   "\tage: " + age +
      //                   "\texpected: " + expectedAge +
      //                   "\tpass: " + (age==expectedAge ? true : false));
                   
      // rewritten using format specifiers to avoid tabbing      
      System.out.printf("%3s%11s%9s%11s%8s%4d%11s%4d%8s%-5b\n",
                       "bd: ", bd,
                       "as of:", UtilsCT.today(),
                       "age:", age,
                       "expected:", expectedAge,
                       "pass: ", (age==expectedAge ? true : false));
      
   } // end test1

   //-----------------------------------------------------------------------------
   
   // test the two-input age form with a BD, milestone date, and an expected age
   private static void test2(CS12Date bd, CS12Date ref, int expectedAge, String text) {
   
      // test the 2-input form (age as of some reference date)
      int age = UtilsCT.getAge(bd, ref);
      
      // display test results
      //System.out.println("bd: " + bd + 
      //                   "\ton: " + ref +
      //                   "\tage: " + age +
      //                   "\texpected: " + expectedAge +
      //                   "\tpass: " + (age==expectedAge ? true : false) +
      //                   "\t" + text);
      
      // rewritten using format specifiers to avoid tabbing      
      System.out.printf("%3s%11s%9s%11s%8s%4d%11s%4d%8s%-8b%s\n",
                       "bd: ", bd,
                       "on:", ref,
                       "age:", age,
                       "expected:", expectedAge,
                       "pass: ", (age==expectedAge ? true : false),
                       text);
                 
   } // end test2
   
} // end class