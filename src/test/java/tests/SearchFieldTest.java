package tests;

import base.AbstractBaseTest;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SearchResultPage;

import static elements.HomePageElements.BMW_URL;
import static org.testng.AssertJUnit.assertTrue;


public class SearchFieldTest extends AbstractBaseTest {
    public String infoForSearch = "electric";

    @Test
    public void checkSearchField() {
        openPage(BMW_URL);
        HomePage homePage = new HomePage(driver);
        SearchResultPage searchResultPage = new SearchResultPage(driver);
        homePage
                .closePopup()
                .clickSearchBtn()
                .enterSearchInfo(infoForSearch);

        searchResultPage.getDetailsFromResearch(infoForSearch);

        assertTrue(searchResultPage.getDetailsFromResearch(infoForSearch) >= 1);
    }
}
