
public class Wrapper {

	public static void main(String[] args) {
		String name = "Jordan";
		
		System.out.println(name.replace('J', 'G'));
		System.out.println(name);
		
		
		StringBuilder sb = new StringBuilder("Morty");
		
		
		// sb.insert(index, "something");
		sb.insert(0, "Rick and ");
		System.out.println(sb);
		
		String number = "42";
		
		Integer num = Integer.parseInt(number);
		
		
		

	}

}
