package RenasTechC4.Yasmin.Aydin.Day9;

import RenasTechC4.Yasmin.Aydin.base.TestBase2;
import Utilities.RenashTech.BrowserUtils;
import Utilities.RenashTech.DriverUtil;
import Utilities.RenashTech.PropertiesReadingUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class c4_driverUtilPractice extends TestBase2 {
    //go to google
//search for hello
//verify title contains hello
    @Test
    public void TC1_practice(){
        DriverUtil.getDriver().get(PropertiesReadingUtil.getProperties("google_url"));
        WebElement searchBox=DriverUtil.getDriver().findElement(By.name("q"));
        String searchItem= PropertiesReadingUtil.getProperties("google_searchData");
        searchBox.sendKeys(searchItem+ Keys.ENTER);
        BrowserUtils.wait(2);
        System.out.println(DriverUtil.getDriver().getTitle());
        Assert.assertTrue(DriverUtil.getDriver().getTitle().contains("hello"));
    }

}
