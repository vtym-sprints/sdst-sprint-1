package pages.FollowingPages;

import elements.FollowingBmwUsa.FacebookBmwUsaPageElements;
import org.openqa.selenium.WebDriver;

public class FacebookFollowPage extends FacebookBmwUsaPageElements {
    public FacebookFollowPage(WebDriver driver) {
        super(driver);
    }
    public  String getNameHeaderFacebook() {
       return waitUntilElementToBeVisibleByXpath(NAME_HEADER_FACEBOOK).getText();
    }

}
