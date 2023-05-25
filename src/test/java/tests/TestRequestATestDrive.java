package tests;

import base.AbstractBaseTest;
import org.checkerframework.checker.units.qual.C;
import org.testng.annotations.Test;
import pages.FollowingPages.RequestTestDrivePage;
import pages.HomePage;
import pages.VisualizeAccessoriesPage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


public class TestRequestATestDrive extends AbstractBaseTest {
    private final String NAME = "QA";
    private final String LASTNAME = "Engenier";
    private final String EMAIL = "email.qa@mail.com";
    private final String PHONE = "(408) 944-9500";
    private final String COMMENTS = "Test QA";

    @Test
    public void testRequestATestDrive() {
        RequestTestDrivePage requestTestDrivePage = new RequestTestDrivePage(driver);
        VisualizeAccessoriesPage visualizeAccessoriesPage = new VisualizeAccessoriesPage(driver);
        HomePage homePage = new HomePage(driver);

        visualizeAccessoriesPage.clickShoppingButton();

        homePage.dismissPopup();
        requestTestDrivePage
                .clickRequestTestDriveButton()
                .clickX5Button()
                .inputZipCodeDealer()
                .clickSelectButton()
                .inputFirstNameDealer(NAME);

        assertEquals(requestTestDrivePage.getInputNameDealer().getAttribute("value"), NAME);

        requestTestDrivePage
                .scrollToPhone()
                .inputLastNameDealer(LASTNAME);

        assertEquals(requestTestDrivePage.getInputLastNameDealer().getAttribute("value"), LASTNAME);

        requestTestDrivePage.inputEmailDealer(EMAIL);

        assertEquals(requestTestDrivePage.getInputEmailDealer().getAttribute("value"), EMAIL);

        requestTestDrivePage.inputPhoneNumberDealer(PHONE);

        assertEquals(requestTestDrivePage.getInputPhoneNumberDealer().getAttribute("value"), PHONE);

        requestTestDrivePage
                .clickToLeadDisclaimer()
                .clickToLeadDisclaimertcpa()
                .scrollToComments()
                .inputComments(COMMENTS);

        assertEquals(requestTestDrivePage.getInputComments().getAttribute("value"), COMMENTS);
        assertEquals(driver.getCurrentUrl(), "https://www.bmwusa.com/contact/testdrive.html");
        assertTrue(requestTestDrivePage.getTextSubmit().isDisplayed());
    }
}
