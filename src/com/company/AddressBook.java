package com.company;
import java.util.ArrayList;
import java.io.*;
import java.util.List;

public class AddressBook {

    //First Build a new entry
    AddressEntry newEntry = new AddressEntry();
    //Variables
    ArrayList <AddressEntry> AddressEntryList = new ArrayList<AddressEntry>(10);


    //NEXT, you are to create a method in your AddressBookApplication called void initAddressBookExercise(ab)
    // that creates 2 instances of com.company.AddressEntry and places them in ab (an com.company.AddressBook) collection called AddressEntryList.
    // NEXT, the initAddressBookExercise method it calls the com.company.AddressBook's ab.list() method.

    /**
     *
     * @param a
     */
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

    /**
     *
     * @param lastName
     */
    void remove(String lastName) throws Exception
    {
        if(lastName == "")
            return;
        else
        {
            ArrayList<AddressEntry> toRemove = find(lastName);
            if(toRemove.size() == 1)
            {
                AddressEntryList.remove(0);
                toRemove.remove(0);
            }
            int i = 1;
            for(AddressEntry index : toRemove)
            {
                System.out.println("\n" + i + ":");
                System.out.print(index.toString1());
                i++;
            }
            int x = 0;
            System.out.println();
            byte a[] = new byte[10];
            System.in.read(a);
            String tempStr = new String();
            tempStr = a.toString();
            AddressEntryList.remove(Integer.parseInt(tempStr));
        }

    }


    /**
     *
     * @param startOfLastName
     * @return
     */
    ArrayList<AddressEntry> find(String startOfLastName)
    {
        ArrayList<AddressEntry> retArr = new ArrayList<AddressEntry>(10);
        for(int i = 0; i<AddressEntryList.size();i++)
        {
            if(AddressEntryList.get(i).getLastName().substring(0,startOfLastName.length()) == startOfLastName)
            {
                retArr.add(AddressEntryList.get(i));
            }
        }
        return retArr;
    }

     void readFromFile(String fileName) throws Exception
    {
        File file = new File(fileName);
        BufferedReader br = new BufferedReader(new FileReader(file));

        int index = 0;
        String str;
        while((str = br.readLine()) != null)
        {
            AddressEntry newEntry = new AddressEntry();
            newEntry.setFirstName(str.substring(0,str.indexOf("/")));
            newEntry.setLastName(str.substring(str.indexOf('/')+1,str.indexOf("//")));
            newEntry.setStreet(str.substring(str.indexOf("//")+2,str.indexOf("///")));
            newEntry.setCity(str.substring(str.indexOf("///")+3,str.indexOf("////")));
            newEntry.setState(str.substring(str.indexOf("////")+4,str.indexOf("/////")));
            newEntry.setZip(Integer.parseInt(str.substring(str.indexOf("/////")+5,str.indexOf("//////"))));
            newEntry.setEmail(str.substring(str.indexOf("//////")+6,str.indexOf("///////")));
            newEntry.setPhone(str.substring(str.indexOf("///////")+7));
            AddressEntryList.add(newEntry);
        }
        list();
    }

}
