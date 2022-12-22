package co.com.choucair.cetification.proyectobase.stepdefinitions;


import co.com.choucair.cetification.proyectobase.tasks.LoginTask;
import co.com.choucair.cetification.proyectobase.tasks.MeetingsTask;
import co.com.choucair.cetification.proyectobase.tasks.NewBusinessUnitTask;
import co.com.choucair.cetification.proyectobase.tasks.NewMeetingTask;
import co.com.choucair.cetification.proyectobase.userinterfaces.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class MeetingCreationStepDefinitions {
    private WebDriver myBrowser;
    private Actor actor = Actor.named("Tester");
    private LoginPage loginPage = new LoginPage();
    @Given("the user accesses the login page and login successfully with credentials")
    public void theUserAccessesTheLoginPage() {
        actor.can(BrowseTheWeb.with(myBrowser));
        actor.wasAbleTo(Open.browserOn(loginPage));
        actor.attemptsTo((LoginTask.enterEredentials()));
    }
    @When("create a business unit")
    public void loginSuccessfullyWithCredentials() {
        actor.attemptsTo(NewBusinessUnitTask.creatBusinessUnit());
    }
    @When("schedule a new meeting")
    public void createABusinessUnitAndScheduleANewMeeting() {
        actor.attemptsTo(NewMeetingTask.createNewMeeting());
    }

    @Then("check if the meeting was created successfully")
    public void checkIfTheMeetingWasCreatedSuccessfully() { actor.attemptsTo(MeetingsTask.validateCreationMeeting());}
}
