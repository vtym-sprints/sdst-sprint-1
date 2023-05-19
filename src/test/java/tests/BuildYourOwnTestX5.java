package tests;

import base.AbstractBaseTest;
import org.testng.annotations.Test;
import pages.BuildYourOwnPage;
import pages.HomePage;

public class BuildYourOwnTestX5 extends AbstractBaseTest {

    @Test
    public void checkCustomizeX5M() {
        BuildYourOwnPage buildYourOwnPage = new BuildYourOwnPage(driver);
        HomePage homePage = new HomePage(driver);
        openPage("https://www.bmwusa.com/");

        homePage.clickDismissBtn();
        homePage.clickBuildYourOwnBtn();

        buildYourOwnPage
                .selectX5MSports()
                .selectX5MCompetition()
                .closeModalWindow()
                .pressNextWheelsBtn()
                .pressNextUpholstery()
                .pressNextTrimBtn()
                .pressNextOptionsBtn()
                .pressNextSummaryBtn()
                .closeModalWindow();

        assertTrue(buildYourOwnPage.checkName().contains("Competition"));
        assertTrue(buildYourOwnPage.checkPrise().contains("122,300"));
    }
}
