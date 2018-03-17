package io;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

public class ReadImageDemo {

	public static void main(String[] args) {
		
		try {
			//read from network
			URL imageUrl = new URL("https://www.google.ca/logos/doodles/2018/celebrating-george-peabody-4943849993535488-l.png");
			HttpsURLConnection httpsURLConnection = (HttpsURLConnection) imageUrl.openConnection();
			InputStream is = httpsURLConnection.getInputStream();
			
			//read from Hard Disk
//			File inputImage = new File("/Users/santhoshgutta/Desktop/google_image.png");
//			InputStream is = new FileInputStream(inputImage);
			BufferedInputStream bis = new BufferedInputStream(is);
			
			byte[] bytes = bis.readAllBytes();
			
			File outputImageFile = new File("/Users/santhoshgutta/Desktop/google_image.png");
			FileOutputStream fileOutputStream = new FileOutputStream(outputImageFile);
			
			fileOutputStream.write(bytes);
			
			bis.close();
			fileOutputStream.close();
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
