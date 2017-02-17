/*
 * Name:    Chase Terry
 * Course:  CS-12 Fall
 * Date:    12/1/16
 * Filename:SimulationCT
 * Purpose: simulation arrays for driving routes
 */
 
public class SimulationCT{  
  
   public static void main (String[] args) {
   
      int MIN = 60;
     
      double[] freewayDist = {4.7, 5.3};
      double[] cityDist = {3.4, 4.1, 2.5};
      
      int wonCity = 0;//counter for city time being quicker
      int wonFree = 0;//counter for freeway time being quicker
      int tossUp = 0; //niether route was fastest
      
      //average road speeds
      double aveFreeSpeed1 = 0.0;
      double aveFreeSpeed2 = 0.0;
      double aveCitySpeed1 = 0.0;
      double aveCitySpeed2 = 0.0;
      double aveCitySpeed3 = 0.0;      
      
      //sum of distances in each road
      double sumFreeDist1 = 0.0;
      double sumFreeDist2 = 0.0;
      double sumCityDist1 = 0.0;
      double sumCityDist2 = 0.0;
      double sumCityDist3 = 0.0;
      
      double sumFreeTime1 = 0.0;
      double sumFreeTime2 = 0.0;
      double sumCityTime1 = 0.0;
      double sumCityTime2 = 0.0;
      double sumCityTime3 = 0.0;
   
      double sumDistCity=0.0;//will become the sum of all the city times
      double sumDistFree=0.0;//will become the sum of all the freeway times
      
      double totalFreeDist = freewayDist[0] + freewayDist[1];
      double totalCityDist = cityDist[0] + cityDist[1] + cityDist[2];
      
      UtilsCT iter = new UtilsCT();
      int iteration = iter.readInt("How many simulation iterations? >", false);
      
      //initialize min and max speed for freeway and city routes
      int[] maxMinCitySpeed = new int[2];
      int[] maxMinFreeSpeed = new int[2];
      
      maxMinCitySpeed[0] = iter.readInt("Average freeway speed (min)? >", false);
      maxMinCitySpeed[1] = iter.readInt("Average freeway speed (max)? >", false);
      maxMinFreeSpeed[0] = iter.readInt("Average city speed (min)? >", false);
      maxMinFreeSpeed[1] = iter.readInt("Average city speed (max)? >", false); 
      
      double[] totalCityTime = new double[iteration];//total city time (MAYBE MAKE THIS AN ARRAY)
      double[] totalFreeTime = new double[iteration];//total free time (MAYBE MAKE THIS AN ARRAY)
      
      //time for each road
      double[] freeTime1 = new double[iteration];
      double[] freeTime2 = new double[iteration];
      double[] cityTime1 = new double[iteration];
      double[] cityTime2 = new double[iteration];
      double[] cityTime3 = new double[iteration];
      
      //speed for each road
      int[] freeSpeed1 = new int[iteration];
      int[] freeSpeed2 = new int[iteration];
      int[] citySpeed1 = new int[iteration];
      int[] citySpeed2 = new int[iteration];
      int[] citySpeed3 = new int[iteration];
                    
      //assign speeds to random integers
      for(int i = 0; i<=citySpeed1.length-1; i++) { 
         freeSpeed1[i] = iter.randomInt(maxMinFreeSpeed[1],maxMinFreeSpeed[0]);
         freeSpeed2[i] = iter.randomInt(maxMinFreeSpeed[1],maxMinFreeSpeed[0]);
         citySpeed1[i] = iter.randomInt(maxMinCitySpeed[1],maxMinCitySpeed[0]);
         citySpeed2[i] = iter.randomInt(maxMinCitySpeed[1],maxMinCitySpeed[0]);
         citySpeed3[i] = iter.randomInt(maxMinCitySpeed[1],maxMinCitySpeed[0]);
      }
      
      //time travel for each road
      for(int j = 0; j<=cityTime1.length-1; j++) {
         freeTime1[j] = freewayDist[0]/freeSpeed1[j]*MIN;
         freeTime2[j] = freewayDist[1]/freeSpeed2[j]*MIN;
         cityTime1[j] = cityDist[0]/citySpeed1[j]*MIN;
         cityTime2[j] = cityDist[1]/citySpeed2[j]*MIN;
         cityTime3[j] = cityDist[2]/citySpeed3[j]*MIN;
      }
      
   
      //counter to see which road was faster more often
      for(int k = 0; k<=citySpeed1.length-1; k++) {
         totalCityTime[k] = cityTime1[k] + cityTime2[k] + cityTime3[k];
         totalFreeTime[k] = freeTime1[k] + freeTime2[k]; 
      
         if(totalCityTime[k]==totalFreeTime[k]) {
            tossUp++;  
         }
         else if(totalCityTime[k]>totalFreeTime[k]) {
            wonFree++;
         }
         else {
            wonCity++;
         }
      }  
      
      //calculates sum of each traveled road
      for(int l = 0; l<=citySpeed1.length-1; l++) {
         sumFreeDist1 += freewayDist[0];
         sumFreeDist2 += freewayDist[1];
         sumCityDist1 += cityDist[0];
         sumCityDist2 += cityDist[1];
         sumCityDist3 += cityDist[2];
         
         sumFreeTime1 += freeTime1[l];
         sumFreeTime2 += freeTime2[l];
         sumCityTime1 += cityTime1[l];
         sumCityTime2 += cityTime2[l];
         sumCityTime3 += cityTime3[l];
      } 
      //Assigns the average speed for each road
      aveFreeSpeed1 = sumFreeDist1/sumFreeTime1;
      aveFreeSpeed2 = sumFreeDist2/sumFreeTime2;
      aveCitySpeed1 = sumCityDist1/sumCityTime1;
      aveCitySpeed2 = sumCityDist2/sumCityTime2;
      aveCitySpeed3 = sumCityDist3/sumCityTime3;
      
      for(int z = 0; z<citySpeed1.length-1; z++) {
         System.out.println("Preforming simulation for iteration " + z+1);
      }
      
      System.out.println("===================================================");
      System.out.println("Trafic simulation for "+iteration + " ITERATOINS");
      System.out.println("===================================================\n\n");
      
      System.out.println("LEGEND:  s=speed [MPH], t=time T=total time [mins] // f=freeway"
                         + " c=city // #=iterations or segment");
      System.out.println("### sc1   tc1  sc2   tc2  sc3   tc3   sf1   tf1  sf2   tf2   Tcity  Tfwy  fastest route");
      System.out.println("=== ===  ====  ===  ====  ===  ====   ===  ====  ===  ====   =====  ===== =============");
      for(int y = 0; y<=citySpeed1.length-1; y++) {
         //city
         System.out.printf("%d\t ",y+1);
         System.out.printf("%d \t", citySpeed1[y]);//sc1
         System.out.printf("%.2f \t",cityTime1[y]);//tc1
         System.out.printf("%d\t  ", citySpeed2[y]);//sc2
         System.out.printf("%.2f \t",cityTime2[y]);//tc2
         System.out.printf("%d  ", citySpeed3[y]);//sc3   
         System.out.printf("%.2f \t",cityTime3[y]);//tc3
         //freeway
         System.out.printf("%d  ", freeSpeed1[y]);//sf1   
         System.out.printf("%.2f\t",freeTime1[y]);//tf1
         System.out.printf(" %d \t", freeSpeed2[y]);//sf2   
         System.out.printf("%.2f \t",freeTime2[y]);//tf2
         //Time for city and Time for freeway
         System.out.printf(" %.2f  ",totalCityTime[y]);//Tcity
         System.out.printf("%.2f  ",totalFreeTime[y]);//Tfwy
         //fastest route
         if(totalCityTime[y]>totalFreeTime[y])
            System.out.printf("freeway faster");
         else if(totalCityTime[y]<totalFreeTime[y])
            System.out.printf("city faster");
         else
            System.out.printf("toss up!");
            
         //new line
         System.out.printf("%n");
      
      }
      //distance for paths
      System.out.println("\n   city travel segments [miles]: "+cityDist[0]+" " +cityDist[1]+" "+cityDist[2]);
      System.out.println("freeway travel segments [miles]: "+freewayDist[0]+" "+freewayDist[1]+"\n\n");
      
      System.out.println("===================================================");  
      System.out.println(" OVERALL SUMMARY RESULTS");
      System.out.println("===================================================\n");
      
      System.out.println(iteration+" trips taken");
      System.out.println("\t" + totalCityDist + "city miles, speed range " + maxMinCitySpeed[0]+"-"+maxMinCitySpeed[1]);
      System.out.println("\t" + totalFreeDist + " fwy miles, speed range " + maxMinFreeSpeed[0]+"-"+maxMinFreeSpeed[1]);
      
      double percentCityWon = wonCity*100.0/iteration;
      double percentFreeWon = wonFree*100.0/iteration;
      double percentTossUp =  tossUp*100.0/iteration;
      System.out.printf("  city route faster  %d/%d times (%.2f %%) \n", wonCity,iteration,percentCityWon);
      System.out.printf("   fwy route faster  %d/%d times (%.2f %%) \n", wonFree,iteration,percentFreeWon);
      System.out.printf("           a toss up %d/%d times (%.2f %%) \n", tossUp,iteration,percentTossUp);
   }
}