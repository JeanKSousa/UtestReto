package utestreto.stepdefinitions;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestForm {
    public static final Target IMPUT_NAME = Target.the("write the firstname")
            .located(By.id("firstName"));
    public static final Target IMPUT_LASTNAME = Target.the("write the lastaname")
            .located(By.id("lastName"));
    public static final Target IMPUT_EMAIL = Target.the(" write the email")
            .located(By.id("email"));
    public static final Target SELECT_MONTH = Target.the("select the birth month")
            .located(By.id("birthMonth"));
    public static final Target SELECT_DAY = Target.the("select the birth day")
            .located(By.id("birthDay"));
    public static final Target SELECT_YEAR = Target.the("select the birth year")
            .located(By.id("birthYear"));
    public static final Target LANGUAGE = Target.the("write and select our language")
            .located(By.xpath("//div[@id='languages']//div[1]//input"));
    public static final Target NEXT1 = Target.the("button that shows us the next step")
            .located(By.xpath("//div[@class='form-group col-xs-12 text-right']//a"));
}
