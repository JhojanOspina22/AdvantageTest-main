package advantage.tasks;

import advantage.userinterfaces.CreateAccountPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;


public class EnterDataCreateAccount implements Task {

    private String username;
    private String email;
    private String password;
    private String confirmPassword;


    public EnterDataCreateAccount(String username,String email,String password, String confirmPassword) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(username).into(CreateAccountPage.INP_USERNAME),
                Enter.theValue(email).into(CreateAccountPage.INP_EMAIL),
                Enter.theValue(password).into(CreateAccountPage.INP_PASSWORD),
                Enter.theValue(confirmPassword).into(CreateAccountPage.INP_CONFIRM_PASSWORD),
                WaitUntil.the(CreateAccountPage.CHK_I_AGREE, WebElementStateMatchers.isClickable()).forNoMoreThan(30).seconds(),
                Click.on(CreateAccountPage.CHK_I_AGREE),
                WaitUntil.the(CreateAccountPage.BTN_REGISTER, WebElementStateMatchers.isEnabled()).forNoMoreThan(30).seconds(),
                Click.on(CreateAccountPage.BTN_REGISTER)
        );

    }

    public static EnterDataCreateAccount data(String username,String email,String password,String confirmPassword){
        return Tasks.instrumented(EnterDataCreateAccount.class, username,email,password,confirmPassword);

    }


}
