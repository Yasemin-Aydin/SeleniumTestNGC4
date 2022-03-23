package RenasTechC4.Yasmin.Aydin.Day4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import Utilities.RenashTech.WebDriverUtil;

import java.util.concurrent.TimeUnit;

public class c2_CheckBox {
    public static void main(String[] args) {
        WebDriver driver = WebDriverUtil.getDriver("chrome");
        WebDriverManager.chromedriver().setup();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://demo.guru99.com/test/radio.html");
        WebElement checkBox1 = driver.findElement(By.id("vfb-6-0"));
        if (checkBox1.isSelected()) {
            System.out.println("Verified CheckBox1");
        } else {
            System.out.println("CheckBox1 is not Selected therefore verification has Failed");

        }
        WebElement checkBox2 = driver.findElement(By.id("vfb-6-1"));
        checkBox2.click();
        if (checkBox2.isSelected()) {
            System.out.println("CheckBox2 is Verified");
        } else {
            System.out.println("CheckBox2 is not Selected therefore verification has Failed");

        }
    }}