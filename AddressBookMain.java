package com.bridge;

import java.util.Scanner;
import java.util.ArrayList;

public class AddressBookMain {
	static Scanner sc = new Scanner(System.in);
	static ArrayList<Person> adressBook = new ArrayList<Person>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the Address Book Problem");
		AddressBookMain addressBookList = new AddressBookMain();
		System.out.println("1.add" + "\n" + "2.edit");
		int option = sc.nextInt();

		 switch (option) {
         case 1:
             addressBookList.addContactDetails();
             break;
         case 2:
             addressBookList.editContactDetails();
             break;
         case 3:
             addressBookList.deleteContact();
             break;
         default:
             System.out.println("Invalid Input");
		}
	}

	public void addContactDetails() {
		Person person1 = new Person();

		System.out.println("Enter a first name:");
		person1.setFirstName(sc.next());

		System.out.println("Enter a last name:");
		person1.setLastName(sc.next());

		System.out.println("Enter a Address:");
		person1.setAddress(sc.next());

		System.out.println("Enter a City name:");
		person1.setCity(sc.next());

		System.out.println("Enter a state:");
		person1.setState(sc.next());

		System.out.println("Enter a email:");
		person1.setEmail(sc.next());

		System.out.println("Enter a zip code:");
		person1.setZip(sc.nextInt());

		System.out.println("Enter a phone number:");
		person1.setPhoneNumber(sc.nextLong());

		adressBook.add(person1);
		System.out.println("==========================");
		System.out.println("Enter a first name:");
		String firstName = sc.next();

		System.out.println("Enter a last name:");
		String lastName = sc.next();

		System.out.println("Enter a Address:");
		String address = sc.next();

		System.out.println("Enter a City name:");
		String city = sc.next();

		System.out.println("Enter a state:");
		String state = sc.next();

		System.out.println("Enter a email:");
		String email = sc.next();

		System.out.println("Enter a zip code:");
		int zip = sc.nextInt();

		System.out.println("Enter a phone number:");
		long phoneNumber = sc.nextLong();

		Person person2 = new Person(firstName, lastName, address, city, state, zip, phoneNumber, email);
		adressBook.add(person2);
		System.out.print(adressBook);
		System.out.println("successfully added person new contacts");

	}

	public void editContactDetails() {
		System.out.println("enter a name for edit:");
		String editName = sc.next();
		for (int i = 0; i < adressBook.size(); i++) {
			if (adressBook.get(i).getFirstName().equals(editName)) {
				System.out.println("select options");
				System.out.println("\n0.First Name\n1.Last Name\n2.Address\n3.City\n4.State\n5.Zip\n6.Phone Number");
				int editOption = sc.nextInt();
				// System.out.println("message"+editOption);
				switch (editOption) {
				case 1:
					System.out.println("Enter a First name:");
					String editFirstName = sc.next();
					adressBook.get(i).setFirstName(editFirstName);
					System.out.println(editFirstName);
					break;
				case 2:
					System.out.print("Enter a Last name:");
					adressBook.get(i).setLastName(sc.next());
					break;
				case 3:
					System.out.print("Enter a Address:");
					adressBook.get(i).setAddress(sc.next());
					break;
				case 4:
					System.out.print("Enter a city:");
					adressBook.get(i).setCity(sc.nextLine());
					break;
				case 5:
					System.out.print("Enter a state:");
					adressBook.get(i).setState(sc.nextLine());
					break;
				case 6:
					System.out.print("Enter a zip code:");
					adressBook.get(i).setZip(sc.nextInt());
					break;
				case 7:
					System.out.print("Enter a phone number:");
					adressBook.get(i).setPhoneNumber(sc.nextLong());
					break;
				case 8:
					System.out.print("Enter a email:");
					adressBook.get(i).setEmail(sc.nextLine());
					break;
				default:
					System.out.println("enter valid contact");
				}
			}
			System.out.println("Edited list is:");
			System.out.println(adressBook);
		}
	}

	public void deleteContact() {
		System.out.println("confirm the name to delete contact");
		String confirmName = sc.next();
		for (int i = 0; i < adressBook.size(); i++) {
			if (adressBook.get(i).getFirstName().equals(confirmName))
				;
			Person person = adressBook.get(i);
			adressBook.remove(person);
		}
		System.out.println(adressBook);
	}
}
