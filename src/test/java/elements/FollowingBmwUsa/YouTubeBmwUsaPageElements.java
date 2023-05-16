package elements.FollowingBmwUsa;

import base.AbstractBasePage;
import org.openqa.selenium.WebDriver;

public class YouTubeBmwUsaPageElements extends AbstractBasePage {
    public YouTubeBmwUsaPageElements(WebDriver driver) {
        super(driver);
    }
    protected static final String NAME_HEADER_YOUTUBE = "//div[@id='channel-container']//yt-formatted-string[@id='text']";
}
