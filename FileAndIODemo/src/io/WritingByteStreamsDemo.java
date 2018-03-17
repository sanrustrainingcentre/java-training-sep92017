package io;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WritingByteStreamsDemo {

	public static void main(String[] args) {
		
		//Step 1. Create a file object
		File outputFile = new File("/Users/santhoshgutta/Desktop/test4.txt");
		
		//Step 2: Create a byte oriented stream object
		//For files this will be java.io.FileOutputStream
		try {
			FileOutputStream fileOutputStream = new FileOutputStream(outputFile);
			BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream, 32 * 1024);
			
			String data = "Writing file using FileOutputStream object."
					+ "Writing file using FileOutputStream object."
					+ "Writing file using FileOutputStream object."
					+ "Writing file using FileOutputStream object."
					+ "Writing file using FileOutputStream object."
					+ "Writing file using FileOutputStream object."
					+ "Writing file using FileOutputStream object."
					+ "Writing file using FileOutputStream object."
					+ "Writing file using FileOutputStream object."
					+ "Writing file using FileOutputStream object."
					+ "Writing file using FileOutputStream object."
					+ "Writing file using FileOutputStream object."
					+ "Writing file using FileOutputStream object."
					+ "Writing file using FileOutputStream object."
					+ "Writing file using FileOutputStream object."
					+ "Writing file using FileOutputStream object."
					+ "Writing file using FileOutputStream object."
					+ "Writing file using FileOutputStream object."
					+ "Writing file using FileOutputStream object."
					+ "Writing file using FileOutputStream object."
					+ "Writing file using FileOutputStream object."
					+ "Writing file using FileOutputStream object."
					+ "Writing file using FileOutputStream object."
					+ "Writing file using FileOutputStream object."
					+ "Writing file using FileOutputStream object."
					+ "Writing file using FileOutputStream object."
					+ "Writing file using FileOutputStream object."
					+ "Writing file using FileOutputStream object."
					+ "Writing file using FileOutputStream object."
					+ "Writing file using FileOutputStream object."
					+ "Writing file using FileOutputStream object."
					+ "Writing file using FileOutputStream object."
					+ "Writing file using FileOutputStream object."
					+ "Writing file using FileOutputStream object."
					+ "Writing file using FileOutputStream object."
					+ "Writing file using FileOutputStream object."
					+ "Writing file using FileOutputStream object."
					+ "Writing file using FileOutputStream object."
					+ "Writing file using FileOutputStream object."
					+ "Writing file using FileOutputStream object."
					+ "Writing file using FileOutputStream object."
					+ "Writing file using FileOutputStream object."
					+ "Writing file using FileOutputStream object."
					+ "Writing file using FileOutputStream object."
					+ "Writing file using FileOutputStream object."
					+ "Writing file using FileOutputStream object."
					+ "Writing file using FileOutputStream object."
					+ "Writing file using FileOutputStream object."
					+ "Writing file using FileOutputStream object."
					+ "Writing file using FileOutputStream object."
					+ "Writing file using FileOutputStream object."
					+ "Writing file using FileOutputStream object."
					+ "Writing file using FileOutputStream object."
					+ "Writing file using FileOutputStream object."
					+ "Writing file using FileOutputStream object."
					+ "Writing file using FileOutputStream object."
					+ "Writing file using FileOutputStream object."
					+ "Writing file using FileOutputStream object."
					+ "Writing file using FileOutputStream object."
					+ "Writing file using FileOutputStream object. - End";
			
			//Step 3: Start writing to a file
//			fileOutputStream.write(data.getBytes());
			bufferedOutputStream.write(data.getBytes());
			
			bufferedOutputStream.flush();
			
			//Step 4: close the input stream connection
//			fileOutputStream.close();
			bufferedOutputStream.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
