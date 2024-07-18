package advantage.userinterfaces;

import org.openqa.selenium.By;
import net.serenitybdd.screenplay.targets.Target;

public class HomePage {

        public static final Target LNK_USER = Target.the("User Menu").located(By.id("menuUser"));
        public static final Target TXT_USERNAME = Target.the("Username Text").located(By.id("menuUserLink"));
        public static final Target IMG_HEADPHONES = Target.the("Username Text").located(By.id("headphonesImg"));


}
