import java.util.ArrayList;
import java.util.Arrays;

public class SortingFun {

	public static void main (String[] args){
		
		int[] array = {42, 33, 23, 2, 4, 97, 256, 12};
		
		for (int var : array) {
			System.out.print(var + " ");
		}
		
		System.out.println("\n------------------------");
		Arrays.sort(array);
		
		for (int var : array) {
			System.out.print(var + " ");
		}
		
		System.out.println("\n------------------------");
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(42);
		list.add(85);
		list.add(3);
		list.add(96);
		list.add(54);
		
		list.sort(null);
		
		System.out.println(list);

		
		
		
		
		
		
	}
	
}
