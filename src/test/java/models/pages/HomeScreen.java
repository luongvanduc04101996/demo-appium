package models.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import models.components.BottomNavComponent;
import models.components.LoginFormComponent;

public class HomeScreen {
    private final AppiumDriver<MobileElement> appiumDriver;

    public HomeScreen(AppiumDriver<MobileElement> appiumDriver) {
        this.appiumDriver = appiumDriver;
    }

    public BottomNavComponent bottomNavComponent() {
        return new BottomNavComponent(appiumDriver);
    }

    public LoginFormComponent loginFormComponent() {
        return new LoginFormComponent(appiumDriver);
    }
}
