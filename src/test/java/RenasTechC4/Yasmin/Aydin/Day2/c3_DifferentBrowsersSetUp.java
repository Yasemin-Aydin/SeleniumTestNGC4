package RenasTechC4.Yasmin.Aydin.Day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class c3_DifferentBrowsersSetUp {
     public static void main(String[] args) {

          //Firefox
          WebDriverManager.firefoxdriver().setup();
          WebDriver driver = new FirefoxDriver();
          driver.manage().window().maximize();
          driver.get("https://amazon.ca");
          //Edge Driver
          WebDriverManager.edgedriver().setup();
          driver = new EdgeDriver();

     }



}
