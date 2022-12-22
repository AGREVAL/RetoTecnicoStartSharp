package co.com.choucair.cetification.proyectobase.tasks;
import co.com.choucair.cetification.proyectobase.models.ActorData;
import co.com.choucair.cetification.proyectobase.userinterfaces.NewBusinessUnitPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SendKeys;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class NewBusinessUnitTask implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {

        ActorData datos = new ActorData();
        // Dashboard
        actor.attemptsTo(
                // Organization > Business Units > Button New Business Unit
                Click.on(NewBusinessUnitPage.ORGANIZATION),
                Click.on(NewBusinessUnitPage.BUSINESS_UNIT),
                Click.on(NewBusinessUnitPage.NEW_BUSINESS_UNIT_BUTTON),

                // Modal New Business Unit
                Click.on(NewBusinessUnitPage.NEW_BUSINESS_UNIT_NAME),
                SendKeys.of(datos.getName()).into(NewBusinessUnitPage.NEW_BUSINESS_UNIT_NAME),
                Click.on(NewBusinessUnitPage.NEW_BUSINESS_UNIT_PARENT_UNIT),
                Click.on(NewBusinessUnitPage.NEW_BUSINESS_UNIT_PARENT_UNIT_SEARCH_FIELD),
                SendKeys.of(datos.getParentUnit()).into(NewBusinessUnitPage.NEW_BUSINESS_UNIT_PARENT_UNIT_SEARCH_FIELD),
                Hit.the(Keys.ENTER).into(NewBusinessUnitPage.NEW_BUSINESS_UNIT_PARENT_UNIT_SEARCH_FIELD),
                Click.on(NewBusinessUnitPage.NEW_BUSINESS_UNIT_BTN_SAVE)
        );
    }
    public static NewBusinessUnitTask creatBusinessUnit() {
        return instrumented(NewBusinessUnitTask.class);
    }
}
