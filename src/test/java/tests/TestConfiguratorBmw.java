package tests;

import base.AbstractBaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BuildYourOwnMainPage;
import pages.ConfiguratorPage;
import pages.HomePage;

public class TestConfiguratorBmw extends AbstractBaseTest {

    @Test
    public void checkPriceOfBuilt5Series() {
        ConfiguratorPage configuratorPage = new ConfiguratorPage(driver);

        new HomePage(driver)
                .dismissPopup()
                .clickBuildYourOwnButton();

        new BuildYourOwnMainPage(driver)
                .clickSelect5Series()
                .clickSelectModel530i();

        int calculatedPrice = configuratorPage.getCurrentPrice();

        calculatedPrice += configuratorPage.setLookMSport();
        configuratorPage.clickNextColorButton();

        calculatedPrice += configuratorPage.setColorAventurinRedMetallic();
        configuratorPage
                .clickNextWheelsButton()
                .closeZipcodeModal();

        calculatedPrice += configuratorPage.setWheels20MYSpokeBiColorJetBlack();
        configuratorPage
                .clickNextUpholsteryButton()
                .clickNextTrimButton()
                .clickNextOptionsButton();

        calculatedPrice += configuratorPage.setExecutivePackage();
        calculatedPrice += configuratorPage.setDrivingAssistanceProfessionalPackage();
        configuratorPage.clickNextSummaryButton();

        Assert.assertEquals(configuratorPage.getEstimatedPrice(), calculatedPrice);
    }
}
