package pages;

import elements.ConfiguratorElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static base.CommonActions.*;
import static java.lang.Integer.parseInt;

public class ConfiguratorPage extends ConfiguratorElements {

    public ConfiguratorPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getCurrentPriceElement() {
        return waitUntilElementToBeVisibleByXpath(CURRENT_PRICE);
    }

    public WebElement getSelectionPriceChangeElement() {
        return waitUntilElementToBeVisibleByXpath(SELECTION_PRICE_CHANGE);
    }

    public WebElement getButtonConfirmChanges() {
        return waitUntilElementToBeClickableByXpath(BUTTON_CONFIRM_CHANGES);
    }

    public WebElement getButtonNextPage() {
        return waitUntilElementToBeClickableByXpath(BUTTON_NEXT);
    }

    public WebElement getLookMSportElement() {
        return waitUntilElementToBeVisibleByXpath(LOOK_MSPORT);
    }

    public WebElement getColorAlpineWhiteElement() {
        return waitUntilElementToBeVisibleByXpath(COLOR_ALPINE_WHITE);
    }

    public WebElement getColorAventurinRedMetallicElement() {
        return waitUntilElementToBeVisibleByXpath(COLOR_AVENTURIN_RED_METALLIC);
    }

    public WebElement getWheels18DoubleSpokeBurnishedOrbitGreyElement() {
        return waitUntilElementToBeVisibleByXpath(WHEELS_18_DOUBLE_SPOKE_BURNISHED_ORBIT_GREY);
    }

    public WebElement getWheels20MYSpokeBiColorJetBlackElement() {
        return waitUntilElementToBeVisibleByXpath(WHEELS_20_M_Y_SPOKE_BI_COLOR_JET_BLACK);
    }

    public WebElement getButtonSelectExecutivePackage() {
        return waitUntilElementToBeVisibleByXpath(BUTTON_SELECT_EXECUTIVE_PACKAGE);
    }

    public WebElement getExecutivePackageAllFeaturesElement() {
        return waitUntilElementToBeVisibleByXpath(BUTTON_SELECT_EXECUTIVE_PACKAGE_FEATURES);
    }

    public WebElement getButtonAddToBuild() {
        return waitUntilElementToBeVisibleByXpath(BUTTON_ADD_TO_BUILD);
    }

    public WebElement getButtonBackToBuild() {
        return waitUntilElementToBeVisibleByXpath(BUTTON_BACK_TO_BUILD);
    }

    public WebElement getButtonDrivingAssistanceProfessionalPackageInfo() {
        return waitUntilElementToBeVisibleByXpath(OPTION_DRIVING_ASSISTANCE_PROFESSIONAL_PACKAGE);
    }

    public WebElement getButtonDrivingAssistanceProfessionalPackagePrice() {
        return waitUntilElementToBeVisibleByXpath(OPTION_DRIVING_ASSISTANCE_PROFESSIONAL_PACKAGE_PRICE);
    }

    private WebElement getEstimatedPriceElement() {
        return waitUntilElementToBeVisibleByXpath(ESTIMATED_PRICE);
    }

    public ConfiguratorPage clickConfirmChangesButton() {
        getButtonConfirmChanges().click();
        return this;
    }

    public ConfiguratorPage clickButtonNextPage() {
        try {
            getButtonNextPage().click();
            return this;
        } catch (Exception e) {
            clickConfirmChangesButton();
        }
        getButtonNextPage().click();
        return this;
    }

    public ConfiguratorPage regularClickButtonNextPage() {
        getButtonNextPage().click();
        return this;
    }

    public int getCurrentPrice() {
        return parseInt(replacePrice(getCurrentPriceElement()));
    }

    public int getSelectionPriceChange() {
        return parseInt(replacePrice(getSelectionPriceChangeElement()));
    }

    public int getLookMSportPrice() {
        return parseInt(replacePrice(getLookMSportElement()));
    }

    public int getColorAventurinRedMetallicPrice() {
        return parseInt(replacePrice(getColorAventurinRedMetallicElement()));
    }

    public int getWheels20MYSpokeBiColorJetBlackPrice() {
        return parseInt(replacePrice(getWheels20MYSpokeBiColorJetBlackElement()));
    }

    public int getDrivingAssistanceProfessionalPackagePrice() {
        return parseInt(replacePrice(getButtonDrivingAssistanceProfessionalPackagePrice()));
    }

    public int setLookMSport() {
        getLookMSportElement().click();
        return getLookMSportPrice();
    }

    public int setColorAventurinRedMetallic() {
        int priceTag;

        moveCursor(getColorAlpineWhiteElement(), driver);
        scrollToElement(getColorAventurinRedMetallicElement(), driver);
        priceTag = getColorAventurinRedMetallicPrice();
        jsClick(getColorAventurinRedMetallicElement(), driver);
        return priceTag;
    }

    public int setWheels20MYSpokeBiColorJetBlack() {
        int priceTag;

        moveCursor(getWheels18DoubleSpokeBurnishedOrbitGreyElement(), driver);
        scrollToElement(getWheels20MYSpokeBiColorJetBlackElement(), driver);
        priceTag = getWheels20MYSpokeBiColorJetBlackPrice();
        jsClick(getWheels20MYSpokeBiColorJetBlackElement(), driver);
        return priceTag;
    }

    public int setExecutivePackage() {
        int priceTag;

        scrollToElement(getExecutivePackageAllFeaturesElement(), driver);
        getButtonSelectExecutivePackage().click();
        getButtonAddToBuild().click();
        priceTag = getSelectionPriceChange();
        getButtonConfirmChanges().click();
        return priceTag;
    }

    public int setDrivingAssistanceProfessionalPackage() {
        getButtonDrivingAssistanceProfessionalPackageInfo().click();
        getButtonAddToBuild().click();
        getButtonBackToBuild().click();
        return getDrivingAssistanceProfessionalPackagePrice();
    }

    public int getEstimatedPrice() {
        return parseInt(replacePrice(getEstimatedPriceElement()));
    }
}
