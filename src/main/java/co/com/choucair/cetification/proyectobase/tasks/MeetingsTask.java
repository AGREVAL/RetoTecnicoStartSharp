package co.com.choucair.cetification.proyectobase.tasks;

import co.com.choucair.cetification.proyectobase.models.ActorData;
import co.com.choucair.cetification.proyectobase.userinterfaces.MeetingsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SendKeys;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class MeetingsTask implements Task {
    ActorData datos = new ActorData();
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(MeetingsPage.MEETING_TYPE_SELECT),
                Click.on(MeetingsPage.MEETING_TYPE_SELECT_SEARCH),
                SendKeys.of(datos.getMeetingType()).into(MeetingsPage.MEETING_TYPE_SELECT_SEARCH),
                Hit.the(Keys.ENTER).into(MeetingsPage.MEETING_TYPE_SELECT_SEARCH),

                Click.on(MeetingsPage.LOCATION_SELECT),
                Click.on(MeetingsPage.LOCATION_SELECT_SEARCH),
                SendKeys.of(datos.getMeetingLocation()).into(MeetingsPage.LOCATION_SELECT_SEARCH),
                Hit.the(Keys.ENTER).into(MeetingsPage.LOCATION_SELECT_SEARCH),

                Click.on(MeetingsPage.UNIT_NAME_SELECT),
                Click.on(MeetingsPage.UNIT_NAME_SELECT_SEARCH),
                SendKeys.of(datos.getUnit()).into(MeetingsPage.UNIT_NAME_SELECT_SEARCH),
                Hit.the(Keys.ENTER).into(MeetingsPage.UNIT_NAME_SELECT_SEARCH),

                Click.on(MeetingsPage.ORGANIZED_BY_SELECT),
                Click.on(MeetingsPage.ORGANIZED_BY_SELECT_SEARCH),
                SendKeys.of(datos.getOrganizedByName()).into(MeetingsPage.ORGANIZED_BY_SELECT_SEARCH),
                Hit.the(Keys.ENTER).into(MeetingsPage.ORGANIZED_BY_SELECT_SEARCH),

                Click.on(MeetingsPage.REPORTER_SELECT),
                Click.on(MeetingsPage.REPORTER_SELECT_SEARCH),
                SendKeys.of(datos.getReporterName()).into(MeetingsPage.REPORTER_SELECT_SEARCH),
                Hit.the(Keys.ENTER).into(MeetingsPage.REPORTER_SELECT_SEARCH)

        );
    }

    public static MeetingsTask validateCreationMeeting() {return instrumented(MeetingsTask.class);}
}
