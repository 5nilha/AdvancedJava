import java.util.Scanner;

public class QuotientWithIf {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Prompt the user with two integers
		System.out.println("Enter two integers: ");
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		
		if (number2 != 0) {
			System.out.println(number1 + " divided by " + number2 + " is equal to " + number1 / number2);
		}
		else {
			System.out.println("Divisor cannot be zero");
		}
	
		

	}

}
