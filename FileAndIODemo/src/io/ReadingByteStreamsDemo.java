package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadingByteStreamsDemo {

	public static void main(String[] args) {
		
		//Step 1. Create a file object
		File inputFile = new File("/Users/santhoshgutta/Desktop/test.txt");
		
		//Step 2: Create a byte oriented stream object
		//For files this will be java.io.FileInputStream
		try {
			FileInputStream fileInputStream = new FileInputStream(inputFile);
			
			//Step 3: Start reading the file
			int data = fileInputStream.read();
			System.out.print((char) data);

			while (data != -1) {
				data = fileInputStream.read();

				if (data != -1) {
					//Step 4: Print the data onto the console
					System.out.print((char) data);
				}
			}
			
			//Step 5: close the input stream connection
			fileInputStream.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
