package se.lexicon;

public class Person {

    //||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
    //-------------------------------------- Fields -------------------------------------------------------
    private int id;

    private String firstName;

    private String lastName;

    private String eMail;

    //-------------------------------------- Fields END-------------------------------------------------------
    //||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
    //------------------------- Constructors -----------------------------------------------------------

    public Person(String firstName, String lastName, String eMail, int id){ // null, null
        this.id = id;
        // this.firstName = firstName;
        this.setFirstName(firstName);
        //this.lastName = lastName;
        this.setLastName(lastName);
        this.seteMail(eMail);

    }
    public String summary(){
        return  "ID:"+id+ " Name: " + firstName+""+lastName+ "," + " e-Mail:" + eMail;
    }

    //------------------------- Constructors END -----------------------------------------------------------
    //||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
    //--------------- SETTERS -------------------------------------------------------------------------

    public void setFirstName(String firstName) {
        //this.firstName = firstName;
        if (firstName == null || firstName.trim().isEmpty()) {
            throw new IllegalArgumentException("Field cannot be empty or null");
        }
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        //this.lastName = lastName;
        if (lastName == null || lastName.trim().isEmpty()) {

            throw new IllegalArgumentException("Field cannot be empty or null");
        }
        this.lastName = lastName;
    }

    public void seteMail(String eMail) {
        // todo: do the same for all other setters
        //this.eMail = eMail;
        if (eMail == null || eMail.trim().isEmpty()) {
            throw new IllegalArgumentException("Field must have @, and cannot be null or empty");
        }
        this.eMail = eMail;
    }
    //----------------------- SETTERS END -----------------------------------------------------------------
    //||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
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

    //----------------------- GETTERS END---------------------------------------------------------------------



}

    //------------------------------- END OF FILE --------------------------------------------------------