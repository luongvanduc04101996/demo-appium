package test;

import helper.HelperUISelector;
import driver.DriverFactory;
import driver.Platforms;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;

import java.util.List;

public class TestXpathAndUISelector {
    public static void main(String[] args) {
        AppiumDriver<MobileElement> driver = DriverFactory.getDriver(Platforms.android);

        try {
            MobileElement loginTabElement = driver.findElement(MobileBy.AccessibilityId("Login"));
            loginTabElement.click();

            List<MobileElement> loginElements = driver.findElements(MobileBy.xpath("//android.widget.EditText"));
            final int USER_NAME_INDEX = 0;
            final int PASSWORD_INDEX = 1;
            loginElements.get(USER_NAME_INDEX).sendKeys("duc@gmail.com");
            loginElements.get(PASSWORD_INDEX).sendKeys("luongvanduc");

            //System.out.println(HelperUISelector.textContains("When the device"));

            MobileElement textInLoginPageElement = driver.findElement(MobileBy.AndroidUIAutomator(HelperUISelector.textContains("When the device")));
            System.out.println(textInLoginPageElement.getText());

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
