package test_flow;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import models.pages.HomeScreen;

public class BaseFlow {
    private final AppiumDriver<MobileElement> appiumDriver;

    public BaseFlow(AppiumDriver<MobileElement> appiumDriver) {
        this.appiumDriver = appiumDriver;
    }

    public void goToLoginScreen() {
        new HomeScreen(appiumDriver).bottomNavComponent().clickOnLoginIcon();
    }

    public void goToFormsScreen() {
        new HomeScreen(appiumDriver).bottomNavComponent().clickOnFormsIcon();
    }

}
