package test;

import driver.DriverFactory;
import driver.Platforms;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestAction {
    public static void main(String[] args) {
        // get appium driver
        AppiumDriver<MobileElement> driver = DriverFactory.getDriver(Platforms.android);

        try {
            MobileElement loginTabElement = driver.findElement(MobileBy.AccessibilityId("Login"));
            loginTabElement.click();

            MobileElement mailTextBoxElement = driver.findElement(MobileBy.AccessibilityId("input-email"));
            mailTextBoxElement.sendKeys("duc@gmail.com");

            MobileElement passwordTextBoxElement = driver.findElement(MobileBy.AccessibilityId("input-password"));
            passwordTextBoxElement.sendKeys("luongvanduc");

            MobileElement loginButtonElement = driver.findElement(MobileBy.AccessibilityId("button-LOGIN"));
            loginButtonElement.click();

            WebDriverWait wait = new WebDriverWait(driver, 5L);
            WebElement titleSuccessElement = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.id("android:id/alertTitle")));

            System.out.println("Title: " + titleSuccessElement.getText());

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // quit appium session
            driver.quit();
        }

        // find and click login button

        // fill the form
    }
}
