package se.lexicon;

public class Person {

    private int id;

    private String firstName;

    private String lastName;

    private String eMail;

    private String summary;





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

    public Person(String firstName, String lastName, String eMail, int id){
        this.id = id;
        this.firstName = firstName + "First name";
        this.lastName = lastName + "Last name";
        this.eMail = eMail + "e-Mail";
        this.summary = "ID:"+id+ " Name:" + firstName+""+lastName+ "," + " e-Mail:" + eMail;


    }

}
