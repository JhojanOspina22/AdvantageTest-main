package advantage.questions;

import advantage.userinterfaces.CreateAccountPage;
import advantage.userinterfaces.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;


public class ValidateUsernameRegisteredAlready implements Question {

    @Override
    public Object answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the(CreateAccountPage.TXT_ERROR_USERNAME_REGISTERED, WebElementStateMatchers.isVisible()).forNoMoreThan(30).seconds());
       return CreateAccountPage.TXT_ERROR_USERNAME_REGISTERED.resolveFor(actor).getText();
    }
    public static ValidateUsernameRegisteredAlready message(){
        return new ValidateUsernameRegisteredAlready();
    }
}
