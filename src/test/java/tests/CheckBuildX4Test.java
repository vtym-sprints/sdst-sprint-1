package tests;

import base.AbstractBaseTest;
import org.testng.annotations.Test;
import pages.BuildYourOwnPage;
import pages.HomePage;

import static org.testng.Assert.assertTrue;

public class CheckBuildX4Test extends AbstractBaseTest {

    @Test
    public void checkBuildX4Test() {

        HomePage homePage = new HomePage(driver);
        BuildYourOwnPage buildYourOwnPage = new BuildYourOwnPage(driver);

        homePage
                .clickModelsBtn()
                .clickBuildYourOwnBtn();

        buildYourOwnPage
                .selectX4Coupe()
                .selectx4MSports()
                .closeModalZip()
                .selectX4AlpineWhiteColor()
                .pressNextWheelsBtn()
                .pressNextUpholstery()
                .pressNextTrimBtn()
                .selectX4SmokeGrey()
                .pressNextOptionsBtn()
                .pressNextAccessories()
                .pressNextSummaryBtn()
                .closeModalWindow();

        assertTrue(buildYourOwnPage.getName().contains("X4 M40"));
    }
}
