import java.util.*;

public class Alf
{
   private int[] arr;
   private int count;
    
   public Alf()
   {
      arr = new int[4];
      count = 0;
   }
    
   public void add(int v)
   {
      if (arr.length == count)
      {
            // Make a new array double the size
         int[] temp = new int[arr.length*2];
            
            // Copy values
         for (int i = 0; i < arr.length; i++)
         {
            temp[i] = arr[i];
         }
            
            // Throw away old array
            // Will get reclaimed by garbage collector
         arr = temp;
      
      }
        
        // Put new element into the correct slot
      arr[count] = v;
      count++;
        
   }
    
   public int get(int index)
   {
      if (index < count && index >= 0)
         return arr[index];
      else
         throw new Inception();
   }
    
   public int size()
   {
      return count;
   }
    
   public void remove(int index)
   {
      for(int i = 0; i<arr.length; i++){
         if(index>arr.length){
            throw new Inception();
         }
         else if(index>i){
            arr[i]=arr[i];
         }
         else if(index==i){
          //cut out the index
         }
         else{//index < i
            arr[i-1]=arr[i];
         }
      }
   } 

    
   public int indexOf(int target)
   {
      for(int i=0; i<arr.length;i++){
         if(target == i){
            return i;
         }
      }
      return -1;
   }
    
   public void insert(int index, int v)
   {
      for (int i = count-1; i >= index; i--)
      {
         arr[i+1] = arr[i];
      }
      arr[index] = v;
      count++;
   }
    
   public void set(int index, int v)
   {
      if (index < count && index >= 0){ 
         arr[index]=v;
      }
      else
         throw new Inception();
   }
    
    //****************************************************
   public void clear()
   {
      arr = new int[0];
      //Arrays.fill(arr, null);
   }
   //*****************************************************
   public String toString(){
      String arrayInString = Arrays.toString(arr);
      return arrayInString;
   }

   public static void main (String[] args){
      Alf a = new Alf();
      a.add(5);
      a.add(10);
      a.add(-2);
      int b = a.indexOf(2);
      System.out.print(b);
      
      a.get(0);
      a.get(1);
      a.get(2);
    
      System.out.print(a.toString());
     
    
      a.insert(2, 20);
      a.remove(0);
   }
}