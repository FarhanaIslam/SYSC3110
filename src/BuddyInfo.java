
public class BuddyInfo {
	private String name;
	private String address;
	private String ph_number;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPh_number() {
		return ph_number;
	}

	public void setPh_number(String ph_number) {
		this.ph_number = ph_number;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BuddyInfo bi = new BuddyInfo();
		bi.setName("Homer");
		System.out.println("Hello " + bi.getName());
		
	}

}
