import javax.swing.*; 
public class PostFixEvalView extends JFrame
{
   public PostFixEvalView()
   {//create view
      super("Post Fix Evaluator");
      setSize(250,300);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      //
      //
      setVisible( true );
   }
   public static void main(String[] args)
   {
      PostFixEvalView pfev = new PostFixEvalView();
   }
}