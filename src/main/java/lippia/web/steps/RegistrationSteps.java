package lippia.web.steps;

import com.crowdar.driver.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.constants.MyAccountConstants;
import lippia.web.constants.RegistrationConstants;
import lippia.web.services.CommonService;

public class RegistrationSteps {
    @When("I click on My Account Menu")
    public void clickOnMyAccountMenu() {
        CommonService.click(RegistrationConstants.MY_ACCOUNT_MENU);
    }
    @And("I enter the valid email {string} in the Register TextBox")
    public void enterValidEmail(String arg0) {
        CommonService.enter(RegistrationConstants.EMAIL_TEXTBOX, arg0);
    }
    @And("I enter the valid password {string} in the Register Textbox")
    public void enterValidPassword(String arg0) {
        CommonService.enter(RegistrationConstants.PASSWORD_TEXTBOX, arg0);
    }
    @When("I click on Register Button")
    public void clickOnRegisterButton() {
        CommonService.click(RegistrationConstants.REGISTER_BUTTON);
    }
    @Then("I am registered and logged in")
    public void registrationSuccessful() {
        String actualValue = DriverManager.getDriverInstance().getCurrentUrl();
        String expectedValue = MyAccountConstants.MY_ACCOUNT_HOME_PAGE_URL;
        CommonService.checkUrl(actualValue, expectedValue);
    }
    @And("I enter (.*) in Register EmailAddress TextBox")
    public void enterEmail(String email) {
        CommonService.enter(RegistrationConstants.EMAIL_TEXTBOX, email);
    }
    @And("I enter (.*) in Register Password Textbox")
    public void enterPassword(String password) {
        CommonService.enter(RegistrationConstants.PASSWORD_TEXTBOX, password);
    }
    @Then("An error message will announce Registration failure")
    public void registrationFail() {
        CommonService.verifyPresence(RegistrationConstants.ERROR_MESSAGE);
    }
}
