package advantage.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src\\test\\resources\\features\\CreateAccount.feature",
glue = "advantage.stepdefinitions", tags = "@UserRegistered",
snippets = CucumberOptions.SnippetType.CAMELCASE)

public class CreateAccount {
}
