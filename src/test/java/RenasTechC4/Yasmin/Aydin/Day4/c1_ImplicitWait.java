package RenasTechC4.Yasmin.Aydin.Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import Utilities.RenashTech.WebDriverUtil;

import java.util.concurrent.TimeUnit;

public class c1_ImplicitWait {
    public static void main(String[] args) {
        WebDriver  driver = WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://vinexpoamerica.com");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector("a[href='/attend/'")).click();
    }

}
