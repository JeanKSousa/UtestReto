package utestreto.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import utestreto.model.UtestData;
import utestreto.stepdefinitions.UtestForm;

import java.util.List;

public class Form4 implements Task {
    List<UtestData> utestData;
    public Form4(List<UtestData> utestData) {
        this.utestData = utestData;
    }
    public static Form4 formStep(List<UtestData> utestData) {
        return Tasks.instrumented(Form4.class,utestData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(UtestForm.IMPUT_PASSWORD1).andAlignToTop(),
                Enter.theValue(utestData.get(0).getPassword()).into(UtestForm.IMPUT_PASSWORD1),
                Enter.theValue(utestData.get(0).getPassword()).into(UtestForm.IMPUT_PASSWORD2),
                Click.on(UtestForm.CHECK_STAY),
                Click.on(UtestForm.CHECK_TERMS),
                Click.on(UtestForm.CHECK_PRIVACY),
                Click.on(UtestForm.COMPLETE_BUTTON)
        );
    }
}
