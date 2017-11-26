import java.io.File;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValenciaCourses {

	public static void main(String[] args) {

		try {
			Scanner scan = new Scanner(new File("file/ValenciaCourses.txt"));
			String myRegex = "[A-Z]{3}(\\s)(\\d){4}([A-Z]?)(\\s)(\\d){1}(\\s)(\\d){1}(\\s)(\\d){1}";

			Pattern pattern = Pattern.compile(myRegex);
			Matcher matcher;
			int count = 0;

			while (scan.hasNext()) {
				String line = scan.nextLine();
				matcher = pattern.matcher(line);

				while (matcher.find()) {
					int i = Integer.parseInt(matcher.group().substring(matcher.end() - 1));

					if (i > 3) {
						System.out.println(matcher.group());
						count++;
					}
				}
			}
			System.out.println(count);

		} catch (Exception ex) {
			System.err.println(ex.getMessage());
		}
	}
}
