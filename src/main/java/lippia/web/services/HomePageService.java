package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.HomePageConstants;

import static com.crowdar.core.actions.WebActionManager.navigateTo;

public class HomePageService extends ActionManager {

    public static void navegarWeb(){
        navigateTo(PropertyManager.getProperty("web.base.url"));
    }

    public static void enterSearchCriteria(String text) {
        setInput(HomePageConstants.INPUT_SEARCH_XPATH, text);
    }

    public static void clickSearchButton() {
        click(HomePageConstants.SEARCH_BUTTON_NAME);
    }

    public static void goToShopMenu() {
        click(HomePageConstants.MENU_SHOP);
    }

    public static void clickOnHomeButton() {
        click(HomePageConstants.HOME_BUTTON);
    }
}
