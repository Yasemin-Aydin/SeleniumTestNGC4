package RenasTechC4.Yasmin.Aydin.Day9;

import RenasTechC4.Yasmin.Aydin.base.TestBase;
import Utilities.RenashTech.PropertiesReadingUtil;
import Utilities.RenashTech.SmartBear_Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class c2_SmartBearPractice extends TestBase {
    //inheritance

    //open chrome browser
    //go to http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
    //click on box which belongs "charles Dodgeson"
    //click on delete button
    //verify if charles deleted from the list


    @Test
    public void TC1_CharlesDeleteVerification() throws InterruptedException {
        //go to http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
        driver.get(PropertiesReadingUtil.getProperties("SmartBear_url"));
        SmartBear_Utilities.logInForSmartBear(driver);
        //click on box which belongs "charles Dodgeson"
        WebElement charlesCheckBox=driver.findElement(By.id("ctl00_MainContent_orderGrid_ctl05_OrderSelector"));
        charlesCheckBox.click();


        //click on delete button
       Thread.sleep(2000);


        WebElement deleteCharles=driver.findElement(By.className("btnDeleteSelected"));
        Thread.sleep(2000);
        deleteCharles.click();

        //verify if charles deleted from the list
        //we store all names
        Thread.sleep(2000);
        List<WebElement> listOfNames=driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr/td[2]"));
        Thread.sleep(2000);
        //verify if charles there
        for(WebElement eachName:listOfNames){
            Assert.assertFalse(eachName.getText().equals("Charles Dodgeson"));
        }

    }


}









