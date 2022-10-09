package lippia.web.steps;

import com.crowdar.driver.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.constants.LoginConstants;
import lippia.web.constants.MyAccountConstants;
import lippia.web.services.CommonService;

public class LoginSteps {

    @When("I enter my valid existing username {string} in the Login Textbox")
    public void enterValidUsername(String arg0) {
        CommonService.enter(LoginConstants.USERNAME_TEXTBOX, arg0);
    }

    @And("I enter my valid password {string} in the Login Textbox")
    public void enterValidPassword(String arg0) {
        CommonService.enter(LoginConstants.PASSWORD_TEXTBOX, arg0);
    }

    @And("I click on Login Button")
    public void clickOnLoginButton() {
        CommonService.click(LoginConstants.LOGIN_BUTTON);
    }

    @Then("I am redirected to My Account Home Page")
    public void loginSuccessful() {
        String actualValue = DriverManager.getDriverInstance().getCurrentUrl();
        String expectedValue = MyAccountConstants.MY_ACCOUNT_HOME_PAGE_URL;
        CommonService.checkUrl(actualValue, expectedValue);
    }

    @When("I enter (.*) in Login User TextBox")
    public void enterUser(String username) {
        CommonService.enter(LoginConstants.USERNAME_TEXTBOX, username);
    }

    @And("I enter (.*) in Login Password Textbox")
    public void enterPassword(String password) {
        CommonService.enter(LoginConstants.PASSWORD_TEXTBOX, password);
    }

    @Then("An error message will announce Login failure")
    public void loginFail() {
        CommonService.verifyPresence(LoginConstants.ERROR_MESSAGE);
    }

}
