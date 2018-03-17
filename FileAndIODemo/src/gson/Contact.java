package gson;

import com.google.gson.annotations.SerializedName;

public class Contact {
	

	@SerializedName("first_Name")
	private String firstName;
	
	private String lastName;
	private int age;
	private transient String gender;
	
	@SerializedName("address")
	private ContactAddress contactAddress;
	
	
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public int getAge() {
		return age;
	}
	public String getGender() {
		return gender;
	}
	
	public String toString() {
		return getFirstName() + " " + getLastName() + " is aged " + getAge() + " yrs. Gender = " + getGender();
	}

}
