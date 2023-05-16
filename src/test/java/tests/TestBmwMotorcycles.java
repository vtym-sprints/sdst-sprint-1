package tests;

import base.AbstractBaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

public class TestBmwMotorcycles extends AbstractBaseTest {
    @Test
    public void testBmwMotorcycles() {
        HomePage homePage = new HomePage(driver);

        homePage
                .clickMotorcyclesField();
        homePage
                .goToNextTab(2);

        Assert.assertTrue(urlContains("bmwmotorcycles"));
    }
}
