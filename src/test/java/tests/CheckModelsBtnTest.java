package tests;

import base.AbstractBaseTest;
import org.testng.annotations.Test;
import pages.BuildYourOwnPage;
import pages.HomePage;

import static org.testng.Assert.assertTrue;

public class CheckModelsBtnTest extends AbstractBaseTest {

    @Test
    public void checkModelsField() {
        HomePage homePage = new HomePage(driver);
        BuildYourOwnPage buildYourOwnPage = new BuildYourOwnPage(driver);

        homePage.dismissPopup()
                .clickModelsBtn();

        buildYourOwnPage
                .choosingXM()
                .pressXMBuildOwn()
                .selectXMBuild()
                .closeModalWindow()
                .pressNextWheelsBtn()
                .pressNextUpholstery()
                .selectXMOrangeLeather()
                .pressNextTrimBtn()
                .pressNextOptionsBtn()
                .pressNextAccessories()
                .pressNextSummaryBtn()
                .closeModalWindow();

        assertTrue(buildYourOwnPage.getName().contains("BMW XM"));
        assertTrue(buildYourOwnPage.getPrice().contains("160,500"));
    }
}
