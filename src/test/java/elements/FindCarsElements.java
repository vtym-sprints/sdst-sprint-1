package elements;

import base.AbstractBasePage;
import org.openqa.selenium.WebDriver;

public class FindCarsElements extends AbstractBasePage {
    public FindCarsElements(WebDriver driver) {super(driver);}

    protected final static String INPUT_ZIP_CODE = "//input[@tab-index='1']";
    protected final static String INPUT_ZIP_CODE_NEW_PAGE = "//input[@id='zipentry-input']";
    protected final static String SHOP_NOW = "//button[contains(text(),'Shop Now')]";
    protected final static String SHOP_NEW_BUTTON = "//button[@tab-index='2']";
    protected final static String SELECT_BUTTON = "//button[@analytics-event='select-dealer-1']";
    protected final static String SERIES_BUTTON = "//button[@aria-controls='series']";
    protected final static String SERIES_5_BUTTON = "//*[@id='series']/div/div[2]/label[4]";  ////label//input[@id='5 Series']
    protected final static String SCROLL_TO_EXTERIER = "//button[@aria-controls='exterior']";
    protected final static String EXTERIER_BUTTON = "//button[@value='expand Exterior Color']"; //i[@aria-controls='exterior']";
    protected final static String BLACK_COLOR_BUTTON = "//div[@class='_base-checkbox_coloricon_37d5O _base-checkbox_Black_3yY2W']";
    protected final static String OPTIONS_BUTTON = "//button[@aria-controls='options']";
    protected final static String M_SPORT_BUTTON = "//span[contains(text(),'M Sport')][1]";
    protected final static String BUILD_MY_DEAL_BUTTON = "//a[@href='/inventory/#/detail/WBA53BJ08PWY20306?pricing=true']";
    protected final static String CONTINUE_BUTTON = "//button[@data-cy='sticky-cta']";
    protected final static String SEND_ESTIMATE_BUTTON = "//button[@data-cy='sticky-cta']";
    protected final static String TEXT_BMW_SEDAN = "//div[@class='headline-5 model']";

}
