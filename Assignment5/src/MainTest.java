
public class MainTest {

	public static void main(String[] args) {

		Telephone phone;
		String testString = "My phone number is 407.582.2213";
		try {
			phone = new Telephone(testString);

			System.out.println(phone);

		} catch (InvalidTelephoneException ite) {
			System.err.println(ite.getMessage());
		}

	}

}
