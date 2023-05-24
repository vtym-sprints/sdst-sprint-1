package tests;

import base.AbstractBaseTest;
import org.testng.annotations.Test;
import pages.BuildYourOwnPage;
import pages.HomePage;

import java.util.List;

import static java.lang.Thread.sleep;
import static org.assertj.core.api.Assertions.assertThat;

public class BuildYourOwnX7Test extends AbstractBaseTest {

    @Test
    public void checkBuildYourOwnX7() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        BuildYourOwnPage buildYourOwnPage = new BuildYourOwnPage(driver);

        homePage
                .dismissPopup()
                .clickBuildYourOwnInFooter();

        buildYourOwnPage
                .choseX7()
                .clickSelectX7()
                .clickDesignX7()
                .choseLook()
                .clickNext()
                .choseColor()
                .choseWheels()
                .closeImportantInfoWindow()
                .clickNext()
                .choseUpholstery()
                .choseTrim()
                .clickNext()
                .choseExecutive()
                .choseSoundSystem()
                .clickAddToBuild()
                .confirmChanges()
                .clickNextAccessories()
                .choseAccessoriesCarbonFiber()
                .clickNextSummery();

        List<Integer> optionPricesResult = buildYourOwnPage.getOptionPrices();
        List<Integer> summeryPricesResult = buildYourOwnPage.getPricesInSummery();

        assertThat(summeryPricesResult)
                .as("Prices are wrong")
                .containsAll(optionPricesResult);
    }
}
