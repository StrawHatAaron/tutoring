/*
 * Name:    Chase Terry
 * Course:  CS-12 Fall
 * Date:    10/30/16
 * Filename:AgeClientCT
 * Purpose: age client
 */

import java.util.Scanner;

public class AgeClientCT {
 
   public static void main(String [] args) {
   
      int bdMonth1 = UtilsCT.readInt("Enter birthday month > ", false);         
      int bdDay1 = UtilsCT.readInt("Enter birthday day > ", false); 
      int bdYear1 = UtilsCT.readInt("Enter birthday year > ", false);
      CS12Date aaronBd = new CS12Date(bdMonth1, bdDay1, bdYear1);
      UtilsCT aaronBdU = new UtilsCT(6,13, 1965, "Hey");
      System.out.println("Birthday: "+aaronBdU.dateDisplay(aaronBd)+"     age = "+aaronBdU.getAge(aaronBd));
      System.out.println();
      
      int bdMonth2 = UtilsCT.readInt(" month > ", true);      
      int bdDay2 = UtilsCT.readInt(" day > ", true); 
      int bdYear2 = UtilsCT.readInt(" year > ", true);
      CS12Date johnnyBd = new CS12Date(bdMonth2, bdDay2, bdYear2);
      UtilsCT johnnyBdU = new UtilsCT(6,13, 1965, "Hey");
      System.out.println("Johnny is "+johnnyBdU.getAge(johnnyBd)+" years old");
      System.out.println();
      
      CS12Date chaseCur = new CS12Date(9,18,1995);
      CS12Date chase75 = new CS12Date(9,18,2070);
      UtilsCT chaseCurU = new UtilsCT(6,13, 1965, "Hey");
      System.out.println("My Birthday " + chaseCurU.dateDisplay(chaseCur) + "\t\tAge = " +  chaseCurU.getAge(chaseCur, chase75)
                         + "\tAs of: " + chaseCurU.dateDisplay(chase75));
           
   } // end main
    
} // end