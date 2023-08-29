package helper.explicitwait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;

public class ExplicitWaitForContexts implements ExpectedCondition<Boolean> {
    private final AppiumDriver<MobileElement> appiumDriver;
    public ExplicitWaitForContexts(AppiumDriver<MobileElement> appiumDriver) {
        this.appiumDriver = appiumDriver;
    }

    @NullableDecl
    public Boolean apply(@NullableDecl WebDriver input) {
        return appiumDriver.getContextHandles().size() > 1;
    }
}
