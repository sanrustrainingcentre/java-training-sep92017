import java.io.File;
import java.io.FilenameFilter;

public class TextFileFilter implements FilenameFilter {

	public boolean accept(File directory, String fileName) {
		
		return fileName.endsWith(".txt");
	}
	

}
