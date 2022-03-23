package RenasTechC4.Yasmin.Aydin.Day8;

import Utilities.RenashTech.SmartBear_Utilities;
import Utilities.RenashTech.WebDriverUtil;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class c1_WebTablePractice {

    WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = WebDriverUtil.getDriver("Chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
    }

    @Test
    public void TC1_StreetVerification() {
        SmartBear_Utilities.logInForSmartBear(driver);
        Assert.assertEquals(driver.getTitle(), "Web Orders");

    }

    @Test(dataProvider = "TestDataforStreetName")
    public void TC2_StreetVerification(String streetName) {
        SmartBear_Utilities.logInForSmartBear(driver);
        SmartBear_Utilities.verifyStreet(driver,streetName);

    }

    @DataProvider(name = "TestDataforStreetName")

    public static Object[][] test() {
        return new Object[][]{
                {"17, Park Avenue"},
                {"379 MaryBay Crescent"},
                {"44 Nibluck"},
                {"Hello World"},
                {"3, Garden st."}
        };
    }
}
