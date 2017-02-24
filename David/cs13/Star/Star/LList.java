public class LList<X>
{
   Node<X> head;
   Node<X> last;
   
   public LList()
   {
      head = null;
   }
   
   public void addLast(X s)
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
         Node<X> n;
         for (n = head; n.next != null; n = n.next);
         
         // Now we are at the last Node
         n.next = new Node(s, null);
      }
   }
   
   public void add(X s)
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
         Node<X> n;
         for (n = head; n.next != null; n = n.next);
         
         // Now we are at the last Node
         n.next = new Node(s, null);
      }
   }

   public void addFirst(X s)
   {
      
      head = new Node(s, head);
      
   }
   
   // Do this
   public int size()
   { 
      int nodeAmount=1;
      Node<X> n;
      if(head==null)
      {
         return 0; 
       }
      for (n = head; n.next != null; n = n.next){
       nodeAmount+=1; 
      }
      return nodeAmount;
   }
   
   // Do this
   public X get(int index)
   {
         Node<X> n=head;
         for(int i = 0; i < this.size()-1; i++)
          {
            if(n==null)
            {
                throw new Inception();
            }
            n = n.next;
          }
          //return null;
          return n.data;
    
   }
   
   // Do this
   public int indexOf(X target)
   {
      int index = 0; 
      Node<X> n;
      for (n = head; n.next != null; n = n.next){
          if(target==n.data)
            return index;
          index++;  
        }
      return -1;
   }
   
   // Needs work
   public void set(int index, X s){
      Node<X> n = head;   // Start at the head
      for (int i = 0; i < index; i++)  // Count as we go
      { 
         n = n.next;  // Hop to the next Node    
      }
      n.data = s;
   }
   
   public void remove(int index)
   {
      head = null;
   }
   
   public void removeFirst()
   {
      Node<X> n = head;
      if(n==null)
      {
        throw new Inception();
      } 
   
     //for (n = head; n.next!=null; n=n)
     //{
       head=n.next;
    // } 
       
       
   }
   
      public void removeLast()
   {
      Node<X> n = head;
      if(n==null)
      {
        throw new Inception();
      } 
         while(n.next!=null){
           n=n.next;
           if(n.next.next==null){
               n.next=null;
            }
      }
   }
   
   
   
   public void clear()
   {
      head = null; 
    }
   public void insert(int index, X s)
   {
      
   }
   
   // Do this
   public String toString()
   {   
       String allData = "[";
       Node<X> n=head;
       while(n!=null)
       {
           allData+=n.data + ", ";
           n = n.next;
       }
       if(allData!="[")
       {
           allData = allData.substring(0, allData.length()-2);
        }  
       allData += "]";
       return allData;
    }
}





