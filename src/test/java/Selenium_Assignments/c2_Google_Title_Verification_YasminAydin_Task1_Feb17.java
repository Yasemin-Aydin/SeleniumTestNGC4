package Selenium_Assignments;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Task
//1.Open Chrome Browser
//2.Go to google
//3.Verify title : Expected : Google

    public class c2_Google_Title_Verification_YasminAydin_Task1_Feb17 {
        public static WebDriver driver;
        public static void main(String[] args){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
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


