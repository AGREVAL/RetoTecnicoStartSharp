package co.com.choucair.cetification.proyectobase.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class NewMeetingPage extends PageObject {

    public String startHour = "09:00";
    public String endHour = "11:00";

    // ********** Dashboard **********

    // Meeting > Meetings > Button New Meeting
    public static final Target MEETING = Target.the("Meeting").
            locatedBy("//body/aside[@id='s-sidebar']/div[2]/div[2]/div[1]/ul[1]/li[3]/ul[1]/li[2]/a[1]/span[1]");
    public static final Target MEETINGS = Target.the("Meetings").
            locatedBy("//span[contains(text(),'Meetings')]");
    public static final Target NEW_MEETING_BUTTON = Target.the("New Meeting Button").
            locatedBy("//body/main[1]/section[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/span[1]");

    // ********** New Meeting Page **********
    public static final Target MEETING_NAME_FIELD = Target.the("Field Meeting Name").
            locatedBy("#Serenity_Pro_Meeting_MeetingDialog10_MeetingName");
    public static final Target MEETING_TYPE_SELECT_FIELD = Target.the("Field Meting type").
            locatedBy("//body/main[1]/section[1]/div[2]/div[2]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/a[1]/span[2]");
    public static final Target MEETING_TYPE_SEARCH_FIELD = Target.the("Field Search")
                .locatedBy("#s2id_autogen6_search");
    public static final Target MEETING_NUMBER_FIELD = Target.the("Field Meeting Number").
            locatedBy("#Serenity_Pro_Meeting_MeetingDialog10_MeetingNumber");
    public static final Target START_DATE_ICON = Target.the("Start Date").
            locatedBy("//body/main[1]/section[1]/div[2]/div[2]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[4]/button[1]/i[1]");
    public static final Target SELECT_START_DATE = Target.the("Field Start Date").
            locatedBy("//a[contains(text(),'30')]");
    public static final Target SELECT_START_HOUR = Target.the("Field Start Hour").
            locatedBy("//body/main[1]/section[1]/div[2]/div[2]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[4]/select[1]/option[109]");
    public static final Target END_DATE_ICON = Target.the("End Date Icon").
            locatedBy("//body/main[1]/section[1]/div[2]/div[2]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[5]/button[1]/i[1]");
    public static final Target SELECT_END_DATE = Target.the("End Date Select Field").
            locatedBy("//a[normalize-space()='31']");
    public static final Target SELECT_END_HOUR = Target.the("End Hour Select Field").
            locatedBy("//body/main[1]/section[1]/div[2]/div[2]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[5]/select[1]/option[133]");
    public static final Target LOCATION_SELECT_FIELD = Target.the("Field Location").
            locatedBy("//body/main[1]/section[1]/div[2]/div[2]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[6]/div[1]/a[1]/span[2]");
    public static final Target LOCATION_SEARCH_FIELD = Target.the("Field Location Search").
            locatedBy("#s2id_autogen7_search");
    public static final Target UNIT_SELECT_FIELD = Target.the("Field Unit").
            locatedBy("//body/main[1]/section[1]/div[2]/div[2]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[7]/div[1]/a[1]/span[2]");
    public static final Target UNIT_SEARCH_FIELD = Target.the("Field Unit Search").
            locatedBy("#s2id_autogen8_search");
    public static final Target ORGANIZATED_BY_SELECT_FIELD = Target.the("Field Organized By").
            locatedBy("//body/main[1]/section[1]/div[2]/div[2]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[8]/div[1]/a[1]/span[2]");
    public static final Target ORGANIZATED_BY_SEARCH_FIELD = Target.the("Field Organized By Search").
            locatedBy("#s2id_autogen9_search");
    public static final Target REPORTER_SELECT_FIELD = Target.the("Field Reporter").
            locatedBy("//body/main[1]/section[1]/div[2]/div[2]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[9]/div[1]/a[1]/span[2]");
    public static final Target REPORTER_SEARCH_FIELD = Target.the("Field Reporter Search").
            locatedBy("#s2id_autogen10_search");
    public static final Target ATTENDEE_LIST_SELECT_FIELD = Target.the("Field Attendee List").
            locatedBy("//body/main[1]/section[1]/div[2]/div[2]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[10]/div[1]/div[1]/div[2]/a[1]/span[2]");
    public static final Target ATTENDEE_LIST_SEARCH_FIELD = Target.the("Field Attendee List Search").
            locatedBy("#s2id_autogen12_search");
    public static final Target BTN_SAVE = Target.the("Btn Save").
            locatedBy("//body/main[1]/section[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]");

}
