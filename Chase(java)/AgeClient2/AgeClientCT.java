/*
 * Name:    Chase Terry
 * Course:  CS-12 Fall
 * Date:    10/30/16
 * Filename:AgeClientCT
 * Purpose: age client to call methods and compute age given a reference date
 */

import java.util.Scanner;

public class AgeClientCT {
 
   public static void main(String [] args) {
   
      int month, day, year, age;
      CS12Date bday, milestone;
      
      //3 values using scanner input, 1 input age
      month = UtilsCT.readInt("Enter birthday month > ", false);
      day = UtilsCT.readInt("Enter birthday day > ", false);
      year = UtilsCT.readInt("Enter birthday year > ", false);
      bday = new CS12Date(month, day, year);
      age = UtilsCT.getAge(bday);
      System.out.println("BD: " + bday + "     Age: " + age);
      
      //3 values using Gui input, 1 input age
      month = UtilsCT.readInt("Enter birthday month > ", true);
      day = UtilsCT.readInt("Enter birthday day > ", true);
      year = UtilsCT.readInt("Enter birthday year > ", true);
      bday = new CS12Date(month, day, year);
      age = UtilsCT.getAge(bday);
      System.out.println("BD: " + bday + "     Age: " + age); 
      
      //hardwire 2 dates use 2 input age
      bday = new CS12Date(9, 18, 1995);
      milestone = new CS12Date(9, 17, 2016);
      age = UtilsCT.getAge(bday, milestone);
      System.out.println("BD: " + bday + "    Age: " + age + "      As of: " + milestone);
      
   } // end main
    
} // end