package lippia.web.steps;

import io.cucumber.java.en.Given;
import lippia.web.services.CommonService;

public class BackgroundSteps {

    @Given("I am in automationtesting site")
    public void home() {
        CommonService.navigateWeb();
    }

}
