package com.company;

public class AddressBookApplication {

//NEXT, you are to create a method in your AddressBookApplication called void initAddressBookExercise(ab)
// that creates 2 instances of com.company.AddressEntry and places them in ab (an com.company.AddressBook) collection called AddressEntryList.
// NEXT, the initAddressBookExercise method it calls the com.company.AddressBook's ab.list() method.
    static void initAddressBookExercise(com.company.AddressBook ab)
    {
        //declaration of Address entry variables
        AddressEntry a = new AddressEntry("James","Parser","A Street","Hayward","California","510-555-fake","1@eastbay.edu",12345);
        AddressEntry b = new AddressEntry("Phil","Parker","B Street","Oakland","California","510-987-6543","2@gmail.com",98765);

        ab.add(a);
        ab.add(b);
        ab.list();
    }


    public static void main(String args[])
    {

        //simply invokes static methods of the com.company.Menu class

        //***YOU NOW FINISH CODE TO CALL ALL the rest of the static methods of the com.company.Menu class

        AddressBook ab = new AddressBook();

       Menu.prompt_FirstName();

        Menu.prompt_LastName();

        Menu.prompt_Street();

        Menu.prompt_City();

        Menu.prompt_State();

        Menu.prompt_Zip();

        Menu.prompt_Telephone();

        Menu.prompt_Email();

        initAddressBookExercise(ab);


    }
}
