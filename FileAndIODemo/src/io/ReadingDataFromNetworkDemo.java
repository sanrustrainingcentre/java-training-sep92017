package io;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

public class ReadingDataFromNetworkDemo {

	public static void main(String[] args) {
		
		 
		try {
			URL url = new URL("https://www.oracle.com");
			HttpsURLConnection httpsURLConnection = (HttpsURLConnection) url.openConnection();
			
			InputStream is = httpsURLConnection.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			
			String str = br.readLine();
			StringBuffer sb = new StringBuffer();
			
			while (str != null) {
				sb.append(str);
				str = br.readLine();
			}
			
			FileWriter fileWriter = new FileWriter("/Users/santhoshgutta/Desktop/oracle_website.html");
			fileWriter.write(sb.toString());
			fileWriter.flush();
			fileWriter.close();
			
			br.close();
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
