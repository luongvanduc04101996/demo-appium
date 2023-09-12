package models.components;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

public class FormsComponent {
    private final AppiumDriver<MobileElement> appiumDriver;
    private final static By inputFieldSel = MobileBy.AccessibilityId("text-input");

    public FormsComponent(AppiumDriver<MobileElement> appiumDriver) {
        this.appiumDriver = appiumDriver;
    }

    private MobileElement inputFieldElem() {
        return appiumDriver.findElement(inputFieldSel);
    }

    public void inputField(String text) {
        if (!text.isEmpty()){
            inputFieldElem().sendKeys(text);
        }
    }
}
