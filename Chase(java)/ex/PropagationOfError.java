//why dont we just have the user enter a big string?
//it is more attractive that way and then we can break each part by each term or serch for unc()
//next task take in sig fig for account
import java.math.*;
import java.util.*;
import java.lang.*;

public class PropagationOfError {
   private int 	    numOfVariables;
   private double     numOfUncertainty;
   private double []  variableValues;
   private double []  uncertaintyValues;

   public PropagationOfError(){
      numOfVariables    = 0;
      numOfUncertainty  = 0;
      variableValues    = new double[100];
      uncertaintyValues = new double[100];
   }
   public PropagationOfError(int variables, int uncertainty){
      numOfVariables    = variables;
      numOfUncertainty  = uncertainty;
      variableValues    = new double[100];
      uncertaintyValues = new double[100];
   }

   private void greeting(){
   	//number of variables
      Scanner in = new Scanner(System.in);
      boolean greetingFlag = true;
      while (greetingFlag){
         System.out.println("Please Enter the the number of variables.");
         try{
            numOfVariables = in.nextInt();
            System.out.println("Please Enter the number of uncertainty values. ");
            
            try {
               numOfUncertainty = in.nextInt();
               greetingFlag = false;
            }
            catch (Exception e){
               System.out.println("Sorry but you did not enter a number. Please re-run the program");
               System.exit(0);
            } 
         }
         catch(Exception e){
            System.out.println("Sorry but you did not enter a number. Please re-run the program.");
            System.exit(0);
         }
      }
   	//uncertainty
   } 
   
   private void fillInTerms(){
      //ask to fill in each value of uncertainty
      System.out.println("fuck you"); 
   }
		
   private int getNumOfVariables(){
      return numOfVariables;
   }
   private void setNumOfVariables(int num){
      numOfVariables = num;
   }
   private double getUncertainty(){
      return numOfUncertainty;   
   }
   private void setUncertainty(int uncertain){
      numOfUncertainty = uncertain;
   }
  
   public static void main (String[] args){
      PropagationOfError test = new PropagationOfError();
      test.greeting();
      //System.out.println(test.numOfVariables);
      //System.out.println(test.numOfUncertainty);
      test.fillInTerms();
   }
  
}