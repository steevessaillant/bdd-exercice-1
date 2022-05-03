package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public List<User> Users = new ArrayList<>();
    public User CreateNewUser(String username, String password, String role) {

        User user;

        switch (username){
            case "admin":
                user = new User(username,password,role);
                this.Users.add(user);
                break;
            default:
                user = null;
        }
        if(user != null)
            return user;
        else
            return null;
    }
}
