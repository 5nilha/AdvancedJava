import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parsing2 {

	public static void main(String[] args) {
		String myString = "Mahendra is pretty awesome (523)555-1212";

		String myRegex = "[0-9]";
//		String myregex = "\\d";
		
		
		Pattern checkRegex = Pattern.compile(myRegex);
		Matcher regexMatcher = checkRegex.matcher(myString);
		
		while (regexMatcher.find()) {
			System.out.println(regexMatcher.group().trim());

		}
		

	}

}

