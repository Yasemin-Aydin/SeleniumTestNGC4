package Selenium_Assignments;
//1- Open a Chrome browser and go to google
//2- Click to Gmail link from top right
//3- Verify Title contains Gmail, expected: "Gmail"

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1_18Feb {

    public static void main(String[] args) throws InterruptedException {
        //1- Open a Chrome browser and go to google
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.get("https://google.com");

        //2- Click to Gmail link from top right
        //LOCATORS
       //driver.findElement(By.className("gb_d" )).click();
       // driver.findElement(By.linkText("Gmail")).click();
       // driver.findElement(By.partialLinkText("Gma")).click();
        driver.findElement(By.className("gb_d" )).click();
        Thread.sleep(2000);
        String expected_Title ="Gmail";
        String actual_Title =driver.getTitle();

        if(actual_Title.contains("Gmail")){
            System.out.println("The Title Verified");
        } else {
            System.out.println("Title unverified");

        }

    }
}
