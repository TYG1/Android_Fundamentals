package com.georgegebretensai;

/**
 * Created by George on 3/15/16.
 */
public class Main {

    public static void main(String []args){
        AddressBook myBook = new AddressBook();

        myBook.newContact("George","george@gmail.com");
        myBook.newContact("Sara", "sara@gmail.com");
        myBook.newContact("Tom", "tom@gmail.com");

        myBook.searchByName("George");
        myBook.searchByName("Sara");
        myBook.searchByName("Tom");
    }

}
