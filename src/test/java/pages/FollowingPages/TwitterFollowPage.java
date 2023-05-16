package pages.FollowingPages;

import elements.FollowingBmwUsa.TwitterBmwUsaPageElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TwitterFollowPage extends TwitterBmwUsaPageElements {
    public TwitterFollowPage(WebDriver driver) {
        super(driver);
    }
    public String getNameHeaderTwitter() {
        return waitUntilElementToBeVisibleByXpath(NAME_HEADER_TWITTER).getText();
    }
}
