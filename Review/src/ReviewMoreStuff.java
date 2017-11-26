
public class ReviewMoreStuff {

	public static void main(String[] args) {
		
		// selection : if else, switch, ? : conditional 
		// repetition: while, do-while, for, enhanced for loop
		
		int a = 10, b = 6, c;
		
		int[] array =  {10, 20, 30, 40, 50};
		
		
		for (int element : array) {        // For each element in the array
			System.out.println(element);
		}
		
		while (a > b) {
			System.out.println(b);
			b++;
		}
		
		do {
			System.out.println(b);
			b++;
		} while (a > b);
		
		
		for ( int i = 0, j = 5; i < 10; ++i, j--) {
			System.out.println(i);
			System.out.println(j);
			
			if (i + j == 5) {
				break;
			}
			
		}
		
		c = a > b ? 23 : a / b;
		
		System.out.println(a > b ? 5 : 34.78);
		
		if (a > b) {
			a = 10;
		}
		else {
			b = a / b;
			c = b + a;
		}
		
		switch ("Colin") {
		
		case "Bob": 
			break;
		case "Colin":
			break;
		}
		
		
		
		switch (5) {
		
		case 0:
			System.out.println("It's a 0");
			break;
		case 1:
			System.out.println("It's a 1");
			break;
		default:
			System.out.println("not 1 or 2");
			break;
		}

	}

}
