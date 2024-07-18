package advantage.tasks;

import advantage.userinterfaces.HomePage;
import advantage.userinterfaces.UserPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;


public class SignUpFormulariesUserMenu implements Task {



    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(HomePage.IMG_HEADPHONES, WebElementStateMatchers.isVisible()).forNoMoreThan(30).seconds(),
                WaitUntil.the(HomePage.LNK_USER, WebElementStateMatchers.isClickable()).forNoMoreThan(30).seconds(),
                Click.on(HomePage.LNK_USER),
                WaitUntil.the(UserPage.LNK_CreateAccount, WebElementStateMatchers.isClickable()).forNoMoreThan(30).seconds(),
                Click.on(UserPage.LNK_CreateAccount)
        );
    }

    public static SignUpFormulariesUserMenu click(){
        return Tasks.instrumented(SignUpFormulariesUserMenu.class);
    }
}
