package base;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.io.File;

import static java.lang.Thread.sleep;
import org.openqa.selenium.support.ui.Select;

public class CommonActions {

    public static void scrollToElement(WebElement element, WebDriver driver) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        var elementPosition = element.getLocation().getY();
        var jsCommand = "window.scroll(" + 0 + "," + (elementPosition - (driver.manage().window().getSize().getHeight() / 2)) + ");";
        js.executeScript(jsCommand);
    }

    public static void back(WebDriver driver) {
        driver.navigate().back();
    }

    public static void moveCursor(WebElement element, WebDriver driver) {
        Actions actions = new Actions(driver);
        actions.moveToElement(element).build().perform();
    }

    public static void jsClick(WebElement element, WebDriver driver) {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].click();", element);
    }

    public static String replacePrice(WebElement element) {
        return element.getText().replaceAll("[^\\-\\d]", "");
    }

    public static void selectOptionByValue(WebElement dropdown, String optionValue) {
        Select select = new Select(dropdown);
        select.selectByValue(optionValue);
    }

    public static void scrollToTop(WebDriver driver) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, 0);");
    }

    public static String readPdfContent(String fileName) throws Exception {
        PDDocument document = PDDocument.load(new File(fileName));
        PDFTextStripper pdfStripper = new PDFTextStripper();
        String text = pdfStripper.getText(document);
        sleep(2000);
        document.close();
        return text;
    }

    public static void deleteFile(String filePath) {
        File file = new File(filePath);
        if (file.delete()) {
            System.out.println("Deleted the file: " + file.getName());
        } else {
            System.out.println("Failed to delete the file.");
        }
    }
}
