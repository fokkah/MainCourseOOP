package se.lexicon.DAO;

import se.lexicon.Todo.AppUser;

//import java.util.HashSet;
import java.util.ArrayList;
import java.util.List;

public class AppUserDAOImplementation implements AppUserDAO {

    private List<AppUser> appUsers = new ArrayList<>();

    @Override
    public AppUser persist(AppUser appUser) {
        if (findByUsername(appUser.getUsername()) != null) {
            throw new IllegalArgumentException("Username" + appUser.getUsername()+ "is taken");
        }
            appUsers.add(appUser);
        return appUser;
    }

    @Override
    public AppUser findByUsername(String username) {
        for (AppUser appUser: appUsers){
            if (appUser.getUsername().equals(username)) {
            return appUser;
            }
        }
        throw new IllegalArgumentException("No match found");

    }

    @Override
    public List<AppUser> findAll() {
        return appUsers;
    }

    @Override
    public void remove(String username) {
        appUsers.remove(username);
    }
}


