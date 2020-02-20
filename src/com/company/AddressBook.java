package com.company;
import java.util.*;
import java.io.*;

public class AddressBook {

    //First Build a new entry
    //Variables
    ArrayList <AddressEntry> AddressEntryList = new ArrayList<AddressEntry>(10);


    //NEXT, you are to create a method in your AddressBookApplication called void initAddressBookExercise(ab)
    // that creates 2 instances of com.company.AddressEntry and places them in ab (an com.company.AddressBook) collection called AddressEntryList.
    // NEXT, the initAddressBookExercise method it calls the com.company.AddressBook's ab.list() method.

    /**
     *
     * @param a adds address entry to list
     */
    void add(AddressEntry a)
    {
        AddressEntryList.add(a);

        Comparator<AddressEntry> comp = (AddressEntry a1, AddressEntry a2) -> a1.getLastName().compareTo(a2.getLastName());

        Collections.sort(AddressEntryList,comp);
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
     * @param lastName last name of entry to be deleted
     */
    void remove(String lastName) throws Exception
    {
        if(lastName.isEmpty())
            return;
        else
        {
            ArrayList<AddressEntry> toRemove = find(lastName);

            int i = 1;
            for(AddressEntry index : toRemove)
            {
                System.out.println("\n" + i + ":");
                System.out.print(index.toString1());
                i++;
            }
            System.out.println("\nWhich would you like to delete?\n");
            Scanner in = new Scanner(System.in);
            int temp = in.nextInt();
            AddressEntry tempEnt = toRemove.get(temp-1);

            for(int j = 0; j<AddressEntryList.size(); j++)
            {
                if(tempEnt == AddressEntryList.get(j))
                    AddressEntryList.remove(j);
            }
        }


    }


    /**
     *
     * @param startOfLastName part of or full last name of Entry being searched for
     * @return returns a list of matching entries
     */
    ArrayList<AddressEntry> find(String startOfLastName)
    {
        ArrayList<AddressEntry> retArr = new ArrayList<AddressEntry>(10);
        for(int i = 0; i<AddressEntryList.size();i++)
        {
            if(AddressEntryList.get(i).getLastName().toLowerCase().startsWith(startOfLastName.toLowerCase()))
            {
                retArr.add(AddressEntryList.get(i));
            }
        }
        return retArr;
    }

    /**
     *
     * @param fileName name of file or file path to be read from
     * @throws Exception if can't find file or file is incorrectly formatted
     */
     void readFromFile(String fileName) throws Exception
    {
        File file = new File(fileName);
        BufferedReader br = new BufferedReader(new FileReader(file));

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
