package pages.FollowingPages;

import elements.FollowingBmwUsa.YouTubeBmwUsaPageElements;
import org.openqa.selenium.WebDriver;

public class YouTubeFollowPage extends YouTubeBmwUsaPageElements {
    public YouTubeFollowPage(WebDriver driver) {
        super(driver);
    }
    public String getNameHeaderYouTube() {
        return waitUntilElementToBeVisibleByXpath(NAME_HEADER_YOUTUBE).getText();
    }
}
