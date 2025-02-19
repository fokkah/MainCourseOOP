package se.lexicon.DAO;

import se.lexicon.Todo.TodoItem;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TodoItemDAOImplementation implements TodoItemDAO {

    List<TodoItem> todoListItem = new ArrayList<>();

    @Override
    public TodoItem persist(TodoItem todoItem) {
        if (findByTitleContains("") != null) {
            throw new IllegalArgumentException("Item exists");
        }
        todoListItem.add(todoItem);
        return todoItem;
    }

    @Override
    public TodoItem findById(int id) {
        return findById(0);
    }

    @Override
    public List<TodoItem> findAll() {
        return todoListItem;
    }

    @Override
    public List<TodoItem> findByDoneStatus(boolean done) {
        if (done == done) {

        }
        return findByDoneStatus(true);
    }

    @Override
    public List<TodoItem> findByTitleContains(String title) {
        if (!todoListItem.contains(title)) {
            throw new IllegalArgumentException("Title is non existant");
        }
        return findByTitleContains(title);
    }

    @Override
    public List<TodoItem> findbyPersonId(int id) {
        if (!findById(0).creator().equals(findbyPersonId(0))) {
            throw new IllegalArgumentException("Id does not exist");
        }
        return findbyPersonId(0);
    }

    @Override
    public List<TodoItem> findByDeadlineBefore(LocalDate localDate) {
        return findByDeadlineBefore(localDate);
    }

    @Override
    public List<TodoItem> findByDeadlineAfter(LocalDate localDate) {
        return findByDeadlineAfter(localDate);
    }

    @Override
    public void remove(int id) {
        remove(id);

    }
}
