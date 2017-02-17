public class yes{
   public static void main (String[] args){  
      String str= "Udemy is the best site for video tutorials";
      String criteria= " ";
      String [] strarr = str.split(criteria);
      for( int i =0; i<strarr.length; i++)
      {
         System.out.println(strarr[i]);
      }
   }         
}