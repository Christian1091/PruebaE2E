package runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import net.thucydides.junit.annotations.UseTestDataFrom;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@UseTestDataFrom(value = "data/dataUsers.csv")
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com.prueba",
        tags = "@Shopping"
)
class RunnerMain {
}
