package tests;

import base.AbstractBaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.ItemCardPage;
import pages.NewInventoryPage;
import pages.ZipCodePage;

public class ItemCardTest extends AbstractBaseTest {
    private final String ZIP_CODE = "90001";

    @Test
    public void checkCorrectnessOfCardInfo() {
        HomePage homePage = new HomePage(driver);
        ZipCodePage zipCodePage = new ZipCodePage(driver);
        NewInventoryPage newInventoryPage = new NewInventoryPage(driver);
        ItemCardPage itemCardPage = new ItemCardPage(driver);

        homePage
                .dismissPopup()
                .clickShoppingButton()
                .setZipCode(ZIP_CODE)
                .clickShopNewButtonInShoppingTab();

        zipCodePage.chooseZipCodeWithNoDealerPick(ZIP_CODE);

        String itemSeriesInList = newInventoryPage.getCardsSeriesList().get(0);
        String itemModelInList = newInventoryPage.getCardsModelsList().get(0);
        Integer itemPriceInList = newInventoryPage.getCardsPricesList().get(0);

        newInventoryPage.openFirstItemCardPage();

        String itemSeries = itemCardPage.getItemSeries();
        String itemModel = itemCardPage.getItemModel();
        Integer itemPrice = itemCardPage.getItemPrice();

        Assert.assertEquals(itemSeries, itemSeriesInList);
        Assert.assertEquals(itemModel, itemModelInList);
        Assert.assertEquals(itemPrice, itemPriceInList);
    }
}
