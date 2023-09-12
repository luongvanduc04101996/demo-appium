package test_flow.authentication;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import models.components.LoginFormComponent;
import models.pages.HomeScreen;
import org.apache.commons.validator.routines.EmailValidator;
import test_flow.BaseFlow;

public class LoginFlow extends BaseFlow {
    private final AppiumDriver<MobileElement> appiumDriver;
    private final String email;
    private final String password;

    public LoginFlow(AppiumDriver<MobileElement> appiumDriver, String email, String password) {
        super(appiumDriver);
        this.appiumDriver = appiumDriver;
        this.email = email;
        this.password = password;
    }

    public void login() {
        HomeScreen homeScreen = new HomeScreen(appiumDriver);
        LoginFormComponent loginFormComponent = homeScreen.loginFormComponent();
        loginFormComponent.inputEmail(email);
        loginFormComponent.inputPassword(password);
    }

    public void verifyLogin() {
        boolean isEmailValid = EmailValidator.getInstance().isValid(email);
        boolean isPasswordValid = password.length() >= 8;
        if (isEmailValid && isPasswordValid) {
            verifyCorrectLogin();
        }

        if (!isEmailValid) {
            verifyIncorrectEmail();
        }

        if (!isPasswordValid) {
            verifyIncorrectPassword();
        }
    }

    private void verifyCorrectLogin() {

    }

    private void verifyIncorrectEmail() {
    }

    private void verifyIncorrectPassword() {
    }
}
