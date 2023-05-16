package tests;

import base.AbstractBaseTest;
import base.CommonActions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.MotorcyclerPage;

public class TestFollowingBmwUsa extends AbstractBaseTest {
    @Test
    public void testFollowingBmwUsa() {
        HomePage homePage = new HomePage(driver);

        homePage
                .clickMotorcyclesField();
        homePage
                .goToNextTab(2);

        Assert.assertTrue(urlContains("bmwmotorcycles"));
    }
}
