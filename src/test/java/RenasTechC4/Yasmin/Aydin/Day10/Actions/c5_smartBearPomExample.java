package RenasTechC4.Yasmin.Aydin.Day10.Actions;

import RenasTechC4.Yasmin.Aydin.Pages.SmartBearLoginPage;
import RenasTechC4.Yasmin.Aydin.base.TestBase2;
import Utilities.RenashTech.DriverUtil;
import Utilities.RenashTech.PropertiesReadingUtil;
import org.testng.annotations.Test;


public class  c5_smartBearPomExample extends TestBase2 {
        SmartBearLoginPage smartBearLoginPage;

        @Test
        public void TC1_smartBearPositiveVerification(){
            DriverUtil.getDriver().get(PropertiesReadingUtil.getProperties("SmartBear_url"));

            smartBearLoginPage=new SmartBearLoginPage();
            smartBearLoginPage.loginSmartBear(PropertiesReadingUtil.getProperties("SmartBear_username"),
                    PropertiesReadingUtil.getProperties("SmartBear_password"));




        }
    }



