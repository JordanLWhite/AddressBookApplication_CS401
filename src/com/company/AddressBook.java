package com.company;
import java.util.ArrayList;

public class AddressBook {

    //First Build a new entry
    AddressEntry newEntry = new AddressEntry();
    //Variables
    ArrayList <AddressEntry> AddressEntryList = new ArrayList<AddressEntry>(10);


    //NEXT, you are to create a method in your AddressBookApplication called void initAddressBookExercise(ab)
    // that creates 2 instances of com.company.AddressEntry and places them in ab (an com.company.AddressBook) collection called AddressEntryList.
    // NEXT, the initAddressBookExercise method it calls the com.company.AddressBook's ab.list() method.
    void add(AddressEntry a)
    {
        AddressEntryList.add(a);
    }


    //NOTE: The AddressBook's list() method cycles through the collection of AddressEntry objects using an iterator
    // the contained in AddressBook and print outs the information to the console window calling toString() methods
    // on each of its com.company.AddressEntry objects.
    void list()
    {
        int i = 1;
        for(AddressEntry index : AddressEntryList)
        {
            System.out.println("\n" + i + ":");
            System.out.print(index.toString1());
            i++;
        }
    }
}
