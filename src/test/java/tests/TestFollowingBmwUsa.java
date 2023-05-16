package tests;

import base.AbstractBaseTest;
import elements.HomePageElements;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FollowingPages.FacebookFollowPage;
import pages.HomePage;
import pages.FollowingPages.TwitterFollowPage;
import pages.FollowingPages.YouTubeFollowPage;

public class TestFollowingBmwUsa extends AbstractBaseTest {
    @Test
    public void testFollowinfBmwUsa() {
        HomePage homePage = new HomePage(driver);


        homePage.clickAndSwitchToFollowingPage(HomePageElements.BTN_FOLLOWING_FACEBOOK);
        String nameHeaderFacebook =
                new FacebookFollowPage(driver).getNameHeaderFacebook();
        Assert.assertEquals(nameHeaderFacebook, homePage.NAME_HEADER);
        Assert.assertTrue(urlContains(homePage.URL_CONTAINS_BWM_USA));
        homePage
                .closeAndSwitchToHomePage();

        homePage.clickAndSwitchToFollowingPage(HomePageElements.BTN_FOLLOWING_TWITTER);
        String nameHeaderTwitter =
                new TwitterFollowPage(driver).getNameHeaderTwitter();
        Assert.assertEquals(nameHeaderTwitter, homePage.NAME_HEADER);
        Assert.assertTrue(urlContains(homePage.URL_CONTAINS_BWM_USA));
        homePage
                .closeAndSwitchToHomePage();

        homePage.clickAndSwitchToFollowingPage(HomePageElements.BTN_FOLLOWING_YOUTUBE);
        String nameHeaderYouTube =
                new YouTubeFollowPage(driver).getNameHeaderYouTube();
        Assert.assertEquals(nameHeaderYouTube, homePage.NAME_HEADER);
        Assert.assertTrue(urlContains(homePage.URL_CONTAINS_BWM_USA));
        homePage
                .closeAndSwitchToHomePage();

        homePage.clickAndSwitchToFollowingPage(HomePageElements.BTN_FOLLOWING_INSTAGRAM);
        Assert.assertTrue(urlContains(homePage.URL_CONTAINS_BWM_USA.toLowerCase()));
        homePage
                .closeAndSwitchToHomePage();
    }
}
