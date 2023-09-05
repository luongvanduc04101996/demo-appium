package models.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import models.components.BottomNavComponent;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class LoginPageObjectFactory {
    private final AppiumDriver<MobileElement> appiumDriver;

    public LoginPageObjectFactory(AppiumDriver<MobileElement> appiumDriver) {
        this.appiumDriver = appiumDriver;
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver, Duration.ofSeconds(15L)), this);
    }

    @AndroidFindBy(accessibility = "input-email")
    private MobileElement emailElem;

    @AndroidFindBy(accessibility = "input-password")
    private MobileElement passwordElem;

    @AndroidFindBy(accessibility = "button-LOGIN")
    private MobileElement loginButtonElem;

    public void inputEmail(String email) {
        if (!email.isEmpty()) {
            emailElem.sendKeys(email);
        }
    }

    public void inputPassword(String password) {
        if (!password.isEmpty()) {
            passwordElem.sendKeys(password);
        }
    }

    public void clickOnLoginButton() {
        loginButtonElem.click();
    }

    public BottomNavComponent bottomNavComponent() {
        return new BottomNavComponent(appiumDriver);
    }
}
