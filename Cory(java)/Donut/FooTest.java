public class FooTest
{
   public static void main( String [] args )
   {
      Drawable d1 = new Rectangle( 2, 3 ) ;
      Drawable d2 = new Triangle( 4, 5 ) ;
      Drawable d3 = new Ellipse( 3, 8 ) ;
      Drawable d4 = new Trapezoid( 3, 8, 10 ) ;

      System.out.println( "Rect area: " + d1.getArea() ) ;
      System.out.println( "Triangle area: " + d2.getArea() ) ;
      System.out.println( "Ellipse area: " + d3.getArea() ) ;
      System.out.println( "Trapezoid area: " + d4.getArea() ) ;
   }
}
