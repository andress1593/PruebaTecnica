package co.com.utest.registration.prueba.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegistrationPagePassword {

    public static final Target NEXT_PASSWORD_BUTTON = Target.the("confirm devices, move to password")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/div[2]/div/a"));

    public static final Target INPUT_PASSWORD = Target.the("enter the password")
            .located(By.id("password"));

    public static final Target INPUT_CONFIRM_PASSWORD = Target.the("confirm the password")
            .located(By.id("confirmPassword"));

    public static final Target CHECK_TERMS = Target.the("accept the uTest terms of use")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));

    public static final Target CHECK_PRIVACY = Target.the("accept the privacy and security policy")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));

    public static final Target FINISH_BUTTON = Target.the("finish the process")
            .located(By.id("laddaBtn"));

    public static final Target WELCOME_TITLE = Target.the("identify welcome message")
            .located(By.xpath("//*[@id=\"mainContent\"]/div/div/div[1]/div/h1"));
}
