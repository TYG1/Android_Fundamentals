/**
 * Created by George on 5/7/16.
 */

import java.util.*;

public class Directory {

    private ArrayList<Contact> Directory;


    public Directory() {

        Directory = new ArrayList<Contact>();
    }


    public void addContact(Contact contact){

        Directory.add(contact);
    }

    public void displayAl(){
        for (Contact contact: Directory){
            System.out.println(" ");
            contact.contactInfo();
        }

    }
}
