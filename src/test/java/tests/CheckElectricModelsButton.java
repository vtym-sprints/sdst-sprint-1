package tests;

import base.AbstractBaseTest;
import org.testng.annotations.Test;
import pages.BuildYourOwnPage;
import pages.HomePage;

import static org.testng.Assert.assertTrue;

public class CheckElectricModelsButton extends AbstractBaseTest {

    @Test
    public void CheckElectricModelsButton() {
        HomePage homePage = new HomePage(driver);
        BuildYourOwnPage buildYourOwnPage = new BuildYourOwnPage(driver);

        homePage
                .dismissPopup()
                .clickBMWElectricButton();

        buildYourOwnPage
                .pressAllElectricBtn()
                .pressBuildYoursBtn()
                .selectBmwIX()
                .customizeThisBuildBtn()
                .closeModalZip()
                .pressNextColor()
                .pressNextWheelsBtn()
                .pressNextUpholstery()
                .pressNextTrimBtn()
                .pressNextOptionsBtn()
                .pressNextAccessories()
                .pressNextSummaryBtn()
                .closeModalZip();

        assertTrue(buildYourOwnPage.getName().contains("iX"));
    }
}
