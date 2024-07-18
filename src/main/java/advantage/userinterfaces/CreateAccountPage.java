package advantage.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CreateAccountPage {
        public static final Target INP_USERNAME = Target.the("Username Field").located(By.name("usernameRegisterPage"));
        public static final Target INP_EMAIL= Target.the("Email Field").located(By.name("emailRegisterPage"));
        public static final Target INP_PASSWORD= Target.the("Password Field").located(By.name("passwordRegisterPage"));
        public static final Target INP_CONFIRM_PASSWORD= Target.the("Confirm  Field").located(By.name("confirm_passwordRegisterPage"));
        public static final Target CHK_I_AGREE= Target.the("Checkbox I Agree").located(By.name("i_agree"));
        public static final Target BTN_REGISTER = Target.the("Register Button").located(By.id("register_btn"));
        public static final Target TXT_ERROR_USERNAME_REGISTERED = Target.the("Massage Username Registered Already").located(By.xpath("//label[contains(@class, 'center block smollMargin')]"));

}
