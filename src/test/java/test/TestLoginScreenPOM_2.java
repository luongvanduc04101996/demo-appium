package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import test_data.data_provider.DataProviderFactory;
import test_data.models.LoginData;
import test_flow.authentication.LoginFlow;

public class TestLoginScreenPOM_2 extends BaseTest {

    @Test(dataProvider = "loginProvider", dataProviderClass = DataProviderFactory.class)
    public void testLogin(LoginData loginData) {
        LoginFlow loginFlow = new LoginFlow(getDriver(), loginData.getEmail(), loginData.getPassword());
        loginFlow.goToLoginScreen();
        loginFlow.login();
        loginFlow.verifyLogin();
        Assert.fail("try to capture failed case");
    }
}
