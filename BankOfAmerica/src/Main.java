
public class Main {

	public static void main(String[] args) {
		BankAccount customer1 = new BankAccount(123456, 1234);

		System.out.println("Balance : " + customer1.balance());
		
		customer1.setWithdrawal(50);
		System.out.println("Withdrawal: " + customer1.getWithdrawal());
		
		System.out.println("Balance : " + customer1.balance());
	
		customer1.setWithdrawal(40);
		System.out.println("Withdrawal: " + customer1.getWithdrawal());
		
		customer1.setWithdrawal(20);
		System.out.println("Withdrawal: " + customer1.getWithdrawal());

		System.out.println("Balance : " + customer1.balance());

	}

}
