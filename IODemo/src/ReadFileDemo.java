import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadFileDemo {

	public static void main(String[] args) {
		
		//Step 1. Read file from Hard Disk
		File testFile = new File("/Users/santhoshgutta/Desktop/TestFolder/File1.txt");
		System.out.println("Is TestFile exists => " + testFile.exists());
		
		//Step 2. Create an input stream object to read the file.
		//For reading files, you have to use FileInputStream object.
		try {
			InputStream is = new FileInputStream(testFile);
			
			//step 3. Keep reading the data after file input stream object is created.
			int data = is.read();
			
			//if the input stream reached end of the file, then -1 will be received to Java program.
			while (data != -1) {
				//Step 4. Print the data
				System.out.print((char) data);
				
				data = is.read();
			}
			
			//Step 5. Close the file input stream connection
			is.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
