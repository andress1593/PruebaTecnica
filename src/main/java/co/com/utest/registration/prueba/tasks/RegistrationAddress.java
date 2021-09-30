package co.com.utest.registration.prueba.tasks;

import co.com.utest.registration.prueba.userinterface.RegistrationPage;
import co.com.utest.registration.prueba.userinterface.RegistrationPageAddress;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.By;

public class RegistrationAddress implements Task {
    private String strCity;
    private String strPostal;
    private String strCountry;

    public RegistrationAddress(String strCity, String strPostal, String strCountry) {
        this.strCity = strCity;
        this.strPostal = strPostal;
        this.strCountry = strCountry;
    }

    public static RegistrationAddress onThePage(String strCity, String strPostal, String strCountry){
        return Tasks.instrumented(RegistrationAddress.class, strCity, strPostal, strCountry);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(RegistrationPageAddress.NEXT_BUTTON),
                Enter.theValue(strCity).into(RegistrationPageAddress.INPUT_CITY),
                Enter.theValue(strPostal).into(RegistrationPageAddress.INPUT_POSTAL),
                Click.on(RegistrationPageAddress.SELECT_COUNTRY),
                Enter.theValue(strCountry).into(RegistrationPageAddress.INPUT_COUNTRY)
        );
    }
}
