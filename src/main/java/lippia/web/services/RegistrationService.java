package lippia.web.services;
import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import com.crowdar.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class RegistrationService extends ActionManager {
    public static void click(String locatorElement) {
        WebElement element = waitClickable(locatorElement);
        click(element);
    }
    public static void enter(String element, String data) {
        setInput(element, data, true, false);
    }
    public static void checkUrl() {
        String actualValue = DriverManager.getDriverInstance().getCurrentUrl();
        String expectedValue = PropertyManager.getProperty("web.base.url");
        Assert.assertEquals(actualValue, expectedValue);
    }
}
