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

    /**
     *
     * @param f first name of entry
     * @param l last name of entry
     * @param s the street of entry lives on
     * @param c the city entry lives in
     * @param st the state that entry lives in
     * @param p entry's phone number
     * @param e entry's email
     * @param z entry's zip code
     */
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

    /**
     *
     * @param f first name to set first name
     */
    void setFirstName(String f)
    {
        firstName = f;
    }

    /**
     *
     * @param l last name to set last name
     */
    void setLastName(String l)
    {
        lastName = l;
    }

    /**
     *
     * @param s street name to set street name
     */
    void setStreet(String s)
    {
        street = s;
    }

    /**
     *
     * @param c city name to set city name
     */
    void setCity(String c)
    {
        city = c;
    }

    /**
     *
     * @param s state name to ste state name
     */
    void setState(String s)
    {
        state = s;
    }

    /**
     *
     * @param p phone number to set phone number
     */
    void setPhone(String p)
    {
        phone = p;
    }

    /**
     *
     * @param e email address to set email address
     */
    void setEmail(String e)
    {
        email = e;
    }

    /**
     *
     * @param z zip code to set zip code
     */
    void setZip(int z)
    {
        zip = z;
    }

    /**
     *
     * @return first name of entry
     */
    String getFirstName()
    {
        return firstName;
    }

    /**
     *
     * @return last name of entry
     */
    String getLastName()
    {
        return lastName;
    }

    /**
     *
     * @return street name of entry
     */
    String getStreet()
    {
        return street;
    }

    /**
     *
     * @return city name of user
     */
    String getCity()
    {
        return city;
    }

    /**
     *
     * @return state name of entry
     */
    String getState()
    {
        return state;
    }

    /**
     *
     * @return phine number of entry
     */
    String getPhone()
    {
        return phone;
    }

    /**
     *
     * @return email address of entry
     */
    String getEmail()
    {
        return email;
    }

    /**
     *
     * @return zip code of entry
     */
    Integer getZip()
    {
        return zip;
    }

    /**
     *
     * @return formatted string for printing
     */
    String toString1()
    {
        String retString = "\t" + firstName +" "+ lastName +"\n\t" +  street;
        retString += "\n\t" + city + ", " + state + " " + zip;
        retString += "\n\t" + email;
        retString += "\n\t" + phone;
        return retString;
    }



}
