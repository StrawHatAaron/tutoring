/*
 * Name:    Chase Terry    
 * Course:  CS12    
 * Date:    11/15/16    
 * Filename:DamCT   
 * Purpose: dam program for calculating dam data
 */

import java.lang.Math;

public class DamCT extends CS12Date{
   
   //declarations
   public String name;
   public int year;
   public double storage;
   public double capacity;
   public double inflow;
   public double outflow;
   public CS12Date date;

  
   
   //final constants
   private final int YEAR_MIN = 1900;
   private final int STOR_MIN = 0;
   private final int CAP_MIN = 0;
   private final int IN_MIN =0;
   private final int OUT_MIN = 0;   
   
   //default constructor 
   public DamCT(){
      this.name = "Folsom";
      this.year = 1901;
      this.storage = 0;
      this.capacity = 0;
      this.inflow = 0;
      this.outflow = 0;
      this.date = new CS12Date();
    
   }
   
   //constructors that customizes ALL variables
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
   
   //constructors that customizes ONLY name/year
   public DamCT(String name, int year){
      this.name = name;
      this.year = year;
   }
   
   //constructors that customizes ONLY name/capacity
   public DamCT(String name, double capacity){
      this.name = name;
      this.capacity = capacity;
   }
   
   //toString method print and return data of dam obj
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
    
   //print method for all data
   public void print(){
      System.out.printf("Name:\t\t\t\t\t  %s %n", this.name);
      System.out.printf("Age [yrs]:\t\t\t  %,d %n", this.year);
      System.out.printf("Storage [acre-ft]:  %,.0f %n", this.storage);
      System.out.printf("Capacity [acre-ft]: %,.0f %n", this.capacity);
      System.out.printf("Inflow [cu-ft/s]:\t  %,.0f %n", this.inflow);
      System.out.printf("Outflow [cu-ft/s]:  %,.0f %n", this.outflow);
      if(date!=null){
         System.out.println("Data as of:         " + this.date);
      }
      //System.out.print(); 
   }
   
   //print method of string in print box
   public void print(String message){
      System.out.println("----------------------------------------------------");
      System.out.println(message);
      System.out.println("Name: " + this.name);
      System.out.println("Year: " + this.year);
      System.out.println("Storage: " + this.storage);
      System.out.println("Capacity: " + this.capacity);
      System.out.println("Inflow: " + this.inflow);
      System.out.println("Outflow: " + this.outflow);
      if(date!=null){
         System.out.println("Date Stamp: " + this.date);
      }
      System.out.println("----------------------------------------------------");
   }
   
   //return name of dam
   public String getName(){
      return name;
   }
   
   //sets new name with string
   public void setName(String name){
      this.name=name;
   }
   
   //sets name using scanner or gui
   public void setName(boolean mode){
      name = UtilsCT.readString("Please enter a dam name: ", mode);
   }
   
   //method returns year
   public int getYear(){
      return year;
   }
   
   //method sets year
   public void setYear(int year){
      if(year>YEAR_MIN){
         this.year = year;
      }
      else {
         System.out.println("ERROR: invalid year value, unchanged");  
      }      
   }
   
   //sets year using scanner or gui
   public void setYear(boolean mode){
      int temp = this.year;
      year = UtilsCT.readInt("Please enter an intager dam year ", mode);
      if(year>YEAR_MIN){
      }
      else {
         System.out.println("ERROR: invalid year value, unchanged");
         this.year = temp;  
      }             
   }
 
   //method returns storage
   public double getStorage(){
      return storage;
   }
   
   //method sets storage
   public void setStorage(double storage){
      if (storage>=0.0 && storage<=this.capacity){
         this.storage = storage;
      }
      else {
         System.out.println("ERROR: invalid year value, unchanged");
           
      }
        
   }
   
   //sets storage using scanner or gui
   public void setStorage(boolean mode){
      double temp = this.storage; 
      storage = UtilsCT.readDouble("Please enter a decimal number for storage: ", mode);
      if (this.storage>=0.0 && storage<=this.capacity){
         this.storage = storage;
      }
      else {
         System.out.println("ERROR: invalid storage value, unchanged");
         this.storage = temp;
      }    
   }
   
   //method returns capacity
   public double getCapacity(){
      return capacity;
   }
   
   //method sets capacity
   public void setCapacity(double capacity){
      if (capacity>=0.0 && this.storage<=capacity){
         this.capacity = capacity;
      }
      else {
         System.out.println("ERROR: invalid capacity value, unchanged");       
      }
   }
   
