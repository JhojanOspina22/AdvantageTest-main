package advantage.questions;

import advantage.userinterfaces.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;


public class ValidateUsernameRegister implements Question {

    @Override
    public Object answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the(HomePage.TXT_USERNAME, WebElementStateMatchers.isVisible()).forNoMoreThan(30).seconds());
       return HomePage.TXT_USERNAME.resolveFor(actor).getText();
    }
    public static ValidateUsernameRegister username(){
        return new ValidateUsernameRegister();
    }
}
