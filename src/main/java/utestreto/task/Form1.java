package utestreto.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.selectactions.SelectByVisibleTextFromTarget;
import org.openqa.selenium.Keys;
import utestreto.model.UtestData;
import utestreto.stepdefinitions.UtestForm;

import java.util.List;

public class Form1 implements Task {

    List <UtestData> utestData;
    public Form1(List<UtestData> utestData) {
        this.utestData = utestData;
    }
    public static Form1 formStep(List<UtestData> utestData) {
        return Tasks.instrumented(Form1.class,utestData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(UtestForm.IMPUT_NAME).andAlignToTop(),
                Enter.theValue(utestData.get(0).getFirstName()).into(UtestForm.IMPUT_NAME),
                Enter.theValue(utestData.get(0).getLastName()).into(UtestForm.IMPUT_LASTNAME),
                Enter.theValue(utestData.get(0).getEmail()).into(UtestForm.IMPUT_EMAIL),
                new SelectByVisibleTextFromTarget(UtestForm.SELECT_MONTH, utestData.get(0).getMonth()),
                new SelectByVisibleTextFromTarget(UtestForm.SELECT_DAY, utestData.get(0).getDay()),
                new SelectByVisibleTextFromTarget(UtestForm.SELECT_YEAR, utestData.get(0).getYear()),
                Click.on(UtestForm.LANGUAGE),
                Enter.theValue(utestData.get(0).getLanguage()+ Keys.ENTER).into(UtestForm.LANGUAGE),
                Click.on(UtestForm.NEXT1)
        );
    }
}
