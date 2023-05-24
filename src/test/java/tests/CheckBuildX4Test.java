package tests;

import base.AbstractBasePage;
import base.AbstractBaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.HomePage;

public class CheckBuildX4Test extends AbstractBaseTest {

    public CheckBuildX4Test(WebDriver driver) {
        super(driver);
    }

    @Test
    public void checkBuildX4Test() {

        HomePage homePage = new HomePage(driver);

        homePage.clickBuildYourOwnBtn();

        BuildYourOwnPage buildYourOwnPage=new BuildYourOwnPage(driver);

        buildYourOwnPage.x4MSportsSelect().click();
        buildYourOwnPage.customizeThisBuildBtn().click();

        buildYourOwnPage.modalWindowClose().click();

        buildYourOwnPage.x4AlpineWhiteColor().click();
        buildYourOwnPage.nextWheelsBtn().click();
        buildYourOwnPage.nextUpholstery().click();
        buildYourOwnPage.x4BlackAlcantara().click();
        buildYourOwnPage.nextTrimBtn().click();
        buildYourOwnPage.x4SmokeGrey().click();
        buildYourOwnPage.nextOptionsBtn().click();
        buildYourOwnPage.nextAccessories().click();
        buildYourOwnPage.nextSummaryBtn().click();

        buildYourOwnPage.modalWindowClose().click();

        assertTrue(buildYourOwnPage.checkName().getText().contains("X4 M40"));
        assertTrue(buildYourOwnPage.checkPrise().getText().contains("68,100"));
    }
}
