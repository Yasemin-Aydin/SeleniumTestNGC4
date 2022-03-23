package RenasTechC4.Yasmin.Aydin.Day4;

import org.testng.Assert;
import org.testng.annotations.*;

public class c6_TestNG_Example {
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
    @Test ( priority = 3 )
    public void TC1_1(){
        System.out.println("Test 1 is Running");

    }

    @Test ( priority = 1 )
    public void TC3_3(){
        System.out.println("Test Case 3 is Running");
        String actualWord = "New York";
        String expectedWord ="Ohia";
        Assert.assertEquals(actualWord,expectedWord);

    }
    @Test ( priority = 2 )
    public void TC2_2(){
        System.out.println("Test Case2 is Running");
        String name1 = "Yasmin";
        String name2 ="Vehbi";
        Assert.assertEquals(name1,name2);
    }
}

