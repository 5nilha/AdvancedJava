import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberValidation {

	public static void main(String[] args) {
		
		
		// test phones: {(123) 456-789, 123 456 789, 123-456-789, (123)456-789, 123.456.789}
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a Phone number: ");
		String phoneNumber = scan.nextLine();
		
		String myRegex = "\\d";
		
		Pattern checkRegex = Pattern.compile(myRegex);
		Matcher regexMatcher = checkRegex.matcher(phoneNumber);
		
		while (regexMatcher.find()) {
			String s = regexMatcher.group();
			System.out.print(s);
		}

	}

}
