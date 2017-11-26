import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class CountWordsTest {

	public static void main(String[] args) {

		ArrayList<String> words = new ArrayList<String>();

		try {
			Scanner scan = new Scanner(new File("src/file/assignment5.txt"));
			StringTokenizer st;

			while (scan.hasNextLine()) {
				String line = scan.nextLine();

				st = new StringTokenizer(line);

				while (st.hasMoreTokens()) {
					words.add(st.nextToken());
				}
			}
			scan.close();
		} catch (Exception ex) {
			System.err.println(ex.getMessage());
		}

		System.out.println(words.size());

	}

}
