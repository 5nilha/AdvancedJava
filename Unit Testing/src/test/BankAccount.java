package test;

public class BankAccount {

	double balance;
	String Owner;
	
	//deposit
	public void deposit(double amount){
		balance += amount;
	}
	
	//withdraw
	public void withdraw(double amount){
		balance -= amount;
	}
	
}
