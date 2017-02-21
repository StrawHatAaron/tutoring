public class LList
{
   Node head;
   Node last;
   
   public LList()
   {
      head = null;
   }
   
   public void addLast(String s)
   {
      if (head == null)
      {
         head = new Node(s, null);
      }
      else
      {
         //Node n = head;  // Start at the head
         //while (n.next != null)  // As long as there is another Node
         //{
             // Hop to the next one
         //    n = n.next;
         //}
         Node n;
         for (n = head; n.next != null; n = n.next);
         
         // Now we are at the last Node
         n.next = new Node(s, null);
      }
   }
   
   public void addFirst(String s)
   {
      
      head = new Node(s, head);
      
   }
   
   // Do this
   public int size()
   {
      int nodeAmount=0;
      Node n;
      for (n = head; n.next != null; n = n.next){
         nodeAmount++; 
      }
      return nodeAmount;
   }
   
   // Do this
   public String get(int index)
   {
      int i=0;
      Node n=head;
      while(i!=index)
      {
         if(n==null)
         {
            throw new Inception();
         }
         i++;
         n = n.next;
      }
      return n.data;
    
   }
   
   // Do this
   public int indexOf(String target)
   {
      int index = 0; 
      Node n;
      for (n = head; n.next != null; n = n.next){
         if(target==n.data)
            return index;
         index++;  
      }
      return -1;
   }
   
   // Needs work
   public void set(int index, String s)
   {
      Node n = head;   // Start at the head
      for (int i = 0; i <= index; i++)  // Count as we go
      { 
         n = n.next;  // Hop to the next Node    
      }
      n.data = s;
   }
   
   public void remove(int index)
   {
      
   }
   
   // Do this
   public void clear()
   {
      Node n = head;
      for (n = head; n.next != null; n = n.next);
      n=null;
   }
   
   public void insert(int index, String s)
   {
      
   }
   
   // Do this
   public String toString()
   {   
      String allData = "[";
      Node n=head;
      while(n!=null)
      {
         allData+=n.data + ", ";
         n = n.next;
      }
      allData = allData.substring(0, allData.length()-3);
      allData += "]";
      return allData;
   }
}





