import java.util.ArrayList;


public class AddressBook {
	
	private ArrayList<BuddyInfo> buddies = new ArrayList<BuddyInfo>();
	
	public AddressBook()
	{
		buddies = new ArrayList<BuddyInfo>();
	}
	
	public void addBuddy(BuddyInfo buddy)
	{
		if(buddy != null)
			buddies.add(buddy);
	}

	public BuddyInfo removeBuddy(int index)
	{
		if(index >= 0 && index < buddies.size())
		{
			return buddies.remove(index);
		}
		return null;
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BuddyInfo bi = new BuddyInfo("Tom", "Carleton", "1234");
		AddressBook ab = new AddressBook();
		ab.addBuddy(bi);
		ab.removeBuddy(0);
		ab.addBuddy(bi);
	}

}
