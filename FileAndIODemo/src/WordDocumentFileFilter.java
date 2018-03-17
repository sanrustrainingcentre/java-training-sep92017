import java.io.File;
import java.io.FilenameFilter;

public class WordDocumentFileFilter implements FilenameFilter {

	public boolean accept(File directory, String fileName) {
		
		return fileName.endsWith(".doc") || fileName.endsWith(".docx");
	}
	

}
