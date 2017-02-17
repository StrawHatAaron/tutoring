import java.util.Arrays;

public class IntStack
{//fields
   private int[] stk;
   private int sp;
   
   //constructor
   public IntStack()
   {
      stk = new int[4];
      sp = -1; // stack is empty
      
   }
   // optimus prime constructor
   public IntStack( int s)
   {
      stk = new int[s];
      sp = -1; //stack empty
   }
   public void push (int e) // the thing we are going to push on the stack
   {
      if (! isFull())
      {
         sp++;
         stk[sp]=e;
      }
      else //stack is full
      {
         System.out.println("Stack over flow");
      }
   }//end of push
   public int pop()
   {
      int rv=0; // value to return
      
      if (!isEmpty())
      {
         rv=stk[sp]; // copy data on top of stack into rv
         sp--;
      }
      else
      {
         System.out.println("stack underflow");
      }
      return rv;
   }
   
   public boolean isFull() //is full class
   {
      
      return sp == stk.length-1;
   }
   
   public boolean isEmpty() //is empty class
   {
      return sp==-1;
   }
   
   public int size()
   {
      return sp++;
   }
   
   public String toString()
   {
      int nodeNum = sp + 1;
      int lnn = nodeNum - 1;
      String rv="";
      while(nodeNum!=0){ 
         rv+= "Stack Pointer: " + lnn + " Value of pointer: " + stk[nodeNum-1] + " \n";
         nodeNum--;
         lnn--;
      }
      return rv;
   }// end to string

// main method
   public static void main(String[] args)
   {
      IntStack s= new IntStack(6);
   
      s.pop();
      System.out.println( "Stack is Empty " + s.isEmpty() );
      System.out.println( "Adding ints to stack.." ); 
      s.push (3);
      s.push (2);
      s.push (1);
      s.push (0);
      s.push(45);
      s.push(35);
      System.out.println("The Stack is Full now: "+s.isFull());
      System.out.println(s.toString());
      System.out.println( s.pop() ); // 0
      System.out.println( s.pop() ); // 1
      System.out.println( s.pop() ); // 2
      System.out.println( s.pop() ); // 3
      System.out.println("The Stack is Empty now: "+s.isEmpty());
      System.out.println("Below is the stack Values in or order");
   }
   
   
}