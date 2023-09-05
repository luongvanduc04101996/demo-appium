package test;

import driver.DriverFactory;
import driver.Platforms;
import helper.HelperUISelector;
import helper.Ihelper.IAppPackage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TestMultipleApps {
    public static void main(String[] args) {
        AppiumDriver<MobileElement> driver = DriverFactory.getDriver(Platforms.android);
        try {
            MobileElement loginTabElement = driver.findElement(MobileBy.AccessibilityId("Login"));
            loginTabElement.click();

            MobileElement mailTextBoxElement = driver.findElement(MobileBy.AccessibilityId("input-email"));
            mailTextBoxElement.sendKeys("duc@gmail.com");

            MobileElement passwordTextBoxElement = driver.findElement(MobileBy.AccessibilityId("input-password"));
            passwordTextBoxElement.sendKeys("luongvanduc");

            driver.runAppInBackground(Duration.ofSeconds(-1));

            openInternetSetting(driver);
            turnOffWifi(driver);

            driver.activateApp(IAppPackage.APP_PACKAGE_NATIVE_APP);
            MobileElement loginButtonElement = driver.findElement(MobileBy.AccessibilityId("button-LOGIN"));
            loginButtonElement.click();


            openInternetSetting(driver);
            turnOnWifi(driver);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }

    private static void openInternetSetting(AppiumDriver<MobileElement> driver) {
        driver.activateApp(IAppPackage.APP_PACKAGE_SETTING);
        MobileElement wifiFeatureElement = driver.findElement(MobileBy.AndroidUIAutomator(HelperUISelector.textContains("Wi‑Fi")));
        wifiFeatureElement.click();
        MobileElement wifiElement = driver.findElement(MobileBy.AndroidUIAutomator(HelperUISelector.textContains("Internet")));
        wifiElement.click();
    }

    private static void turnOffWifi(AppiumDriver<MobileElement> driver) {
        WebDriverWait explicitWait = new WebDriverWait(driver, 10L);
        explicitWait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.className("android.widget.Switch")));
        MobileElement wifiButtonElement = driver.findElement(MobileBy.className("android.widget.Switch"));
        if (wifiButtonElement.getAttribute("checked").equals("true")){
            wifiButtonElement.click();
            System.out.println("==============================> WIFI TURN OFF");
        } else {
            System.out.println("==============================> WIFI ALREADY TURN OFF");
        }
    }

    private static void turnOnWifi(AppiumDriver<MobileElement> driver) {
        WebDriverWait explicitWait = new WebDriverWait(driver, 10L);
        explicitWait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.className("android.widget.Switch")));
        MobileElement wifiButtonElement = driver.findElement(MobileBy.className("android.widget.Switch"));
        if (wifiButtonElement.getAttribute("checked").equals("false")){
            wifiButtonElement.click();
            System.out.println("==============================> WIFI TURN ON");
        } else {
            System.out.println("==============================> WIFI ALREADY TURN ON");
        }
    }
}
