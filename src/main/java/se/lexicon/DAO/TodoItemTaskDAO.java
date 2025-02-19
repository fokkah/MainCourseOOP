package se.lexicon.DAO;



import se.lexicon.Todo.TodoItemTask;


import java.util.List;


public interface TodoItemTaskDAO {

    TodoItemTask persist(TodoItemTask todoItemTask);
    TodoItemTask findById(int id);
    List<TodoItemTask> findAll();
    List<TodoItemTask> findByAssignedStatus(boolean status);
    List<TodoItemTask> findByPersonId(int personID);
    void remove(int id);

}
