package RenasTechC4.Yasmin.Aydin.Day5;

import org.testng.Assert;
import org.testng.annotations.*;

public class c1_TestNG_Example2 {
    @BeforeClass
    public void setupClass(){
        System.out.println("Before Class is Running");
    }
    @AfterClass
    public void setupAfterClass(){
        System.out.println("After Class is Running");
    }
    @BeforeMethod
    public void setup(){
        System.out.println("Before Method is Running");
    }
    @AfterMethod
    public void closing(){
        System.out.println("After Method is Running");
    }
    @Test (priority = 3, dependsOnMethods = "TC3_test")
    public void TC1_test(  ){
        System.out.println("Test Case1 is Running");

    }
    @Test (priority = 1)
    public void TC3_test(){
        System.out.println("Test Case3 is Running");
        String actual_word = "BMW";
        String expected_word = "Honda";
        Assert.assertEquals(actual_word,expected_word);
        System.out.println("continue test3");

    }
    @Test (priority = 2)
    public void TC2_test(){
        System.out.println("Test Case2 is Running");
        String str = "USA";
        String str2="USA";
        Assert.assertTrue(str.equals(str2));

    }
    @Ignore
    @Test
    public void TC4_test(){
        System.out.println(" Test4 is Running");

    }

}
