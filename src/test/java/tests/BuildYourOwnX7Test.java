package tests;

import base.AbstractBaseTest;
import org.testng.annotations.Test;
import pages.BuildYourOwnPage;
import pages.HomePage;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class BuildYourOwnX7Test extends AbstractBaseTest {

    @Test
    public void checkBuildYourOwnX7() {
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
                .clickNext()
                .choseWheels()
                .clickNext()
                .choseUpholstery()
                .confirmChanges()
                .clickNext()
                .clickNext()
                .choseExecutive()
                .choseSoundSystem()
                .clickAddToBuild()
                .confirmChanges()
                .clickNextAccessories()
                .clickNextSummaryButton();

        List<Integer> optionPricesResult = buildYourOwnPage.getOptionPrices();
        int sum = optionPricesResult.stream().mapToInt(Integer::intValue).sum()
                + buildYourOwnPage.getTotalPriceX7();
        assertThat(sum)
                .as("Prices are wrong")
                .isEqualTo(115850);
    }
}
