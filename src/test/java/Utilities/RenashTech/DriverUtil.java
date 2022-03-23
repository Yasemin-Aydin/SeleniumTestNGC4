package Utilities.RenashTech;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.FirefoxDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class DriverUtil {
    //to be able to achieve singleton design pattern we will need to have private constructor
//no one can be able to create an object from this class because we are making constructor private .
    private DriverUtil() {

    }

    private static WebDriver driver;

    // we are using encapsulation logic in here by making driver private
    //we will need to create getter and setter for driver
    public static WebDriver getDriver() {
        if (driver == null) {
            String browser = PropertiesReadingUtil.getProperties("browser");
            switch (browser) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;

                case "firefox":
                    FirefoxDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
                    //browser will not show up but your code will run. If you do not wanna see everytime things working in browser use headless
                case "chrome-headless":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver(new ChromeOptions().setHeadless(true));
                    break;
                case "firefox-headless":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver(new FirefoxOptions().setHeadless(true));


            }
        }
        return driver;
    }
    public static void closeDriver(){
        if(driver!=null){
            driver.quit();
            driver=null;
        }
    }
}