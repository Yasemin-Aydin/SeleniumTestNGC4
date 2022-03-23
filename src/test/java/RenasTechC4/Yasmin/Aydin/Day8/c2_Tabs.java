package RenasTechC4.Yasmin.Aydin.Day8;

import RenasTechC4.Yasmin.Aydin.base.TestBase;
import Utilities.RenashTech.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.Set;

public class c2_Tabs extends TestBase {
    //we use inheritance here
    @Test
    public void TC1_TabHandle(){
        driver.get("https://renas-practice.herokuapp.com/home");
        driver.findElement(By.id("selenium-Elements")).click();
        driver.findElement(By.id("WindowsII")).click();
        String currentwindow= driver.getWindowHandle();//this will store only one window
        System.out.println("Current window:" + currentwindow);
        System.out.println("Current Title:" + driver.getTitle());
        WebElement openTabButton= driver.findElement(By.id("open-tab"));
        openTabButton.click();
        System.out.println("after clicking tab button title:" + driver.getTitle());
        Set<String> allwindows=driver.getWindowHandles();//gonna use for handling those steps
        for(String tab: allwindows){
            driver.switchTo().window(tab);
            BrowserUtils.wait(2);
            System.out.println(driver.getTitle());
            System.out.println("after clicking tab button title:" + driver.getTitle());
        }

    }

}
