public Subs(){
    String meat, tomatoes, peppers, cheese;
     
     //contructor
     public Subs(m,t,p,c){
      m = meat;
      t=tomatoes;
      p=peppers;
      c=cheese;
     }
   public static void main (String[] args){
      Subs italian = new Subs("salami", "ripe Tomatoes", "bell pepper", "provlone");
      System.out.println(italian());
      
   }
}