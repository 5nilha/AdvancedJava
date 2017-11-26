import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListStrings {

	public static void main(String[] args) {

		ArrayList<String> names = new ArrayList<String>();

		names.add("Bob");
		names.add("Susan");
		names.add("Ducan");
		names.add("Tom");
		names.add("James");

		names.toArray();

		for (String name : names) {
			System.out.print(name + " ");
		}
		System.out.println("");

		Arrays.asList(names);
		for (String name : names) {
			System.out.print(name + " ");
		}

	}
}
