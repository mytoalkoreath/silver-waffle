	import java.util.*;
public class AddressBook {
	private List<Object> AddressList = new ArrayList<Object>();

	public AddressBook() {
		super();

	}
	
	
	public void addBuddy(String name, String address, String pNumber) {
		this.AddressList.add(new BuddyInfo(name, address, pNumber));
	}
	
	public void removeBuddy(int index) {
		if (AddressList.size()>= 0 && index < AddressList.size()) {
			
			this.AddressList.remove(index);

		}
	}
	 	
	
	public static void main(String[] args) {
		AddressBook Book = new AddressBook();
		System.out.println("Address Book Created");
		Book.addBuddy("Frank", "3254 Trajan Lane" , "613-555-7432");
		Book.removeBuddy(0);
	
	}
}
