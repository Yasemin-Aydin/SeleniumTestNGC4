package Selenium_Assignments;

import Utilities.RenashTech.BrowserUtils;
import Utilities.RenashTech.WebDriverUtil;
import org.openqa.selenium.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Assignment_byYAsminAydin_Feb28 {


WebDriver driver;
   @BeforeMethod
    public void setup(){
       //  1) Launch the web browser and open the site http://demo.guru99.com/test/delete_customer.php
       driver= WebDriverUtil.getDriver("Chrome");
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       driver.get("http://demo.guru99.com/test/delete_customer.php");

   }
    @Test
    public void TC1_Alert_Dismiss() {
       // Enter Any Customer id.
        driver.findElement(By.name("cusid")).sendKeys("Yasmin");
        //After entering the customer ID, Click on the “Submit” button.
        driver.findElement(By.name("submit")).click();
        BrowserUtils.wait(2);
        // Step 4) Reject/accept the alert.
        Alert alert=driver.switchTo().alert();
        BrowserUtils.wait(2);
       // alert.dismiss();
        alert.accept();
    }
    }


