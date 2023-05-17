package pages.FollowingPages;

import elements.FollowingBmwUsa.FacebookBmwUsaElements;
import org.openqa.selenium.WebDriver;

public class FacebookFollowPage extends FacebookBmwUsaElements {
    public FacebookFollowPage(WebDriver driver) {
        super(driver);
    }

    public  String getNameHeaderFacebook() {
       return waitUntilElementToBeVisibleByXpath(NAME_HEADER_FACEBOOK).getText();
    }
}
