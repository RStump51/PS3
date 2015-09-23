package AccountPackage;



public class InsufficientFundsException extends Exception
{
	public double amount;

 

public InsufficientFundsException(double amount)
   {
      this.amount = amount;
   } 
   public double getAmount()
   {
      return amount;
   }
   
}
