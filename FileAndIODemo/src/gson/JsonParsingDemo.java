package gson;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class JsonParsingDemo {

	public static void main(String[] args) {
		
		try {
			FileReader fileReader = new FileReader("/Users/santhoshgutta/Desktop/contacts.json");
			BufferedReader br = new BufferedReader(fileReader);
			
			String str = br.readLine();
			StringBuffer jsonData = new StringBuffer();
			
			while (str != null) {
				jsonData.append(str);
				
				str = br.readLine();
			}
			
			br.close();
			
			Gson gson = new Gson();
//			Contact contact = gson.fromJson(jsonData.toString(), Contact.class);
			TypeToken<List<Contact>> contactsTypeToken = new TypeToken<List<Contact>>() {};
			List<Contact> contacts = gson.fromJson(jsonData.toString(), contactsTypeToken.getType());
			
			for(int index = 0; index < contacts.size(); index++) {
				Contact contact = contacts.get(index);
				System.out.println(contact);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
