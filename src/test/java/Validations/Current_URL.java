package Validations;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.versions.UrlComparator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Current_URL {
    public static WebDriver driver;

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://cnn.com");
        //we need to determine the title of this page
        System.out.println("The title of the cnn.com home page is:" + driver.getCurrentUrl());
        String title = driver.getCurrentUrl();

        if (title.equals("https://www.cnn.com/")) {
            System.out.println("Test case is PASSED");
        } else {
           System.out.println("Test case is FAILED");
       }
   }
}


