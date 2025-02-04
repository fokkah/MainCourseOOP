package se.lexicon;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {


        Person erik = new Person("Erik", "Svensson", "erik@gmail.com ", 1);
        Person anna = new Person("Anna ", "Olsson", "anna@gmail.com ", 2);
        Person anders = new Person("Anders ", "Fredriksson", " anders@gmail.com", 3);
        TodoItem item = new TodoItem("Win CL", "what evs", LocalDate.now().plusDays(3), "anders", 3, true);
        TodoItemTask itemTask = new TodoItemTask(item);
        TodoItem itemTwo = new TodoItem("how fast do u run?", "FAST", LocalDate.now().minusDays(1), "botond", 5, true);
        AppRole userRole;
        AppRole adminRole;


        /*
        itemTask.setAssignee(anders);
        itemTask.setTodoItem(item);
        itemTask.setTodoItem(itemTwo);


        System.out.println(itemTwo.getTitle());
        System.out.println(itemTwo.getXtraInfo());
        System.out.println(itemTwo.getWhoisDoing());
        System.out.println(itemTask.getAssignee().getFirstName());


        System.out.println(erik.getId());
        System.out.println(erik.getFirstName());
        System.out.println(erik.getLastName());
        System.out.println(erik.geteMail());
        System.out.println(erik.getSummary());
        System.out.println(anna.getId());
        System.out.println(anna.getFirstName());
        System.out.println(anna.getLastName());
        System.out.println(anna.geteMail());
        System.out.println(anna.getSummary());


        System.out.println(item.getXtraInfo());
        System.out.println(item.getWhoisDoing());
        System.out.println(item.getDeadLine());
        System.out.println(item.getTitle());
        System.out.println(item.isDone());
         */
        System.out.println(item.getSummary());






    }


}
