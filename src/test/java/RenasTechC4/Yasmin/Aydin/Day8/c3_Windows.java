package RenasTechC4.Yasmin.Aydin.Day8;

import RenasTechC4.Yasmin.Aydin.base.TestBase;
import Utilities.RenashTech.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class c3_Windows extends TestBase {
    @Test
    public void TC1_MultiWindows(){
        driver.get("https://renas-practice.herokuapp.com/home");
        driver.findElement(By.id("selenium-Elements")).click();
        driver.findElement(By.id("WindowsII")).click();
        System.out.println("Before Clicking new window:" + driver.getTitle());
        WebElement openwindowbutton = driver.findElement(By.id("open-window"));
        openwindowbutton.click();
        //after clicking, now we have two seperate window
        //to be able to work on the second window,change selenium focus on the next window
        Set<String> allWindows = driver.getWindowHandles(); //store all windows

        List<String> windowlist=new ArrayList<>();
        for (String newwindow:allWindows){
            windowlist.add(newwindow);
            BrowserUtils.wait(2);
            driver.switchTo().window(newwindow); // this will switch between windows that is stored in set all windows
            System.out.println("after switching driver.getTitle() = " + driver.getTitle());
    }
        driver.switchTo().window(windowlist.get(1));
        System.out.println("after switching get title:" +  driver.getTitle());
        driver.findElement(By.xpath("(//span[.='Contact' and @class='elementor-icon-list-text'])[1]")).click();
} }
