package tests;

import base.AbstractBaseTest;
import elements.HomePageElements;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FollowingPages.FacebookFollowPage;
import pages.FollowingPages.TwitterFollowPage;
import pages.FollowingPages.YouTubeFollowPage;
import pages.HomePage;

public class TestFollowingBmwUsa extends AbstractBaseTest {
    private static final String NAME_HEADER = "BMW USA";
    private static final String URL_CONTAINS_BWM_USA = "BMWUSA";

    @Test
    public void testFollowingBmwUsa() {
        HomePage homePage = new HomePage(driver);

        homePage.clickAndSwitchToFollowingPage(HomePageElements.BTN_FOLLOWING_FACEBOOK);
        String nameHeaderFacebook =
                new FacebookFollowPage(driver).getNameHeaderFacebook();

        Assert.assertEquals(nameHeaderFacebook, TestFollowingBmwUsa.NAME_HEADER);
        Assert.assertTrue(urlContains(TestFollowingBmwUsa.URL_CONTAINS_BWM_USA));

        homePage
                .closeAndSwitchToHomePage();

        homePage.clickAndSwitchToFollowingPage(HomePageElements.BTN_FOLLOWING_TWITTER);
        String nameHeaderTwitter =
                new TwitterFollowPage(driver).getNameHeaderTwitter();

        Assert.assertEquals(nameHeaderTwitter, TestFollowingBmwUsa.NAME_HEADER);
        Assert.assertTrue(urlContains(TestFollowingBmwUsa.URL_CONTAINS_BWM_USA));

        homePage
                .closeAndSwitchToHomePage();

        homePage.clickAndSwitchToFollowingPage(HomePageElements.BTN_FOLLOWING_YOUTUBE);
        String nameHeaderYouTube =
                new YouTubeFollowPage(driver).getNameHeaderYouTube();

        Assert.assertEquals(nameHeaderYouTube, TestFollowingBmwUsa.NAME_HEADER);
        Assert.assertTrue(urlContains(TestFollowingBmwUsa.URL_CONTAINS_BWM_USA));

        homePage
                .closeAndSwitchToHomePage();

        homePage.clickAndSwitchToFollowingPage(HomePageElements.BTN_FOLLOWING_INSTAGRAM);

        Assert.assertTrue(urlContains(TestFollowingBmwUsa.URL_CONTAINS_BWM_USA.toLowerCase()));

        homePage
                .closeAndSwitchToHomePage();
    }
}
