import java.io.File;
import java.io.FileFilter;

public class JpegFileFilter implements FileFilter {

	public boolean accept(File file) {
		
		String absolutePathOfFile = file.getAbsolutePath();

		if (absolutePathOfFile.endsWith(".jpg")) {
			return true;
		}
		
		
		return false;
	}
	

}
