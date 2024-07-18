package advantage.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UserPage {

    public static final Target LNK_CreateAccount = Target.the("Link Create Account").located(By.xpath("//a[contains(text(),'CREATE NEW ACCOUNT')]"));


}
