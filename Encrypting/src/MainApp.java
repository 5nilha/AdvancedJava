import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a phrase to encrypt: ");
		String input = scanner.nextLine();

		String passcode = Bitshifter.encrypt(input);
		System.out.println(passcode);
		System.out.println(Bitshifter.decrypt(passcode));

		DataWriter.write(passcode);
		scanner.close();
	}

}
