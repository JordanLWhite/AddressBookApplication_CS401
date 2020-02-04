package com.company;

public class AddressEntry {

    //variables
    String firstName;
    String lastName;
    String street;
    String city;
    String state;
    String phone;
    String email;
    int zip;

    //Methods
    AddressEntry()
    {}

    AddressEntry(String f,String l, String s, String c, String st, String p, String e, int z)
    {
        this.firstName = f;
        lastName = l;
        street = s;
        city = c;
        state = st;
        zip = z;
        phone = p;
        email = e;
    }

    //String toString()

    void setFirstName(String f)
    {
        firstName = f;
    }

    void setLastName(String l)
    {
        lastName = l;
    }
    void setStreet(String s)
    {
        street = s;
    }
    void setCity(String c)
    {
        city = c;
    }

    void setState(String s)
    {
        state = s;
    }

    void setPhone(String p)
    {
        phone = p;
    }

    void setEmail(String e)
    {
        email = e;
    }

    void setZip(int z)
    {
        zip = z;
    }

    String getFirstName()
    {
        return firstName;
    }
    String getLastName()
    {
        return lastName;
    }

    String getStreet()
    {
        return street;
    }

    String getCity()
    {
        return city;
    }

    String getState()
    {
        return state;
    }

    String getPhone()
    {
        return phone;
    }

    String getEmail()
    {
        return email;
    }

    Integer getZip()
    {
        return zip;
    }

    String toString1()
    {
        String retString = "\t" + firstName + "\n\t" +  street;
        retString += "\n\t" + city + ", " + state + " " + zip;
        retString += "\n\t" + email;
        retString += "\n\t" + phone;
        return retString;
    }
}
