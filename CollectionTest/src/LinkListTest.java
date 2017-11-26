import java.util.Iterator;
import java.util.LinkedList;

public class LinkListTest {
	
	
	public static void main(String[] args) {
		
		
		LinkedList< Student> linky = new LinkedList<Student>();
		Student first = new Student(42, "Mahendra", 1.59);
		Student second = new Student (24, "Bryan", 3.89);
		Student third = new Student (7, "Lucy", 4.00);
		
		linky.add(first);
		linky.add(third);
		linky.add(second);

		Iterator<Student> iterator = linky.iterator();
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next().toString());
		}
		
		Student fourth = new Student(1, "Jullie", 3.00);
		linky.add(2, fourth);  // index, object student
		
		System.out.println("-----------------");
		
		Iterator<Student> iterator2 = linky.iterator();
		
		while (iterator2.hasNext()) {
			System.out.println(iterator2.next().toString());
		}
		
	}

}
