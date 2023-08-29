package test;

import driver.DriverFactory;
import driver.Platforms;
import helper.HelperUISelector;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;

public class TestTakingScreenshot {
    //Add one more dependency: commons-io
    public static void main(String[] args) {
        AppiumDriver<MobileElement> appiumDriver = DriverFactory.getDriver(Platforms.android);
        try {
            MobileElement homeElement = appiumDriver.findElement(MobileBy.AndroidUIAutomator(HelperUISelector.textContains("Home")));
            WebDriverWait explicitWait = new WebDriverWait(appiumDriver, 15L);
            explicitWait.until(ExpectedConditions.visibilityOf(homeElement));

            // whole screen
            File base64ScreenshotData = appiumDriver.getScreenshotAs(OutputType.FILE);
            String fileLocation = System.getProperty("user.dir").concat("/screenshots/").concat("HomeScreen.png");
            FileUtils.copyFile(base64ScreenshotData, new File(fileLocation));

            // an area
            MobileElement homeViewElement = appiumDriver.findElement(MobileBy.className("android.widget.ScrollView"));
            File base64HomeViewData = homeViewElement.getScreenshotAs(OutputType.FILE);
            String fileLocationForHomeView = System.getProperty("user.dir").concat("/screenshots/").concat("HomeView.png");
            FileUtils.copyFile(base64HomeViewData, new File(fileLocationForHomeView));

            // an element
            File base64HomeTextData = homeElement.getScreenshotAs(OutputType.FILE);
            String fileLocationForHomeText = System.getProperty("user.dir").concat("/screenshots/").concat("HomeText.png");
            FileUtils.copyFile(base64HomeTextData, new File(fileLocationForHomeText));

        } catch (Exception e){
            e.printStackTrace();
        } finally {
            appiumDriver.quit();
        }
    }
}
