package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json","rerun:target/rerun.txt"},
        features ="src/test/resources/features",
        glue = "steps",
        tags = "@MB4-170 or @MB4-170-invalid" ,
        dryRun = false

)
public class Runner {


}