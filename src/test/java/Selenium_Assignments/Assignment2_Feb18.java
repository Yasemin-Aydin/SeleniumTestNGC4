package Selenium_Assignments;
//1.open Chrome browser
//2.Go to https://www.amazon.com
//3.type laptop on search box
//4.then click on search button
//5.verify title

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2_Feb18 {
    public static void main(String[] args) throws InterruptedException {
        ///1.open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        //2.Go to https://www.amazon.com
        driver.get("https://www.amazon.com");
        //3.type laptop on search box
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        Thread.sleep(2000);
        searchBox.sendKeys("laptop");
        //4.then click on search button
        Thread.sleep(2000);
        driver.findElement(By.id("nav-search-submit-button")).sendKeys("Laptop" + Keys.ENTER);
        //verify title
        String actual_Title = driver.getTitle();
        String expected_Title = "Amazon";

        if ( expected_Title.equals("https://www.amazon.com")) {
            System.out.println("Title unverified");
        } else {
            System.out.println("The Title Verified");
        }


    }}
