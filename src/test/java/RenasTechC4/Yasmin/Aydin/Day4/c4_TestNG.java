package RenasTechC4.Yasmin.Aydin.Day4;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class c4_TestNG {
  @BeforeMethod

  public void setUp(){
    System.out.println("Before Method is Running");
  }
  @AfterMethod
  public void closing(){
    System.out.println("After Method is Running");
}
@Test
  public void TC1_Test (){
  System.out.println("Test Case1 is Running");
}
  @Test
  public void TC2_Test (){
    System.out.println("Test Case1 is Running");
  }

  @Test
  public void TC3_Test (){
    System.out.println("Test Case1 is Running");
  }

}
