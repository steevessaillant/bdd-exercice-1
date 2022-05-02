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
    private String role;
    public String username;

    public String password;

    public User(String username,String password,String role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }
}
