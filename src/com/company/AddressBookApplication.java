package com.company;


public class AddressBookApplication {


//NEXT, you are to create a method in your AddressBookApplication called void initAddressBookExercise(ab)
// that creates 2 instances of com.company.AddressEntry and places them in ab (an com.company.AddressBook) collection called AddressEntryList.
// NEXT, the initAddressBookExercise method it calls the com.company.AddressBook's ab.list() method.

    /**
     *
     * @param ab  exercise 1
     */
    static void initAddressBookExercise(AddressBook ab)
    {
        //declaration of Address entry variables
        AddressEntry a = new AddressEntry("James","Parser","A Street","Hayward","California","510-555-fake","1@eastbay.edu",12345);
        AddressEntry b = new AddressEntry("Phil","Parker","B Street","Oakland","California","510-987-6543","2@gmail.com",98765);

        ab.add(a);
        ab.add(b);
        ab.list();
    }


    /**
     * @author Jordan L. White
     * @param args default parameter
     */
    public static void main(String args[])
    {


        //simply invokes static methods of the com.company.Menu class

        //***YOU NOW FINISH CODE TO CALL ALL the rest of the static methods of the com.company.Menu class
        int done = 0;
        AddressBook ab = new AddressBook();
        do {

            try {
                done = Menu.menu(ab);
            } catch (Exception e) {
                System.out.println("Bad Input. Let's try again.\n");
            }
        }while(done ==0);
/*
        String fileName = "text.txt";
       try {
           newBook.readFromFile(fileName);
       }
       catch (Exception e)
       {
           System.out.println("Can't find File!!");
       }
        initAddressBookExercise(ab);

*/
    }


}
