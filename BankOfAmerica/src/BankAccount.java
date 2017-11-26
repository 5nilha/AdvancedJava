
public class BankAccount {

	private int bankAccount;
	private int cardNumber;
	private int pin;
	private double accountBalance = 100.00;
	private double withdrawalAmount = 0;

	public BankAccount(int cardNumber, int pin) {
		this.cardNumber = cardNumber;
		this.pin = pin;
	}

	public double getWithdrawal() {
		return this.withdrawalAmount;
	}

	public void setWithdrawal(double withdrawalAmount) {

		try {
			if (balance() < withdrawalAmount) {
				throw new Exception("Withdrawal : " + withdrawalAmount + " - Insuficient Funds");
			} else {
				this.withdrawalAmount = withdrawalAmount;
				this.accountBalance = balance() - withdrawalAmount;
			}

		} catch (Exception e) {
			String message = e.getMessage();
			System.out.println(message);
			System.exit(0);
		}

	}

	public double balance() {
		if (this.accountBalance < 20.00) {
			System.out.println("You have less than $20.00 in your Bank account.");
		}
		return this.accountBalance;
	}

	public void menu() {
		System.out.println("Menu Options: \n| 1 | Balance\n | 2 |\nWithdrawal ");
	}

}
