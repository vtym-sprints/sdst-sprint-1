package pages;

import elements.SearchResultElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static base.CommonActions.scrollToElement;
import static org.openqa.selenium.By.xpath;
import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfAllElementsLocatedBy;
import static org.openqa.selenium.support.ui.ExpectedConditions.refreshed;

public class SearchResultPage extends SearchResultElements {
    public SearchResultPage(WebDriver driver) {
        super(driver);
    }

    public int getDetailsFromResearch(String infoForSearch) {
        int count = 0;
        while (count < getProductPriceElementsCount(DETAIL_INFO)) {
            WebElement element = wait.until(refreshed(presenceOfAllElementsLocatedBy(xpath(DETAIL_INFO)))).get(count);
            scrollToElement(element, driver);
            String detailText = element.getText().toLowerCase();
            if (detailText.contains(infoForSearch)) {
                count++;
            }
        }
        return count;
    }

    private int getProductPriceElementsCount(String locator) {
        return waitUntilPresenceOfAllElementsByXpath(locator).size();
    }
}
