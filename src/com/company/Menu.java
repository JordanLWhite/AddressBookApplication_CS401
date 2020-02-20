package com.company;
import java.util.*;

public class Menu {


        //need firstname, lastname, street, city, state, zip, telephone, email
        public static void menu(AddressBook ab) throws Exception
        {
            byte a[] = new byte[100];
            int b;
            Scanner in = new Scanner(System.in);
            System.out.println("What would you like to do?\n");
            System.out.println("1)Loading from file\n2)Additional\n3)Removal\n4)Find\n5)Listing\n\n6)Quit\n");
            b = in.nextInt();
            //System.in.read(a);
            String str = a.toString();
            if(b == 1) //get entries from file
            {
                System.out.println("Ok. Please enter the file name.");
                str = in.next();
                ab.readFromFile(str);

            }
            else if(b == 2) //add entry
            {
                AddressEntry newEntry = new AddressEntry();
                System.out.println("Let's Begin.");
                prompt_FirstName();                         //getting firstname
                str=in.next();
                newEntry.setFirstName(str);
                prompt_LastName();                          //getting lastname
                str = in.next();
                newEntry.setLastName(str);
                prompt_Street();                           //getting street
                str = in.next();
                newEntry.setStreet(str);
                prompt_City();                             //getting city
                str = in.next();
                newEntry.setCity(str);
                prompt_State();                            //getting state
                str = in.next();
                newEntry.setState(str);
                prompt_Zip();
                b = in.nextInt();
                newEntry.setZip(b);
                prompt_Telephone();
                str = in.next();
                newEntry.setPhone(str);
                prompt_Email();
                str = in.next();
                newEntry.setEmail(str);

                ab.add(newEntry);
            }
            else if(b == 3) //remove entry
            {
                System.out.println("What entry would you like to delete?\n");
                str = in.next();
                ab.remove(str);
            }
            else if(b == 4) //find entry
            {
                System.out.println("Who are you looking for?\n");
                str = in.next();
                ab.find(str);
            }
            else if(b == 5) //print book
            {
                ab.list();
            }
            else if(b == 6)//leave
            {
                System.exit(0);
            }


        }

        public static void prompt_FirstName()
        {
            System.out.println("First Name: ");
        }

        public static void prompt_LastName()
        {
            System.out.println("Last Name: ");
        }

        public static void prompt_Street()
        {
            System.out.println("Street: ");
        }

        public static void prompt_City()
        {
            System.out.println("City: ");
        }

        public static void prompt_State()
        {
            System.out.println("State: ");
        }

        public static void prompt_Zip()
        {
            System.out.println("Zip: ");
        }

        public static void prompt_Telephone()
        {
            System.out.println("Telephone: ");
        }

        public static void prompt_Email()
        {
            System.out.println("Email: ");
        }

    }

