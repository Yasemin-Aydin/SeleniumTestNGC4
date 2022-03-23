package RenasTechC4.Yasmin.Aydin.Day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class c2_Locators2_Amazon {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://amazon.com");
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        driver.findElement(By.xpath("//input[@type='submit']"));
        Thread.sleep(2000);
        searchBox.sendKeys("gift ideas" + Keys.ENTER);


    }
}
