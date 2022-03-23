package RenasTechC4.Yasmin.Aydin.Day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.*;
import Utilities.RenashTech.WebDriverUtil;

import java.util.concurrent.TimeUnit;

public class c3_Dropdown {
    //task1
//1. Open Chrome browser
//2. Go to "http://the-internet.herokuapp.com/"
//3 click on dropdown
//confirm default selected dropdown is "Please select an option"
//task2
//1. Open Chrome browser
//2. Go to "http://the-internet.herokuapp.com/"
//3 click on dropdown
//choose  option 2 from dropdown
//choose option 1 from dropdown
//choose option 2 from dropdown
WebDriver driver;
@BeforeClass
    public void BeforeClass(){System.out.println("Before Class is running");}
@AfterClass
    public void AfterClass(){ System.out.println("After Class is running");}
    @BeforeMethod
    public void setup(){

    System.out.println("Before Method is Running");
        driver= WebDriverUtil.getDriver("Chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://the-internet.herokuapp.com");}
    @Test
    public void TestCase1(){
        System.out.println("TestCase1 is running");}

    @Test
    public void TC1_test(  ){
        System.out.println("Test Case1 is Running");
        driver.findElement(By.xpath("//a[@href='/dropdown']")).click();
        //confirm default selected dropdown is "Please select an option"
        WebElement dropdownbox = driver.findElement (By.id("dropdown"));
        Select dropDown = new Select( dropdownbox );
        String default_Option= dropDown.getFirstSelectedOption().getText();
        String expectedDefault = "Please select an option";
        System.out.println("default option is: " + default_Option);
        Assert.assertEquals(expectedDefault,default_Option, "Default option is not work");
}
    @Test
    public void TC2_VerifyFromOptionDropdown(  ) throws InterruptedException {
        System.out.println("Test Case1 is Running");
        driver.findElement(By.xpath("//a[@href='/dropdown']")).click();
        WebElement dropdownbox = driver.findElement (By.id("dropdown"));
        Select dropDown = new Select( dropdownbox );
        Thread.sleep(2000);
        dropDown.selectByVisibleText("Option 2");
        Thread.sleep(2000);
        dropDown.selectByValue("1");
        Thread.sleep(2000);
        dropDown.selectByIndex(2);
}
    @AfterMethod
    public void closing(){
        driver.close();
    }
}