   //sets capacity using scanner or gui
   public void setCapacity(boolean mode){
      double temp = this.capacity;
      capacity = UtilsCT.readDouble("Please enter a decimal number for capacity: ", mode);
      if (capacity>=0.0 && this.storage<=capacity){
         this.capacity = capacity;
      }
      else {
         System.out.println("ERROR: invalid capacity value, unchanged");
         this.capacity = temp;
      }
   }
   
   //method returns inflow
   public double getInflow(){
      return inflow;
   }
   
   //method sets inflow
   public void setInflow(double inflow){
      if(inflow>=0.0){
         this.inflow = inflow;
      }
      else {
         System.out.println("ERROR: invalid inflow value, unchanged");    
      }
   }
   
   //sets inflow using scanner or gui
   public void setInflow(boolean mode){
      double temp = this.inflow; 
      inflow = UtilsCT.readDouble("Please enter a decimal number for inflow: ", mode);   
      if (inflow>=0.0){
         this.inflow = inflow;
      }
      else {
         System.out.println("ERROR: invalid inflow value, unchanged");
         this.inflow = temp;
      }    
   
   }
   
   //method returns outflow
   public double getOutflow(){
      return outflow;
   }
   
   //method set outflow
   public void setOutflow(double outflow){
      if(outflow>=0.0){
         this.outflow = outflow;
      }
      else {
         System.out.println("ERROR: invalid outflow value, unchanged");    
      }    
   }
   
   //sets outflow scanner or gui
   public void setOutflow(boolean mode){
      double temp = this.outflow; 
      outflow = UtilsCT.readDouble("Please enter a decimal number for outflow: ", mode);   
      if (outflow>=0.0){
         this.outflow = outflow;
      }
      else {
         System.out.println("ERROR: invalid outflow value, unchanged");
         this.outflow = temp;
      }    
   }
   
   //method return CS12 date obj
   public CS12Date getDate(){
      CS12Date temp = new CS12Date();
      temp.setMonth(this.date.getMonth());
      temp.setDay(this.date.getDay());
      temp.setYear(this.date.getYear());
      return temp;
   }
   
   //method sets new date
   public void setDate(CS12Date date){
      (this.date).setMonth(date.getMonth());
      (this.date).setDay(date.getDay());
      (this.date).setYear(date.getYear());    
   }
   
   //sets date using scanner or gui
   public void setDate(boolean mode){
      System.out.println("What is the new date stamp you want for the damn?");
      int m = UtilsCT.readInt("Enter a month: ", mode);
      (this.date).setMonth(m);
      int d = UtilsCT.readInt("Enter a day: ", mode);
      (this.date).setDay(d);
      int y = UtilsCT.readInt("Enter a year: ", mode);
      (this.date).setYear(y);
          
   }
 
