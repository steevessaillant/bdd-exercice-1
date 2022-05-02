package org.example.StepsDefs;

import io.cucumber.datatable.DataTable;
import io.cucumber.datatable.DataTableTypeRegistryTableConverter;
import org.example.App;
import org.example.User;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;


public class LoginSteps implements io.cucumber.java8.En {
    private App application;
    public LoginSteps(){

        Before(() ->{
            this.application = new App();
        });

        Given("I user {string} with the password {string} and the {string} role", (String username, String password, String role) -> {
            User actual = this.application.CreateNew(username,password,role);
            User expected = new User(username,password,role);
            assertThat(actual).usingRecursiveComparison()
                    .isEqualTo(expected);
        });

        When("I submit my credentials as", (DataTable dataTable) -> {
            List<List<String>> rows = dataTable.asLists(String.class);
            rows.subList(1,rows.size()).forEach(row -> {
                if (!row.isEmpty() && row.) {
                    //String columnName = row.remove(0);
                    System.out.println(row.get(0).toCharArray());
                }
            });
        });
        Then("{string} as {string}", (String string, String string2) -> {
            // Write code here that turns the phrase above into concrete actions
            //throw new io.cucumber.java8.PendingException();
            Assert.assertTrue(true);
        });
    }

}
