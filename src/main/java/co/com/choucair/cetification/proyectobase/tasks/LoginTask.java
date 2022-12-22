package co.com.choucair.cetification.proyectobase.tasks;


import co.com.choucair.cetification.proyectobase.userinterfaces.LoginPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;


import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LoginTask implements Task {

    private String username = "admin";
    private String password = "serenity";
    @Override
    public <T extends Actor> void performAs(T actor) {

        // Limpia los campos de loging y password e ingresa nuevamente los campos
        actor.attemptsTo(
                Click.on(LoginPage.USERNAME),
                Clear.field("//input[@id='LoginPanel0_Username']"),
                SendKeys.of(username).into(LoginPage.USERNAME),
                Click.on(LoginPage.PASSWORD),
                Clear.field("//input[@id='LoginPanel0_Password']"),
                SendKeys.of(password).into(LoginPage.PASSWORD),
                Click.on(LoginPage.BTN_LOGIN)
        );
    }
        public static LoginTask enterEredentials() {
            return instrumented(LoginTask.class);
        }
}
