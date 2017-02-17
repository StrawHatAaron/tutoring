import java.io.*;
import java.util.*;

public class Test {
   
   private static DamCT convertString2Dam(String data){
      //Initialization
      CS12Date dateStamp;
      String name;
      int year = 0, yearStamp = 0, monthStamp = 0, dayStamp = 0, count = 0;
      double storage = 0, capacity = 0, inflow = 0, outflow = 0;
      //spearate the string by commas
      String [] tokens1 = data.split(",");
      for(int i = 0; i < tokens1.length; i++){
         //take out white spacing
         tokens1[i]=tokens1[i].trim();
      }  
         
      String [] tokens2 = tokens1[6].split("/");
      for(int k = 0; k < tokens2.length; k++){
         tokens2[k] = tokens2[k].trim();
      }
         
      name = tokens1[0];
      year = Integer.parseInt(tokens1[1]);
      storage = Double.parseDouble(tokens1[2]);
      capacity = Double.parseDouble(tokens1[3]);
      inflow = Double.parseDouble(tokens1[4]);
      outflow = Double.parseDouble(tokens1[5]);
      dateStamp = new CS12Date(Integer.parseInt(tokens2[0]),
                                  Integer.parseInt(tokens2[1]), 
                                  Integer.parseInt(tokens2[2]));
   
         
         
         /*switch(count){
            case 0:
               //Do nothing the name string does not need data conversion
               break;
            case 1:
               year = Integer.parseInt(tokens1[1]);
               System.out.println(year);
               break;
            case 2:
               storage = Double.parseDouble(tokens1[2]);
               break;
            case 3:
               capacity = Double.parseDouble(tokens1[3]);
               break;
            case 4:
               inflow = Double.parseDouble(tokens1[4]);
               
               break;
            case 5:
               outflow = Double.parseDouble(tokens1[5]);
               System.out.println(outflow);
               break;   
            case 6:
               String [] tokens2 = tokens1[6].split("/");
               monthStamp = Integer.parseInt(tokens2[0]);
               dayStamp = Integer.parseInt(tokens2[1]); 
               yearStamp = Integer.parseInt(tokens2[2]);
               System.out.println(monthStamp);
               System.out.println(dayStamp);
               System.out.println(yearStamp);
         } 
         count++;
         //System.out.println(i);*/
               
      
                            
   
            //need another tokens1 set for the CS12Date 
      
       
       
         //                 string    int       double    double    double    double    CS12Date
         //                 name 	  year      storage   capacity  inflow    outflow   CS12Date             
      return new DamCT(name, year, storage, capacity, inflow, outflow, dateStamp);
   }
   
   private static int readDataFromFile(DamCT[] dams){
      String fileName = UtilsCT.readString("enter text file containing Dam data", false);
      dams = new DamCT[50];
      int count = 0;
      String line = null;
   
      try {
         // FileReader reads text files in the default encoding.
         FileReader fileReader = new FileReader(fileName);
         // Always wrap FileReader in BufferedReader.
         BufferedReader bufferedReader = new BufferedReader(fileReader);
      
         while((line = bufferedReader.readLine()) != null) {
            dams[count] = convertString2Dam(line);
            count++;      
         }   
      
         // Always close files.
         bufferedReader.close();         
      }
      catch(FileNotFoundException ex) {
         System.out.println(
            "Unable to open file '" + 
            fileName + "'");                
      }
      catch(IOException ex) {
         System.out.println(
            "Error reading file '" 
            + fileName + "'");                  
         // Or we could just do this: 
         // ex.printStackTrace();
      }
      System.out.println("There was " + count + " dams in the file: " + fileName);
      
      return count;
   }
   
   private static void printDamSummaries(DamCT[] dams, int count){
      if(dams == null){
         System.out.println("Dam object does not exist..");
      }
      System.out.printf("Name\t\t Year\t\t Storage\t\t    Capacity\t\t Inflow\t\t Outflow\t\t\t\tDate %n");
      for(int i = 0; i < count; i++){
         System.out.printf("%-10s", dams[i].name);
         System.out.printf("%4d", dams[i].year);
         System.out.printf("%12.0f", dams[i].storage);
         System.out.printf("%16.0f", dams[i].capacity);
         System.out.printf("%13.0f", dams[i].inflow);
         System.out.printf("%13.0f  \t", dams[i].outflow);
         System.out.println(dams[i].date.getMonth() + "/" + dams[i].date.getDay() + "/" + dams[i].date.getYear());
           
      }
   }
   
