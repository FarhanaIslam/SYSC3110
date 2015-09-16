import java.util.ArrayList;


public class AddressBook {
	
	private ArrayList<BuddyInfo> buddies = new ArrayList<BuddyInfo>();
	
	public void addBuddy(BuddyInfo buddy)
	{
		buddies.add(buddy);
	}

	public void removeBuddy(int index)
	{
		buddies.remove(index);
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
