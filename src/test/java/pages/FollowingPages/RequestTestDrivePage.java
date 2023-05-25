package pages.FollowingPages;

import elements.RequestTestDriveElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static base.CommonActions.scrollToElement;

public class RequestTestDrivePage extends RequestTestDriveElements {
    public RequestTestDrivePage(WebDriver driver) {
        super(driver);
    }

    public RequestTestDrivePage clickRequestTestDriveButton() {
        waitUntilElementToBeClickableByXpath(REQUEST_TEST_DRIVE_BUTTON).click();
        return this;
    }

    public RequestTestDrivePage clickX5Button() {
        waitUntilElementToBeClickableByXpath(X5_BUTTON).click();
        return this;
    }

    public RequestTestDrivePage inputZipCodeDealer() {
        waitUntilElementToBeVisibleByXpath((INPUT_ZIP_CODE)).sendKeys("90001");
        return this;
    }

    public RequestTestDrivePage clickSelectButton() {
        waitUntilElementToBeClickableByXpath(SELECT_BUTTON).click();
        return this;
    }

    public RequestTestDrivePage inputFirstNameDealer(String name) {
        waitUntilElementToBeVisibleByXpath((INPUT_FIRST_NAME)).sendKeys(name);
        return this;
    }

    public WebElement getInputNameDealer() {
        return waitUntilElementToBeVisibleByXpath(INPUT_FIRST_NAME);
    }

    public RequestTestDrivePage inputLastNameDealer(String lastname) {
        waitUntilElementToBeVisibleByXpath((INPUT_LAST_NAME)).sendKeys(lastname);
        return this;
    }
    public WebElement getInputLastNameDealer() {
        return waitUntilPresenceOfElementByXpath(INPUT_LAST_NAME);
    }

    public RequestTestDrivePage scrollToPhone() {
        scrollToElement(waitUntilElementToBeVisibleByXpath(SCROLL_TO_PHONE), driver);
        return this;
    }

    public RequestTestDrivePage inputEmailDealer(String email) {
        waitUntilElementToBeVisibleByXpath((INPUT_EMAIL)).sendKeys(email);
        return this;
    }

    public WebElement getInputEmailDealer() {
        return waitUntilElementToBeVisibleByXpath(INPUT_EMAIL);
    }

    public RequestTestDrivePage inputPhoneNumberDealer(String phone) {
        waitUntilElementToBeVisibleByXpath((INPUT_PHONE_NUMBER)).sendKeys(phone);
        return this;
    }
    public WebElement getInputPhoneNumberDealer() {
        return waitUntilElementToBeVisibleByXpath(INPUT_PHONE_NUMBER);
    }


    public RequestTestDrivePage clickToLeadDisclaimer() {
        waitUntilElementToBeVisibleByXpath(LEAD_DISCLAIMER_BUTTON).click();
        return this;
    }

    public RequestTestDrivePage clickToLeadDisclaimertcpa() {
        waitUntilElementToBeVisibleByXpath(LEAD_DISCLAIMER_TCPA_BUTTON).click();
        return this;
    }

    public RequestTestDrivePage scrollToComments() {
        scrollToElement(waitUntilElementToBeVisibleByXpath(SCROLL_TO_COMMENTS), driver);
        return this;
    }

    public RequestTestDrivePage inputComments(String comments) {
        waitUntilElementToBeVisibleByXpath((INPUT_COMMENTS)).sendKeys(comments);
        return this;
    }
    public WebElement getInputComments() {
        return waitUntilElementToBeVisibleByXpath(INPUT_COMMENTS);
    }
    public WebElement getTextSubmit(){
         return waitUntilElementToBeVisibleByXpath(TEXT_SUBMIT);

    }
}