   private static void printDamDetails(DamCT[] dams, int count){
      if(dams == null){
         System.out.println("Dam object does not exist..");
      }
      
      CS12Date event = new CS12Date();
      for(int i = 0; i < count; i++){
         System.out.println("--------------------------------------------------------");
         dams[i].print();
         System.out.print("% full:");
         System.out.printf("%17.1f %% %n" , dams[i].getPercentFull());
         System.out.printf("Status:\t\t\t\t  %s %n" , dams[i].getStatus());
         System.out.printf("days until event:\t  %d %n" , dams[i].getEventDays());
         event = dams[i].getEventDate();
         System.out.println("date of dam event:  " + event.getMonth() + "/" + event.getDay() + "/" + event.getYear());
         System.out.println("--------------------------------------------------------");
      
      }
   }
   
   public static void showWaterStatus(DamCT[] dams, int count){
      if(dams == null){
         System.out.println("Dam object does not exist..");
      }
      String superName = "OVERALL WATER HEALTH";
      int superYear = 2016;
      double superStorage = 0, superCapacity = 0, superInflow = 0, superOutflow = 0;
      for(int i = 0; i < count; i++){
         superStorage += dams[i].getStorage();
         superCapacity += dams[i].getCapacity();
         superInflow += dams[i].getInflow();
         superOutflow += dams[i].getOutflow();
      }
      //                 string    int       double    double    double    double    CS12Date
      //                 name 	  year      storage   capacity  inflow    outflow   CS12Date    
      DamCT[] superDam = new DamCT[50];
      CS12Date today = new CS12Date();
      superDam[0] = new DamCT(superName, superYear, superStorage, superCapacity, superInflow, superOutflow, today);
      printDamDetails(superDam, 1);
      
   }
   
   public static void main(String [] args) {
     
      DamCT[] test = new DamCT[50];
      
      //test readDataFromFile
      //readDataFromFile(test);
      DamCT norm = new DamCT(); 
      
      //test for convertStringToDam
      norm = convertString2Dam("Folsom,   1956,  442411,  977000, 3437, 1217, 11/29/2016");
      test[0] = norm;
      test[1] = convertString2Dam("Oroville, 1968, 1488529, 3537577, 2240, 3516, 11/29/2016"); 
      test[2] = convertString2Dam("Shasta,   1945, 2906447, 4552000, 5658, 4423, 11/29/2016");
      test[3] = convertString2Dam("Nimbus,   1955,    8351,    9000, 1243, 1261, 11/29/2016");
   
      boolean continu = true;
      boolean flag = false;
      while(continu){
         char in = UtilsCT.readChar("\nDAM OPTIONS: \nRead data from file  [R] \nPrint dam summaries  [S] \nPrint dam details    [D] " +
                                    "\nOverall water status [W] \nQuit                 [Q] \nEnter option >", flag);
         switch (in){
            case 'R':
            case 'r':
               
               readDataFromFile(test);  
               break;
            case 'S':
            case 's':
               printDamSummaries(test, 4);
               break;
            case 'D':
            case 'd':
               printDamDetails(test, 4);
               break;
            case 'W':
            case 'w':
               showWaterStatus(test, 4);
               break;
            case 'Q':
            case 'q':
               System.out.println("exiting upon user request. Goodbye!");
               continu = false;
               break;
            default:
               System.out.println("ERROR: Unrecognized option " + in + ", please try again!"); 
         }
      }
      /*DamCT[] test = new DamCT[50];
      
      //test readDataFromFile
      //readDataFromFile(test);
      DamCT norm = new DamCT(); 
      
      //test for convertStringToDam
      norm = convertString2Dam("Folsom,   1956,  442411,  977000, 3437, 1217, 11/29/2016");
      test[0] = norm;
      test[1] = convertString2Dam("Oroville, 1968, 1488529, 3537577, 2240, 3516, 11/29/2016"); 
      test[2] = convertString2Dam("Shasta,   1945, 2906447, 4552000, 5658, 4423, 11/29/2016");
      test[3] = convertString2Dam("Nimbus,   1955,    8351,    9000, 1243, 1261, 11/29/2016");
                 
      //test PrintDamSummaries     
      printDamSummaries(test, 4);
      
      //printDamDetails
      printDamDetails(test, 4);
      
      //showWaterStatus
      showWaterStatus(test, 4);*/
   
   }
}
