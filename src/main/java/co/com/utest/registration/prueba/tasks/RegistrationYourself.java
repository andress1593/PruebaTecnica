package co.com.utest.registration.prueba.tasks;

import co.com.utest.registration.prueba.userinterface.RegistrationPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class RegistrationYourself implements Task {

    private String strName;
    private String strLastName;
    private String strEmail;

    public RegistrationYourself(String strName, String strLastName, String strEmail) {
        this.strName = strName;
        this.strLastName = strLastName;
        this.strEmail = strEmail;
    }

    public static RegistrationYourself onThePage(String strName, String strLastName, String strEmail){
        return Tasks.instrumented(RegistrationYourself.class, strName, strLastName, strEmail);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo((Click.on(RegistrationPage.JOIN_BUTTON)),
                Enter.theValue(strName).into(RegistrationPage.INPUT_FIRSTNAME),
                Enter.theValue(strLastName).into(RegistrationPage.INPUT_LASTNAME),
                Enter.theValue(strEmail).into(RegistrationPage.INPUT_EMAIL),
                SelectFromOptions.byValue("number:7").from(RegistrationPage.SELECT_MONTH),
                SelectFromOptions.byValue("number:15").from(RegistrationPage.SELECT_DAY),
                SelectFromOptions.byValue("number:1993").from(RegistrationPage.SELECT_YEAR)
        );

    }
}