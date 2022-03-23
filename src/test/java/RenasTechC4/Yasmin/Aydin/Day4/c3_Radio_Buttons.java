package RenasTechC4.Yasmin.Aydin.Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import Utilities.RenashTech.WebDriverUtil;

import java.util.concurrent.TimeUnit;

public class c3_Radio_Buttons {
    public static void main(String[] args) {

        WebDriver driver= WebDriverUtil.getDriver("chrome");
        driver.navigate().to("https://courses.letskodeit.com/practice");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement  BMWRadioButton = driver.findElement(By.xpath("//input[@id='bmwradio']"));
        BMWRadioButton.click();

        boolean  bmwRadioSelected =  BMWRadioButton.isSelected();
        if(bmwRadioSelected ) {
            System.out.println("BMW is Selected");
        }else{ System.out.println("BMW is not Selected");}

        WebElement HondaButton = driver.findElement(By.id("hondaradio"));
        if(HondaButton.isSelected()){System.out.println("The test has passed");}
        else{System.out.println("Honda Button is not selected");}
    }}
