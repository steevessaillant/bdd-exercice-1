import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class) @CucumberOptions(
        plugin = { "me.jvt.cucumber.report.PrettyReports:target/cucumber" },
        features ="src/it/resources",
        glue = {"org.example.StepsDefs"},
        monochrome = true )
public class RunCucumberIT {
}
