package test;

import driver.DriverFactory;
import driver.Platforms;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import models.components.LoginFormComponent;
import models.pages.LoginScreen;

public class TestLoginScreenPOM_1 {
    public static void main(String[] args) {
        AppiumDriver<MobileElement> appiumDriver = DriverFactory.getDriver(Platforms.android);
        try {
            LoginScreen loginScreen = new LoginScreen(appiumDriver);
            loginScreen.bottomNavComponent().clickOnLoginIcon();

            LoginFormComponent loginFormComponent = new LoginFormComponent(appiumDriver);
            loginFormComponent.inputEmail("duc@gmail.com");
            loginFormComponent.inputPassword("12345678");
            loginFormComponent.clickOnLoginButton();

            //debug
            Thread.sleep(3000L);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            appiumDriver.quit();
        }
    }
}
