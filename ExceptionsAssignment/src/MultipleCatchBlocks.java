import java.util.Random;

public class MultipleCatchBlocks {

	public static void main(String[] args) {
		Random r = new Random();
		int [] array = {10, 20};
		int result = 0;
		
		try {
			result = array[r.nextInt(array.length + 1)] / r.nextInt(2);
		}
		catch (ArithmeticException ae) {
			System.out.println("ArithmeticException : Cannot Divide by 0");
		}
		catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("ArrayIndexOutOfBoundsException : Index size too big");
		}
		
		System.out.println("Result = " + result);

	}

}
