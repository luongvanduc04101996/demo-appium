package test_flow;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import models.components.FormsComponent;
import models.components.LoginFormComponent;
import models.pages.FormsScreen;
import org.apache.commons.validator.routines.EmailValidator;
import test_data.models.FormsData;

public class FormsFlow extends BaseFlow {
    private final AppiumDriver<MobileElement> appiumDriver;
    public String inputField;

    public FormsFlow(AppiumDriver<MobileElement> appiumDriver, FormsData formsData) {
        super(appiumDriver);
        this.appiumDriver = appiumDriver;
        this.inputField = formsData.getInputField();
    }

    public FormsFlow(AppiumDriver<MobileElement> appiumDriver) {
        super(appiumDriver);
        this.appiumDriver = appiumDriver;
    }

    public void inputFieldInForms() {
        FormsScreen formsScreen = new FormsScreen(appiumDriver);
        FormsComponent formsComponent = formsScreen.formsComponent();
        formsComponent.inputField(inputField);
        //Check function
        try {
            Thread.sleep(2000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void inputFieldInForms(String text) {
        FormsScreen formsScreen = new FormsScreen(appiumDriver);
        FormsComponent formsComponent = formsScreen.formsComponent();
        formsComponent.inputField(text);
    }

    public void verifyForms() {
    }
}
