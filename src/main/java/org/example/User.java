package org.example;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
    private boolean isAuthenticated;
    private Role role;
    private String username;
    private String password;

    public User(String username,String password,Role role) {
        this.username = username;
        this.password = password;
        this.role = role;
        this.isAuthenticated = false;
    }
}
