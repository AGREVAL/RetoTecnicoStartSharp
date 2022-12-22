package co.com.choucair.cetification.proyectobase.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class NewBusinessUnitPage extends PageObject {

    public static final Target ORGANIZATION = Target.the("Organization").
            locatedBy("//span[contains(text(),'Organization')]");

    public static final Target BUSINESS_UNIT = Target.the("Business Unit").
            locatedBy("//span[contains(text(),'Business Units')]");

    public static final Target NEW_BUSINESS_UNIT_BUTTON = Target.the("Button New Business Unit").
            locatedBy("//body/main[1]/section[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/span[1]");

    // New Business Unit
    public static final Target NEW_BUSINESS_UNIT_NAME = Target.the("Field Name").
            locatedBy("//input[@id='Serenity_Pro_Organization_BusinessUnitDialog3_Name']");

    public static final Target NEW_BUSINESS_UNIT_PARENT_UNIT = Target.the("Field Parent Unit").
            locatedBy("//body/div[4]/div[2]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/a[1]/span[2]");

    public static final Target NEW_BUSINESS_UNIT_PARENT_UNIT_SEARCH_FIELD = Target.the("Field Search").
            locatedBy("/html[1]/body[1]/div[7]/div[1]/input[1]");

    public static final Target NEW_BUSINESS_UNIT_PARENT_UNIT_CHOICE = Target.the("Field Search").
            locatedBy("/html[1]/body[1]/div[7]/ul[1]/li[1]/div[1]");

    public static final Target NEW_BUSINESS_UNIT_BTN_SAVE = Target.the("Btn Save").
            locatedBy("//body/div[4]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]");


}
