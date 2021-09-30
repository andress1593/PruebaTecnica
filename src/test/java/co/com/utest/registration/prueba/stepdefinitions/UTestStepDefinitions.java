package co.com.utest.registration.prueba.stepdefinitions;

import co.com.utest.registration.prueba.model.UtestData;
import co.com.utest.registration.prueba.questions.Answer;
import co.com.utest.registration.prueba.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class UTestStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^that Andres wants to create an account in uTest$")
    public void thatAndresWantsToCreateAnAccountInUTest() throws Exception {
        OnStage.theActorCalled("Andres").wasAbleTo(OpenUp.thePage());
    }

    @When("^he fills out the registration form$")
    public void heFillsOutTheRegistrationForm(List<UtestData> utestData) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(RegistrationYourself.
                onThePage(utestData.get(0).getStrName(), utestData.get(0).getStrLastName(), utestData.get(0).getStrEmail()));
        OnStage.theActorInTheSpotlight().attemptsTo(RegistrationAddress.onThePage(utestData.get(0).getStrCity(), utestData.get(0).getStrPostal(), utestData.get(0).getStrCountry()));
        OnStage.theActorInTheSpotlight().attemptsTo(RegistrationDevices.onThePage(utestData.get(0).getStrSystem(), utestData.get(0).getStrSystemVersion(), utestData.get(0).getStrLanguage(),
                utestData.get(0).getStrMobile(), utestData.get(0).getStrModel(), utestData.get(0).getStrMobileOS()));
        OnStage.theActorInTheSpotlight().attemptsTo(RegistrationPassword.onThePage(utestData.get(0).getStrPassword()));
    }

    @Then("^he enters the home page$")
    public void heEntersTheHomePage(List<UtestData> utestData) throws Exception {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(utestData.get(0).getStrTitle())));
    }
}

