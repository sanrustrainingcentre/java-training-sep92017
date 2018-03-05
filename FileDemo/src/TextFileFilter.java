import java.io.File;
import java.io.FileFilter;

public class TextFileFilter implements FileFilter {
	
	public boolean accept(File file) {
		
		if (file.getAbsolutePath().endsWith(".txt")) {
			return true;
		}
		
		return false;
	}

}
