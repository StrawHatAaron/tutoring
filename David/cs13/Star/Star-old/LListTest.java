//import static org.junit.Assert.*;
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;

/**
 * The test class LListTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class LListTest
{
   public static void main (String[] args){
      LList a = new LList();
      a.addFirst("1");
      a.addFirst("2");
      a.addFirst("3");
      a.addFirst("4");
      System.out.println(a.size());
      System.out.println(a.toString());
      System.out.println(a.get(1));
      //System.out.println(a.set(3, "Changed"));
      System.out.println(a.get(3));
      System.out.println(a.indexOf("Changed"));
      a.clear();
      System.out.println(a.size());
     
   } 
    
}