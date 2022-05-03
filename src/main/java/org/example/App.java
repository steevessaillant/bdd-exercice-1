package org.example;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.annotation.CheckForNull;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


@Getter
@Setter
@ToString
@NoArgsConstructor
public class App 
{
    private List<User> users = new ArrayList<>();
    public User createNewUser(String username, String password, Role role) {

        User user;

        user = new User(username,password,role);
        this.users.add(user);
        return user;

    }

    @CheckForNull
    public User login(User user) throws NullPointerException{
        User authenticatedUser = this.users.stream()
                .filter(x -> Objects.equals(x.getUsername(), user.getUsername()) && Objects.equals(x.getPassword(), user.getPassword()))
                .findAny()
                .orElse(null);
        if(authenticatedUser  != null)
            authenticatedUser.setAuthenticated(true);
        else
            throw new NullPointerException();
        return authenticatedUser;
    }
}
