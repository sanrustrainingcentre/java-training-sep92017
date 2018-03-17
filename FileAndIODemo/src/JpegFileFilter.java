import java.io.File;
import java.io.FilenameFilter;

public class JpegFileFilter implements FilenameFilter {

	public boolean accept(File directory, String fileName) {
		return fileName.endsWith(".jpeg") || fileName.endsWith(".jpg");
	}
	
	

}
