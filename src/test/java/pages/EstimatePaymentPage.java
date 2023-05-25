package pages;

import elements.EstimatePaymentElements;
import org.openqa.selenium.WebDriver;

import static base.CommonActions.*;
import static java.lang.Thread.sleep;

public class EstimatePaymentPage extends EstimatePaymentElements {

    public EstimatePaymentPage(WebDriver driver) {
        super(driver);
    }

    public int getPriceOfChosenCar(){
        return Integer.parseInt(replacePrice(waitUntilPresenceOfElementByXpath(STARTING_SRP)));
    }

    public EstimatePaymentPage chose8Series(){
        selectOptionByValue(waitUntilPresenceOfElementByXpath(SERIES_FILTER),"8");
        return this;
    }

    public EstimatePaymentPage chose840iGranCoupe(){
        selectOptionByValue(waitUntilPresenceOfElementByXpath(MODEL_FILTER),"248H");
        return this;
    }

    public EstimatePaymentPage enterZIpCode(String zipCode){
        waitUntilPresenceOfElementByXpath(ZIP_FIELD).sendKeys(zipCode);
        return this;
    }

    public EstimatePaymentPage clickEstimatePayments() throws InterruptedException {
        scrollToElement(waitUntilElementToBeVisibleByXpath("//h3[contains(text(),'Adjustments')]"),driver);
        sleep(4000);
        jsClick(waitUntilElementToBeClickableByXpath(ESTIMATE_PAYMENTS_BTN),driver);
        return this;
    }

    public EstimatePaymentPage scroll42FinanceTerms(){
        scrollToTop(driver);
        //scrollToElement(waitUntilPresenceOfElementByXpath(FINANCE_TERMS_SELECT),driver);
        //scrollToElement(waitUntilPresenceOfElementByXpath("//h2[contains(text(), 'Payment')]"),driver);
        selectOptionByValue(waitUntilPresenceOfElementByXpath(FINANCE_TERMS_SELECT),"42");
        return this;
    }
    public EstimatePaymentPage chose42FinanceTerms(){
        selectOptionByValue(waitUntilPresenceOfElementByXpath(FINANCE_TERMS_SELECT),"42");
        return this;
    }


    public EstimatePaymentPage chose30LeaseTerms(){
        selectOptionByValue(waitUntilPresenceOfElementByXpath(FINANCE_TERMS_SELECT),"30");
        return this;
    }

    public EstimatePaymentPage choseAnnualMileage(){
        waitUntilElementToBeClickableByXpath(ANNUAL_MILEAGE).click();
        return this;
    }

    public static double calculateMonthlyPayment(double loanAmount, double annualRate, int termInMonths) {
        // переводим проценты в десятичную форму и делим на 12 месяцев
        double monthlyRate = (annualRate / 100) / 12;
        // вычисляем ежемесячный платеж
        double monthlyPayment = (loanAmount * monthlyRate) / (1 - Math.pow(1 + monthlyRate, -termInMonths));
        return monthlyPayment;
    }
}
