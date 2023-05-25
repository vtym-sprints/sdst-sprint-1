package tests;

import base.AbstractBaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FollowingPages.FacebookFollowPage;
import pages.FollowingPages.TwitterFollowPage;
import pages.FollowingPages.YouTubeFollowPage;
import pages.HomePage;

import static elements.HomePageElements.*;

public class TestFollowingBmwUsa extends AbstractBaseTest {
    private static final String NAME_HEADER = "BMW USA";
    private static final String URL_CONTAINS_BWM_USA = "BMWUSA";

    @Test
    public void testFollowingBmwUsa() {
        HomePage homePage = new HomePage(driver);

        homePage.clickAndSwitchToFollowingPage(BTN_FOLLOWING_FACEBOOK);

        Assert.assertEquals(new FacebookFollowPage(driver).getNameHeaderFacebook(), NAME_HEADER);
        Assert.assertTrue(urlContains(URL_CONTAINS_BWM_USA));

        homePage
                .closeAndSwitchToHomePage()
                .clickAndSwitchToFollowingPage(BTN_FOLLOWING_TWITTER);

        Assert.assertEquals(new TwitterFollowPage(driver).getNameHeaderTwitter(), NAME_HEADER);
        Assert.assertTrue(urlContains(URL_CONTAINS_BWM_USA));

        homePage
                .closeAndSwitchToHomePage()
                .clickAndSwitchToFollowingPage(BTN_FOLLOWING_YOUTUBE);

        Assert.assertEquals(new YouTubeFollowPage(driver).getNameHeaderYouTube(), NAME_HEADER);
        Assert.assertTrue(urlContains(URL_CONTAINS_BWM_USA));

        homePage
                .closeAndSwitchToHomePage()
                .clickAndSwitchToFollowingPage(BTN_FOLLOWING_INSTAGRAM);

        Assert.assertTrue(urlContains(URL_CONTAINS_BWM_USA.toLowerCase()));
    }
}
