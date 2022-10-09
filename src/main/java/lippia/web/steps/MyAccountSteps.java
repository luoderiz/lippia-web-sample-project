package lippia.web.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.constants.MyAccountConstants;
import lippia.web.services.CommonService;

public class MyAccountSteps {

    @When("I click on Dashboard")
    public void clickOnDashboard() {
        CommonService.click(MyAccountConstants.DASHBORD);
    }

    @Then("I can see the Dashboard of the site")
    public void verifyDashboard() {
        CommonService.verify(MyAccountConstants.DASHBORD, 1);
    }
}
