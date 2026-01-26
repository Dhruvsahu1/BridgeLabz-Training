package in.bl.main;

import java.util.Scanner;
import java.util.*;
import in.bl.addressbook.AddressBook;
import in.bl.ucs.Contact;

public class Main {
	public static void main(String[] args) {
		Map<String , AddressBook> addressBookMap = new HashMap<>();
		Scanner sc= new Scanner(System.in);
		boolean b = true;
		while(b) {
			System.out.println("Welcome to Address Book");
			System.out.println("Choose what you want to do");
			System.out.println("Enter 1 for creating a new AddressBook");
			System.out.println("Enter 2 for creating a record in Address Book");
			System.out.println("Enter 3 for reading all the contacts");
			System.out.println("Enter 4 for Editing the existing contacts");
			System.out.println("Enter 5 for exiting");
			int key = sc.nextInt();
			sc.nextLine();
			switch (key) {
			case 1:{
				System.out.println("Enter your book name");
				String addressBookName = sc.nextLine();
				if(addressBookMap.containsKey(addressBookName)) {
					System.out.println("Address Book is already present");
				}else {
					AddressBook ab = new AddressBook();
					addressBookMap.put(addressBookName, ab);
					System.out.println("Address Book created successlly with name "+addressBookName);
				}
				break;
			}
			case 2: {
				if(addressBookMap.isEmpty()) {
					System.out.println("no biik is present create first");
					break;
				}
				System.out.println("Available Address Books:");
			    for (String bookName : addressBookMap.keySet()) {
			        System.out.println("- " + bookName);
			    }
				System.out.println("Enter the address book name in ehich contact is added");
				String bookName = sc.nextLine();
				AddressBook selectedBook = addressBookMap.get(bookName);
				if(selectedBook ==null) {
					System.out.println("your entered address book is not present create it first");
					break;
				}
				
				System.out.println("please Enterr the first Name");
				String first_Name = sc.nextLine();
				System.out.println("plese Enter your last Name");
				String last_Name = sc.nextLine();
				System.out.println("please Enter Your address");
				String address = sc.nextLine();
				System.out.println("please Enter Your city");
				String city = sc.nextLine();
				System.out.println("please Enter your state");
				String state = sc.nextLine();
				System.out.println("please enter your zipCode");
				String zipCode = sc.nextLine();
				System.out.println("please enter your contact number");
				String contact_no = sc.nextLine();
				System.out.println("please enter your email");
				String email = sc.nextLine();
				Contact c= new Contact(first_Name,last_Name,address,city,state,zipCode,contact_no,email);
				selectedBook.addContact(c);
				break;
			}
			case 3:{
				if(addressBookMap.isEmpty()) {
					System.out.println("no biik is present create first");
					break;
				}
				System.out.println("Enter the address book name in ehich contact is added");
				String bookName = sc.nextLine();
				AddressBook selectedBook = addressBookMap.get(bookName);
				if(selectedBook ==null) {
					System.out.println("your entered address book is not present create it first");
					break;
				}
				selectedBook.displaycontacts();
				break;
			}
			case 4:{
				if(addressBookMap.isEmpty()) {
					System.out.println("no book is present create first");
					break;
				}
				System.out.println("Enter the address book name in ehich contact is added");
				String bookName = sc.nextLine();
				AddressBook selectedBook = addressBookMap.get(bookName);
				if(selectedBook ==null) {
					System.out.println("your entered address book is not present create it first");
					break;
				}
				selectedBook.displaycontacts();
				System.out.println("Enter your id");
				int id = sc.nextInt();
				sc.nextLine();
				selectedBook.editContacts(id, sc);
				break;
			}
			case 5:{
				System.out.println("Thankyou !");
				return;
			}
			default:
				System.out.println("Welcome back again");
			}
		}
	}
}
