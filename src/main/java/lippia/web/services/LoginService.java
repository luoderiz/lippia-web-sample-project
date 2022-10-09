package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.driver.DriverManager;
import lippia.web.constants.RegistrationConstants;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class LoginService extends ActionManager {

    public static void checkUrl() {
        String actualValue = DriverManager.getDriverInstance().getCurrentUrl();
        String expectedValue = RegistrationConstants.MY_ACCOUNT_HOME_PAGE;
        Assert.assertEquals(actualValue, expectedValue);
    }
}
