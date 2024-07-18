package advantage.stepdefinitions;

import advantage.questions.ValidateUsernameRegisteredAlready;
import advantage.tasks.SignUpFormulariesUserMenu;
import advantage.questions.ValidateUsernameRegister;
import advantage.tasks.EnterDataCreateAccount;

import io.cucumber.java.Before;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static org.hamcrest.CoreMatchers.equalTo;

public class CreateAccountStepsDefinitions {

    @Managed
     public WebDriver Browser;

    @Before
    public void setUp(){
        OnStage.setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(Browser)));
        OnStage.theActorCalled("Jhojan");
    }

    @Given("^User click on the button user menu$")
    public void userClickOnTheButtonUserMenu() throws InterruptedException {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://www.advantageonlineshopping.com/#/"));
        //Thread.sleep(10000);
        OnStage.theActorInTheSpotlight().wasAbleTo(SignUpFormulariesUserMenu.click());

    }

    @When("the user enters {string}, {string}, {string} and {string}")
    public void theUserEntersAnd(String username, String email, String password, String confirmPassword) {
        OnStage.theActorInTheSpotlight().wasAbleTo(EnterDataCreateAccount.data(username,email,password,confirmPassword));

    }

    @Then("the user will see {string}")
    public void theUserWillSee(String username) throws InterruptedException {
        //Thread.sleep(5000);
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateUsernameRegister.username(), equalTo(username)));
    }


    @Then("the user will see error{string}")
    public void theUserWillSeeError(String message) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateUsernameRegisteredAlready.message(), equalTo(message)));
    }
}
