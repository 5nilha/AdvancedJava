import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReadMyFile {

	public static void main(String[] args) throws FileNotFoundException {
		
		///Users/fabioquintanilha/Downloads/names.txt
		File file = new File("/Users/fabioquintanilha/Downloads/names.txt");
		Scanner fileInput;
		
		try {
			fileInput = new Scanner(file);
		}
		catch (FileNotFoundException ex) {
			ex.printStackTrace();
			System.out.println("File not found");
			fileInput = null;
		}
		while (fileInput.hasNextLine()) {
			String line = fileInput.nextLine();
			System.out.println(line);
		}
		
		fileInput.close();
		
		PrintWriter pw = new PrintWriter("myfile.txt");
		pw.write("This is my file");
		pw.close();
		
	}

}
