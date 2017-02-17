public class Stats
{
   private double[] xs;
   public Stats()
   {
    //fill xs with a set of 5 known values
      xs= new double[5];
      xs[0]=1;
      xs[1]=2;
      xs[2]=3;
      xs[3]=4;
      xs[4]=5;
   }
   public Stats(double[] pxs)
   {
      xs=pxs;
   }
   
   public double mean()
   {
      double sum=0;
      for (int i=0; i<xs.length; i++)
      {
      //this takes care of the summation for our mean. for loops are awesome, so making an awesome program with this.
         sum=sum+xs[i];
          
      
      }
      return sum/xs.length;
      //if multiple methods need to use it, then it should be a field
      // if only one uses it, then make it a variable
      // if it has to come in from the outside, then you need to passs a perameter
   }
   public double stdDev()
   {
      double total=0;
      double xBar=mean();
      for (int i=0; i<xs.length; i++)
      {
         total =total+ Math.pow(xs[i]-xBar,2);
      }
      return Math.pow(total/xs.length,0.5f);
   }
   public String toString ()// not sure what this is or if it is written correctly. I think we are trying to print the results with a for loop.
   {
      String s="";
      for(int i=0; i<xs.length; i++)
      { 
         s=s+xs[i]+" "; 
      }
      return s;   
   }
}