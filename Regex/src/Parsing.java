import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parsing {

	public static void main(String[] args) {
		String myString = "Mahendra is pretty awesome (523)555-1212";
		String myRegex = "[A-Za-z]+\\s";
//		String myRegex = "[0-9]";
//		String myregex = "\\d";
		
		
		Pattern checkRegex = Pattern.compile(myRegex);
		Matcher regexMatcher = checkRegex.matcher(myString);
		
		while (regexMatcher.find()) {
			System.out.println(regexMatcher.group().trim());
			System.out.println("Array " + regexMatcher.start());
			System.out.println("to " + regexMatcher.end());
		}
		

	}

}
