package tests;

import base.AbstractBaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.VisualizeAccessoriesPage;

import java.util.Set;

import static org.testng.Assert.assertTrue;
import static org.testng.AssertJUnit.assertEquals;

public class TestVisualizeAccessories extends AbstractBaseTest {

    @Test
    public void test() {
        HomePage homePage = new HomePage(driver);
        VisualizeAccessoriesPage visualizeAccessoriesPage = new VisualizeAccessoriesPage(driver);

        visualizeAccessoriesPage
                .clickShoppingButton();

        homePage
                .dismissPopup();

        visualizeAccessoriesPage
                .clickShopBMWPartsButton();

        Set<String> windowHandles = driver.getWindowHandles();
        String currentWindowHandle = driver.getWindowHandle();
        for (String windowHandle : windowHandles) {
            if (!windowHandle.equals(currentWindowHandle)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }

        Assert.assertEquals(driver.getCurrentUrl(), "https://www.shopbmwusa.com/");
        assertTrue(visualizeAccessoriesPage.springIntoGearText().isDisplayed());

        visualizeAccessoriesPage
                .clickShopNowButton()
                .click2007Button()
                .click3Button()
                .click328iCoupeButton()
                .scrollToCategories()
                .clickCategoriesButton()
                .clickBmwWheelButton()
                .inputTextState()
                .clickLookUpButton()
                .clickSetMyDealerButton();

        assertEquals(driver.getCurrentUrl(), "https://www.shopbmwusa.com/product/3600/BMW-M-PERFORMANCE-ELECTRONIC-STEERING-WHEEL-FOR-SPORT-LINE-EQUIPPED-VEHICLES");
        assertTrue(visualizeAccessoriesPage.textBmwMWheel().isDisplayed());

        visualizeAccessoriesPage
                .scrollToSelectDealer()
                .clickChooseOptionsButton()
                .scrollToAddCartButton()
                .clickAddToCartButton();

        assertTrue(visualizeAccessoriesPage.getTextBmwWheel().isDisplayed());

    }
}
