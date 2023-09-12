package models.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import models.components.BottomNavComponent;
import models.components.FormsComponent;

public class FormsScreen {
    private final AppiumDriver<MobileElement> appiumDriver;

    public FormsScreen(AppiumDriver<MobileElement> appiumDriver) {
        this.appiumDriver = appiumDriver;
    }

    public BottomNavComponent bottomNavComponent() {
        return new BottomNavComponent(appiumDriver);
    }

    public FormsComponent formsComponent() {
        return new FormsComponent(appiumDriver);
    }
}
