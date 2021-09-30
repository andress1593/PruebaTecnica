package co.com.utest.registration.prueba.tasks;

import co.com.utest.registration.prueba.userinterface.RegistrationPageDevices;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.EnterValue;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.By;

public class RegistrationDevices implements Task {
    private String strSystem;
    private String strSystemVersion;
    private String strLanguage;
    private String strMobile;
    private String strModel;
    private String strMobileOS;

    public RegistrationDevices(String strSystem, String strSystemVersion, String strLanguage, String strMobile, String strModel, String strMobileOS) {
        this.strSystem = strSystem;
        this.strSystemVersion = strSystemVersion;
        this.strLanguage = strLanguage;
        this.strMobile = strMobile;
        this.strModel = strModel;
        this.strMobileOS = strMobileOS;
    }

    public static RegistrationDevices onThePage(String strSystem, String strSystemVersion, String strLanguage, String strMobile, String strModel, String strMobileOS){
        return Tasks.instrumented(RegistrationDevices.class, strSystem, strSystemVersion, strLanguage, strMobile, strModel, strMobileOS);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(RegistrationPageDevices.NEXT_DEVICES_BUTTON),
                Click.on(RegistrationPageDevices.SELECT_SYSTEM),
                Enter.theValue(strSystem).into(RegistrationPageDevices.INPUT_SYSTEM),
                Click.on(RegistrationPageDevices.SELECT_VERSION), //Dar click lista de versión sistema para input
                Enter.theValue(strSystemVersion).into(RegistrationPageDevices.INPUT_VERSION),
                Click.on(RegistrationPageDevices.SELECT_LANGUAGE), //Dar click lista de Language para input
                Enter.theValue(strLanguage).into(RegistrationPageDevices.INPUT_LANGUAGE)
//                Click.on(By.xpath("//*[@id=\"mobile-device\"]/div[1]/div[2]/div/div[1]/span")),
//                Enter.theValue(strMobile).into(RegistrationPageDevices.INPUT_MOBILE),
//                Click.on(By.xpath("/html/body/ui-view/m]/div[2]/div/div[1]/span/i")),
//                Enter.theValue(strModel).into(RegistrationPageDevices.INPUT_MODEL),
//                Click.on(By.xpath("//*[@id=\"mobile-device\"]/div[3]/div[2]/div/div[1]/span")),
//                Enter.theValue(strMobileOS).into(RegistrationPageDevices.INPUT_MOBILEOS)
        );
    }
}
