package RenasTechC4.Yasmin.Aydin.Day2;

import browser_opening.Day1Selenium_Class;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class c4_ClassTask_byYasminAydin {//TASK: Google search
//1- Open a chrome browser
//2- Go to: https://google.com
//3- Write "orange" in search box
//4- Click google search button
//5- Verify title:
//Expected: Title should start with "orange" word
//6-navigate back
//7-write banana in search box
//8-verify title contains banana.
public static void main(String[] args) throws InterruptedException {
    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://google.com");
    //we find this element by using element name
    WebElement searchBox = driver.findElement(By.name("q"));
    searchBox.sendKeys("orange");
    Thread.sleep(2000);
    driver.findElement(By.name("btnK")).click();
    String expected_Title ="orange";
    String actual_Title = driver.getTitle();

    if (actual_Title.startsWith(expected_Title)){
        System.out.println("Title Verified");
    }
    else{ System.out.println("Title is not Verified");}
    System.out.println("Actual title is:" +actual_Title );
    Thread.sleep(2000);
    driver.navigate().back();
    driver.findElement(By.name("q")).sendKeys("banana" + Keys.ENTER);

    String expected_Title2 = "banana";
    String actual_Title2 = driver.getTitle();
    if(actual_Title2.contains("expected_Title2")){
        System.out.println("Title2 Verified");
    }else{
        System.out.println("Title2 Unverified");
    }
    System.out.println("Actual Title2 is :" + actual_Title2);




}



}



