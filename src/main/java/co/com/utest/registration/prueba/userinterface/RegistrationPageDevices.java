package co.com.utest.registration.prueba.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegistrationPageDevices {

    public static final Target NEXT_DEVICES_BUTTON = Target.the("confirm location, move to devices")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/div/a"));

    public static final Target SELECT_SYSTEM = Target.the("select the input to enter the string operating system")
            .located(By.xpath("//*[@id=\"web-device\"]/div[1]/div[2]/div/div[1]/span"));

    public static final Target INPUT_SYSTEM = Target.the("enter the operating system")
            .located(By.xpath("//*[@id=\"web-device\"]/div[1]/div[2]/div/input[1]"));

    public static final Target SELECT_VERSION = Target.the("select the input to enter the string operating version")
            .located(By.xpath("//*[@id=\"web-device\"]/div[2]/div[2]/div/div[1]/span"));

    public static final Target INPUT_VERSION = Target.the("enter operating system version")
            .located(By.xpath("//*[@id=\"web-device\"]/div[2]/div[2]/div/input[1]"));

    public static final Target SELECT_LANGUAGE = Target.the("select the input to enter the string operating version")
            .located(By.xpath("//*[@id=\"web-device\"]/div[3]/div[2]/div/div[1]/span"));

    public static final Target INPUT_LANGUAGE = Target.the("enter operating system language")
            .located(By.xpath("//*[@id=\"web-device\"]/div[3]/div[2]/div/input[1]"));

    //Select lista para ingresar mobile

    public static final Target INPUT_MOBILE = Target.the("enter your mobile device")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[1]/div[2]/div/input[1]"));

    //Select lista para ingresar Modelo

    public static final Target INPUT_MODEL = Target.the("enter your model device")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[2]/div[2]/div/input[1]"));

    //Select lsita para ingresa OS

    public static final Target INPUT_MOBILEOS = Target.the("enter your model device")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[3]/div[2]/div/input[1]"));
}
