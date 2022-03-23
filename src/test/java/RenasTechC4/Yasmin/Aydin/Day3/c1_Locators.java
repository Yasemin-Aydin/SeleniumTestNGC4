package RenasTechC4.Yasmin.Aydin.Day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class c1_Locators {
        public static void main(String[] args) throws InterruptedException {
            //1- Open a Chrome browser and go to google
            WebDriverManager.chromedriver().setup();
            WebDriver driver=new ChromeDriver();
            driver.manage().window().fullscreen();
            driver.get("https://google.com");

            //2- Click to Gmail link from top right
            //LOCATORS
            //driver.findElement(By.className("gb_d" )).click();
            // driver.findElement(By.linkText("Gmail")).click();
            // driver.findElement(By.partialLinkText("Gma")).click();
            driver.findElement(By.className("gb_d" )).click();
            Thread.sleep(2000);
    }
}
