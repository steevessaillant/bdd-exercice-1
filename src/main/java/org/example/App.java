package org.example;

import lombok.Getter;
import lombok.NoArgsConstructor;
import javax.annotation.CheckForNull;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


@Getter
@NoArgsConstructor
public class App 
{
    private final List<User> users = new ArrayList<>();
    public User createNewUser(String username, String password, Role role) {

        User user;
        user = new User();
        user.setUsername(username);
        user.setPassword(password);
        user.setRole(role);
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

    public void promoteUserToAdmin(User testUser) {
        testUser.setRole(Role.ADMIN);
    }
}
