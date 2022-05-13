package org.example;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class User {
    private boolean isAuthenticated;
    private Role role;
    private String username;
    private String password;

}
