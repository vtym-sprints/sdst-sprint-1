package tests;

import base.AbstractBaseTest;
import lombok.SneakyThrows;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SearchResultPage;

import static elements.HomeElements.BMW_URL;
import static org.assertj.core.api.Assertions.assertThat;


public class SearchFieldTest extends AbstractBaseTest {
    public String infoForSearch = "electric";

    @Test
    @SneakyThrows
    public void checkSearchField() {
        openPage(BMW_URL);
        HomePage homePage = new HomePage(driver);
        SearchResultPage searchResultPage = new SearchResultPage(driver);

        homePage
                .dismissPopup()
                .clickSearchBtn()
                .enterSearchInfo(infoForSearch);

        var matchingElementCount = searchResultPage.getDetailsFromResearch(infoForSearch);

        assertThat(matchingElementCount)
                .as("добавить сообщение!!!")
                .isGreaterThanOrEqualTo(1);
    }
}
