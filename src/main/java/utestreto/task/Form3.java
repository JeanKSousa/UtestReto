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

public class Form3 implements Task {
    List<UtestData> utestData;
    public Form3(List<UtestData> utestData) {
        this.utestData = utestData;
    }
    public static Form3 formStep(List<UtestData> utestData) {
        return Tasks.instrumented(Form3.class, utestData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(UtestForm.COMPUTER).andAlignToTop(),
                Click.on(UtestForm.COMPUTER),
                Enter.theValue(utestData.get(0).getComputer() + Keys.ENTER).into(UtestForm.INPUT_COMPUTER),
                Click.on(UtestForm.VERSION),
                Enter.theValue(utestData.get(0).getVersion() + Keys.ENTER).into(UtestForm.INPUT_VERSION),
                Click.on(UtestForm.LANGUAGE_DEVICE),
                Enter.theValue(utestData.get(0).getLanguage() + Keys.ENTER).into(UtestForm.INPUT_LANGUAGE_DEVICE),
                Click.on(UtestForm.MOBIL),
                Enter.theValue(utestData.get(0).getMobil() + Keys.ENTER).into(UtestForm.INPUT_MOBIL),
                Click.on(UtestForm.MODEL),
                Enter.theValue(utestData.get(0).getModel() + Keys.ENTER).into(UtestForm.INPUT_MODEL),
                Click.on(UtestForm.SYSTEM),
                Enter.theValue(utestData.get(0).getSystem() + Keys.ENTER).into(UtestForm.INPUT_SYSTEM),
                Click.on(UtestForm.NEXT3)
        );
    }
}
