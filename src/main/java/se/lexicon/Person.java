package se.lexicon;

public class Person {

    private int id;

    private String firstName;

    private String lastName;

    private String eMail;

    private String summary;

    //--------------- SETTERS -------------------------------------------------------------------------

    public void setFirstName(String firstName) {
        this.firstName = firstName;
        if (firstName == null || firstName.isEmpty()) {
            throw new IllegalArgumentException("Field cannot be empty or null");

        }
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
        if (lastName == null || lastName.trim().isEmpty()) {

            throw new IllegalArgumentException("Field cannot be empty or null");
        }
        this.lastName = lastName;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
        if (eMail == null || eMail.isEmpty()) {
            throw new IllegalArgumentException("Field must have @, and cannot be null or empty");

        }
        this.eMail = eMail;
    }
    //----------------------- SETTERS END -----------------------------------------------------------------

    //----------------------- GETTERS ---------------------------------------------------------------------

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }


    public String geteMail() {
        return eMail;
    }

    public String getSummary() {
        return summary;
    }



/*
    public int getId() {
        return id;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String eMail) {
        this.eMail = eMail;
    }


    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String geteMail() {
        return eMail;
    }

    public String getSummary() {
        return summary;
    }
     */

    public Person(String firstName, String lastName, String eMail, int id){
        this.id = id;
        this.firstName = "First name: " + firstName;
        this.lastName = "Last name: " +  lastName;
        this.eMail = "e-Mail: " + eMail;
        this.summary = "ID:"+id+ " Name: " + firstName+""+lastName+ "," + " e-Mail:" + eMail;


    }

}

