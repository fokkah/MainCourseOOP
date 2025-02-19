package se.lexicon.DAO;

import se.lexicon.Todo.AppUser;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public interface AppUserDAO {

    AppUser persist(AppUser appUser);
    AppUser findByUsername(String username);
    List<AppUser> findAll();
    void remove(String username);



}
