package org.example;

/**
 * Hello world!
 *
 */
public class App 
{

    public User CreateNew(String username, String password,String role) {


        org.example.User user;
        switch (username){
            case "admin":
                user = new User(username,password,role);
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
