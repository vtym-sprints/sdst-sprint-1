package pages.FollowingPages;

import elements.FollowingBmwUsa.TwitterBmwUsaElements;
import org.openqa.selenium.WebDriver;

public class TwitterFollowPage extends TwitterBmwUsaElements {

    public TwitterFollowPage(WebDriver driver) {
        super(driver);
    }

    public String getNameHeaderTwitter() {
        return waitUntilElementToBeVisibleByXpath(NAME_HEADER_TWITTER).getText();
    }
}
