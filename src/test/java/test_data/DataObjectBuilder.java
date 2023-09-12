package test_data;

import com.google.gson.Gson;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;

public class DataObjectBuilder {
    public static <D> D buildDataObject(String filePath, Class<D> dataType) {
        D returnData;
        String absolutePath = System.getProperty("user.dir").concat(filePath);

        try {
            Reader reader = Files.newBufferedReader(Paths.get(absolutePath));
            Gson gson = new Gson();
            returnData = gson.fromJson(reader, dataType);
        } catch (NoSuchFileException exception) {
            exception.printStackTrace();
            throw new RuntimeException("[ERR]--Can not find the path: " + absolutePath);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e.getMessage());
        }
        return returnData;
    }
}
