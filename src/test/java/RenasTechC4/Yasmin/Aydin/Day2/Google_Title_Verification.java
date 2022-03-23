package RenasTechC4.Yasmin.Aydin.Day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Title_Verification {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://google.com");
        System.out.println("The expected title is:" + driver.getTitle());
        String expected_title = "Google";
        if (driver.getTitle().equals(expected_title)) {
            System.out.println("Title Verified!");
        } else {
            System.out.println("Title is not Verified");
        }

    }
    }

