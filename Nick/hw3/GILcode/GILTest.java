/*
 * Code to test Generic Integer List
 * 
 * author Tim McGowen
 * version 1.0
 */
public class GILTest
{
   public static void main(String[] args)
   {
      int errors = 0;
   
      GL<Integer> list = new GL();
      //GIL list = new GIL();
      /******************************************************************/
      /* A new list should return a size of zero                        */
      /******************************************************************/
      if ( list.size() != 0)
      {
         System.out.println("ERROR: A new list does not return size of 0");
         errors++;
      }
   
      /******************************************************************/
      /* Adding an element should change the size to 1                  */
      /******************************************************************/
      list.add(3);
      if ( list.size() != 1)
      {
         System.out.println("ERROR: Add one element to list does not return size of 1");
         errors++;
      }
   
      /******************************************************************/
      /* Is value at the first position the value we expect?            */
      /******************************************************************/
      if ( list.get(0) != null )
      {
         System.out.println("ERROR: The value of the first element is not what we set it to be");
         errors++;
      }
   
      /******************************************************************/
      /* Display the list                                               */
      /******************************************************************/
      System.out.println("Display list with one element");
      list.display();
   
      /******************************************************************/
      /* Add 9 more values to list. The size should be 10.              */
      /******************************************************************/
      for (int i = 0; i < 9; i++)
         list.add(i + 1);
      if ( list.size() != 10 )
      {
         System.out.println("ERROR: The size is not equal to 10");
         errors++;
      }
      // Display the list
      System.out.println("Display list with ten elements");
      list.display();
   
      /******************************************************************/
      /* Add one more value. The list should expand                     */
      /******************************************************************/
      list.add(11);
      if ( list.size() != 11)
      {
         System.out.println("ERROR: Add one more element to list does not return size of 11");
         errors++;
      }
      if ( list.get(10) != 11 )
      {
         System.out.println("ERROR: The value of the 11th element is not what we set it to be");
         errors++;
      }
      System.out.println("Display list with eleven elements. List expanded");
      list.display();
   
      /******************************************************************/
      /* Insert a new element at the beginning of the list              */
      /******************************************************************/
      list.insert(0, 111);
      if ( list.size() != 12)
      {
         System.out.println("ERROR: Add one more element to list does not return size of 12");
         errors++;
      }
      if ( list.get(0) != 111 )
      {
         System.out.println("ERROR: The value of the first element is not what we set it to be");
         errors++;
      }
      // Display the list
      System.out.println("Display list with insert at index 5");
      list.display();
   
      /******************************************************************/
      /*Insert a new element in the middle of the list                  */
      /******************************************************************/
      list.insert(5, 2222);
      if ( list.size() != 13)
      {
         System.out.println("ERROR: Add one more element to list does not return size of 13");
         errors++;
      }
      if ( list.get(5) != 2222 )
      {
         System.out.println("ERROR: The value of the sixth element is not what we set it to be");
         errors++;
      }
      // Display the list
      System.out.println("Display list with insert at index 5");
      list.display();
   
      /******************************************************************/
      /* Display list as a string                                       */
      /******************************************************************/
      String stringList = list.toString();
      if (!("111, 3, 1, 2, 3, 2222, 4, 5, 6, 7, 8, 9, 11".equals(stringList)))
      {
         System.out.println("ERROR: toString does not return a properly formatted string");
         System.out.println("ERROR: >" + stringList + "<");
         errors++;
      }
   
      /******************************************************************/
      /* Clear the list                                                 */
      /******************************************************************/
      list.clear();
      // An empty list should return a size of zero
      if ( list.size() != 0)
      {
         System.out.println("ERROR: An empty list does not return size of 0");
         errors++;
      }
      // Display the list
      System.out.println("Display list that has been cleared");
      list.display();
   
      // What is the final result?
      if ( errors == 0 )
         System.out.println("No errors found!!!");
   }
}
