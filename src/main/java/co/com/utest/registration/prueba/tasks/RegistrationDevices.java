package co.com.utest.registration.prueba.tasks;

import co.com.utest.registration.prueba.userinterface.RegistrationPageDevices;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class RegistrationDevices implements Task {

    public RegistrationDevices() {
    }

    public static RegistrationDevices onThePage(){
        return Tasks.instrumented(RegistrationDevices.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(RegistrationPageDevices.NEXT_DEVICES_BUTTON)
//                Click.on(RegistrationPageDevices.SELECT_SYSTEM)
        );
    }
}
