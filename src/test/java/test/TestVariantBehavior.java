package test;

import driver.DriverFactory;
import driver.MobileCapabilityTypeEx;
import driver.Platforms;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.internal.CapabilityHelpers;
import org.openqa.selenium.Capabilities;

public class TestVariantBehavior {

    public static void main(String[] args) {
        AppiumDriver<MobileElement> appiumDriver = DriverFactory.getDriver(Platforms.android);
        try {
            Capabilities caps = appiumDriver.getCapabilities();
            String platForm = caps.getCapability(MobileCapabilityTypeEx.PLATFORM_NAME).toString();
            String udid = caps.getCapability(MobileCapabilityTypeEx.UDID).toString();
            String packageName1 = caps.getCapability(MobileCapabilityTypeEx.APP_PACKAGE).toString();
            String packageName2 = CapabilityHelpers.getCapability(caps, MobileCapabilityTypeEx.APP_PACKAGE, String.class);

            System.out.println(platForm);
            System.out.println(udid);
            System.out.println(packageName1);
            System.out.println(packageName2);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            appiumDriver.quit();
        }
    }
}
