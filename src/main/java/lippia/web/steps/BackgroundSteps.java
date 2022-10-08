package lippia.web.steps;

import io.cucumber.java.en.Given;
import lippia.web.services.HomePageService;

public class BackgroundSteps {
    @Given("I am in automationtesting site")
    public void home() {
        HomePageService.navigateWeb();
    }
}
