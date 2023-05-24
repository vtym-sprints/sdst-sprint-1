package pages;

import elements.BuildYourOwnElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

import static base.CommonActions.*;

public class BuildYourOwnPage extends BuildYourOwnElements {

    public BuildYourOwnPage(WebDriver driver) {
        super(driver);
    }

    public BuildYourOwnPage choseX7() {
        waitUntilElementToBeClickableByXpath(X7_MODEL_BTN).click();
        return this;
    }

    public BuildYourOwnPage clickSelectX7() {
        waitUntilElementToBeClickableByXpath(SELECT_X7MODEL_BTN).click();
        return this;
    }

    public BuildYourOwnPage clickDesignX7() {
        scrollToElement(waitUntilPresenceOfElementByXpath(DESIGN_X7), driver);
        jsClick(waitUntilElementToBeClickableByXpath(DESIGN_X7),driver);
        return this;
    }

    public int getPriceOfChoseOption(String car) {
        return Integer.parseInt(replacePrice(waitUntilPresenceOfElementByXpath(car)));
    }

    public BuildYourOwnPage choseLook() {
        scrollToElement(waitUntilPresenceOfElementByXpath(M_SPORT_LOOK), driver);
        waitUntilElementToBeClickableByXpath(M_SPORT_LOOK).click();
        optionPrices.add(getPriceOfChoseOption(PRICE_M_SPORT));
        return this;
    }

    public BuildYourOwnPage clickNext() {
        waitUntilElementToBeClickableByXpath(NEXT_BTN).click();
        return this;
    }

    public BuildYourOwnPage choseColor() {
        waitUntilElementToBeClickableByXpath(FIND_A_DEALER_CLOSE_BTN).click();
        waitUntilElementToBeClickableByXpath(CONFIRM_COLOR_CHANGES).click();
        scrollToElement(waitUntilPresenceOfElementByXpath(TANZANITE_BLUE_II_METALIC_COLOR), driver);
        waitUntilElementToBeClickableByXpath(TANZANITE_BLUE_II_METALIC_COLOR).click();
        optionPrices.add(getPriceOfChoseOption(PRICE_OF_COLOR));
        waitUntilPresenceOfElementByXpath(CHOSE_YOUR_EXTERIOR_PART).click();
        return this;
    }

    public BuildYourOwnPage choseWheels() {
        scrollToElement(waitUntilPresenceOfElementByXpath(WHEELS_OPTION), driver);
        waitUntilElementToBeClickableByXpath(WHEELS_OPTION).click();
        scrollToElement(waitUntilPresenceOfElementByXpath(WHEEL_STYLE_DOUBLE_SPOKE), driver);
        waitUntilElementToBeClickableByXpath(WHEEL_STYLE_DOUBLE_SPOKE).click();
        optionPrices.add(getPriceOfChoseOption(PRICE_OF_WHEELS));
        return this;
    }

    public BuildYourOwnPage closeImportantInfoWindow() {
        waitUntilElementToBeClickableByXpath(IMPORTANT_INFO_CLOSE_BTN).click();
        return this;
    }

    public BuildYourOwnPage choseUpholstery() {
        scrollToElement(waitUntilPresenceOfElementByXpath(BLACK_UPHOLSTERY), driver);
        waitUntilElementToBeClickableByXpath(BLACK_UPHOLSTERY).click();
        optionPrices.add(getPriceOfChoseOption(PRICE_OF_BLACK_UPHOLSTERY));
        return this;
    }

    public BuildYourOwnPage choseTrim() {
        scrollToElement(waitUntilPresenceOfElementByXpath(TRIM), driver);
        waitUntilElementToBeClickableByXpath(TRIM).click();
        scrollToElement(waitUntilPresenceOfElementByXpath(TRIM_INDIVIDUAL_PIANO_BLACK_FINISH), driver);
        waitUntilElementToBeClickableByXpath(TRIM_INDIVIDUAL_PIANO_BLACK_FINISH).click();
        optionPrices.add(getPriceOfChoseOption(PRICE_OF_PIANO_TRIM));
        return this;
    }

    public BuildYourOwnPage choseExecutive() {
        scrollToElement(waitUntilPresenceOfElementByXpath(SEE_ALL_8_FEATURES), driver);
        waitUntilElementToBeClickableByXpath(SEE_ALL_8_FEATURES).click();
        return this;
    }

    public BuildYourOwnPage choseSoundSystem() {
        scrollToElement(waitUntilPresenceOfElementByXpath(SOUND_SYSTEM), driver);
        waitUntilElementToBeClickableByXpath(SOUND_SYSTEM).click();
        optionPrices.add(getPriceOfChoseOption(PRICE_OF_SOUND_SYSTEM));
        return this;
    }

    public BuildYourOwnPage clickAddToBuild() {
        waitUntilElementToBeClickableByXpath(ADD_TO_BUILD).click();
        return this;
    }

    public BuildYourOwnPage confirmChanges() {
        optionPrices.add(getPriceOfChoseOption(PRICE_OF_CLIMATE_COMFORT));
        optionPrices.add(getPriceOfChoseOption(PRICE_EXECUTIVE_PACKAGE));
        waitUntilElementToBeClickableByXpath(CONFIRM_CHANGES).click();
        return this;
    }

    public BuildYourOwnPage clickNextAccessories() {
        waitUntilElementToBeClickableByXpath(NEXT_ACCESSORIES).click();
        return this;
    }

    public BuildYourOwnPage choseAccessoriesCarbonFiber() {
        scrollToElement(waitUntilPresenceOfElementByXpath(ADD_CURBON_FIBER), driver);
        waitUntilElementToBeClickableByXpath(ADD_CURBON_FIBER).click();
        optionPrices.add(getPriceOfChoseOption(CURBON_FIBER_PRICEC));
        return this;
    }

    public BuildYourOwnPage clickNextSummery() {
        waitUntilElementToBeClickableByXpath(NEXT_SUMMERY).click();
        return this;
    }

    public List<Integer> getPricesInSummery() {
        List<Integer> pricesInSummery = new ArrayList<>();
        List<WebElement> elementsPrices = new ArrayList<>();
        for (WebElement element : elementsPrices) {
            int price = getPriceOfChoseOption(PRICE_LIST);
            pricesInSummery.add(price);
        }
        return pricesInSummery;
    }

    public List<Integer> getOptionPrices() {
        return optionPrices;
    }
}
