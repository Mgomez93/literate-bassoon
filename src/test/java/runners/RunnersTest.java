package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = { "pretty","html:target/cucumber-reports" },
        monochrome = true,
        features = "src/test/resources/features/",
        glue = {"stepDef"},
        dryRun = false,
        tags = "@SmokeTest"
)


public class RunnersTest {



}

