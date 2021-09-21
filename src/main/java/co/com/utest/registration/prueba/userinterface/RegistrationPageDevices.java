package co.com.utest.registration.prueba.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegistrationPageDevices {

    public static final Target NEXT_DEVICES_BUTTON = Target.the("confirm data, move to devices")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[2]/div/a/span"));
}
