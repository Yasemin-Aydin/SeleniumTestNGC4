package RenasTechC4.Yasmin.Aydin.Day1_Introduction;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class c1_HelloSelenium {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");
        driver.manage().window().maximize();
        driver.getCurrentUrl();
        System.out.println("Current URL is :" + driver.getCurrentUrl());


    }

}
