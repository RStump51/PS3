import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import AccountPackage.InsufficientFundsException;

public class PS3_test {
	
	Account a;
	
	
	@Before
	public void setUp() throws Exception {
		a = new Account(1122, 20000.00);
		a.deposit(3000.00);
		a.setAnnualInterestRate(0.045);
		a.withdraw(2500.00);
	
	}

	@After
	public void tearDown() throws Exception {
		a = null;
	}

	@Test(expected = InsufficientFundsException.class)
	public final void withdraw() throws InsufficientFundsException {
		a.deposit(700.00);
		assertEquals("$400 Expected, actual is $500",(long)a.getBalance(),(long)500.00);
        a.withdraw(1000);
	}
	
	@Test
	public void getIDTest()
	
	{
	assertTrue(a.getID() == 1122);
	assertFalse(a.getID() == 7656);
	}
	@Test
	public void getBalanceTest()
	{
	assertTrue(a.getBalance() == 20500.00);
	assertFalse(a.getBalance() == 3000000.00);
	}
	public void getannualInterestRateTest()
	{
		assertTrue(a.getAnnualInterestRate() == 0.045);
		assertFalse(a.getAnnualInterestRate() == 0.055);
	}
	
	public void getMonthlyInterestRateTest()
	{
		assertTrue(a.getMonthlyInterestRate() == 0.00375);
		assertFalse(a.getMonthlyInterestRate() == 0.00889);
	}

	}

