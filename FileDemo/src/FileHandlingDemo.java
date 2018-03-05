import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

public class FileHandlingDemo {

	public static void main(String[] args) {
		
		
		// 1. Encapsulating root folder and printing its free space in bytes
		// '/' is root folder for UNIX and MAC OS
		// 'C:\' is the root folder for C Drive
		System.out.println("1. Printing the root drive free space");
		File rootFolder = new File("/");
		long freeSpace = rootFolder.getFreeSpace();
		System.out.println(freeSpace + " bytes");
		System.out.println((freeSpace/(1024.0 * 1024 * 1024) + " GB"));
		
		System.out.println("============================================");
		System.out.println("2. Listing the roots");
		//listing the nodes or roots
		File[] roots = File.listRoots();
		for (int index = 0; index < roots.length; index++) {
			System.out.println(roots[index].getAbsolutePath());
		}
		
		//3. Printing the name of the directory
		System.out.println("============================================");
		System.out.println("3. Printing the name of the directory");
		File testFolderDir = new File("/Users/santhoshgutta/Desktop/TestFolder");
		System.out.println(testFolderDir.getName());
		System.out.println(testFolderDir.getPath());
		System.out.println(testFolderDir.getAbsolutePath());
		System.out.println("Parent => " + testFolderDir.getParent());
		
		//4. Printing File attributes
		System.out.println("============================================");
		System.out.println("4. File Attributes");
		System.out.println("Is Absolute => " + testFolderDir.isAbsolute());
		System.out.println("Is Directory => " + testFolderDir.isDirectory());
		System.out.println("Is File => " + testFolderDir.isFile());
		
		long lastModified = testFolderDir.lastModified();
		System.out.println("Last Modified date as long value => " + lastModified);
		
		Date date = new Date(lastModified);
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		
		int year = calendar.get(Calendar.YEAR);
		int month = (calendar.get(Calendar.MONTH) + 1);
		int day = calendar.get(Calendar.DAY_OF_MONTH);
		int hours = calendar.get(Calendar.HOUR_OF_DAY);
		int mins = calendar.get(Calendar.MINUTE);
		int seconds = calendar.get(Calendar.SECOND);
		int milliseconds = calendar.get(Calendar.MILLISECOND);
		
		System.out.println("Last Modified date => " 
						+ (year + "-" + month + "-" + day) 
						+ " " 
						+ hours + ":" + mins + ":" + seconds 
						+ "." 
						+ milliseconds);
		
		//5. Creating a file
		File testNewFile = new File(testFolderDir, "TestFile.txt");
		
		try {
			testNewFile.createNewFile();	
			System.out.println("Length of the file: " + testNewFile.length());
			
			if (testNewFile.exists()) {
				testNewFile.delete();
			}
			
			System.out.println("testNewFile exists after deletion? => " + testNewFile.exists());
			
		} catch (IOException e) {
			System.out.println("Could not create a new file." + e.getMessage());
		}
		
		File filesUnderRoot[] = rootFolder.listFiles();
		for (int index = 0; index < filesUnderRoot.length; index++) {
			System.out.println(filesUnderRoot[index].getAbsolutePath());
		}
	
		File[] jpegFiles = testFolderDir.listFiles(new JpegFileFilter());
		
		for (int index = 0; index < jpegFiles.length; index++) {
			System.out.println(jpegFiles[index].getAbsolutePath());
		}
		
		File[] txtFiles = testFolderDir.listFiles(new TextFileFilter());
		
		for (int index = 0; index < txtFiles.length; index++) {
			System.out.println(txtFiles[index].getAbsolutePath());
		}
		
		
		

	}

}
