package tests;

import base.AbstractBaseTest;
import org.testng.annotations.Test;
import pages.BuildYourOwnPage;
import pages.HomePage;

import static org.testng.Assert.assertTrue;

public class CheckModelsField extends AbstractBaseTest {

    @Test
    public void checkModelsField() {

        HomePage homePage = new HomePage(driver);
        BuildYourOwnPage buildYourOwnPage = new BuildYourOwnPage(driver);

        homePage.clickDismissBtn();
        homePage.clickModelsField();

        buildYourOwnPage
                .choosingXM();
        buildYourOwnPage
                .pressXMBuildOwn()
                .selectXMBuild();
        buildYourOwnPage
                .closeModalWindow()
                .pressNextWheelsBtn()
                .pressNextUpholstery()
                .selectXMOrangeLeather()
                .pressNextTrimBtn()
                .pressNextOptionsBtn()
                .pressNextAccessories()
                .pressNextSummaryBtn();

        buildYourOwnPage.closeModalWindow();

        assertTrue(buildYourOwnPage.checkName().contains("BMW XM"));
        assertTrue(buildYourOwnPage.checkPrise().contains("160,500"));
    }
}
