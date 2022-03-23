package RenasTechC4.Yasmin.Aydin.Day1_Introduction;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class c2_browserNavigation {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //driver.navigate().to( "https://facebook.com" );
        driver.manage().window().fullscreen();
        driver.get("https://apple.com");
        Thread.sleep(2000);
        driver.get("https://amazon.com");
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().forward();
        driver.close();
        driver.quit();


    }
}
