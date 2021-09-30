package co.com.utest.registration.prueba.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegistrationPageAddress {

    public static final Target NEXT_BUTTON = Target.the("confirm data, move to location")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[2]/a/span"));

    public static final Target INPUT_CITY = Target.the("enter the city")
            .located(By.id("city"));

    public static final Target INPUT_POSTAL = Target.the("enter the postal code")
            .located(By.id("zip"));

    public static final Target SELECT_COUNTRY = Target.the("click on the list")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/div[1]"));

    public static final Target INPUT_COUNTRY = Target.the("enter the country")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/input[1]"));
}
