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

}
