import com.google.common.annotations.VisibleForTesting;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LoadProps {
    // creating an object of properties
    static Properties props;
    // creating  an object of FileInputStream
    static FileInputStream inputStream;

    public  String getProperty(String key){
        // prps variable is intialized
        props = new Properties();

        try{
            // get copy path from testdataconfig.properties
            // inputstram an object is intialized
            inputStream = new FileInputStream("src\\test\\Resources\\TestData\\TestdataConfig.properties");
            props.load(inputStream);
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return props.getProperty(key);
    }
    @Test
    public void test1(){
        System.out.println(getProperty("url"));
    }
}
