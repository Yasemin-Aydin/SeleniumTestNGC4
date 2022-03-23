package RenasTechC4.Yasmin.Aydin.Day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import Utilities.RenashTech.SmartBear_Utilities;
import Utilities.RenashTech.WebDriverUtil;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;
//       Smartbear software street verification
//       1. Open browser and login to Smartbear software
//       2. Click on View all orders
//       3. Verify Mark Smith has street as  "9, Maple Valley"

public class c1_WebTable {
    WebDriver driver;
    @BeforeMethod
    public void setup() {
        driver = WebDriverUtil.getDriver("Chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //2- Go to:http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

        //Login
        SmartBear_Utilities.logInForSmartBear(driver);
    }

        @Test
        public void TC1_VerifyMarkStreetName( ){

            //       3. Verify Mark Smith has street as  "9, Maple Valley"
            WebElement markStreet=driver.findElement(By.xpath("//td[.='770077007700']//..//td[6]"));
            System.out.println("mark street name="+markStreet.getText());

            String actualStreet=markStreet.getText();
            String expected="9, Maple Valley";

            Assert.assertEquals(actualStreet,expected,"street name verification has failed");




        }
    }