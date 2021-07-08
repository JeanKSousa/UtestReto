package utestreto.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnlineCast;
import utestreto.model.UtestData;
import utestreto.task.OpenUp;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class UtestStepdefinition {
    @Before
    public void setStage(){
        setTheStage(new OnlineCast());
    }

    @Given("^I enter to utest$")
    public void iEnterToUtest() throws Exception {
        theActorCalled("jean").wasAbleTo(OpenUp.thePage());
    }

    @When("^I type my personal information on the form$")
    public void iTypeMyPersonalInformationOnTheForm(List<UtestData> utestData) throws Exception {

    }

    @Then("^Successfully registered$")
    public void successfullyRegistered() throws Exception {
    }
}
