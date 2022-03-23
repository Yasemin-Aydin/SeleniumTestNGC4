package Validations;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Title {
    public static WebDriver driver;

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://cnn.com");
        //we need to determine the title of this page
        System.out.println("The title of the cnn.com home page is:" + driver.getTitle());
        String title = driver.getTitle();

        if (title.equals("CNN - Breaking News, Latest News and Videos")) {
            System.out.println("Test case is PASSED");
        } else {
            System.out.println("Test case is FAILED");
        }
    }
}
