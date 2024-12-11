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
<<<<<<< HEAD
        glue = "com.prueba",
        tags = "@Shopping",
        plugin = {
                "pretty",
                "html:target/cucumber-report/PruebaE2E.html",
                "json:target/cucumber-report/PruebaE2E.json"
=======
        glue = "com.prueba.steps",
        tags = "@Shopping",
        plugin = {
                "pretty",
                "html:target/cucumber-report/index.html",
                "json:target/cucumber-report/cucumber.json"
>>>>>>> 111bda151ec0af129578fad5e1a364d01ba3d21d
        }
)
class RunnerMain {
}
