package gson;

import com.google.gson.annotations.SerializedName;

public class ContactAddress {
	
	@SerializedName("residential_address")
	private Address residentialAddress;
	
	@SerializedName("office_address")
	private Address officeAddress;

	public Address getResidentialAddress() {
		return residentialAddress;
	}

	public Address getOfficeAddress() {
		return officeAddress;
	}
	
	

}
