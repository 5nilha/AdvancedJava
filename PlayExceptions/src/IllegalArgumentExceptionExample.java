import java.io.File;

public class IllegalArgumentExceptionExample {

	public static String createRelativePath(String parent, String filename) {
		if (parent == null) {
			throw new IllegalArgumentException("The parent path cannot be null!");
		}
		
		if (filename == null) {
			throw new IllegalArgumentException("The filename cannot be null!");
		}
		
		return parent + File.separator + filename;
	}
	
	
	public static void main(String[] args) {
		System.out.println(createRelativePath("dir1", "file1"));
		
		String file = null;
		
		System.out.println(createRelativePath("dir2", file));

	}

}
