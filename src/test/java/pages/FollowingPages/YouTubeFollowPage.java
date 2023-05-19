package pages.FollowingPages;

import elements.FollowingBmwUsa.YouTubeBmwUsaElements;
import org.openqa.selenium.WebDriver;

public class YouTubeFollowPage extends YouTubeBmwUsaElements {

    public YouTubeFollowPage(WebDriver driver) {
        super(driver);
    }

    public String getNameHeaderYouTube() {
        return waitUntilElementToBeVisibleByXpath(NAME_HEADER_YOUTUBE).getText();
    }
}
