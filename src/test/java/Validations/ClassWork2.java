package Validations;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassWork2 {
        public static WebDriver driver;

        public static void main(String[] args) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://skyscanner.org");
            //we need to determine the title of this page
            System.out.println("The title of the Skyscanner home page is:" + driver.getTitle());
            System.out.println("The URL of the Skyscanner home page is:" +  driver.getCurrentUrl());
            String title = driver.getCurrentUrl();

       if (title.equals("https://www.skyscanner.ca/?previousCultureSource=GEO_LOCATION&redirectedFrom=www.skyscanner.net")) {
            System.out.println("Test case is PASSED");
        } else {
            System.out.println("Test case is FAILED");
        }
        }
    }


