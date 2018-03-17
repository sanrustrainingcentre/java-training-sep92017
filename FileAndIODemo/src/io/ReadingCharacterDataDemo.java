package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadingCharacterDataDemo {

	public static void main(String[] args) {
		
		//Step 1. Create a file object
		File inputFile = new File("/Users/santhoshgutta/Desktop/test4.txt");
		
		//Step 2: Create a byte oriented stream object
		//For files this will be java.io.FileReader
		try {
			FileReader fileReader = new FileReader(inputFile);
			
			//Step 3: Read the character
			//Method1 --------
//			char[] data = new char[4096];
//			int lastCharacter = fileReader.read(data);
//			String str = new String(data);
//			
//			while (lastCharacter != -1) {
//				data = new char[4096];
//				lastCharacter = fileReader.read(data);
//				str += (new String(data));
//			}
//			
//			System.out.println(str);
			
			//Method2 --------
//			StringBuffer sb = new StringBuffer();
//			int data = fileReader.read();
//			
//			while(data != -1) {
//				sb.append((char) data);
//				
//				data = fileReader.read();
//			}
			
//			//Method 3-----------
			StringBuffer sb = new StringBuffer();
//			String data = "";

			BufferedReader br = new BufferedReader(fileReader);
			String str = br.readLine();
			
			while(str != null) {
				sb.append(str);
//				data = data + str;
				str = br.readLine();
			}
			
			System.out.println(sb.toString());
			
			//Step 4: Close the reader connection
			fileReader.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
