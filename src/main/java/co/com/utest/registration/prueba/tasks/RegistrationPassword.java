package co.com.utest.registration.prueba.tasks;

import co.com.utest.registration.prueba.userinterface.RegistrationPagePassword;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class RegistrationPassword implements Task {

    private String strPassword;

    public RegistrationPassword(String strPassword) {
        this.strPassword = strPassword;
    }

    public static RegistrationPassword onThePage(String strPassword){
        return Tasks.instrumented(RegistrationPassword.class, strPassword);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(RegistrationPagePassword.NEXT_PASSWORD_BUTTON),
                Enter.theValue(strPassword).into(RegistrationPagePassword.INPUT_PASSWORD),
                Enter.theValue(strPassword).into(RegistrationPagePassword.INPUT_CONFIRM_PASSWORD),
                Click.on(RegistrationPagePassword.CHECK_TERMS),
                Click.on(RegistrationPagePassword.CHECK_PRIVACY),
                Click.on(RegistrationPagePassword.FINISH_BUTTON)
        );
    }
}
