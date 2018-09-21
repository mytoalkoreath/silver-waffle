
public class BuddyInfo {
	private String pNumber;
	private String name;
	private String streetAddress;
	
	
	public BuddyInfo(String name, String address, String number) {
		
		super();
		this.setName(name);
		this.setpNumber(number);
		this.setStreetAddress(address);
		
	}


	public String getpNumber() {
		return pNumber;
	}


	public void setpNumber(String pNumber) {
		this.pNumber = pNumber;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getStreetAddress() {
		return streetAddress;
	}


	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}


	


	
	
	

}
