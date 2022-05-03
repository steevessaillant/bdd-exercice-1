package org.example.StepsDefs;

import io.cucumber.datatable.DataTable;
import org.example.App;
import org.example.Role;
import org.example.User;
import org.junit.Assert;

import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;


public class LoginSteps implements io.cucumber.java8.En {
    private App application;
    private User authenticatedUser;
    public LoginSteps(){

        Before(() -> this.application = new App());

        Given("I user {string} with the password {string} and the {string} role", (String username, String password, String role) -> {
            User actual = this.application.createNewUser(username,password,Role.valueOf(role));
            User expected = new User(username,password,Role.valueOf(role));
            assertThat(actual).usingRecursiveComparison()
                    .isEqualTo(expected);
        });

        When("I submit my credentials for login as", (DataTable dataTable) -> {
            List<List<String>> rows = dataTable.asLists(String.class);
            Stream<User> userStream = dataTable.cells()
                    .stream()
                    .skip(1)        // Skip header row
                    .map(fields -> this.application.createNewUser(fields.get(0), fields.get(1), Role.valueOf(fields.get(2))));

            this.authenticatedUser = this.application.login(this.application.getUsers().get(0));
        });
        Then("the system will return an authenticated ADMIN user", () -> Assert.assertTrue(authenticatedUser.isAuthenticated()));
    }

}
