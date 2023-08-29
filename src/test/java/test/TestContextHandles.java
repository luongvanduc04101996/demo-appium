package test;

import driver.DriverFactory;
import driver.Platforms;
import helper.HelperUISelector;
import helper.Ihelper.IContexts;
import helper.explicitwait.ExplicitWaitForContexts;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class TestContextHandles {
    public static void main(String[] args) {
        AppiumDriver<MobileElement> appiumDriver = DriverFactory.getDriver(Platforms.android);
        try {
            appiumDriver.findElement(MobileBy.AndroidUIAutomator(HelperUISelector.textContains("Webview"))).click();

            WebDriverWait explicitWait = new WebDriverWait(appiumDriver, 15L);
            explicitWait.until(new ExplicitWaitForContexts(appiumDriver));

            appiumDriver.context(IContexts.WEB_VIEW);
            //How to inspect web view in mobile => chrome://inspect
            List<MobileElement> heroImageElement = appiumDriver.findElements(By.xpath("//h1[contains(@class, 'hero')]"));
            if (heroImageElement.isEmpty()) {
                throw new RuntimeException("[ERR] There is no list item!!!");
            } else {
                System.out.println("====================================> PASSED in WEB VIEW");
            }

            appiumDriver.context(IContexts.NATIVE_APP);
            List<MobileElement> webViewButton = appiumDriver.findElements(MobileBy.AndroidUIAutomator(HelperUISelector.textContains("Webview")));
            if (webViewButton.isEmpty()) {
                throw new RuntimeException("[ERR] There is no list item!!!");
            } else {
                System.out.println("====================================> PASSED in NATIVE APP");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            appiumDriver.quit();
        }
    }
}
