package RenasTechC4.Yasmin.Aydin.Day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class c3_Locators_Guru99 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/selenium-xpath.html");
        driver.manage().window().maximize();
        WebElement TestingHeader  = driver.findElement(By.xpath("//b[.='Testing'"));
        Thread.sleep(2000);
        //another xpath
       // WebElement TestingHeader  = driver.findElement(By.xpath("//b[.='Testing'"));

    }
}
