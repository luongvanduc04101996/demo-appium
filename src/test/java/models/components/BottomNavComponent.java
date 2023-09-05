package models.components;

import helper.HelperUISelector;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

public class BottomNavComponent {
    private final AppiumDriver<MobileElement> appiumDriver;
    private final static By homeIconSel = MobileBy.AndroidUIAutomator(HelperUISelector.textContains("Home"));
    private final static By webviewIconSel = MobileBy.AndroidUIAutomator(HelperUISelector.textContains("Webview"));
    private final static By loginIconSel = MobileBy.AndroidUIAutomator(HelperUISelector.textContains("Login"));
    private final static By formIconSel = MobileBy.AndroidUIAutomator(HelperUISelector.textContains("Forms"));
    private final static By swipeIconSel = MobileBy.AndroidUIAutomator(HelperUISelector.textContains("Swipe"));
    private final static By dragIconSel = MobileBy.AndroidUIAutomator(HelperUISelector.textContains("Drag"));

    public BottomNavComponent(AppiumDriver<MobileElement> appiumDriver) {
        this.appiumDriver = appiumDriver;
    }

    public void clickOnHomeIcon() {
        appiumDriver.findElement(homeIconSel).click();
    }

    public void clickOnWebviewIcon() {
        appiumDriver.findElement(webviewIconSel).click();
    }

    public void clickOnLoginIcon() {
        appiumDriver.findElement(loginIconSel).click();
    }

    public void clickOnFormsIcon() {
        appiumDriver.findElement(formIconSel).click();
    }

    public void clickOnSwipeIcon() {
        appiumDriver.findElement(swipeIconSel).click();
    }

    public void clickOnDragIcon() {
        appiumDriver.findElement(dragIconSel).click();
    }

}
