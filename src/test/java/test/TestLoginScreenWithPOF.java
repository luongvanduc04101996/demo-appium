package test;

import driver.DriverFactory;
import driver.Platforms;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import models.pages.LoginPageObjectFactory;

public class TestLoginScreenWithPOF {
    public static void main(String[] args) {
        AppiumDriver<MobileElement> appiumDriver = DriverFactory.getDriver(Platforms.android);
        try {
            LoginPageObjectFactory loginPage = new LoginPageObjectFactory(appiumDriver);
            loginPage.bottomNavComponent().clickOnLoginIcon();
            loginPage.inputEmail("duc@gmail.com");
            loginPage.inputPassword("12345678");
            loginPage.clickOnLoginButton();

            //debug
            Thread.sleep(3000L);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            appiumDriver.quit();
        }
    }
}
