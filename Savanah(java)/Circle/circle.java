public class Circle{
   double radius, circum, are;
   
   public  Circle(double r){
      radius = r;
      
   }  
   
   public double circumference(double r){
      circum = r * 3.14;
      return circum;
   }
   
   public double area(double r){
      are = r * Math.pow(3.14, 2);
      return are;
   }
   
   public static void main (String[] args){
      
      double c = 2.1;
      double a = area(c);
      System.out.println(a);
   }
}