package StepsDefs;

import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;


public class ServiceHooks {
    @BeforeAll
    public void initializeTests(){
        System.console().printf("BEFORE ALL");
    }

    @AfterAll
    public void teardownTests(){
        System.console().printf("AFTER ALL");
    }
}