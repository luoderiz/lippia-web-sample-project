package lippia.web.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.constants.HomePageConstants;
import lippia.web.services.HomePageService;

public class HomePageSteps {

    @When("I click on Shop Menu")
    public void clickOnShopMenu() {
        HomePageService.click(HomePageConstants.HOME_MENU_BUTTON);
    }
    @When("I click on Home Menu Button")
    public void clickOnHomeMenuButton() {
        HomePageService.click(HomePageConstants.SHOP_MENU);
    }

    /*
    @When("I click on (.*)")
    public void clickOnElement(String string) {
        String element = string.toUpperCase().replaceAll("\\s","_");
        if (element.equals("HOME_MENU_BUTTON")){
            HomePageService.click(HomePageConstants.HOME_MENU_BUTTON);
        } if (element.equals("SHOP_MENU")){
            HomePageService.click(HomePageConstants.SHOP_MENU);
        }
    }
     */
    @Then("I can verify that the Home Page has a (.*) of an (.*) only")
    public void verifyElements(int quantity, String string) {
        String element = string.toUpperCase().replaceAll("\\s", "_");
        if (element.equals(HomePageConstants.SLIDER)) {
            HomePageService.verify(HomePageConstants.SLIDER, quantity);
        }
        if (element.equals(HomePageConstants.NEW_ARRIVAL)) {
            HomePageService.verify(HomePageConstants.NEW_ARRIVAL, quantity);
        }
    }
}
