package co.com.choucair.cetification.proyectobase.runners;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/meeting_creation.feature",
        glue = "co.com.choucair.cetification.proyectobase.stepdefinitions",
        tags= "",
        snippets = SnippetType.CAMELCASE
)
public class StartSharpRunner {

}
