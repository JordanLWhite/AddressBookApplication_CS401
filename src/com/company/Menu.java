package com.company;

public class Menu {


        //need firstname, lastname, street, city, state, zip, telephone, email
        public static void menu(AddressBook ab) throws Exception
        {
            byte a[] = new byte[100];
            String str = new String();
            int b;
            System.out.println("What would you like to do?\n");
            System.out.println("1)Loading from file\n2)Additional\n3)Removal\n4)Find\n5)Listing\n\n6)Quit\n");
            System.in.read(a);
            str = a.toString();
            if(str.toLowerCase() == "a") //get entries from file
            {
                System.out.println("Ok. Please enter the file name.");
                System.in.read(a);
                str = a.toString();
                ab.readFromFile(str);

            }
            else if(str == "b") //add entry
            {
                AddressEntry newEntry = new AddressEntry();
                System.out.println("Let's Begin.");
                prompt_FirstName();                         //getting firstname
                System.in.read(a);
                newEntry.setFirstName(a.toString());
                prompt_LastName();                          //getting lastname
                System.in.read(a);
                newEntry.setLastName(a.toString());
                prompt_Street();                           //getting street
                System.in.read(a);
                newEntry.setStreet(a.toString());
                prompt_City();                             //getting city
                System.in.read(a);
                newEntry.setCity(a.toString());
                prompt_State();                            //getting state
                System.in.read(a);
                newEntry.setState(a.toString());
                prompt_Zip();
                System.in.read(a);
                newEntry.setZip(Integer.parseInt(a.toString()));
                prompt_Telephone();
                System.in.read(a);
                newEntry.setPhone(a.toString());
                prompt_Email();
                System.in.read(a);
                newEntry.setEmail(a.toString());

                ab.add(newEntry);
            }
            else if(str == "c") //remove entry
            {
                System.out.println("What entry would you like to delete?\n");
                System.in.read(a);
                ab.remove(a.toString());
            }
            else if(str == "d") //find entry
            {
                System.out.println("Who are you looking for?\n");
                System  .in.read(a);
                ab.find(a.toString());
            }
            if(str == "e") //print book
            {
                ab.list();
            }
            if(str == "f")//leave
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

