package pages;

import elements.BuildYourOwnElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.NoSuchElementException;

import static base.CommonActions.*;

public class BuildYourOwnPage extends BuildYourOwnElements {

    public BuildYourOwnPage(WebDriver driver) {
        super(driver);
    }

        public BuildYourOwnPage choseX7 () {
            waitUntilElementToBeClickableByXpath(X7_MODEL_BTN).click();
            return this;
        }

        public BuildYourOwnPage clickSelectX7 () {
            waitUntilElementToBeClickableByXpath(SELECT_X7MODEL_BTN).click();
            return this;
        }

        public BuildYourOwnPage clickDesignX7 () {
            scrollToElement(waitUntilPresenceOfElementByXpath(DESIGN_X7), driver);
            jsClick(waitUntilElementToBeClickableByXpath(DESIGN_X7), driver);
            return this;
        }

        public int getTotalPriceX7 () {
            return Integer.parseInt(replacePrice(waitUntilPresenceOfElementByXpath(TOTAL_PRICE_X7)));
        }

        public int getPriceOfChoseOption (String car){
            return Integer.parseInt(replacePrice(waitUntilPresenceOfElementByXpath(car)));
        }

        public BuildYourOwnPage choseLook () {
            scrollToElement(waitUntilPresenceOfElementByXpath(M_SPORT_LOOK), driver);
            waitUntilElementToBeClickableByXpath(M_SPORT_LOOK).click();
            optionPrices.add(getPriceOfChoseOption(PRICE_M_SPORT));
            waitUntilElementToBeClickableByXpath(FIND_A_DEALER_CLOSE_BTN).click();
            return this;
        }

        public BuildYourOwnPage clickNext () {
            waitUntilElementToBeClickableByXpath(NEXT_BTN).click();
            return this;
        }

        public BuildYourOwnPage choseColor () {
            scrollToElement(waitUntilPresenceOfElementByXpath(TANZANITE_BLUE_II_METALIC_COLOR), driver);
            waitUntilElementToBeClickableByXpath(TANZANITE_BLUE_II_METALIC_COLOR).click();
            optionPrices.add(getPriceOfChoseOption(PRICE_OF_COLOR));
            return this;
        }

        public BuildYourOwnPage choseWheels () {
            scrollToElement(waitUntilElementToBeVisibleByXpath(WHEEL_STYLE_DOUBLE_SPOKE), driver);
            waitUntilElementToBeClickableByXpath(WHEEL_STYLE_DOUBLE_SPOKE).click();
            optionPrices.add(getPriceOfChoseOption(PRICE_OF_WHEELS));
            return this;
        }

        public BuildYourOwnPage closeImportantInfoWindow () {
            try {
                waitUntilElementToBeClickableByXpath(IMPORTANT_INFO_CLOSE_BTN).click();
            } catch (Exception e) {
                if (isElementPresent(FIND_A_DEALER_CLOSE_BTN)) {
                    waitUntilElementToBeClickableByXpath(FIND_A_DEALER_CLOSE_BTN).click();
                }
                if (isElementPresent(CONFIRM_COLOR_CHANGES)) {
                    waitUntilElementToBeClickableByXpath(CONFIRM_COLOR_CHANGES).click();
                }
            }
            return this;
        }

        public BuildYourOwnPage choseUpholstery () {
            scrollToElement(waitUntilPresenceOfElementByXpath(BLACK_UPHOLSTERY), driver);
            waitUntilElementToBeClickableByXpath(BLACK_UPHOLSTERY).click();
            optionPrices.add(getPriceOfChoseOption(PRICE_OF_BLACK_UPHOLSTERY));
            return this;
        }

        public BuildYourOwnPage choseTrim () {
            scrollToElement(waitUntilPresenceOfElementByXpath(TRIM_INDIVIDUAL_PIANO_BLACK_FINISH), driver);
            waitUntilElementToBeVisibleByXpath(TRIM_INDIVIDUAL_PIANO_BLACK_FINISH).click();
            optionPrices.add(getPriceOfChoseOption(PRICE_OF_PIANO_TRIM));
            return this;
        }

        public BuildYourOwnPage choseExecutive () {
            waitUntilElementToBeVisibleByXpath(SELECT_SEE_ALL_8_FEATURES);
            scrollToElement(waitUntilPresenceOfElementByXpath(SELECT_SEE_ALL_8_FEATURES), driver);
            jsClick(waitUntilPresenceOfElementByXpath(SELECT_SEE_ALL_8_FEATURES), driver);
            return this;
        }

        public BuildYourOwnPage choseSoundSystem () {
            scrollToElement(waitUntilElementToBeVisibleByXpath(SOUND_SYSTEM), driver);
            waitUntilElementToBeClickableByXpath(SOUND_SYSTEM).click();
            optionPrices.add(getPriceOfChoseOption(PRICE_OF_SOUND_SYSTEM));
            return this;
        }

        public BuildYourOwnPage clickAddToBuild () {
            waitUntilElementToBeClickableByXpath(ADD_TO_BUILD).click();
            return this;
        }

        public BuildYourOwnPage confirmChanges () {
            waitUntilElementToBeClickableByXpath(CONFIRM_CHANGES).click();
            return this;
        }

        public BuildYourOwnPage clickNextAccessories () {
            waitUntilElementToBeClickableByXpath(NEXT_ACCESSORIES).click();
            return this;
        }

        public WebElement getNextSummaryButton () {
            return waitUntilElementToBeClickableByXpath(NEXT_SUMMERY);
        }

        public BuildYourOwnPage clickNextSummaryButton () {
            getNextSummaryButton().click();
            return this;
        }

        public List<Integer> getOptionPrices () {
            return optionPrices;
        }

