
/**
 * GSL - Generic Integer List
 * 
 * @author Tim McGowen
 * @version version 1.0
 */
public class GSL
{
   // Use an array to create the list
   private int arr[];
   private int size;

   /*
    * Constructor for objects of class GSL
    */
   public GSL()
   {
      arr = new int[10];
      size = 0;
   }

   /*
    * size - returns the size of the list
    * 
    * return - the size of the list as an integer
    */
   public int size()
   {
      return size;
   }

   /*
    * add - add one value to the list in the next available position
    * 
    * param - integer to add to the list
    */
   public void add(int value)
   {
      if (size == arr.length) // Is arr full? Then expand by 20%
      {
         int[] arr2 = new int[(int)(arr.length * 1.2)];
         // Copy elements from arr to arr2
         for (int i = 0; i < arr.length; i++)
            arr2[i] = arr[i];
         // Have arr point to new array
         arr = arr2;
         // Old array will be Garbage Collected
      }
   
      arr[size] = value;
      size++;
   }

   /*
    * get - return the value at the specified location in the list
    * 
    * param - index into the list for the value to return
    * return - integer value
    */
   public int get(int index)
   {
      return arr[index];
   }

   /*
    * clear - empty the list
    */
   public void clear()
   {
      arr = new int[10];
      size = 0;
   }

   /*
    * insert - insert new element at indicated index
    * 
    * param - index to insert new element
    * param - integer value of new element
    */
   public void insert(int index, int value)
   {
      // If the index points to an empty element, add it.
      if ( index >= size )
         add(value);
      else
      {
         if (size == arr.length) // Is arr full? Then expand by 20%
         {
            int[] arr2 = new int[(int)(arr.length * 1.2)];
            // Copy elems from arr to arr2
            for (int i = 0; i < arr.length; i++)
               arr2[i] = arr[i];
            // Have arr point to new array
            arr = arr2;
            // Old array will be Garbage Collected
         }
         // Open a hole to insert the value
         for (int i = size; i > index; i--)
            arr[i] = arr[i - 1];
         arr[index] = value;
         size++;
      }
   }

   /*
    * toString - return a string value that represents the list
    *
    * return - String
    */
   public String toString()
   {
      String returnValue = String.valueOf(arr[0]);
      for (int i = 1; i < size; i++)
         returnValue = returnValue + ", " + arr[i];
      return returnValue;
   }

   /*
    * display - display the list
    */
   public void display()
   {
      for (int i = 0; i < size; i++)
         System.out.println(i + ": " + arr[i]);
      if ( arr.length == size)
         System.out.println("List is full\n");
      else
         System.out.println("List has " + (arr.length - size) + " spaces left\n");
   }
}

