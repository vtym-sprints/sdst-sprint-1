package elements.FollowingBmwUsa;

import base.AbstractBasePage;
import org.openqa.selenium.WebDriver;

public class TwitterBmwUsaElements extends AbstractBasePage {
    public TwitterBmwUsaElements(WebDriver driver) {
        super(driver);
    }
    protected static final String NAME_HEADER_TWITTER = "//div[@data-testid='UserName']//span[contains(text(),'BMW USA')]";
}
