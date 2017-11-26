import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parsing3 {

	public static void main(String[] args) {
		String myString = "Aia Bwh6a Dnk8t Ft2o 9gnm Pomi Ab2a 5ren";
		String message = "";
		StringBuilder messageAnotherWay = new StringBuilder();
		String pattern = "[A-Z].|\\d.";
		
		Pattern checkRegex = Pattern.compile(pattern);
		Matcher regexMatcher = checkRegex.matcher(myString);
		
		while (regexMatcher.find()) {
//			System.out.println(regexMatcher.group().trim());
			message += myString.charAt(regexMatcher.end() -1);
			messageAnotherWay = messageAnotherWay.append(regexMatcher.group().substring(1));
			//indexOf(regexMatcher.end())		
		}
		System.out.print(message);
		System.out.print("\n\n");
		System.out.print(messageAnotherWay);
	}
}
