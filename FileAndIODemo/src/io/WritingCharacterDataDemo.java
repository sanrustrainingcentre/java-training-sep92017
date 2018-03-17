package io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class WritingCharacterDataDemo {

	public static void main(String[] args) {
		
		//Step 1. Create a file object
		File outputFile = new File("/Users/santhoshgutta/Desktop/test_output.txt");
		
		//Step 2: Create a byte oriented stream object
		//For files this will be java.io.FileReader
		try {
			FileWriter fileWriter = new FileWriter(outputFile);
			String data = "asjdkgfaksdgf kajsjdgfk asdhgf akhjsdgf aksdgf akhjsdg fkahsdjfg kajhs";
			
			//Step 3: Write data to a file
			fileWriter.write(data);
			
			//Step 4: Close the reader connection
			fileWriter.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
