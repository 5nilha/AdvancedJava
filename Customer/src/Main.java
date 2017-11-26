
public class Main {

	public static void main(String[] args) {

		Customer chelsea = new Customer(1, "Chelsea", "Stouk", "chelsea@gmail.com");
		Customer juliane = new Customer(2, "Juliane", "Martek", "juliane@gmail.com");
		Customer chelsea2 = new Customer(3, "Chelsea", "Stouk", "chelsea@gmail.com");
		Customer jordan = new Customer(4, "Jordan", "Dulaney", "jdulaney@hotmail.com");

		System.out.println(chelsea.toString());
		System.out.println(juliane.toString());
		System.out.println(chelsea2.toString());
		System.out.println(jordan.toString());

		System.out.println(chelsea.compare(juliane));
		System.out.println(jordan.compare(chelsea));
		System.out.println("");

		System.out.println(chelsea.getFirstName() + " " + chelsea.getLastName() + " is Equal " + chelsea2.getFirstName()
				+ " " + chelsea2.getLastName() + " : " + chelsea.equals(chelsea2));
		System.out.println(chelsea.getFirstName() + " " + chelsea.getLastName() + " is Equal " + juliane.getFirstName()
				+ " " + juliane.getLastName() + " : " + chelsea.equals(juliane));

	}

}
