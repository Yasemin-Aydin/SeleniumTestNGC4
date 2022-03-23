package Validations;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageSource {

        public static WebDriver driver;

        public static void main(String[] args) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://skyscanner.org");
            String pageSource = driver.getPageSource();
            //we need to determine the title of this page
            System.out.println(pageSource);
        }
    }


