package se.lexicon;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {


        Person erik = new Person("Erik", "Svensson", " erik@gmail.com ",  1);
        Person anna = new Person("Anna ", "Olsson", " anna@gmail.com ",  2);
        Person anders = new Person("Anders ", "Fredriksson", " anders@gmail.com", 3);
        TodoItem todoItem;
        todoItem = new TodoItem("Work work", "What evs", LocalDate.now(), "Anders", 3);

        //System.out.println(todoItem.getSummary());
        System.out.println(todoItem.getDeadLine());
        /*System.out.println(erik.getId());
        System.out.println(erik.getFirstName());
        System.out.println(erik.getLastName());
        System.out.println(erik.geteMail());

        System.out.println(anna.getId());
        System.out.println(anna.getFirstName());
        System.out.println(anna.getLastName());
        System.out.println(anna.geteMail());


         */



    }


}
