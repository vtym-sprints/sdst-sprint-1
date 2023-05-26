package tests;

import base.AbstractBaseTest;
import org.testng.annotations.Test;
import pages.BMWConnectedDrivePage;
import pages.HomePage;

import static elements.BMWConnectedDriveElements.*;
import static org.assertj.core.api.Assertions.assertThat;

public class BMWConnectedDriveTest extends AbstractBaseTest {

    @Test
    public void checkDownloadingFiles() throws Exception {
        HomePage homePage = new HomePage(driver);
        BMWConnectedDrivePage bmwConnectedDrivePage = new BMWConnectedDrivePage(driver);

        homePage
                .dismissPopup()
                .goToBMWConnectedDrivePage();

        bmwConnectedDrivePage
                .clickSeeNewFeatures()
                .clickDownloadTrafficCameraInformation()
                .clickDownloadRemoteEngineStart()
                .clickDownloadParkingAssistantProfessional()
                .waitTillCircleLoaderDisappear();

        String firstFilename = bmwConnectedDrivePage.readPdfContent(filePathTrafficCameraInformation);
        assertThat(firstFilename)
                .contains("TRAFFIC CAMERA INFORMATION");

        bmwConnectedDrivePage.deleteFile(filePathTrafficCameraInformation);

        String secondFileName = bmwConnectedDrivePage.readPdfContent(filePathRemoteEngineStart);
        assertThat(secondFileName)
                .contains("REMOTE ENGINE");

        bmwConnectedDrivePage.deleteFile(filePathRemoteEngineStart);

        String thirdFileName = bmwConnectedDrivePage.readPdfContent(filePathParkingAssistantProfessional);
        assertThat(thirdFileName)
                .contains("PARKING");

        bmwConnectedDrivePage.deleteFile(filePathParkingAssistantProfessional);
    }
}
