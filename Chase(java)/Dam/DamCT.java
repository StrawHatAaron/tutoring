import javax.swing.*;
import java.util.*;
public class DamCT{
   
   String name;
   int year;
   double storage;
   double capacity;
   double inflow;
   double outflow;
   public CS12Date date;
    
   public DamCT(){
      this.name = "Folsom";
      this.year = 1955;
      this.storage = 100000.0;
      this.capacity = 1000000.0;
      this.inflow = 1000.0;
      this.outflow = 2000.0;
      this.date = new CS12Date();  
   }
   
   public DamCT(String name, int year, double storage, double capacity, double inflow, 
   double outflow, CS12Date date ){
      this.name = name;
      this.year = year;
      this.storage = storage;
      this.capacity = capacity;
      this.inflow = inflow;
      this.outflow = outflow;
      this.date = date; 
   } 
   
   public DamCT(String name, int year){
      this.name = name;
      this.year = year;
      this.storage = 100000.0;
      this.capacity = 1000000.0;
      this.inflow = 1000.0;
      this.outflow = 2000.0;
      this.date = new CS12Date();
   }
   
   public DamCT(String name, double capacity){
      this.name = name;
      this.capacity = capacity;
      this.year = 1955;
      this.storage = 100000.0;
      this.inflow = inflow;
      this.outflow = outflow;
      this.date = date; 
   
   }
   
   public String toString(){
      String var = name;
      var+= ", ";
      var+= Integer.toString(year);
      var+= ", ";
      var+= Double.toString(storage);
      var+= ", ";
      var+= Double.toString(capacity);
      var+= ", ";
      var+= Double.toString(inflow);
      var+= ", ";
      var+= Double.toString(outflow);
      var+= ", ";
      var+= date.toString();
      System.out.println(var);
      return var;
   }
   
   public void print(){
      System.out.println(name+"\t"+year+"\t"+storage+"\t"+capacity+"\t"+ 
         inflow+"\t"+outflow+"\t"+date.toString());
      System.out.println(); 
   }
   
   public void print(String message){
      System.out.println("----------------------------------------------------");
      System.out.println(message);
      System.out.println(name+"\t"+year+"\t"+storage+"\t"+capacity+"\t"+ 
         inflow+"\t"+outflow+"\t"+date.toString()); 
      System.out.println("----------------------------------------------------");
   }
   //gotta check
   public String getName(){
      return name;
   }
   
   public void setName(String name){
      this.name=name;
   }
   
   public void setName(boolean mode){
      Scanner scan = new Scanner(System.in);
      if (mode==true){
         System.out.println("What is the new name you want for the damn?");
         name = scan.nextLine();
      }
      else if (mode==false){
         name = JOptionPane.showInputDialog(null, "please enter a new name for the dam >");
      }
   }
   
   public int getYear(){
      return year;
   }
   
   public void setYear(int year){
      this.year = year;      
   }
   
   public void setYear(boolean mode){
      Scanner scan = new Scanner(System.in);
      if (mode==true){
         System.out.println("What is the new year you want for the damn?");
         year = scan.nextInt();
      }
      else{
         year = Integer.parseInt(JOptionPane.showInputDialog(null, "please enter a new year for the dam >"));
      }
   }
   
   public double getStorage(){
      return storage;
   }
   
   public void setStorage(double storage){
      this.storage = storage;      
   }
   
   public void setStorage(boolean mode){
      Scanner scan = new Scanner(System.in);
      if (mode==true){
         System.out.println("What is the new Storage you want for the damn?");
         storage = scan.nextDouble();
      }
      else{
         storage = Double.parseDouble(JOptionPane.showInputDialog(null, "please enter a new Storage amount for the dam >"));
      }
   }

   public double getCapacity(){
      return capacity;
   }
   
   public void setCapacity(double capacity){
      this.capacity = capacity;      
   }
   
   public void setCapacity(boolean mode){
      Scanner scan = new Scanner(System.in);
      if (mode==true){
         System.out.println("What is the new capacity you want for the damn?");
         capacity = scan.nextDouble();
      }
      else{
         storage = Double.parseDouble(JOptionPane.showInputDialog(null, "please enter a new Storage amount for the dam >"));
      
      }
   }

   public double getInflow(){
      return inflow;
   }
   
   public void setInflow(double inflow){
      this.inflow = inflow;      
   }
   
   public void setInflow(boolean mode){
      Scanner scan = new Scanner(System.in);
      if (mode==true){
         System.out.println("What is the new In Flow you want for the damn?");
         inflow = scan.nextDouble();
      }
      else{
      //do nothing?
      }
   }

   public double getOutflow(){
      return outflow;
   }
   
   public void setOutflow(double outflow){
      this.outflow = outflow;      
   }
   
   public void setOutflow(boolean mode){
      Scanner scan = new Scanner(System.in);
      if (mode==true){
         System.out.println("What is the new In Flow you want for the damn?");
         outflow = scan.nextDouble();
      }
      else{
         outflow = Double.parseDouble(JOptionPane.showInputDialog(null, "please enter a new outflow rate for the dam >"));
      
      }
   }
   
   public CS12Date getDate(){
      return date;
   }
   
   public void setDate(CS12Date date){
      this.date=date;
   }
   
   public void setDate(boolean mode){
      Scanner scan = new Scanner(System.in);
      if (mode==true){
         System.out.println("What is the new date stamp you want for the damn?");
         System.out.println("Month:");
         int m = scan.nextInt();
         System.out.println("Day:");
         int d = scan.nextInt();
         System.out.println("Year:");
         int y = scan.nextInt();
         date = new CS12Date(m, d, y);
      }
      else{
         int m1 = Integer.parseInt(JOptionPane.showInputDialog(null, "please enter a new month for the dam >"));
         int d1 = Integer.parseInt(JOptionPane.showInputDialog(null, "please enter a new day for the dam >"));
         int y1 = Integer.parseInt(JOptionPane.showInputDialog(null, "please enter a new year for the dam >"));
         date = new CS12Date(m1, d1, y1);
      }
   
   }
   
   public boolean equals (DamCT obj){
      if((obj.year == this.year) && (obj.name.equals(this.name))&&(obj.storage==this.storage)
      &&(obj.capacity==this.capacity)&& (obj.inflow==this.inflow)&&(obj.outflow==this.outflow)){
         
         return true;  
      }
      return false;
   }
   
   public static void main (String[] args){
      //create dams and date stamps
      CS12Date today = new CS12Date();
      UtilsCT u = new UtilsCT();
      DamCT ohio = new DamCT("ohio", 1995, 99.9, 999.9, 99.9, 99.98, today);
      //DamCT folsom = new DamCT();
      //folsom.setDate(true);
      //DamCT folsom1 = new DamCT();
      //checks toString
      //folsom.toString();
      //checks print()
      //folsom.print();
      //checks print(String message)
      //folsom.print("this is the one that contains the message");
      //ohio.print("this is the one that contains the message");
      //check equals
      //folsom1.equals(folsom);
      //check setName(name);
      //System.out.println(ohio.getName());
      //check setName(bool)
      //ohio.setName(false);
      //ohio.setDate(false);
      u.pause();
      System.out.println(ohio.getName());
      u.pause();
      ohio.print();
      //pause();
   }
}