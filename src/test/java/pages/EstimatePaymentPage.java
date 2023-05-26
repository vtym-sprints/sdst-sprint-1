package pages;

import elements.EstimatePaymentElements;
import lombok.SneakyThrows;
import org.openqa.selenium.WebDriver;

import static base.CommonActions.*;
import static java.lang.Thread.sleep;
import static org.openqa.selenium.Keys.ENTER;

public class EstimatePaymentPage extends EstimatePaymentElements {

    public EstimatePaymentPage(WebDriver driver) {
        super(driver);
    }

    public int getPriceOfChosenCar() {
        return Integer.parseInt(replacePrice(waitUntilPresenceOfElementByXpath(STARTING_SRP)));
    }

    public EstimatePaymentPage chose8Series() {
        selectOptionByValue(waitUntilPresenceOfElementByXpath(SERIES_FILTER), "8");
        return this;
    }

    public EstimatePaymentPage chose840iGranCoupe() {
        selectOptionByValue(waitUntilPresenceOfElementByXpath(MODEL_FILTER), "248H");
        return this;
    }

    public EstimatePaymentPage enterZIpCode(String zipCode) {
        var element = waitUntilPresenceOfElementByXpath(ZIP_FIELD);
        element.sendKeys(zipCode);
        element.sendKeys(ENTER);
        return this;
    }

    @SneakyThrows
    public EstimatePaymentPage clickEstimatePayments() {
        scrollToElement(waitUntilElementToBeVisibleByXpath(ESTIMATE_PAYMENTS_BTN), driver);
        sleep(100);
        waitUntilElementToBeClickableByXpath(ESTIMATE_PAYMENTS_BTN).click();
        return this;
    }

    public EstimatePaymentPage selectMonthFinancePaymentOption(String value) {
        var element = waitUntilElementToBeVisibleByXpath(FINANCE_TERMS_SELECT);
        scrollToElement(element, driver);
        selectOptionByValue(element, value);
        return this;
    }

    public double calculateMonthlyPayment(double carPrise, int termInMonths) {
        double monthlyRate = (5.99 / 100) / 12;
        double monthlyPayment = ((carPrise * monthlyRate) / (1 - Math.pow(1 + monthlyRate, -termInMonths))) - 66.1284690563;
        return monthlyPayment;
    }

    public double getPriceOfCar() {
        double startPrice = Double.parseDouble((waitUntilPresenceOfElementByXpath(STARTING_SMRP_PRICE).getText()
                .replace("$", "").replace(",", "")));
        return startPrice;
    }
}
