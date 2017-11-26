
public class Customer {

	private String firstName;
	private String lastName;
	private String emailAddress;
	private int customerNumber;

	public Customer(int customerNumber, String firstName, String lastName, String emailAddress) {
		this.customerNumber = customerNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailAddress = emailAddress;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public int getCustomerNumber() {
		return this.customerNumber;
	}

	public void setEmail(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getEmail() {
		return this.emailAddress;
	}

	@Override
	public String toString() {
		String result;
		result = "Customer Number: " + this.customerNumber + "\n" + "Name: " + this.firstName + " " + this.lastName
				+ "\n" + "Email: " + this.emailAddress + "\n";
		return result;
	}

	@Override
	public boolean equals(Object obj) {

		if (!(obj instanceof Customer)) {
			return false;
		}

		boolean result = false;

		if ((this.getFirstName() == ((Customer) obj).getFirstName())
				&& (this.getLastName() == ((Customer) obj).getLastName())
				&& (this.getEmail() == ((Customer) obj).getEmail())) {
			result = true;
		}
		return result;
	}

	public String compare(Customer customer2) {
		Integer customer1_number = this.getCustomerNumber();
		Integer customer2_number = customer2.getCustomerNumber();

		if (customer1_number.compareTo(customer2_number) == -1) {
			return this.getFirstName() + " " + this.getLastName() + " is before " + customer2.getFirstName() + " "
					+ customer2.getLastName();
		} else if (customer1_number.compareTo(customer2_number) == 1) {
			return this.getFirstName() + " " + this.getLastName() + " is after " + customer2.getFirstName() + " "
					+ customer2.getLastName();
		} else {
			return this.getFirstName() + " " + this.getLastName() + " is equal " + customer2.getFirstName() + " "
					+ customer2.getLastName();
		}
	}

}
