import java.sql.Date;

public class Account {
	//Data fields for ID, balance, annual interest rate
	//and date created
	private int ID;
	private double balance;
	private double annualInterestRate;
	private Date datecreated;
	
	//no-arg constructor for a default account
	public Account()
	{
		super();
		this.ID = 0;
		this.balance = 0;
	}
	//constructor making an account with specified
	//ID and balance
	public Account(int id, double Balance)
	{
		super();
		this.ID = id;
		this.balance = Balance;
	}
	/**
	 * The next six methods containing get and set
	 * are the accessor and mutator methods for 
	 * Id, balance, and annual interest rate.
	 */
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	//Accessor method for date created
	public Date getDatecreated() {
		return datecreated;
	}
	
	//returns monthly interest rate
	public double getMonthlyInterestRate()
	{
		return (annualInterestRate / 12);
	}
	//withdraws specified amount from the account
	public void withdraw(double amount)
	{
		this.balance = balance - amount;
	}
	// deposits specified amount from the account
	public void deposit(double amount)
	{
		this.balance = balance + amount;
	}
	
		
		
	

}
