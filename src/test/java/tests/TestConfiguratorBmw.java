package tests;

import base.AbstractBaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BuildYourOwnMainPage;
import pages.ConfiguratorPage;
import pages.HomePage;

public class TestConfiguratorBmw extends AbstractBaseTest {

    @Test
    public void reviewPriceOfBuilt5Series() {
        ConfiguratorPage configuratorPage = new ConfiguratorPage(driver);

        new HomePage(driver)
                .dismissPopup()
                .clickBuildYourOwnButton();

        new BuildYourOwnMainPage(driver)
                .clickSelect5Series()
                .clickSelectModel530i();

        int calculatedPrice = configuratorPage.getCurrentPrice();

        calculatedPrice += configuratorPage.setLookMSport();
        configuratorPage.clickButtonNextPage();

        calculatedPrice += configuratorPage.setColorAventurinRedMetallic();
        configuratorPage.clickButtonNextPage();

        calculatedPrice += configuratorPage.setWheels20MYSpokeBiColorJetBlack();
        configuratorPage
                .regularClickButtonNextPage()
                .regularClickButtonNextPage()
                .regularClickButtonNextPage()
                .regularClickButtonNextPage();

        calculatedPrice += configuratorPage.setExecutivePackage();
        calculatedPrice += configuratorPage.setDrivingAssistanceProfessionalPackage();
        configuratorPage.clickButtonNextPage();

        Assert.assertEquals(configuratorPage.getEstimatedPrice(), calculatedPrice);
    }
}
