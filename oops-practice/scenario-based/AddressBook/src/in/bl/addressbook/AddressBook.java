package in.bl.addressbook;
import java.util.*;

import in.bl.ucs.Contact;

public class AddressBook {
	Scanner sc = new Scanner(System.in);
	private List<Contact> contactList = new ArrayList<>();

	public List<Contact> getContact() {
		return contactList;
	}

	public void setContact(List<Contact> contact) {
		this.contactList = contact;
	}
	public void addContact(Contact cont) {
		contactList.add(cont);
		System.out.println("Contact added successfully");
	}
	public void displaycontacts() {
		for(Contact contact : contactList) {
			contact.display();
		}
	}
	public void editContacts(int id , Scanner sc) {
		boolean found = false;
		for(Contact contact: contactList) {
			if(id== contact.getContactId()) {
				 System.out.println("Contact Found. Enter new details:");

		            System.out.print("Enter new Address: ");
		            contact.setAddress(sc.nextLine());

		            System.out.print("Enter new City: ");
		            contact.setCity(sc.nextLine());

		            System.out.print("Enter new State: ");
		            contact.setState(sc.nextLine());

		            System.out.print("Enter new Zip: ");
		            contact.setZipCode(sc.nextLine());

		            System.out.print("Enter new Phone: ");
		            contact.setPhoneNumber(sc.nextLine());

		            System.out.print("Enter new Email: ");
		            contact.setEmail(sc.nextLine());

		            System.out.println("Contact updated successfully!");
		            found = true;
		            break;
			}
		}
	}
	public void deleteContacts(int id, Scanner sc) {
		boolean found = false;
		for(Contact contact:contactList) {
			if(id == contact.getContactId()) {
				contactList.remove(contact);
				return;
			}
		}
	}
}
