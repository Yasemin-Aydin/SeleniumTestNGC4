package RenasTechC4.Yasmin.Aydin.base;

import Utilities.RenashTech.BrowserUtils;
import Utilities.RenashTech.DriverUtil;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public abstract class TestBase2 {
    //abstraction example

    @BeforeMethod
    public void setup(){
        DriverUtil.getDriver().manage().window().maximize();
        DriverUtil.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
    @AfterMethod
    public void closing(){
        BrowserUtils.wait(2);
       // DriverUtil.closeDriver();
    }
}
