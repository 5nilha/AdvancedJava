import java.util.Random;

public class MainTest {

	static Random rand;
	static long initialMillisecond;
	static long elapsedTimeMillis;

	public static void main(String[] args) {

		try {
			drinkMilk();
		} catch (OutOfMilkException om) {
			System.err.println("The milk is gone." + " A Division by zero occured");
		}

	}

	public static void drinkMilk() throws OutOfMilkException {
		try {
			currentTimeMillis();
		} catch (ArithmeticException ae) {
			String message = "";
			message = message.concat((System.currentTimeMillis() - initialMillisecond) + " Milliseconds.");
			System.out.println("\n" + message);
			throw new OutOfMilkException(message);
		}
	}

	public static long currentTimeMillis() throws OutOfMilkException {

		initialMillisecond = System.currentTimeMillis();

		while (true) {
			rand = new Random();
			int numerator = 5;
			int denominator = rand.nextInt(1001);
			int result = numerator / denominator;
			System.out.print("Gulp");
		}

	}

}
