package co.com.choucair.cetification.proyectobase.tasks;

import co.com.choucair.cetification.proyectobase.models.ActorData;
import co.com.choucair.cetification.proyectobase.userinterfaces.NewMeetingPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SendKeys;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class NewMeetingTask implements Task {

    ActorData datos = new ActorData();
    @Override
    public <T extends Actor> void performAs(T actor) {
        // Dashboard > Meeting > Meetings
        actor.attemptsTo(
                // Dashboard > Meeting > Meetings > Button New Meeting
                Click.on(NewMeetingPage.MEETING),
                Click.on(NewMeetingPage.MEETINGS),
                Click.on(NewMeetingPage.NEW_MEETING_BUTTON),

                // Dashboard > Meeting > Meetings > Button New Meeting > New Meeting Page - fields
                Click.on(NewMeetingPage.MEETING_NAME_FIELD),
                SendKeys.of(datos.getMeetingName()).into(NewMeetingPage.MEETING_NAME_FIELD),
                // Meeting Type Field
                Click.on(NewMeetingPage.MEETING_TYPE_SELECT_FIELD),
                Click.on(NewMeetingPage.MEETING_TYPE_SEARCH_FIELD),
                SendKeys.of(datos.getMeetingType()).into(NewMeetingPage.MEETING_TYPE_SEARCH_FIELD),
                Hit.the(Keys.ENTER).into(NewMeetingPage.MEETING_TYPE_SEARCH_FIELD),
                // Meeting Number
                Click.on(NewMeetingPage.MEETING_NUMBER_FIELD),
                SendKeys.of(datos.getMeetingNubmer()).into(NewMeetingPage.MEETING_NUMBER_FIELD),
                // Start Date - Start Hour
                Click.on(NewMeetingPage.START_DATE_ICON),
                Click.on(NewMeetingPage.SELECT_START_DATE),
                Click.on(NewMeetingPage.SELECT_START_HOUR),
                // Enda Date - End Hour
                Click.on(NewMeetingPage.END_DATE_ICON),
                Click.on(NewMeetingPage.SELECT_END_DATE),
                Click.on(NewMeetingPage.SELECT_END_HOUR),
                // Location
                Click.on(NewMeetingPage.LOCATION_SELECT_FIELD),
                Click.on(NewMeetingPage.LOCATION_SEARCH_FIELD),
                SendKeys.of(datos.getMeetingLocation()).into(NewMeetingPage.LOCATION_SEARCH_FIELD),
                Hit.the(Keys.ENTER).into(NewMeetingPage.LOCATION_SEARCH_FIELD),
                // Unit
                Click.on(NewMeetingPage.UNIT_SELECT_FIELD),
                Click.on(NewMeetingPage.UNIT_SEARCH_FIELD),
                SendKeys.of(datos.getUnit()).into(NewMeetingPage.UNIT_SEARCH_FIELD),
                Hit.the(Keys.ENTER).into(NewMeetingPage.UNIT_SEARCH_FIELD),
                // Organized By
                Click.on(NewMeetingPage.ORGANIZATED_BY_SELECT_FIELD),
                Click.on(NewMeetingPage.ORGANIZATED_BY_SEARCH_FIELD),
                SendKeys.of(datos.getOrganizedByName()).into(NewMeetingPage.ORGANIZATED_BY_SEARCH_FIELD),
                Hit.the(Keys.ENTER).into(NewMeetingPage.ORGANIZATED_BY_SEARCH_FIELD),
                // Reporter
                Click.on(NewMeetingPage.REPORTER_SELECT_FIELD),
                Click.on(NewMeetingPage.REPORTER_SEARCH_FIELD),
                SendKeys.of(datos.getReporterName()).into(NewMeetingPage.REPORTER_SEARCH_FIELD),
                Hit.the(Keys.ENTER).into(NewMeetingPage.REPORTER_SEARCH_FIELD),
                // Attendee List
                Click.on(NewMeetingPage.ATTENDEE_LIST_SELECT_FIELD),
                Click.on(NewMeetingPage.ATTENDEE_LIST_SEARCH_FIELD),
                SendKeys.of(datos.getAttendeeListName()).into(NewMeetingPage.ATTENDEE_LIST_SEARCH_FIELD),
                Hit.the(Keys.ENTER).into(NewMeetingPage.ATTENDEE_LIST_SEARCH_FIELD),
                // Button Save
                Click.on(NewMeetingPage.BTN_SAVE)
        );

    }
    public static NewMeetingTask createNewMeeting() {
        return instrumented(NewMeetingTask.class);
    }
}
