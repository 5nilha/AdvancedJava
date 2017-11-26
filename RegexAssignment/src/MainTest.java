import java.io.File;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainTest {

	public static void main(String[] args) {
		
//		File file = new File ("/src/ValenciaCourses.txt");
		
		Scanner scan;
		try {
		scan = new Scanner(new File ("src/ValenciaCourses.txt"));
		
//		String myRegex = "ARH 1000";
//		Pattern pattern = Pattern.compile(myRegex);
//		Matcher matcher;
		
		
		while(scan.hasNext()) {
			System.out.println(scan.nextLine());
//			matcher = pattern.matcher(line);
//			System.out.println(matcher.group().trim());
		}
		
		}
		catch (Exception ex) {
			System.err.println(ex.getMessage());
		}
		
		
		

	}

}
