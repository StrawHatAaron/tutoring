import java.util.*;
import java.lang.*;
import java.util.regex.Pattern;

public class SCounter{
   public static void main (String[] args){
      System.out.println("Please enter a String");
      int nCap=0;
      int nVow=0;
      int nSecL=0;
      String SecLets="";
       
      Scanner input = new Scanner(System.in);
      StringBuilder str = new StringBuilder(input.nextLine());
      StringBuilder str1 = new StringBuilder(str.toString());
      StringBuilder str2 = new StringBuilder(str.toString());
      StringBuilder str3 = new StringBuilder(str.toString());
      StringBuilder str4 = new StringBuilder(str.toString());
      String rstr1 = str1.toString();
      String rstr2=""; 
      String nSecLS=" ";
   //1 
    
      String caps="";   
      while(str.toString().length()>0){
         switch(str.toString().charAt(0)){
            case 'A':
               caps = caps + "A";
               break;
            case 'B':
               caps = caps + "B";
               break;
            case 'C':
               caps = caps + "C";
               break;
            case 'D':
               caps = caps + "D";
               break;
            case 'E':
               caps = caps + "E";
               break;
            case 'F':
               caps = caps + "F";
               break;
            case 'G':
               caps = caps + "G";
               break;
            case 'H':
               caps = caps + "H";
               break;
            case 'I':
               caps = caps + "I";
               break;
            case 'J':
               caps = caps + "J";
               break;
            case 'K':
               caps = caps + "K";
               break;
            case 'L':
               caps = caps + "L";
               break;
            case 'M':
               caps = caps + "M";
               break;
            case 'N':
               caps = caps + "N";
               break;
            case 'O':
               caps = caps + "O";
               break;
            case 'P':
               caps = caps + "P";
               break;
            case 'Q':
               caps = caps + "Q";
               break;
            case 'R':
               caps = caps + "R";
               break;
            case 'S':
               caps = caps + "S";
               break;   
            case 'T':
               caps = caps + "T";
               break;
            case 'U':
               caps = caps + "U";
               break;
            case 'V':
               caps = caps + "V";
               break;
            case 'W':
               caps = caps + "W";
               break;
            case 'X':
               caps = caps + "X";
               break;
            case 'Y':
               caps = caps + "Y";
               break;
            case 'Z':
               caps = caps + "Z";
               break;
            default:
               //do nothing
         }
         str.deleteCharAt(0);
      }
      System.out.println();
      System.out.println( caps + " Is the capital letters in the string you entered.");
      int count1p1 = 0;
      int count1p2 = 0;  
      String r2str1= "";
         
   //2
      for(int i=0; i<=rstr1.length()-1; i+=2){
         System.out.print(rstr1.substring(i, i+1));
         //System.out.println(" is every second letter in ther string");  
      }
         
   //3 
   
      System.out.println();//new line
      while(str3.toString().length()>0){
         switch(str3.toString().charAt(0)){
            case 'A':
               nVow++;
               break;
            case 'E':
               nVow++;
               break;
            case 'I':
               nVow++;
               break;
            case 'O':
               nVow++;
               break;
            case 'U':
               nVow++;
               break;
            case 'a':
               nVow++;
               break;
            case 'e':
               nVow++;
               break;
            case 'i':
               nVow++;
               break;
            case 'o':
               nVow++;
               break;
            case 'u':
               nVow++;
               break;
         
            default:
              //do nothing
               break;
         }
         str3.deleteCharAt(0);
      }
      System.out.println("There are " + nVow + " Vowels in the string you entered" );
   
   
         
   //4
      //int[] inVow = new int[nVow];
      int v = 0;
      System.out.println();//new line
      while(str2.toString().length()>0){
         switch(str2.toString().charAt(0)){
            case 'A':
               System.out.print(v+ " ");
               break;
            case 'E':
               System.out.print(v+ " ");
               break;
            case 'I':
               System.out.print(v+ " ");
               break;
            case 'O':
               System.out.print(v+ " ");
               break;
            case 'U':
               System.out.print(v+ " ");
               break;
            case 'a':
               System.out.print(v+ " ");
               break;
            case 'e':
               System.out.print(v+ " ");
               break;
            case 'i':
               System.out.print(v+ " ");
               break;
            case 'o':
               System.out.print(v+ " ");
               break;
            case 'u':
               System.out.print(v+ " ");
               break;
         
            default:
              //do nothing
               break;
         }
         str2.deleteCharAt(0);
         v++;
      }
      System.out.println("Are the indexes values of the vowels");
   
   
   //5
      int c5 = 0;
      while(str4.toString().length()>0){
         switch(str4.toString().charAt(0)){
            case 'A':
               rstr2 = rstr2 + "_";
               break;
            case 'E':
               rstr2 = rstr2 + "_";
               break;
            case 'I':
               rstr2 = rstr2 + "_";
               break;
            case 'O':
               rstr2 = rstr2 + "_";
               break;
            case 'U':
               rstr2 = rstr2 + "_";
               break;
            case 'a':
               rstr2 = rstr2 + "_";
               break;
            case 'e':
               rstr2 = rstr2 + "_";
               break;
            case 'i':
               rstr2 = rstr2 + "_";
               break;
            case 'o':
               rstr2 = rstr2 + "_";
               break;
            case 'u':
               rstr2 = rstr2 + "_";
               break;
         
            default:
               rstr2 = rstr2 + str4.toString().charAt(0);
               break;
         }
         str4.deleteCharAt(0);
      }
      System.out.println(rstr2);
   
   }//end main static method
}//end main

