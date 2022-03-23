package Utilities.RenashTech;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class SmartBear_Utilities {
    public static void logInForSmartBear(WebDriver driver){

        //3- Enter username --->Tester
        WebElement username=driver.findElement(By.id("ctl00_MainContent_username"));
        username.sendKeys("Tester");
        //4- Enter password --->test
        WebElement password=driver.findElement(By.id("ctl00_MainContent_password"));
        password.sendKeys("test");
        //5- Click "Login" button
        WebElement login=driver.findElement(By.id("ctl00_MainContent_login_button"));
        login.click();

    }

    public static void negative_loginFor_SmartBear(WebDriver driver, String userID, String PasswordID) {
        //3- Enter username --->Tester>>> invalid user name
        WebElement username=driver.findElement(By.id("ctl00_MainContent_username"));
        username.sendKeys(userID);
        //4- Enter password --->test>>>>>>>invalid password
        WebElement password=driver.findElement(By.id("ctl00_MainContent_password"));
        password.sendKeys(PasswordID);
        //5- Click "Login" button
        WebElement login=driver.findElement(By.id("ctl00_MainContent_login_button"));
        login.click();
    }

    public static void verifyStreet(WebDriver driver, String streetName){
        //to locate all table //table[@id='ctl00_MainContent_orderGrid']
        // to locate a table row >>>> //table[@id='ctl00_MainContent_orderGrid']//tr

        List<WebElement> streetList = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//tr//td[6]"));

        for(WebElement eachStreet: streetList){
            if(eachStreet.getText().equals(streetName)){
                Assert.assertTrue(eachStreet.getText().equals(streetName));
                return;
            }
        }
        Assert.fail("Street Name:" + streetName + "is not present on the table");
    }
}

