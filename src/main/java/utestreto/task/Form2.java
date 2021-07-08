package utestreto.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import org.openqa.selenium.Keys;
import utestreto.model.UtestData;
import utestreto.stepdefinitions.UtestForm;

import java.util.List;

public class Form2 implements Task {
    List<UtestData> utestData;
    public Form2(List<UtestData> utestData) {
        this.utestData = utestData;
    }
    public static Form2 formStep(List<UtestData> utestData) {
        return Tasks.instrumented(Form2.class, utestData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(UtestForm.CITY).andAlignToTop(),
                Enter.theValue(utestData.get(0).getCity()).into(UtestForm.CITY),
                Enter.theValue(utestData.get(0).getPostal()).into(UtestForm.POSTAL),
                Click.on(UtestForm.COUNTRY),
                Enter.theValue(utestData.get(0).getCountry() + Keys.ENTER).into((UtestForm.INPUT_COUNTRY)),
                Click.on(UtestForm.NEXT2)
        );
    }
}
