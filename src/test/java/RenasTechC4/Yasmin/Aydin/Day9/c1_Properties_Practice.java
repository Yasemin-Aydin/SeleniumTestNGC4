package RenasTechC4.Yasmin.Aydin.Day9;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class c1_Properties_Practice {
    @Test
    public void TC1_SystemProperties(){
        //java has some ready properties that we can get system info
        System.out.println(System.getProperty("os.name"));
    }
    @Test
    public void TC2_configurationProperties() throws FileNotFoundException {
        //to be able to make our code understand properties file I need to connect to my file
        Properties properties = new Properties();
        String pathForPropertiesFile="configuration.properties";
        //this is path of configuration.properties file
        //we need to tell compiler to open the file
        FileInputStream fileInputStream=new FileInputStream(pathForPropertiesFile);
        try{
            properties.load(fileInputStream);
            //file needs to be loaded in the automation

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(properties.getProperty("SmartBear_url"));
        System.out.println(properties.getProperty("SmartBear_username"));
        System.out.println(properties.getProperty("SmartBear_password"));
        System.out.println(properties.getProperty("SmartBear_username" + "\nSmartBear_password"));

    }
}
