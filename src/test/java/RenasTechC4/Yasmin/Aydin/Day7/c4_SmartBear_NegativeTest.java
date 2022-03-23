package RenasTechC4.Yasmin.Aydin.Day7;

import Utilities.RenashTech.SmartBear_Utilities;
import Utilities.RenashTech.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class c4_SmartBear_NegativeTest {
    WebDriver driver;

    @BeforeMethod
    public void setup(){
        driver= WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
    }

    @Test(dataProvider ="testData")
    public void TC1_NegativeTest(String userID, String passwordID){
        SmartBear_Utilities.negative_loginFor_SmartBear(driver,userID,passwordID);

        //6- verify error message displayed :Invalid Login or Password.
        WebElement errorMessage=driver.findElement(By.className("error"));
        Assert.assertTrue(errorMessage.isDisplayed());

    }

    @DataProvider(name = "testData")
    public static Object[][] wrongUserCredentials(){

        return new Object[][]{
                {"Zelal", "test"},
                {"Ogun","mike"},
                {"Sara","Tester"},
                {"Eren","Kefo"},
                {"Tester","test"}
        };

    }

}

