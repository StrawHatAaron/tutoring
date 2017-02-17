import java.text.DecimalFormat;
 
public class BankAccount
{
   public int accountNumber;
   public String owner;
   public double balance;
  
   public BankAccount ( String o, int num)
   {
      accountNumber = num;
      owner = o;
      balance = 0;
   }
  
   public void adjust(double amnt)
   {
      balance += amnt;
   }
  
   
   DecimalFormat df = new DecimalFormat("#0.00");
  
   public double getBalance ()
   {
      return balance;
   }
  
   public int getaccountNumber()
   {
      int x = accountNumber;
      return x;
     
   }
  
   public String toString()
   {
      return  owner + " owns the account " + accountNumber +
             " with the balance of $" + (df.format(balance));
   }

}