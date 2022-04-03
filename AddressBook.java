package com.bridge;

import java.util.ArrayList;
//import java.util.List;

public class AddressBook {
    private String myAddressBook;
    private ArrayList<Person> myContacts;

    AddressBook(String myAddressBook) {
        this.myAddressBook = myAddressBook;
        this.myContacts = new ArrayList<Person>();
    }

    public boolean addNewContact(Person newContact) {
        if (findContact(newContact.getFirstName()) >= 0) {
            System.out.println("Contact is already on List");
            return false;
        }
        myContacts.add(newContact);
        return true;
    }

    private int findContact(String firstName) {
        for (int i = 0; i < this.myContacts.size(); i++) {
        	Person contact = this.myContacts.get(i);
            if (contact.getFirstName().equals(firstName)) {
                return i;
            }
        }
        return -1;
    }

    public void printContacts() {
        System.out.println("ContactBook List");
        for (int i = 0; i < this.myContacts.size(); i++) {
            System.out.println((i + 1) + ". " +
                    "FirstName:\t" + this.myContacts.get(i).getFirstName() +
                    "\nLastName:\t" + this.myContacts.get(i).getLastName() +
                    "\n Address:\t" + this.myContacts.get(i).getAddress() +
                    "\n City:\t" + this.myContacts.get(i).getCity() +
                    "\n State:\t" + this.myContacts.get(i).getState() +
                    "\n zipCode:\t" + this.myContacts.get(i).getZip() +
                    "\n PhoneNumber:\t" + this.myContacts.get(i).getPhoneNumber() +
                    "\n Email:\t" + this.myContacts.get(i).getEmail());
        }
    }

    public boolean updateContact(Person oldContact, Person newContact) {
        int foundPosition = findContact(oldContact);
        if (foundPosition < 0) {
            System.out.println(oldContact.getFirstName() + " was not found in the list");
            return false;
        }
        if (findContact(newContact.getFirstName()) >= 0) {
            System.out.println("cannot add " + newContact.getFirstName() + " already on contactBook list");
            return false;
        }
        this.myContacts.set(foundPosition, newContact);
        System.out.println(oldContact.getFirstName() + ", was replaced with " + newContact.getFirstName());
        return true;
    }

    private int findContact(Person contact) {
        return this.myContacts.indexOf(contact);
    }

    public Person queryContact(String searchName) {
        int position = findContact(searchName);
        if (position >= 0) {
            return this.myContacts.get(position);
        }
        return null;
    }

    public boolean removeContact(Person contact) {
        int foundPosition = findContact(contact);
        if (foundPosition < 0) {
            System.out.println(contact.getFirstName() + " was not found in the list");
            return false;
        }
        this.myContacts.remove(foundPosition);
        System.out.println(contact.getFirstName() + ", was removed from the list");
        return true;
    }


}
