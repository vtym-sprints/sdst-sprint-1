package tests;

import base.AbstractBasePage;
import base.AbstractBaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.HomePage;

public class CheckBuildX4Test extends AbstractBaseTest {

    @Test
    public void checkBuildX4Test() {

        HomePage homePage = new HomePage(driver);

        homePage.clickBuildYourOwnBtn();

        BuildYourOwnPage buildYourOwnPage=new BuildYourOwnPage(driver);

        buildYourOwnPage.x4MSportsSelect().click();
        buildYourOwnPage.customizeThisBuildBtn().click();

        buildYourOwnPage.modalWindowClose().click();

        buildYourOwnPage.x4AlpineWhiteColor();
        buildYourOwnPage.nextWheelsBtn();
        buildYourOwnPage.nextUpholstery();
        buildYourOwnPage.x4BlackAlcantara();
        buildYourOwnPage.nextTrimBtn();
        buildYourOwnPage.x4SmokeGrey();
        buildYourOwnPage.nextOptionsBtn();
        buildYourOwnPage.nextAccessories();
        buildYourOwnPage.nextSummaryBtn();

        buildYourOwnPage.modalWindowClose();

        assertTrue(buildYourOwnPage.checkName().getText().contains("X4 M40"));
        assertTrue(buildYourOwnPage.checkPrise().getText().contains("68,100"));
    }
}
