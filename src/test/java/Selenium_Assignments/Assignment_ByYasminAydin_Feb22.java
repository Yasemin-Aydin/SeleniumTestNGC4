package Selenium_Assignments;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import Utilities.RenashTech.WebDriverUtil;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Assignment_ByYasminAydin_Feb22 {

    //1. Open Chrome browser
//2. Go to https://demo.guru99.com/test/radio.html
//3. Verify all checkboxes are not selected (you can use find elements to store in list and use for loop to validate)
//4. Click to checkbox3
//5. Verify checkbox3 is selected
    public static void main(String[] args) {
        WebDriver driver = WebDriverUtil.getDriver("chrome");
        WebDriverManager.chromedriver().setup();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://demo.guru99.com/test/radio.html");
        List<WebElement> checkBox = driver.findElements(By.xpath("//input[@type='checkbox']"));

        for (WebElement  checkboxes : checkBox){
            if (!checkboxes.isSelected()) {
                System.out.println(" Checkbox1 has passed");

            } else {
                System.out.println("Verified CheckBox1");
            }
            WebElement checkBox3 = driver.findElement(By.id("vfb-6-2"));
        checkBox3.click();
        if (checkBox3.isSelected()) {
            System.out.println("CheckBox3 is Verified");
        } else {
            System.out.println("CheckBox3 is not Selected therefore verification has Failed");

        }
    }}

    }

