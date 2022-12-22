package co.com.choucair.cetification.proyectobase.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class MeetingsPage {

    public  static final Target MEETING_TYPE_SELECT = Target.the("Meeting Type Select ").
            locatedBy("//body/main[1]/section[1]/div[1]/div[2]/div[4]/div[1]/div[1]/a[1]/span[2]");
    public  static final Target MEETING_TYPE_SELECT_SEARCH = Target.the("Location Select Search").
            locatedBy("#s2id_autogen1_search");
    public  static final Target LOCATION_SELECT = Target.the("Location Select").
            locatedBy("//body/main[1]/section[1]/div[1]/div[2]/div[4]/div[2]/div[1]/a[1]/span[2]");
    public  static final Target LOCATION_SELECT_SEARCH= Target.the("Location Select").
            locatedBy("#s2id_autogen2_search");
    public  static final Target UNIT_NAME_SELECT = Target.the("Location Select").
            locatedBy("//body/main[1]/section[1]/div[1]/div[2]/div[4]/div[3]/div[1]/a[1]/span[2]");
    public  static final Target UNIT_NAME_SELECT_SEARCH = Target.the("Unit Name Select").
            locatedBy("#s2id_autogen3_search");
    public  static final Target ORGANIZED_BY_SELECT = Target.the("Unit Name Select").
            locatedBy("//body/main[1]/section[1]/div[1]/div[2]/div[4]/div[4]/div[1]/a[1]/span[2]");
    public  static final Target ORGANIZED_BY_SELECT_SEARCH = Target.the("Unit Name Select").
            locatedBy("#s2id_autogen4_search");
    public  static final Target REPORTER_SELECT = Target.the("Unit Name Select").
            locatedBy("//body/main[1]/section[1]/div[1]/div[2]/div[4]/div[5]/div[1]/a[1]/span[2]");
    public  static final Target REPORTER_SELECT_SEARCH = Target.the("Reporter select search").
            locatedBy("#s2id_autogen5_search");


}
