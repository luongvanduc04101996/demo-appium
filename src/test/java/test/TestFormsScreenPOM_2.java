package test;

import org.testng.annotations.Test;
import test_data.data_provider.DataProviderFactory;
import test_data.models.FormsData;
import test_data.models.LoginData;
import test_flow.FormsFlow;
import test_flow.authentication.LoginFlow;

public class TestFormsScreenPOM_2 extends BaseTest {

    @Test(dataProvider = "forms", dataProviderClass = DataProviderFactory.class)
    public void testLogin(FormsData formsData) {
        FormsFlow formsFlow = new FormsFlow(getDriver(), formsData);
        formsFlow.goToFormsScreen();
        formsFlow.inputFieldInForms();
        formsFlow.verifyForms();
    }
}
