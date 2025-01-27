package se.lexicon;

public class Main {
    public static void main(String[] args) {

        Person erik = new Person("Erik", "Svensson", " erik@gmail.com ",  1);
        Person anna = new Person("Anna ", "Olsson", " anna@gmail.com ",  2);

        erik.setFirstName("Erik");
        erik.setLastName("Svensson");
        erik.setEmail("erik@gmail.com");
        System.out.println("Person: " + erik.getSummary() );

        anna.setFirstName("Anna");
        anna.setLastName("Olsson");
        anna.setEmail("anna@gmail.com");
        System.out.println("Person: " + anna.getSummary() );


    }
}
