package com.bridge;

import java.util.Scanner;
import java.util.ArrayList;

public class AddressBookMain {
	static Scanner sc = new Scanner(System.in);
    static  ArrayList<Person> adressBook = new ArrayList<Person>();
    
	public static void main(String[] args) {
			// TODO Auto-generated method stub
		 System.out.println("Welcome to the Address Book Problem");
	     AddressBookMain addressBookList=new AddressBookMain();
	     addressBookList.addContactDetails();	
	}
	 public void addContactDetails() {
	        Person person1=new Person();
	        
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
	        String firstName=sc.next();
	        
	        System.out.println("Enter a last name:");
	        String lastName=sc.next();
	        
	        System.out.println("Enter a Address:");
	        String address=sc.next();
	        
	        System.out.println("Enter a City name:");
	        String city=sc.next();
	        
	        System.out.println("Enter a state:");
	        String state=sc.next();
	        
	        System.out.println("Enter a email:");
	        String email=sc.next();
	        
	        System.out.println("Enter a zip code:");
	        int  zip=sc.nextInt();
	        
	        System.out.println("Enter a phone number:");
	        long phoneNumber=sc.nextLong();
	  
	        Person person2=new Person(firstName,lastName, address, city, state, zip, phoneNumber, email);
	        adressBook.add(person2);
	        System.out.print(adressBook);
	        System.out.println("successfully added person new contacts");
	

	 }
}
