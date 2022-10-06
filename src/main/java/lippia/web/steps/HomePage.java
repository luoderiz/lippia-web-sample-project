package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.*;
import lippia.web.services.GoogleSearchResultService;
import lippia.web.services.HomePageService;

public class HomePage extends PageSteps {

    @Given("The client is in AT Home Page")
    public void navegarWeb() {
        HomePageService.navegarWeb();
    }

    @When("The client clicks on Shop Menu")
    public void clickOnMenu() {
        HomePageService.goToShopMenu();
    }

    @And("click on Home menu button")
    public void clickOnHomeButton() {
        HomePageService.clickOnHomeButton();
    }


    @Then("The client verifies that Home page contain only three sliders")
    public void statVerfication() {
        HomePageService.verifyResults();

    }

}
