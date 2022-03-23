package RenasTechC4.Yasmin.Aydin.Day11_POM_explicityWait;

import RenasTechC4.Yasmin.Aydin.Pages.SeleniumPracticeExplicitlyWaitPage;
import RenasTechC4.Yasmin.Aydin.base.TestBase2;
import Utilities.RenashTech.DriverUtil;
import Utilities.RenashTech.PropertiesReadingUtil;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class c3_Explicitly_example extends TestBase2 {
    //go to http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html
    //click on timer
    //verify webdriver text gets present


    SeleniumPracticeExplicitlyWaitPage seleniumPracticeExplicitlyWaitPage;
    @Test
    public void TC1_practice(){
        DriverUtil.getDriver().get(PropertiesReadingUtil.getProperties("selenium_practice_url"));
        seleniumPracticeExplicitlyWaitPage=new SeleniumPracticeExplicitlyWaitPage();
        seleniumPracticeExplicitlyWaitPage.getDefaultText();
        seleniumPracticeExplicitlyWaitPage.clickTimerButton();

        WebElement actualText=seleniumPracticeExplicitlyWaitPage.getWebDriverText();

        Assert.assertEquals(actualText.getText(),"WebDriver","WebDriver verification has failed!");
}}
