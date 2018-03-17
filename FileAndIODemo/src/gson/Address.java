package gson;

import com.google.gson.annotations.SerializedName;

public class Address {
	
	private String addressLine1;
	private String addressLine2;
	private String city;
	private String province;
	
	@SerializedName("postal_code")
	private String postalCode;
	
	private String country;

}
