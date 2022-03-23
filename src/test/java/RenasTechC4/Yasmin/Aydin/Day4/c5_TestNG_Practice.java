package RenasTechC4.Yasmin.Aydin.Day4;

import org.testng.annotations.*;

public class c5_TestNG_Practice {
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
        System.out.println("Before MEthod is Running");
    }
    @AfterMethod
    public void closing(){
        System.out.println("After MEthod is Running");
    }
    @Test
    public void TC1_test(){
        System.out.println("Test Case1 is Running");

    }
    @Test
    public void TC2_test(){
        System.out.println("Test Case2 is Running");

    }
    @Test
    public void TC3_test(){
        System.out.println("Test Case3 is Running");

    }
}
