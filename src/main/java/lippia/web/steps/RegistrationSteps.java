package lippia.web.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.constants.RegistrationConstants;
import lippia.web.services.RegistrationService;

public class RegistrationSteps {
    @When("I click on My Account Menu")
    public void clickOnMyAccountMenu() {
        RegistrationService.click(RegistrationConstants.MY_ACCOUNT_MENU);
    }
    @And("I enter {string} in email address textbox")
    public void enterEmail(String arg0) {
        RegistrationService.enter(RegistrationConstants.EMAIL_TEXTBOX, arg0);
    }
    @And("I enter {string} in password textbox")
    public void enterPassword(String arg0) {
        RegistrationService.enter(RegistrationConstants.PASSWORD_TEXTBOX, arg0);
    }
    @When("I click on Register Button")
    public void clickOnRegisterButton() {
        RegistrationService.click(RegistrationConstants.REGISTER_BUTTON);
    }
    @Then("I will be navigated to the Home Page")
    public void registrationSuccessful() {
        RegistrationService.checkUrl();
    }

}
