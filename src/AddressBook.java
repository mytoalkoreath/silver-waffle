import java.util.*;
public class AddressBook {
	private List<Object> AddressList = new ArrayList<Object>();
	private int Count;
	public AddressBook() {
		super();
		this.Count = 0;
	}
	
	
	public void addBuddy(String name, String address, String pNumber) {
		this.AddressList.add(new BuddyInfo(name, address, pNumber));
		this.Count++;
	}
	
	public void removeBuddy() {
		if (getCount() == 0) {
			System.out.println("ERROR:  No buddies to remove");
		}else {
			this.AddressList.remove(getCount()-1);
			this.Count --;
		}
	}
	public int getCount() {
		return Count;
	}
}
