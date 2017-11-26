import java.io.FileNotFoundException;
import java.io.FileReader;

public class HelloExceptions {

	public static void main(String[] args) {
		int a = 10, b = 6, c;
		// a = b / 0;

		// if (a > b) {
		// throw new ArithmeticException( "Horrible Problem" );
		// }

		try {
			foo();
		} catch (CustomerRecordsMissingException crme) {
			String message = crme.getMessage();
			System.out.println(message);
		}

	}

	private static void foo() throws CustomerRecordsMissingException {
		if (10 > 5) {
			throw new CustomerRecordsMissingException("Im in foo with an important message");
		}

		try {
			foo2();
		} catch (ArithmeticException ae) {
			System.out.println("Dealing with the exception");
		} catch (FileNotFoundException fnfe) {
			System.out.println("The file wasn't found!!!");
		}
		// catch(Exception e) {
		// System.out.println("Handling another exception");
		// }
		finally {
			System.out.println("Always happens");
		}
	}

	private static void foo2() throws FileNotFoundException {
		int e = 45;
		System.out.println("in foo2");

		FileReader fileReader = new FileReader("Bob");

	}

}
