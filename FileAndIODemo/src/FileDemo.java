import java.awt.List;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		
		File desktopFolder = new File("/Users/santhoshgutta/Desktop");
		
		File newFile = new File(desktopFolder, "test.txt");
		
		try {
			newFile.delete();
			
			boolean fileCreationResult = newFile.createNewFile();
			
			if (fileCreationResult) {
				System.out.println("File with absolute path = [" + newFile.getAbsolutePath() + "] is created succesfully.");
			} else {
				System.out.println("File creation failed.");
			}
			
			System.out.println("canRead = " + newFile.canRead());
			System.out.println("canWrite = " + newFile.canWrite());
			System.out.println("canExecute = " + newFile.canExecute());
			
			File[] roots = File.listRoots();
			
			for (int index = 0; index < roots.length; index++)
			{
				System.out.println(roots[index].getAbsolutePath());
			}
			
			long lastModifiedTimeStamp = desktopFolder.lastModified();
			Date date = new Date(lastModifiedTimeStamp);
			
//			Calendar calendar = Calendar.getInstance();
//			calendar.setTime(date);
//			
//			int month = calendar.get(Calendar.MONTH) + 1;
//			int day = calendar.get(Calendar.DAY_OF_MONTH);
//			int year = calendar.get(Calendar.YEAR);
//			int hour = calendar.get(Calendar.HOUR_OF_DAY);
//			int mins = calendar.get(Calendar.MINUTE);
//			int seconds = calendar.get(Calendar.SECOND);
//			int millis = calendar.get(Calendar.MILLISECOND);
//			
//			System.out.println(year + "-" + month + "-" + year + " " + hour + ":" + mins + ":" + seconds + "." + millis);
//			
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MMM-yyyy hh:mm:ss.SSS Z");
			String dateInStringFormat = simpleDateFormat.format(date);
			System.out.println(dateInStringFormat);
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		File directories = new File("/Users/santhoshgutta/Desktop/Folder1/Folder2/Folder3");
		directories.mkdirs();
		
		File unknownFolder = new File("/Users/santhoshgutta/Desktop/aksdhfklasdfasdf");
		unknownFolder.mkdir();
		
		File unknownFile = new File(unknownFolder, "Document1.txt");
		unknownFile.createNewFile();
		
		File folder1 = new File("/Users/santhoshgutta/Desktop/Folder1");
		File[] allFilesAndFoldersUnderFolder1 = folder1.listFiles();
		
		for(int index = 0; index < allFilesAndFoldersUnderFolder1.length; index++) {
			System.out.println(allFilesAndFoldersUnderFolder1[index].getAbsolutePath());
		} 
		
		System.out.println("Printing ONLY JPEG files");
		
		JpegFileFilter jpegFileFilter = new JpegFileFilter();
		WordDocumentFileFilter wordDocumentFileFilter = new WordDocumentFileFilter();
		TextFileFilter textFileFilter = new TextFileFilter();
		
		File[] jpegFiles = folder1.listFiles(jpegFileFilter);
		for(int index = 0; index < jpegFiles.length; index++) {
			System.out.println(jpegFiles[index].getAbsolutePath());
		}

		System.out.println("Printing ONLY TXT files");
		
		File[] textFiles = folder1.listFiles(textFileFilter);
		for(int index = 0; index < textFiles.length; index++) {
			System.out.println(textFiles[index].getAbsolutePath());
		} 
		
		
		

	}

}
