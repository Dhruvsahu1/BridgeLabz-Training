package in.bl.ucs;

public class Contact {
	private static int idCounter = 1000;
	private int contactId;
	private String first_name;
	private String last_name;
	private String address;
	private String city;
	private String state;
	private String zipCode;
	private String phoneNumber;
	private String email;
	public Contact(String first_name , String last_name , String address , String city , String state , String zipCode, String phoneNumber , String email ) {
		this.contactId = ++idCounter;
		this.first_name = first_name;
		this.last_name = last_name;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}

	public static int getIdCounter() {
		return idCounter;
	}

	public static void setIdCounter(int idCounter) {
		Contact.idCounter = idCounter;
	}

	public int getContactId() {
		return contactId;
	}

	public void setContactId(int contactId) {
		this.contactId = contactId;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void display() {
		System.out.println("addressBook Id: "+contactId);
		System.out.println("Name : "+first_name + " "+ last_name);
		System.out.println("Address : "+address);
		System.out.println("city : "+city);
		System.out.println("state : "+state);
		System.out.println("zipCode : "+zipCode);
		System.out.println("Contact Number : "+phoneNumber);
		System.out.println("Email : "+email);
		System.out.println("------------------------------------------------");
	}
	
}
