package com.georgegebretensai;

import java.util.ArrayList;
import java.util.List;



//Create a class that represents contact information for a person. The class should store the
// person's name and their email address.
//
// Create a second class that represents an address book (a collection of contact information
// for many people) that includes methods for adding new contact information and for searching
// the existing collection for a contacts email address when the name is specified.
//
//The program should create instances of the classes and demonstrate the functionality.

public class AddressBook {
    private List<Contact> contacts;

    AddressBook() {
        contacts = new ArrayList<>();
    }

    public String searchByName(String name) {
        String email = null;
        for (Contact contactInfo : contacts)
            if (contactInfo.getName().equals(name)) {
                email = contactInfo.getEmail();
            }
        return email;
    }

    public void newContact(String name, String email) {
        Contact aNewContact = new Contact(name, email);
        contacts.add(aNewContact);
    }


}