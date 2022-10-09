package lippia.web.steps;

import com.crowdar.driver.DriverManager;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.constants.MyAccountConstants;
import lippia.web.services.CommonService;

public class MyAccountSteps {

    @When("I click on Dashboard")
    public void clickOnDashboard() {
        CommonService.click(MyAccountConstants.DASHBORD_BUTTON);
    }

    @Then("I can see the Dashboard of the site")
    public void verifyDashboard() {
        String actualValue = DriverManager.getDriverInstance().getCurrentUrl();
        String expectedValue = MyAccountConstants.MY_ACCOUNT_HOME_PAGE_URL;
        CommonService.checkUrl(actualValue, expectedValue);
    }

    @When("I click on Orders Button")
    public void clickOnOrders() {
        CommonService.click(MyAccountConstants.ORDERS_BUTTON);
    }

    @Then("I can see my Orders Page")
    public void verifyOrders() {
        String actualValue = DriverManager.getDriverInstance().getCurrentUrl();
        String expectedValue = MyAccountConstants.ORDERS_URL;
        CommonService.checkUrl(actualValue, expectedValue);    }
}
