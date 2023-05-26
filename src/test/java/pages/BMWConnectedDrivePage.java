package pages;

import elements.BMWConnectedDriveElements;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.WebDriver;

import java.io.File;

import static java.lang.Thread.sleep;

public class BMWConnectedDrivePage extends BMWConnectedDriveElements {

    public BMWConnectedDrivePage(WebDriver driver) {
        super(driver);
    }

    public BMWConnectedDrivePage clickSeeNewFeatures() {
        waitUntilElementToBeClickableByXpath(SeeNewFeatures).click();
        return this;
    }

    public BMWConnectedDrivePage clickDownloadTrafficCameraInformation() throws InterruptedException {
        waitUntilElementToBeClickableByXpath(TRAFFIC_CAMERA_INFORMATION_DownloadBTN).click();
        sleep(2000);
        return this;
    }

    public BMWConnectedDrivePage clickDownloadRemoteEngineStart() throws InterruptedException {
        waitUntilElementToBeClickableByXpath(REMOTE_ENGINE_START_DownloadBT).click();
        sleep(2000);
        return this;
    }

    public BMWConnectedDrivePage clickDownloadParkingAssistantProfessional() throws InterruptedException {
        waitUntilElementToBeClickableByXpath(PARKING_ASSISTANT_PROFESSIONAL_DownloadBT).click();
        sleep(2000);
        return this;
    }

    public String readPdfContent(String fileName) throws Exception {
        PDDocument document = PDDocument.load(new File(fileName));
        PDFTextStripper pdfStripper = new PDFTextStripper();
        String text = pdfStripper.getText(document);
        sleep(2000);
        document.close();
        return text;
    }

    public void deleteFile(String filePath) {
        File file = new File(filePath);
        if (file.delete()) {
            System.out.println("Deleted the file: " + file.getName());
        } else {
            System.out.println("Failed to delete the file.");
        }
    }
}
