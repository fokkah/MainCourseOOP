package se.lexicon;

public class TodoItemTask {

    //----------------------------------------------- Fields --------------------------------------------------

    private int id;
    private boolean assigned;
    private TodoItemTask todoItemTask;
    private Person assignee;

    //------------------------------------------ Fields End -----------------------------------------------------
    //||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
    //--------------------------- Constructors -------------------------------------------------------------------


    public TodoItemTask(int id, TodoItemTask todoItem) {
        this.id = id;
        this.todoItemTask = todoItem;

    }

    public TodoItemTask(Person assignee) {
        this.assignee = assignee;
    }

    //---------------------------- Constructors End --------------------------------------------------------------
    //||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
    //--------------------------------------- Setters ------------------------------------------------------------


    public void setId(int id) {
        this.id = id;
    }

    public void setTodoItem(TodoItem todoItem) {
        this.todoItemTask = todoItemTask;
        System.out.println("U need to finish training to win CL2025");
    }

    public void setAssignee(Person assignee) {
        this.assignee = assignee;
        assignee = new Person("Anders", "Fredriksson", "anders@gmail.com", 3);
    }

    //--------------------------------------- Setters End --------------------------------------------------------
    //||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
    //--------------------------------------- Getters ------------------------------------------------------------


    public int getId() {
        return id;
    }

    public boolean isAssigned() {
        return assigned;
    }

    public TodoItemTask getTodoItemTask() {
        return todoItemTask;
    }

    public Person getAssignee() {
        return assignee;
    }
}
