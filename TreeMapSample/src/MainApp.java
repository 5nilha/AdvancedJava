import java.util.TreeMap;

public class MainApp {
	
	static TreeMap<Integer, String> names = new TreeMap<Integer, String>();
	
	public static void main (String[] args) {
		
		AnotherClass ac = new AnotherClass();
		TreeMap <Integer, String> students = ac.getStudents();
		System.out.println(students.get(2));
		
		addingValues();
		System.out.println(names.get(1));
		
		
	}
	
	public static void addToTree(int key, String value) {
		names.put(key, value);
	}
	
	public static void addingValues() {
		addToTree(1, "Hector");
	}
	
}


class AnotherClass {
	
	private TreeMap<Integer, String> students = new TreeMap<Integer, String>();
	
	public TreeMap<Integer, String> getStudents(){
		return students;
	}
	
	public void setTreeMap(TreeMap<Integer, String> students) {
		this.students = students;
		
		students.put(1, "John");
		students.put(2, "Lauren");
	}
	
	
}