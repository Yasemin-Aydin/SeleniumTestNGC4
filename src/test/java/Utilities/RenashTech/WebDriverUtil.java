package Utilities.RenashTech;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverUtil {
    public static WebDriver getDriver(String browser) {
        if (browser.equalsIgnoreCase("Chrome")) {
            //Chrome browser needs to be set up
            WebDriverManager.chromedriver().setup();
            return new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            return new FirefoxDriver();
        }
        else {
            System.out.println("Browser is not exist");
            System.out.println("Check Browser name" );
            System.out.println("Browser : "+ browser);
            return null;
        }

    }
}
