package elements;

import base.AbstractBasePage;
import org.openqa.selenium.WebDriver;

public class BMWConnectedDriveElements extends AbstractBasePage {

    public BMWConnectedDriveElements(WebDriver driver) {
        super(driver);
    }

    public static final String SeeNewFeatures = "//a[@analytics-event='electric-fma.#upgrades.see-new-features.button']";
    public static final String TRAFFIC_CAMERA_INFORMATION_DownloadBTN =
            "//a[@analytics-event='connecteddrive.gsg_traffic_camera_information.pdf.download-guide.button']";
    public static final String DRIVER_RECORDER_DownloadBTN =
            "//a[@analytics-event='connecteddrive.gsg_drive_recorder.pdf.download-guide.button']";
    public static final String REMOTE_ENGINE_START_DownloadBT =
            "//a[@analytics-event='connecteddrive.gsg_remoteenginestart.pdf.download-guide.button']";
    public static final String PARKING_ASSISTANT_PROFESSIONAL_DownloadBT =
            "//a[@analytics-event='connecteddrive.gsg_parking_assistant.pdf.download-guide.button']";
    public static String filePathTrafficCameraInformation = "src/test/java/downloadFiles/GSG_Traffic_Camera_Information.pdf";
    public static String filePathRemoteEngineStart = "src/test/java/downloadFiles/GSG_RemoteEngineStart.pdf";
    public static String filePathParkingAssistantProfessional = "src/test/java/downloadFiles/GSG_parking_assistant.pdf";
}
