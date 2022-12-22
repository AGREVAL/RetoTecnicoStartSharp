package co.com.choucair.cetification.proyectobase.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://demo.serenity.is/Account/Login/")
public class LoginPage extends PageObject {

    // Step 1. Username Field
    public static final Target USERNAME = Target.the("username field").
            locatedBy("(//input[@id='LoginPanel0_Username'])[1]");
    // Step 2. Password Field
    public static final Target PASSWORD = Target.the("password field").
            locatedBy("(//input[@id='LoginPanel0_Password'])[1]");
    // Step 3. Button Login
    public static final Target BTN_LOGIN = Target.the("button login").
            locatedBy("//button[@id='LoginPanel0_LoginButton']");
}
