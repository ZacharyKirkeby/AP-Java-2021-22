package bankAccount;

public class Account {
	private String name;
	private int accountNumber;
	private double balance;
	
	
	private static int accountNumbers = 1000;
	
	
	public Account(String n, double b) {
		this.name = n;
		this.accountNumber = accountNumbers;
		accountNumber++;
		this.balance = b;
	}
	
	public String toString() {
		return this.name + ", " + this.balance;
	}
	
	public void deposit(double d) {
		this.balance += d;
	}
	
	
	public boolean withdrawl(double d) {
		if (this.balance >= d) {
			this.balance -= d;
			return true;
			
		}else 
			System.out.println("Not enough money");
			return false;
	}
	
	
	public void interest() {
		this.balance *=1.01;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
