package test_data.data_provider;

import org.testng.annotations.DataProvider;
import test_data.DataObjectBuilder;
import test_data.models.FormsData;
import test_data.models.LoginData;

public class DataProviderFactory {
    @DataProvider(name = "loginProvider")
    public static LoginData[] loginProvider() {
        String filePath ="/src/test/java/test_data/data_json/LoginData.json";
        return DataObjectBuilder.buildDataObject(filePath, LoginData[].class);
    }

    @DataProvider(name = "forms")
    public static FormsData[] forms() {
        String filePath ="/src/test/java/test_data/data_json/FormsData.json";
        return DataObjectBuilder.buildDataObject(filePath, FormsData[].class);
    }
}
