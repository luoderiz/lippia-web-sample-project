package lippia.web.services;
import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.RegistrationConstants;
import org.openqa.selenium.WebElement;

public class RegistrationService extends ActionManager {
    public static void verifyFailure() {
        isPresent(RegistrationConstants.ERROR_MESSAGE);
    }
}
