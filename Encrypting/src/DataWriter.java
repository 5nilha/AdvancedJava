import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class DataWriter {

	public static void write(String text) {
		try {
			File file = new File("encryptionFile.txt");

			if (file.createNewFile()) {

				FileWriter writer = new FileWriter(file);
				writer.write(text);
				writer.close();

			} else {
				System.out.println("File Alread exists");

			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
