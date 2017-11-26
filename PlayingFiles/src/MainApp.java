import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MainApp {

	public static void main(String[] args) {
		

		File file = new File("testFile.txt");
		
		try {
			FileWriter writer= new FileWriter(file);
			
			writer.write("Hello test");
			writer.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
