import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class MainTest {

	public static void main(String[] args) {

		int[] numbers = {1, 2, 3, 4, 5};
		Object a = Integer.valueOf(10);
		String file = null;
		Object o = null;
		String name = "Bob";
		
//		numberFormatException(name);
//		nullPointerException(o);
//		illegalArgument("File", file);
//		fileNotFound();
//		classCastException(a);
//		negativeArraySize(-1);
		
	}

	public static int arrayIndexOutOfBounds(int[] numbers) {
		Scanner input = new Scanner(System.in);
		int index;
		int number = 0;
		
		try {
			System.out.print("Enter the index: ");
			index = input.nextInt();
			number = numbers[index];
		}
		catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("Index too big");
		}
		
		return number;
	}
	
	public static void classCastException(Object a) {
		String s = (String) a;	
	}
	
	public static String illegalArgument(String directory, String file) {
		
		if (directory == null) {
			throw new IllegalArgumentException("Directory cannot be null!");
		}
		if (file == null) {
			throw new IllegalArgumentException("File cannot be null");
		}
		return directory + File.separator + file;
	}
	
	public static void nullPointerException(Object obj) {
		
		System.out.println(obj.toString());
	}
	
	public static void numberFormatException(String name) {
		int i;
		
		i = Integer.parseInt(name);
		System.out.println(i);
	}
	
	public static void fileNotFound() {
		try {
			FileReader fileReader = new FileReader("Bob");
		}
		catch (FileNotFoundException fnfe) {
			System.err.println(fnfe.getMessage());
		}
	}
	
	public static void negativeArraySize(int size) {
		int [] array = new int [size];
	}
	
}
