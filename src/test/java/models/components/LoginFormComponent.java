package models.components;

import helper.HelperUISelector;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

public class LoginFormComponent {
    private final AppiumDriver<MobileElement> appiumDriver;
    private final static By emailSel = MobileBy.AccessibilityId("input-email");
    private final static By passwordSel = MobileBy.AccessibilityId("input-password");
    private final static By loginButtonSel = MobileBy.AccessibilityId("button-LOGIN");

    public LoginFormComponent(AppiumDriver<MobileElement> appiumDriver) {
        this.appiumDriver = appiumDriver;
    }

    private MobileElement emailElem() {
        return appiumDriver.findElement(emailSel);
    }

    private MobileElement passwordElem() {
        return appiumDriver.findElement(passwordSel);
    }

    private MobileElement loginButtonElem() {
        return appiumDriver.findElement(loginButtonSel);
    }

    public void inputEmail(String email) {
        if (!email.isEmpty()){
        emailElem().sendKeys(email);
        }
    }

    public void inputPassword(String password) {
        if (!password.isEmpty()){
            passwordElem().sendKeys(password);
        }
    }

    public void clickOnLoginButton() {
        loginButtonElem().click();
    }
}
