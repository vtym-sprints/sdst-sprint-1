package tests;

import base.AbstractBaseTest;
import lombok.SneakyThrows;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SearchResultPage;

import static org.assertj.core.api.Assertions.assertThat;

public class SearchFieldTest extends AbstractBaseTest {

    private static final String INFO_FOR_Search = "electric";

    @Test
    @SneakyThrows
    public void checkSearchField() {
        HomePage homePage = new HomePage(driver);
        SearchResultPage searchResultPage = new SearchResultPage(driver);

        homePage
                .dismissPopup()
                .clickSearchBtn()
                .enterSearchInfo(INFO_FOR_Search);

        var matchingElementCount = searchResultPage.getDetailsFromResearch(INFO_FOR_Search);

        assertThat(matchingElementCount)
                .as("Search doesn't work correct")
                .isGreaterThanOrEqualTo(1);
    }
}
