package co.com.utest.registration.prueba.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegistrationPage {

    public static final Target JOIN_BUTTON = Target.the("button that show us the registration form")
            .located(By.xpath("/html/body/ui-view/unauthenticated-container/div/div/unauthenticated-header/div/div[3]/ul[2]/li[2]/a"));

    public static final Target INPUT_FIRSTNAME = Target.the("where we write the user name")
            .located(By.id("firstName"));

    public static final Target INPUT_LASTNAME = Target.the("where we write the last name user")
            .located(By.id("lastName"));

    public static final Target INPUT_EMAIL = Target.the("where we write the email")
            .located(By.id("email"));

    public static final Target SELECT_MONTH = Target.the("Select the month of birth")
            .located(By.id("birthMonth"));

    public static final Target SELECT_DAY = Target.the("Select the day of birth")
            .located(By.id("birthDay"));

    public static final Target SELECT_YEAR = Target.the("Select the year of birth")
            .located(By.id("birthYear"));

    public static final Target NEXT_BUTTON = Target.the("confirm data, move to location")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[2]/a/span"));
}
