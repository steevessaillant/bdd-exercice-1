package org.example;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
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
