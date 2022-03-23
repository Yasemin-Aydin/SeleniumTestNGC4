package RenasTechC4.Yasmin.Aydin.Day7;

import Utilities.RenashTech.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class c3_Iframes {
    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver= WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://the-internet.herokuapp.com/iframe");
    }

    @Test
    public void TC1_iframe(){
        //First of all, you need to locate iframe same as a Web element
       // WebElement iframe=driver.findElement(By.id("courses-iframe"));
        //to be able to tell selenium focus on iframe
        //you need to tell selenium to change the focus from page to iframe
       // driver.switchTo().frame(iframe);

        // you can also locate Web element inside iframe.
        //3Switching by id or name attribute value
        driver.switchTo().frame("mce_0_ifr");
        WebElement Message_Box = driver.findElement(By.id("tinymce"));
        Message_Box.clear();
        Message_Box.sendKeys("Message box has passed test");


    }
}


