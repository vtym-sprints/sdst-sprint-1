package tests;

import base.AbstractBaseTest;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.ShoppingPage;

import java.util.ArrayList;
import java.util.List;

import static elements.HomePageElements.*;
import static org.testng.Assert.*;

public class CheckingFilterInTheShopping extends AbstractBaseTest {
    private static final String ZIP_CODE = "11222";

    @Test
    public void checkingFilterInTheShopping() {
        ShoppingPage shoppingPage = new ShoppingPage(driver);
        List<Integer> numbers = new ArrayList<>();
        int min = 50000;
        int max = 79999;

        new HomePage(driver)
                .clickButton(BTN_SHOPPING_ON_HEADER)
                .clickButton(FIELD_INPUT_ZIP_CODE_IN_SHOPPING)
                .sendKeysInFieldDealerNameOrZipCode(ZIP_CODE)
                .sendKeysZipCode(ZIP_CODE)
                .selectDealerByNumber("1")
                .closeRightPopUp();

        shoppingPage
                .clickFieldInFilter("Body Style")
                .clickOnFieldInBodyStyle("Sports Activity Vehicle")
                .clickFieldInFilter("Body Style")
                .clickFieldInFilter("Price")
                .clickBoxMinOrMaxPrice("1")
                .clickPriceInMinAndMax("50,000")
                .clickBoxMinOrMaxPrice("2")
                .clickPriceInMinAndMax("79,999")
                .clickFieldInFilter("Price")
                .clickFieldInFilter("Model Year")
                .clickBoxMinOrMaxPrice("1")
                .clickPriceInMinAndMax("2023")
                .clickBoxMinOrMaxPrice("2")
                .clickPriceInMinAndMax("2024");

        for (WebElement element : shoppingPage.allPriceOnShoppingPage()) {
            String text = element.getText().replaceAll("[\\$,]", "");
            int number = Integer.parseInt(text);
            numbers.add(number);
        }

        for (int number : numbers) {
            assertTrue(min <= number && number <= max);
        }

        assertTrue(shoppingPage.getListNameParameterProducts().stream()
                .allMatch(el -> el.getText().contains("X3") || el.getText().contains("X5")));
        assertTrue(shoppingPage.getListProductYears().stream()
                .allMatch(el -> el.getText().contains("2023") || el.getText().contains("2024")));
    }
}
