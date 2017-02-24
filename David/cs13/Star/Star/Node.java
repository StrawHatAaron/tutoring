public class Node<X>
{
   X data;
   Node<X> next;
   
   public Node(X d, Node<X> n)
   {
      data = d;
      next = n;
   }
}