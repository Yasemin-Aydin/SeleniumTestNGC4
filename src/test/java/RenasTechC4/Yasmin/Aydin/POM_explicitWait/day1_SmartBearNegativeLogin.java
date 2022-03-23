package RenasTechC4.Yasmin.Aydin.POM_explicitWait;

import RenasTechC4.Yasmin.Aydin.Pages.SmartBearLoginPage;
import RenasTechC4.Yasmin.Aydin.base.TestBase2;
import Utilities.RenashTech.DriverUtil;
import Utilities.RenashTech.PropertiesReadingUtil;
import org.testng.Assert;
import org.testng.annotations.Test;

public class day1_SmartBearNegativeLogin extends TestBase2 {
    //enter invalid username and password for SmartBear

    SmartBearLoginPage smartBearLoginPage;
    @Test
    public void TC1_NegativeTest(){

        DriverUtil.getDriver().get(PropertiesReadingUtil.getProperties("SmartBear_url"));
        smartBearLoginPage=new SmartBearLoginPage();
        smartBearLoginPage.loginSmartBear(PropertiesReadingUtil.getProperties("SmartBear_invalidUsername"),
                PropertiesReadingUtil.getProperties("SmartBear_invalidPassword"));


        String expectedMessage="Invalid Login or Password.";
        String actualText=smartBearLoginPage.getStatusMessage();

        Assert.assertEquals(expectedMessage,actualText,"negative login failed");

        //we extend TestBase2 with logic of inheritence
        //we get before and after method
        //we create page class
        //and we stored webelements and some usefull methods
        //create an object from page to be able to call webelements and methods
        //you navigate your url
        //then you pass username ,password and click on login button with one method that we created under SMLogin Page
        //then we verified text after we try to logged in with a method that again we create under Login Page


    }





    }

