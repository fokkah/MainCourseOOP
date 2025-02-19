package se.lexicon.DAO;

import se.lexicon.Todo.TodoItemTask;

import java.util.ArrayList;
import java.util.List;

public class TodoItemTaskImplementation implements TodoItemTaskDAO{

    List<TodoItemTask> todoItemTaskList  = new ArrayList<>();


    @Override
    public TodoItemTask persist(TodoItemTask todoItemTask) {
        if (findByAssignedStatus(true) != null);
        throw new IllegalArgumentException("Task exists");
    }

    @Override
    public TodoItemTask findById(int id) {
        return findById(id);
    }

    @Override
    public List<TodoItemTask> findAll() {
        return todoItemTaskList;
    }

    @Override
    public List<TodoItemTask> findByAssignedStatus(boolean status) {
        return findByAssignedStatus(status);
    }

    @Override
    public List<TodoItemTask> findByPersonId(int personID) {
        if (findById(0).equals(findByPersonId(personID))){
            throw new IllegalArgumentException("ID does not exist");
        }
            return  findByPersonId(personID);
    }

    @Override
    public void remove(int id) {
        todoItemTaskList.remove(findByPersonId(id));

    }
}
