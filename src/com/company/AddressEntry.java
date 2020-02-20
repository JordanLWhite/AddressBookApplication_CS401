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

    /**
     *
     */
    AddressEntry()
    {}

    /**
     *
     * @param f
     * @param l
     * @param s
     * @param c
     * @param st
     * @param p
     * @param e
     * @param z
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
     * @param f
     */
    void setFirstName(String f)
    {
        firstName = f;
    }

    /**
     *
     * @param l
     */
    void setLastName(String l)
    {
        lastName = l;
    }

    /**
     *
     * @param s
     */
    void setStreet(String s)
    {
        street = s;
    }

    /**
     *
     * @param c
     */
    void setCity(String c)
    {
        city = c;
    }

    /**
     *
     * @param s
     */
    void setState(String s)
    {
        state = s;
    }

    /**
     *
     * @param p
     */
    void setPhone(String p)
    {
        phone = p;
    }

    /**
     *
     * @param e
     */
    void setEmail(String e)
    {
        email = e;
    }

    /**
     *
     * @param z
     */
    void setZip(int z)
    {
        zip = z;
    }

    /**
     *
     * @return
     */
    String getFirstName()
    {
        return firstName;
    }

    /**
     *
     * @return
     */
    String getLastName()
    {
        return lastName;
    }

    /**
     *
     * @return
     */
    String getStreet()
    {
        return street;
    }

    /**
     *
     * @return
     */
    String getCity()
    {
        return city;
    }

    /**
     *
     * @return
     */
    String getState()
    {
        return state;
    }

    /**
     *
     * @return
     */
    String getPhone()
    {
        return phone;
    }

    /**
     *
     * @return
     */
    String getEmail()
    {
        return email;
    }

    /**
     *
     * @return
     */
    Integer getZip()
    {
        return zip;
    }

    /**
     *
     * @return
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
