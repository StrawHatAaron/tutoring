int /*
 * Name:       Rob Lapkass
 *
 * Course:     CS-12, Fall 2016
 *
 * Date:       11/30/16
 *
 * Filename:   ObjectArrayMethodExamples.java
 *
 * Purpose:    Demo prototype for an array of objects (CS12Dates).
 *             Various methods are being called upon the entire array.
 *             So, we need to pass the ENTIRE array as a method input argument.
 *
 *             The methods of this example do 3 things:
 *             1) initialize the array
 *             2) print the array
 *             3) find the "average" date of the array
 */

import java.util.Random;

public class ObjectArrayMethodExamples {

   public static void main(String [] args) {
   
      final int MAX_SIZE = 100;
   
      // the core of this program is an array of objects, and a count of used ones
      // there are WAY more array elements available than we will use
      CS12Date [] dates = new CS12Date [MAX_SIZE];
      int count = 0;
      
      // here are a few operations upon the entire USED array
      // can you see how to incorporate these into a menuing (while/switch) structure??
      // each of these is ONE standalone statement
      count = initDates(dates);
      printDates(dates, count);
      averageDates(dates, count);
        
   } // end main
   
   //-----------------------------------------------------------------------------------
   // all the following methods are static, because they are called directly from main()
   // also, they all operate upon the passed-in array directly,
   // but here that's OK because these are all just local helper methods
   //
   // most of the methods need to know the following two things:
   // a) the name of the object array
   // b) how many elements are actually in use (= index of NEXT available array element)
   //-----------------------------------------------------------------------------------
   
   // generate some random CS12Date, given a year
   // "data in, object out" (int in, CS12Date out)
   private static CS12Date randomDate(int year) {
      Random rand = new Random();
      int month = rand.nextInt(12) + 1; 
      int day = rand.nextInt(28) + 1;   // close enough for our purposes
      
      return new CS12Date(month, day, year);
      
   } // end randomDate
   
   //-----------------------------------------------------------------------------------
   
   // initialize the array to some made-up data, return how many elements actually get used
   private static int initDates(CS12Date [] data) {
      final int MAX_USED = 10;
      int num = 0;
      
      // how would you loop over the entire array, and null out ALL its elements??
      
      // initialize the first 5 elements to some random dates
      // can you see how this can extend to reading from a file??
      for (int i=0; i<MAX_USED; i++) {
         data[num] = randomDate(2016);
         num++;
      }
      
      // return the actual subset of array elements in use
      System.out.println(MAX_USED + " random dates have been initialized\n");
      return num;
      
   } // end initDates
   
   //-----------------------------------------------------------------------------------

   // print all the array elements by looping over the USED portion
   // we need to be told what that used portion is
   private static void printDates(CS12Date [] data, int count) {
      System.out.println("These are all " + count + " dates:");
      for (int i=0; i<count; i++) {
         System.out.println(data[i].toString());
      }
      System.out.println();
      
   } // end printDates
   
   //-----------------------------------------------------------------------------------

   // calculate the "average" of all dates, assume rounding down
   // we need to be told what that used portion is
   private static void averageDates(CS12Date [] data, int count) {
      int sumMonth = 0;
      int sumDay = 0;
      int sumYear = 0;
      int month, day, year;
      CS12Date avgDate;
      
      // tally up all date componenents
      for (int i=0; i<count; i++) {
         sumMonth += data[i].getMonth();
         sumDay += data[i].getDay();
         sumYear += data[i].getYear();
      }
      
      // compute averages and construct "average" date
      // rounds down by use of integer division
      avgDate = new CS12Date(sumMonth/count, sumDay/count, sumYear/count);
      System.out.println("The \"average\" of the dates (rounding down) is: " + avgDate.toString());
   
   } // end everageDates
   
} // end class