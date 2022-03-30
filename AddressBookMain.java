package com.bridge;

import java.util.Scanner;
import java.util.ArrayList;

public class AddressBookMain {
	static Scanner sc = new Scanner(System.in);
    static  ArrayList<Person> adressBook = new ArrayList<Person>();
    
	public static void main(String[] args) {
			// TODO Auto-generated method stub
		 	System.out.println("Welcome to the Address Book Problem");
		 	
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

	}

}
