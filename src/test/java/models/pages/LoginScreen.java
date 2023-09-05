package models.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import models.components.BottomNavComponent;
import models.components.LoginFormComponent;

public class LoginScreen {
    private final AppiumDriver<MobileElement> appiumDriver;

    public LoginScreen(AppiumDriver<MobileElement> appiumDriver) {
        this.appiumDriver = appiumDriver;
    }

    public BottomNavComponent bottomNavComponent() {
        return new BottomNavComponent(appiumDriver);
    }

    public LoginFormComponent loginFormComponent() {
        return new LoginFormComponent(appiumDriver);
    }
}