   //method checks dam objects equivalence/returns true if equal 
   public boolean equals(DamCT obj){
      if((obj.year==this.year)&&(obj.name.equals(this.name))&&(obj.storage==this.storage)
       &&(obj.capacity==this.capacity)&&(obj.inflow==this.inflow)&&(obj.outflow==this.outflow)
       &&(this.date.equals(obj.date))){
         
         return true;  
      }
      return false;
   }
   //method gets age 
   public int getAge() {
      return UtilsCT.getAge(date);
   }
   //method gets dam status
   public String getStatus() {
      if(this.inflow>this.outflow) {
         return "filling";
      }
      else if (inflow<outflow) { 
         return "emptying";     
      }
      else {
         return "holding";
      }
       
   }
   //method gets capacity filled percent 
   public double getPercentFull() {
      double percentage = (this.storage/this.capacity)*100;
      if(this.capacity == 0.0) {
         System.out.println("ERROR: capacity is 0, percent unchanged");
         return 0.0;
      }
      return percentage;
   }
   //method get days till event
   public int getEventDays() {
      double time;
      double c1 = 43560;
      double c2 = 3600;
      double c3 = 24;
      double c = c1/(c2*c3);
       
      if(getStatus().equals("filling")) {
         time = ((capacity-storage)/(inflow-outflow)) * c;
      }
      else if(getStatus().equals("empyting")) {
         time = (storage/(outflow-inflow));
      } 
      else {
         time = -1;
      }
      time = Math.floor((int)time);
      int temp = ((int)time);
      return temp;
   }
   //gets event date
   public CS12Date getEventDate() {
      int daysTillEvent = getEventDays();
      CS12Date event = new CS12Date();
      event.laterDate(daysTillEvent); 
   
      return event; 
   }
   //allows user to updates dates
   public void update(boolean inputMode) {
      setName(inputMode);
      setYear(inputMode);
      setStorage(inputMode);
      setCapacity(inputMode);
      setInflow(inputMode);
      setOutflow(inputMode);
      setDate(inputMode);
   }
   //method to set imported water
   public void importWater(double acreFeet) {
      double temp;
      if(acreFeet <= 0.0) {
         System.out.println("ERROR: imported wtaer must be greater or equal to 0.0, value unchanged");
      }
       
      else if((this.capacity - this.storage)<(acreFeet)) {
         System.out.println("ERROR: dam overflow");
         temp = this.storage + acreFeet;
         setStorage(temp);       
      }
       
      else { 
         temp = this.storage + acreFeet;
         setStorage(temp);  
      }
   
   }
   //method to set released water
   public void releaseWater(double acreFeet) {
      double temp;
      if(acreFeet <= 0.0) {
         System.out.println("ERROR: released water must be greater or equal to 0.0, value unchanged");
      }
           
      else if((this.storage)<(acreFeet)) {
         System.out.println("ERROR: dam empty");
         temp = this.storage - acreFeet;
         setStorage(temp);       
      }
       
      else { 
         temp = this.storage - acreFeet;
         setStorage(temp);  
      }
   
   }
   //method to set increase outflow
   public void increaseOutflow(double cuFtSec) {
      double temp;
      if(this.storage == 0) {
         System.out.println("ERROR: no outflow rate if there is no storage");
      }
      else if(cuFtSec <= 0.0) {
         System.out.println("ERROR: increase outflow must be greater or equal to 0.0, value unchanged");
      }
      else { 
         temp = this.outflow + cuFtSec;
         setOutflow(temp);  
      }
   
   }
   //method to set decrease outflow
   public void decreaseOutflow(double cuFtSec) {
      double temp;
      if(this.storage == 0) {
         System.out.println("ERROR: no outflow rate if there is no storage");
      }
      else if(cuFtSec <= 0.0) {
         System.out.println("ERROR: decrease outflow must be greater or equal to 0.0, value unchanged");
      }
           
      else if((this.outflow)<(cuFtSec)) {
         System.out.println("ERROR: outflow cannot be less than 0");
         setOutflow(0);       
      }
       
      else { 
         temp = this.outflow - cuFtSec;
         setOutflow(temp);  
      }
   
   }

   
   //method tests
   public static void main (String[] args){
      //CS12Date objects and DamCT object created
      CS12Date today = new CS12Date();
      CS12Date dFolsom = new CS12Date(1,6,2001);
      DamCT def = new DamCT();
      DamCT folsom = new DamCT("local", 1995, 99.9, 999.9, 99.9, 99.98, dFolsom);
      DamCT ohio = new DamCT("Great", 1945);
      DamCT checks = new DamCT("Awesome", 196634.43);
       //Print along with increase decrease, increase, import water, realease water 
      folsom.print();
      folsom.decreaseOutflow(4.234);
      folsom.print("Decreased outflow rate by 4.234");
      folsom.increaseOutflow(4.234);
      folsom.print("Increased outflow rate to original");
      folsom.importWater(7.777);
      folsom.print("Increase storage by 7.777");
      folsom.releaseWater(7.777);
      folsom.print("Decrease storage to original amount");
       //calling update method
      def.update(true);
      def.print("print values just entered in");
      def.update(false);
      def.print("print values just entered");
      ohio.print("ohio dam before modifcation from the set/mutator methods");
       //set/mutator methods 
      ohio.setName("chase is awesome");
      ohio.setYear(1995);
      ohio.setStorage(54.345);
      ohio.setCapacity(5123.53);
      ohio.setInflow(30.0);
      ohio.setOutflow(34.0);
      folsom.setDate(today);
      System.out.println();
      folsom.getEventDate();
       //Accsessor Methods
      System.out.println("Days till folsom event" + folsom.getEventDays());
      System.out.println("Percent folsom is full"+  folsom.getPercentFull()); 
      System.out.println("Age of folsom damn"+ folsom.getAge()); 
      System.out.println("Folsom = folsom"+ folsom.equals(folsom)); 
      System.out.println("Folsom = ohio " + folsom.equals(ohio));
       //gui for setting new date
      folsom.setDate(true);
       //Accessor methods
      System.out.println("Date: "+folsom.getDate()+ " Outflow: " + folsom.getOutflow()+ " Inflow: " + folsom.getInflow()+" Capacity: " + folsom.getCapacity() +" Stroage: "+ folsom.getStorage()+ " Year: " + folsom.getYear()+" Name" + folsom.getName());
       
   }
}
