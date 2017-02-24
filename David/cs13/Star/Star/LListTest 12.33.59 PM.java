import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class LListTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class LListTest
{
   /**
    * Default constructor for test class LListTest
    */
   public LListTest()
   {
   }

   /**
    * Sets up the test fixture.
    *
    * Called before every test case method.
    */
   @Before
   public void setUp()
   {
   }

   /**
    * Tears down the test fixture.
    *
    * Called after every test case method.
    */
   @After
   public void tearDown()
   {
   }
   
   @Test
   public void testFirstAdd()
   {
      LList x = new LList();
      assertEquals(null, x.head);
      
      x.addLast("Werd");
      assertEquals("Werd", x.head.data);
      assertEquals(null, x.head.next);
   }
   
   @Test
   public void testTwoAdds()
   {
      LList x = new LList();
      x.addLast("Werd");
      x.addLast("Xenix");
      assertEquals("Werd", x.head.data);
      assertEquals("Xenix", x.head.next.data);
      assertEquals(null, x.head.next.next);
   }
   
   @Test
   public void testFourAdds()
   {
      LList x = new LList();
      x.addLast("Werd");
      x.addLast("Xenix");
      x.addLast("Zen");
      x.addLast("Bird");
      assertEquals("Werd", x.head.data);
      assertEquals("Xenix", x.head.next.data);
      assertEquals("Zen", x.head.next.next.data);
      assertEquals("Bird", x.head.next.next.next.data);
      assertEquals(null, x.head.next.next.next.next);
   }
   
   @Test
   public void testAddFirst()
   {
      LList x = new LList();
      x.addLast("Werd");
      x.addLast("Xenix");
      x.addLast("Zen");
      x.addFirst("First!");
      assertEquals("First!", x.head.data);
      assertEquals("Werd", x.head.next.data);
      assertEquals("Xenix", x.head.next.next.data);
   }
   
   @Test
   public void testAddFirst2()
   {
      LList x = new LList();
      x.addFirst("First!");
      assertEquals("First!", x.head.data);
      assertEquals(null, x.head.next);
      
      x.addFirst("Really first");
      assertEquals("Really first", x.head.data);
      assertEquals("First!", x.head.next.data);
   }
   
   @Test
   public void testSet()
   {
      LList x = new LList();
      x.addLast("Werd");
      x.addLast("Xenix");
      x.addLast("Zen");
      x.addFirst("First!");
      x.set(2, "Third");
      assertEquals("Third", x.head.next.next.data);
   }
}