package tests;

import base.AbstractBaseTest;
import org.testng.annotations.Test;
import pages.BuildYourOwnPage;
import pages.HomePage;

import static org.testng.Assert.assertTrue;

public class BuildYourOwnX5Test extends AbstractBaseTest {

    @Test
    public void checkCustomizeX5M() {
        BuildYourOwnPage buildYourOwnPage = new BuildYourOwnPage(driver);
        HomePage homePage = new HomePage(driver);

        homePage.dismissPopup()
                .clickBuildYourOwnBtn();

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

        assertTrue(buildYourOwnPage.getName().contains("Competition"));
        assertTrue(buildYourOwnPage.getPrice().contains("122,300"));
    }
}
