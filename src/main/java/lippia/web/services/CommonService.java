package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.CommonConstants;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

import static com.crowdar.core.actions.WebActionManager.navigateTo;

public class CommonService extends ActionManager {

    public static void dismissAdds() {
        boolean add = isPresent(CommonConstants.ADD);
        if (add) {
            click(CommonConstants.CLOSE_ADD);
        }
    }

    public static void navigateWeb() {
        navigateTo(PropertyManager.getProperty("web.base.url"));
        dismissAdds();
    }

    public static void click(String locatorElement) {
        WebElement element = waitClickable(locatorElement);
        click(element);
        dismissAdds();
    }

    public static void verify(String locatorElement, int expectedValue) {
        List<WebElement> elements = getElements(locatorElement);
        int actualValue = elements.size();
        Assert.assertEquals(actualValue, expectedValue);
    }

    public static void enter(String element, String data) {
        waitPresence(element);
        setInput(element, data, true, false);
        dismissAdds();
    }

    public static void checkUrl(String actualValue, String expectedValue) {
        Assert.assertEquals(actualValue, expectedValue);
    }

    public static void verifyPresence(String element) {
        isPresent(element);
    }
}