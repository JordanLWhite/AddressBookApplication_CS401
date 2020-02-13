package com.company;
import java.io.*;

public class AddressBookApplication {

    //a quick global variable
    static AddressBook newBook = new AddressBook();

//NEXT, you are to create a method in your AddressBookApplication called void initAddressBookExercise(ab)
// that creates 2 instances of com.company.AddressEntry and places them in ab (an com.company.AddressBook) collection called AddressEntryList.
// NEXT, the initAddressBookExercise method it calls the com.company.AddressBook's ab.list() method.

    /**
     *
     * @param ab
     */
    static void initAddressBookExercise(com.company.AddressBook ab)
    {
        //declaration of Address entry variables
        AddressEntry a = new AddressEntry("James","Parser","A Street","Hayward","California","510-555-fake","1@eastbay.edu",12345);
        AddressEntry b = new AddressEntry("Phil","Parker","B Street","Oakland","California","510-987-6543","2@gmail.com",98765);

        ab.add(a);
        ab.add(b);
        ab.list();
    }

    /**
     *
     * @param fileName
     * @throws Exception
     */
    static void init(String fileName) throws Exception
    {
        File file = new File(fileName);
        BufferedReader br = new BufferedReader(new FileReader(file));

        int index = 0;
        String str;
        AddressEntry newEntry = new AddressEntry();
        while((str = br.readLine()) != null)
        {
            System.out.println(str);
            if(index != 0)
            {
                if(index == 1)
                {
                    newEntry.setFirstName(str.substring(1,str.indexOf(" ")));
                    newEntry.setLastName(str.substring(str.indexOf(' '),str.length()-1));
                }
                else if(index == 2)
                {
                    newEntry.setStreet(str.substring(1));
                }
                else if(index == 3)
                {
                    newEntry.setCity(str.substring(1,str.indexOf(',')));
                    newEntry.setState(str.substring(str.indexOf(' '),str.length()-6));
                    newEntry.setZip(Integer.parseInt(str.substring(str.length()-6)));
                }
                else if(index == 4)
                {
                    newEntry.setEmail(str.substring(1));
                }
                else if(index == 5)
                {
                    newEntry.setPhone(str.substring(1));
                    index = 0;
                    newBook.add(newEntry);
                    newEntry = null;
                }
            }
        }
        newBook.list();
    }

    /**
     *
     * @throws Exception
     */
   static void makeFile( ) throws Exception
    {
        File newFile = new File("C:\\Users\\Jordan\\Desktop\\text.txt");
        newFile.createNewFile();
    }

    /**
     *
     * @param args
     */
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

        String fileName = "C:\\Users\\Jordan\\Desktop\\text.txt";
        try {
            init(fileName);
        } catch (Exception e) {
            try
            {
                makeFile();
            }
            catch(Exception e1)
            {
                e.printStackTrace();
            }
        }

        initAddressBookExercise(ab);


    }
}
