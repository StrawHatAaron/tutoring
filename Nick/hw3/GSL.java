
/**
 * GSL - Generic Integer List
 * 
 * @author Tim McGowen
 * @version version 1.0
 */
public class GSL
{
   // Use an array to create the list
   private String arr[];
   private int size;

   /*
    * Constructor for objects of class GSL
    */
   public GSL()
   {
      arr = new String[10];
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
   public void add(String value)
   {
      if (size == arr.length) // Is arr full? Then expand by 20%
      {
         String[] arr2 = new String[(int)(arr.length * 1.2)];
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
   public String get(int index)
   {
      return arr[index];
   }

   /*
    * clear - empty the list
    */
   public void clear()
   {
      arr = new String[10];
      size = 0;
   }

   /*
    * insert - insert new element at indicated index
    * 
    * param - index to insert new element
    * param - integer value of new element
    */
   public void insert(int index, String value)
   {
      // If the index points to an empty element, add it.
      if ( index >= size )
         add(value);
      else
      {
         if (size == arr.length) // Is arr full? Then expand by 20%
         {
            String[] arr2 = new String[(int)(arr.length * 1.2)];
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

   //*
   //Create new Array
   //*
   private void newArray(){
      arr = new int[10];
      size = 0;
   }

  public void set(int index, String value)
  {
    // Code to set an element of your string list at specified index
    // to the provided value. You cannot set an item beyond that last
    // item in the list. Set will only work on elements greater than
    // or equal to zero and less than size. Do not add elements to the
    // list with set. Display an error if an index is out of bounds.
    
    //dont 
    if((index<size) && index>=0){
      arr[index]=value;
    }
    else{
      System.out.println("index is out of bounds");
    }
  }

  public void remove(int index)
  {
    // Code to remove the element at the specified index. All elements
    // after the index are shifted down to fill the hole. You cannot
    // remove an item beyond the last item in the list. Remove will only
    // work on elements greater than or equal to zero and less than size.
    // Display an error if an index is out of bounds.
    if((index<size) && index>=0){
      for(int i = index; i < size; i++){
        arr[i+1]=arr[i];
      }
    }
    else{
      System.out.println("index is out of bounds");
    }
  }
}