package Selenium_Assignments;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Task - 2
//Open Chrome Browser
//Go to google
//Navigate back
//Navigate forward
//Navigate to https://www.amazon.com
//Verify title contains : Smile
    public class c1_Amazon_Title_Verificationby_YAsminAydin_Feb17 {

        //if u use driver.get you will get a new tab
        // when u use driver.navigate u open a browser

        public static void main(String[] args) throws InterruptedException {
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.manage().window().fullscreen();
            driver.get("https://google.com");
            Thread.sleep(1000);
            driver.navigate().back();
            Thread.sleep(1000);
            driver.navigate().forward();
            driver.navigate().to("https://amazon.com");
            String exist_one = driver.getTitle();
            String contains_Title = "smile";


            if (exist_one.equalsIgnoreCase(contains_Title)) {
                System.out.println("Title Verified!");
            } else {
                System.out.println("Title is not Verified");
                System.out.println("Actual Title is : " + driver.getTitle());
            }



        }
    }


