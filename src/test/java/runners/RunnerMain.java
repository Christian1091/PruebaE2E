package runners;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberSerenityRunner;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import net.thucydides.junit.annotations.UseTestDataFrom;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@UseTestDataFrom(value = "data/dataUsers.csv")
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com.prueba.steps",
        tags = "@Shopping",
        plugin = {
                "pretty",
                "html:target/cucumber-report/index.html",
                "json:target/cucumber-report/cucumber.json"
        }
)
class RunnerMain {
}
