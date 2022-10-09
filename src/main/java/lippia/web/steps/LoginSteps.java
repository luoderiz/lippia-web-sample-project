package lippia.web.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.constants.LoginConstants;
import lippia.web.services.LoginService;
import lippia.web.services.RegistrationService;

public class LoginSteps {

    @When("I enter my valid existing username {string} in the Login Textbox")
    public void enterValidUsername(String arg0) {
        LoginService.enter(LoginConstants.USERNAME_TEXTBOX, arg0);
    }

    @And("I enter my valid password {string} in the Login Textbox")
    public void enterValidPassword(String arg0) {
        LoginService.enter(LoginConstants.PASSWORD_TEXTBOX, arg0);
    }

    @And("I click on Login Button")
    public void clickOnLoginButton() {
        LoginService.click(LoginConstants.LOGIN_BUTTON);
    }

    @Then("I will be redirected to My Account Home Page")
    public void loginSuccessful() {
        LoginService.checkUrl();
    }

    @When("I enter (.*) in Login User TextBox")
    public void enterUser(String username) {
        LoginService.enter(LoginConstants.USERNAME_TEXTBOX, username);
    }

    @And("I enter (.*) in Login Password Textbox")
    public void enterPassword(String password) {
        LoginService.enter(LoginConstants.PASSWORD_TEXTBOX, password);
    }

    @Then("An error message will announce Login failure")
    public void loginFail() {
        RegistrationService.verifyFailure();
    }

}
