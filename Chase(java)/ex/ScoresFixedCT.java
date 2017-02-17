/*
 * Name:       Chase Terry
 *
 * Course:     CS-12, Fall 2016
 *
 * Date:       12/11/16
 *
 * Filename:   ScoresFixedCT.java
 *
 * Purpose:    Final Exam
 */

import java.util.Scanner;

public class ScoresFixedCT{

   //fills in the test scores for all the students
   public static int[] fillInTestScore(int[] stu, int stuNum) {
      for(int i=0; i<stu.length; i++ ) {
         int k=i+1;  
         stu[i] = UtilsCT.readInt("Please enter students #"+ stuNum +"'s test score for test # "+ k +
                                     " as an integer value: \n", true);       
      }      
      return stu;  
   }
   //finds the average of a specific student grades
   public static double aveTestScore(int[] numStu) {
   
      int sum = 0;//giving sum initial value
      int count = 0;//giving count initial value
      for(int i=0; i<numStu.length; i++) {
         sum += numStu[i]; 
         count++;
      }
      return (double)sum/count;
   } 
   
   //return the entire class average
   public static double overAllAve(double[] ave) {
   
      double sum = 0;//giving sum initial value
      double count = 0;//giving count initial value
      for (int i = 0; i < ave.length; i++){
         sum+=ave[i];
         count++;
      }
      return sum/count;
   } 
   //main method
   public static void main(String [] args) {
      
      final int MAX_STUDENTS = 12;//max amount of students
      final int MAX_SC = 5;//max amount of students
      
      boolean flag = true;//decides GUI or Scanner          
      double classAve=0;//Averages of the entire class                                                                               
      
      //Sets and checks number of students (makes sure it does not exceed allowed limit)
      int numStu = UtilsCT.readInt("Enter amount of students: " , flag);
      while (numStu > MAX_STUDENTS){
         numStu = UtilsCT.readInt("That is too many students. Do not exceed "+MAX_STUDENTS+ " students", flag);
      }
      
      //Sets and checks number of test scores (makes sure it does not exceed allowed limit)
      int tests = UtilsCT.readInt("How many test scores are there?", flag);
      
      while (tests > MAX_SC){
         tests = UtilsCT.readInt("That is too many test scores. Do not exceed "+MAX_SC+" students", flag);
      }
      //declare an array of averages for each student
      //needed to know amount of tests before decleration
      double[] testAve = new double[numStu];
      //needed to know amount of tests before decleration
      int[] stu1 = new int[tests];//scores test 1
      int[] stu2 = new int[tests];//scores test 2
      int[] stu3 = new int[tests];//scores test 3
      int[] stu4 = new int[tests];//scores test 4
      int[] stu5 = new int[tests];//scores test 5
      int[] stu6 = new int[tests];//scores test 6
      int[] stu7 = new int[tests];//scores test 7
      int[] stu8 = new int[tests];//scores test 8
      int[] stu9 = new int[tests];//scores test 9
      int[] stu10 = new int[tests];//scores test 10
      int[] stu11 = new int[tests];//scores test 11
      int[] stu12 = new int[tests];//scores test 12
      //assigns all the student arrays with a value of negitive one at
      //index zero for the if staements 
      stu1[0]=-1;
      stu2[0]=-1;
      stu3[0]=-1;
      stu4[0]=-1;
      stu5[0]=-1;
      stu6[0]=-1;
      stu7[0]=-1;
      stu8[0]=-1;
      stu9[0]=-1;
      stu10[0]=-1;
      stu11[0]=-1;
      stu12[0]=-1;
      
      //Uses the user input to create the number of student (not over 12)
      switch(numStu){
         //prompts user to fill out the scores for student number 1 along with it's average
         case 1:            
            stu1 = fillInTestScore(stu1, 1);
            testAve[0] = aveTestScore(stu1);
            break;
         //prompts user to fill out the scores for students up to number 2 along with their averages   
         case 2:
            stu1 = fillInTestScore(stu1, 1);
            stu2 = fillInTestScore(stu2, 2);
            testAve[0] = aveTestScore(stu1);
            testAve[1] = aveTestScore(stu2);
            break;
         //prompts user to fill out the scores for students up to number 3 along with their averages
         case 3:
            stu1 = fillInTestScore(stu1, 1);
            stu2 = fillInTestScore(stu2, 2);
            stu3 = fillInTestScore(stu3, 3);
            testAve[0] = aveTestScore(stu1);
            testAve[1] = aveTestScore(stu2);
            testAve[2] = aveTestScore(stu3);
            break;
         //prompts user to fill out the scores for students up to number 4 along with their averages
         case 4:
            stu1 = fillInTestScore(stu1, 1);
            stu2 = fillInTestScore(stu2, 2);
            stu3 = fillInTestScore(stu3, 3);
            stu4 = fillInTestScore(stu4, 4);
            testAve[0] = aveTestScore(stu1);
            testAve[1] = aveTestScore(stu2);
            testAve[2] = aveTestScore(stu3);
            testAve[3] = aveTestScore(stu4);
            break;
         //prompts user to fill out the scores for students up to number 5 along with their averages
         case 5:
            stu1 = fillInTestScore(stu1, 1);
            stu2 = fillInTestScore(stu2, 2);
            stu3 = fillInTestScore(stu3, 3);
            stu4 = fillInTestScore(stu4, 4);
            stu5 = fillInTestScore(stu5, 5);
            testAve[0] = aveTestScore(stu1);
            testAve[1] = aveTestScore(stu2);
            testAve[2] = aveTestScore(stu3);
            testAve[3] = aveTestScore(stu4);
            testAve[4] = aveTestScore(stu5);
            break;
         //prompts user to fill out the scores for students up to number 6 along with their averages
         case 6:
            stu1 = fillInTestScore(stu1, 1);
            stu2 = fillInTestScore(stu2, 2);
            stu3 = fillInTestScore(stu3, 3);
            stu4 = fillInTestScore(stu4, 4);
            stu5 = fillInTestScore(stu5, 5);
            stu6 = fillInTestScore(stu6, 6);
            testAve[0] = aveTestScore(stu1);
            testAve[1] = aveTestScore(stu2);
            testAve[2] = aveTestScore(stu3);
            testAve[3] = aveTestScore(stu4);
            testAve[4] = aveTestScore(stu5);
            testAve[5] = aveTestScore(stu6);
            break; 
         //prompts user to fill out the scores for students up to number 7 along with their averages
         case 7:
            stu1 = fillInTestScore(stu1, 1);
            stu2 = fillInTestScore(stu2, 2);
            stu3 = fillInTestScore(stu3, 3);
            stu4 = fillInTestScore(stu4, 4);
            stu5 = fillInTestScore(stu5, 5);
            stu6 = fillInTestScore(stu6, 6);
            stu7 = fillInTestScore(stu7, 7);
            testAve[0] = aveTestScore(stu1);
            testAve[1] = aveTestScore(stu2);
            testAve[2] = aveTestScore(stu3);
            testAve[3] = aveTestScore(stu4);
            testAve[4] = aveTestScore(stu5);
            testAve[5] = aveTestScore(stu6);
            testAve[6] = aveTestScore(stu7);
            break;
         //prompts user to fill out the scores for students up to number 8 along with their averages
         case 8:
            stu1 = fillInTestScore(stu1, 1);
            stu2 = fillInTestScore(stu2, 2);
            stu3 = fillInTestScore(stu3, 3);
            stu4 = fillInTestScore(stu4, 4);
            stu5 = fillInTestScore(stu5, 5);
            stu6 = fillInTestScore(stu6, 6);
            stu7 = fillInTestScore(stu7, 7);
            stu8 = fillInTestScore(stu8, 8);
            testAve[0] = aveTestScore(stu1);
            testAve[1] = aveTestScore(stu2);
            testAve[2] = aveTestScore(stu3);
            testAve[3] = aveTestScore(stu4);
            testAve[4] = aveTestScore(stu5);
            testAve[5] = aveTestScore(stu6);
            testAve[6] = aveTestScore(stu7);
            testAve[7] = aveTestScore(stu8);
            break;
         //prompts user to fill out the scores for students up to number 9 along with their averages
         case 9:
            stu1 = fillInTestScore(stu1, 1);
            stu2 = fillInTestScore(stu2, 2);
            stu3 = fillInTestScore(stu3, 3);
            stu4 = fillInTestScore(stu4, 4);
            stu5 = fillInTestScore(stu5, 5);
            stu6 = fillInTestScore(stu6, 6);
            stu7 = fillInTestScore(stu7, 7);
            stu8 = fillInTestScore(stu8, 8);
            stu9 = fillInTestScore(stu9, 9);
            testAve[0] = aveTestScore(stu1);
            testAve[1] = aveTestScore(stu2);
            testAve[2] = aveTestScore(stu3);
            testAve[3] = aveTestScore(stu4);
            testAve[4] = aveTestScore(stu5);
            testAve[5] = aveTestScore(stu6);
            testAve[6] = aveTestScore(stu7);
            testAve[7] = aveTestScore(stu8);
            testAve[8] = aveTestScore(stu9);
            break;
         //prompts user to fill out the scores for students up to number 10 along with their averages
         case 10:
            stu1 = fillInTestScore(stu1, 1);
            stu2 = fillInTestScore(stu2, 2);
            stu3 = fillInTestScore(stu3, 3);
            stu4 = fillInTestScore(stu4, 4);
            stu5 = fillInTestScore(stu5, 5);
            stu6 = fillInTestScore(stu6, 6);
            stu7 = fillInTestScore(stu7, 7);
            stu8 = fillInTestScore(stu8, 8);
            stu9 = fillInTestScore(stu9, 9);
            stu10 = fillInTestScore(stu10, 10);
            testAve[0] = aveTestScore(stu1);
            testAve[1] = aveTestScore(stu2);
            testAve[2] = aveTestScore(stu3);
            testAve[3] = aveTestScore(stu4);
            testAve[4] = aveTestScore(stu5);
            testAve[5] = aveTestScore(stu6);
            testAve[6] = aveTestScore(stu7);
            testAve[7] = aveTestScore(stu8);
            testAve[8] = aveTestScore(stu9);
            testAve[9] = aveTestScore(stu10);
            break;
         //prompts user to fill out the scores for students up to number 11 along with their averages                                      
         case 11:
            stu1 = fillInTestScore(stu1, 1);
            stu2 = fillInTestScore(stu2, 2);
            stu3 = fillInTestScore(stu3, 3);
            stu4 = fillInTestScore(stu4, 4);
            stu5 = fillInTestScore(stu5, 5);
            stu6 = fillInTestScore(stu6, 6);
            stu7 = fillInTestScore(stu7, 7);
            stu8 = fillInTestScore(stu8, 8);
            stu9 = fillInTestScore(stu9, 9);
            stu10 = fillInTestScore(stu10, 10);
            stu11 = fillInTestScore(stu11, 11);
            testAve[0] = aveTestScore(stu1);
            testAve[1] = aveTestScore(stu2);
            testAve[2] = aveTestScore(stu3);
            testAve[3] = aveTestScore(stu4);
            testAve[4] = aveTestScore(stu5);
            testAve[5] = aveTestScore(stu6);
            testAve[6] = aveTestScore(stu7);
            testAve[7] = aveTestScore(stu8);
            testAve[8] = aveTestScore(stu9);
            testAve[9] = aveTestScore(stu10);
            testAve[10] = aveTestScore(stu11);
            break;
         //prompts user to fill out the scores for students up to number 12 along with their averages
         case 12:
            stu1 = fillInTestScore(stu1, 1);
            stu2 = fillInTestScore(stu2, 2);
            stu3 = fillInTestScore(stu3, 3);
            stu4 = fillInTestScore(stu4, 4);
            stu5 = fillInTestScore(stu5, 5);
            stu6 = fillInTestScore(stu6, 6);
            stu7 = fillInTestScore(stu7, 7);
            stu8 = fillInTestScore(stu8, 8);
            stu9 = fillInTestScore(stu9, 9);
            stu10 = fillInTestScore(stu10, 10);
            stu11 = fillInTestScore(stu11, 11);
            stu12 = fillInTestScore(stu12, 12);
            testAve[0] = aveTestScore(stu1);
            testAve[1] = aveTestScore(stu2);
            testAve[2] = aveTestScore(stu3);
            testAve[3] = aveTestScore(stu4);
            testAve[4] = aveTestScore(stu5);
            testAve[5] = aveTestScore(stu6);
            testAve[6] = aveTestScore(stu7);
            testAve[7] = aveTestScore(stu8);
            testAve[8] = aveTestScore(stu9);
            testAve[9] = aveTestScore(stu10);
            testAve[10] = aveTestScore(stu11);
            testAve[11] = aveTestScore(stu12);
            break;               
      }
      //print out the header      
      System.out.println("average score1 score2 score3 score4 score5");
      //checks if Student #1 should be printed
      if(stu1[0]>-1){
         System.out.printf("%7.2f", testAve[0]);
         for(int j=0; j<stu1.length; j++){
            System.out.printf("%7d", stu1[j]);
         }
         System.out.println();
      }
      //checks if Student #2 should be printed
      if(stu2[0]>-1){
         System.out.printf("%7.2f", testAve[1]);
         for(int k=0; k<stu1.length; k++){
            System.out.printf("%7d", stu2[k]);
         }
         System.out.println();
      }
      //checks if Student #3 should be printed
      if(stu3[0]>-1){
         System.out.printf("%7.2f", testAve[2]);
         for(int l=0; l<stu1.length; l++){
            System.out.printf("%7d", stu3[l]);
         }
         System.out.println();
      }
      //checks if Student #4 should be printed
      if(stu4[0]>-1){
         System.out.printf("%7.2f", testAve[3]);
         for(int m=0; m<stu1.length; m++){
            System.out.printf("%7d", stu4[m]);
         }
         System.out.println();
      }
      //checks if Student #5 should be printed
      if(stu5[0]>-1){
         System.out.printf("%7.2f", testAve[4]);
         for(int n=0; n<stu1.length; n++){
            System.out.printf("%7d", stu5[n]);
         }
         System.out.println();
      }
      //checks if Student #6 should be printed
      if(stu6[0]>-1){
         System.out.printf("%7.2f", testAve[5]);
         for(int o=0; o<stu1.length; o++){
            System.out.printf("%7d", stu6[o]);
         }
         System.out.println();
      }
      //checks if Student #7 should be printed
      if(stu7[0]>-1){
         System.out.printf("%7.2f", testAve[6]);
         for(int p=0; p<stu1.length; p++){
            System.out.printf("%7d", stu7[p]);
         }
         System.out.println();
      }
      //checks if Student #8 should be printed
      if(stu8[0]>-1){
         System.out.printf("%7.2f", testAve[7]);
         for(int q=0; q<stu1.length; q++){
            System.out.printf("%7d", stu8[q]);
         }
         System.out.println();
      }
      //checks if Student #9 should be printed
      if(stu9[0]>-1){
         System.out.printf("%7.2f", testAve[8]);
         for(int r=0; r<stu1.length; r++){
            System.out.printf("%7d", stu9[r]);
         }
         System.out.println();
      }
      //checks if Student #10 should be printed
      if(stu10[0]>-1){
         System.out.printf("%7.2f", testAve[9]);
         for(int s=0; s<stu1.length; s++){
            System.out.printf("%7d", stu10[s]);
         }
         System.out.println();
      }
       //checks if Student #11 should be printed
      if(stu11[0]>-1){
         System.out.printf("%7.2f", testAve[10]);
         for(int t=0; t<stu1.length; t++){
            System.out.printf("%7d", stu11[t]);
         }
         System.out.println();
      }
      //checks if Student #12 should be printed
      if(stu12[0]>-1){
         System.out.printf("%7.2f", testAve[11]);
         for(int u=0; u<stu1.length; u++){
            System.out.printf("%7d", stu12[u]);
         }
         System.out.println();
      }
      
      System.out.println();      
      //assign classAve the overall Class average
      classAve = overAllAve(testAve);
      //print class average
      System.out.printf("Class average: %7.2f", classAve);
   }//end main
}//end class
