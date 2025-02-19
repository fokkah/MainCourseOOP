package se.lexicon.DAO;

import se.lexicon.Todo.TodoItem;

import java.time.LocalDate;
import java.util.List;

public interface TodoItemDAO {

    TodoItem persist(TodoItem todoItem);
    TodoItem findById(int id);
    List<TodoItem> findAll();
    List<TodoItem> findByDoneStatus(boolean done);
    List<TodoItem> findByTitleContains(String title);
    List<TodoItem> findbyPersonId(int id);
    List<TodoItem> findByDeadlineBefore(LocalDate localDate);
    List<TodoItem> findByDeadlineAfter(LocalDate localDate);
    void remove(int id);




}
