package se.lexicon;

public class Person {

    //||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
    //-------------------------------------- Fields -------------------------------------------------------
    private final int id;
    private String firstName;
    private String lastName;
    private String eMail;
    private AppUser credentials;

    //-------------------------------------- Fields END-------------------------------------------------------
    //||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
    //------------------------- Constructors -----------------------------------------------------------

    public Person(String firstName, String lastName, String eMail, int id) { // null, null
        this.id = id;
        // this.firstName = firstName;
        this.setFirstName(firstName);
        //this.lastName = lastName;
        this.setLastName(lastName);
        this.seteMail(eMail);

    }

    public String summary() {
        return "ID:" + id + " Name: " + firstName + lastName + "," + " e-Mail:" + eMail;
    }

    //------------------------- Constructors END -----------------------------------------------------------
    //||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
    //--------------- SETTERS -------------------------------------------------------------------------

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        //this.firstName = firstName;
        if (firstName == null || firstName.trim().isEmpty()) {
            throw new IllegalArgumentException("Field cannot be empty or null");
        }
        this.firstName = firstName;
    }

    public void setCredentials(AppUser credentials) {
        this.credentials = credentials;
    }
//----------------------- SETTERS END -----------------------------------------------------------------
    //||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
    //----------------------- GETTERS ---------------------------------------------------------------------

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        //this.lastName = lastName;
        if (lastName == null || lastName.trim().isEmpty()) {

            throw new IllegalArgumentException("Field cannot be empty or null");
        }
        this.lastName = lastName;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        // todo: do the same for all other setters
        //this.eMail = eMail;
        if (eMail == null || eMail.trim().isEmpty()) {
            throw new IllegalArgumentException("Field must have @, and cannot be null or empty");
        }
        this.eMail = eMail;


    }

    public String getSummary() {
        return toString(); //summary
    }

    public AppUser getCredentials() {
        return credentials;
    }
//----------------------- GETTERS END---------------------------------------------------------------------


}

//------------------------------- END OF FILE --------------------------------------------------------