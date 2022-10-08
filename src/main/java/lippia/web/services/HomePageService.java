package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

import static com.crowdar.core.actions.WebActionManager.navigateTo;

public class HomePageService extends ActionManager {
    public static void navigateWeb() {
        navigateTo(PropertyManager.getProperty("web.base.url"));
    }
    public static void click(String locatorElement) {
        WebElement element = waitClickable(locatorElement);
        click(element);
    }
    public static void verify(String locatorElement, int expectedValue) {
        List<WebElement> elements = getElements(locatorElement);
        int actualValue = elements.size();
        Assert.assertEquals(actualValue, expectedValue);
    }
}
