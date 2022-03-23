package RenasTechC4.Yasmin.Aydin.Day9;

import RenasTechC4.Yasmin.Aydin.base.TestBase;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import java.util.Set;

public class c3_JavaScript_Examples extends TestBase {
    @Test
    public void TC1_Handling_window_with_js_Executer() {
        driver.get("https://www.youtube.com");
        // 1- We create javascriptExecutor object and we cast our WebDriver type instance into JavascriptExecutor type.
        //2. Java scripts future is helps to open new windows
        ((JavascriptExecutor) driver).executeScript("window.open('https://google.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('https://facebook.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('https://amazon.com','_blank');");
        //String is a container for all our windows
        Set<String> windows = driver.getWindowHandles();
        for (String window : windows) {
            //changes windows
            driver.switchTo().window(window);
            //tells whihc window we are in
            String currentwindow = driver.getWindowHandle();
            System.out.println("current window =" + currentwindow);
            System.out.println("Title=" + driver.getTitle());

        }
    }
    @Test
    public void scrollDownJS () {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.get("http://demo.guru99.com/test/guru99home/");
        js.executeScript("window.scrollBy(0,3000)");
    } }
         /*
The syntax of ScrollBy() methods is :

executeScript("window.scrollBy(x-pixels,y-pixels)");
x-pixels is the number at x-axis,
it moves to the left if number is positive and
it move to the right if number is negative .
y-pixels is the number at y-axis,
it moves to the down if number is positive and
it move to the up if number is in negative . */