        public BuildYourOwnPage selectx6MSportsActivityCoupeBtn () {
            waitUntilElementToBeClickableByXpath(X6_M_SPORTS_ACTIVITY_COUPE_SELECT).click();
            return this;
        }

        public BuildYourOwnPage customizeThisBuildBtn () {
            waitUntilElementToBeClickableByXpath(CUSTOMIZE_YOUR_BUILD).click();
            return this;
        }

        public BuildYourOwnPage selectColorTanzanite () {
            waitUntilElementToBeClickableByXpath(COLOR_BLACK_METAL).click();
            return this;
        }

        public BuildYourOwnPage pressNextWheelsBtn () {
            waitUntilElementToBeClickableByXpath(NEXT_WHEELS_BTN).click();
            return this;
        }

        public BuildYourOwnPage selectWheels21Inches () {
            waitUntilElementToBeClickableByXpath(WHEELS_21_INCHES).click();
            return this;
        }

        public BuildYourOwnPage pressNextUpholstery () {
            waitUntilElementToBeClickableByXpath(NEXT_UPHOLSTERY_BTN).click();
            return this;
        }

        public BuildYourOwnPage selectLeatherColorCognac () {
            waitUntilElementToBeClickableByXpath(LEATHER_COLOR_COGNAC).click();
            return this;
        }

        public BuildYourOwnPage selectX4BlackAlcantara () {
            waitUntilElementToBeClickableByXpath(X4_BLACK_ALCANTARA).click();
            return this;
        }

        public BuildYourOwnPage selectX4SmokeGrey () {
            waitUntilElementToBeClickableByXpath(X4_SMOKE_GREY).click();
            return this;
        }

        public BuildYourOwnPage pressNextTrimBtn () {
            waitUntilElementToBeClickableByXpath(NEXT_TRIM_BTN).click();
            return this;
        }

        public BuildYourOwnPage selectTrimGlossWood () {
            waitUntilElementToBeClickableByXpath(TRIM_GLOSS_WOOD).click();
            return this;
        }

        public BuildYourOwnPage pressNextOptionsBtn () {
            waitUntilElementToBeClickableByXpath(NEXT_OPTIONS_BTN).click();
            return this;
        }

        public BuildYourOwnPage pressNextSummaryBtn () {
            waitUntilElementToBeClickableByXpath(NEXT_SUMMARY_BTN).click();
            return this;
        }

        public String getTotalPrice () {
            return waitUntilElementToBeClickableByXpath(TOTAL_PRICE).getText();
        }

        public BuildYourOwnPage closeModalWindow () {
            waitUntilElementToBeVisibleByXpath(MODAL_WINDOW_CLOSE_BTN).click();
            return this;
        }

        public BuildYourOwnPage selectX5MSports () {
            waitUntilElementToBeClickableByXpath(X5_M_SPORTS_SELECT).click();
            return this;
        }

        public BuildYourOwnPage selectX5MCompetition () {
            waitUntilElementToBeClickableByXpath(X5_M_COMPETITION).click();
            return this;
        }

        public String getName () {
            return waitUntilElementToBeClickableByXpath(CHECK_NAME).getText();
        }

        public String getPrice () {
            return waitUntilElementToBeClickableByXpath(CHECK_PRICE).getText();
        }

        public BuildYourOwnPage selectX4MSports () {
            waitUntilElementToBeClickableByXpath(X4_M_SPORTS_SELECT).click();
            return this;
        }

        public BuildYourOwnPage closeModalZip () {
            waitUntilElementToBeClickableByXpath(MODAL_ZIP_CLOSE).click();
            return this;
        }

        public BuildYourOwnPage clickX4MPerformance () {
            waitUntilElementToBeClickableByXpath(X4M_PERFORMANCE_BTN).click();
            return this;
        }

        public BuildYourOwnPage selectX4M () {
            waitUntilElementToBeVisibleByXpath(X4_M_SELECT).click();
            return this;
        }

        public BuildYourOwnPage pressNextColor () {
            waitUntilElementToBeClickableByXpath(NEXT_COLOR_BTN).click();
            return this;
        }

        public BuildYourOwnPage selectX4AlpineWhiteColor () {
            waitUntilElementToBeClickableByXpath(X4_ALPINE_WHITE_COLOR).click();
            return this;
        }

    public BuildYourOwnPage pressNextAccessories() {
        waitUntilElementToBeClickableByXpath(NEXT_ACCESSORIES).click();
        return this;
    }

        public BuildYourOwnPage choosingXM () {
            waitUntilElementToBeClickableByXpath(XM_CHOOSING).click();
            return this;
        }

        public BuildYourOwnPage pressXMBuildOwn () {
            waitUntilElementToBeClickableByXpath(XM_BUILD_OWN).click();
            return this;
        }

        public BuildYourOwnPage selectXMWhiteColor () {
            waitUntilElementToBeClickableByXpath(XM_WHITE_COLOR).click();
            return this;
        }

        public BuildYourOwnPage selectXMOrangeLeather () {
            waitUntilElementToBeClickableByXpath(XM_ORANGE_LEATHER).click();
            return this;
        }

        public BuildYourOwnPage selectXMBuild () {
            waitUntilElementToBeClickableByXpath(XM_SELECT_BUILD).click();
            return this;
        }

        public BuildYourOwnPage selectx4MSports () {
            waitUntilElementToBeClickableByXpath(X4_M_SELECT).click();
            return this;
        }

        public BuildYourOwnPage selectX4Coupe () {
            waitUntilElementToBeClickableByXpath(X4_MSPORT_SELECT).click();
            return this;
        }

    private boolean isElementPresent(String xpath) {
        try {
            driver.findElement(By.xpath(xpath));
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }
}