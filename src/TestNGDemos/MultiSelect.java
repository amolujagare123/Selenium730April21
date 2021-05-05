package TestNGDemos;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class MultiSelect {


    @Test
    public void dropDownDemo() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///D:/Scriptinglogic%20docs/class%20Activities/Selenium/Mywebsite/amol.html");

        WebElement mulTxt = driver.findElement(By.id("multiSel"));

        Select selTxt = new Select(mulTxt);

        Thread.sleep(4000);
        selTxt.selectByIndex(0);

        Thread.sleep(4000);
        selTxt.selectByIndex(2);

        Thread.sleep(4000);
        selTxt.selectByIndex(3);

      /*  Thread.sleep(4000);
        selTxt.deselectByIndex(2);

        Thread.sleep(4000);
        selTxt.deselectByIndex(0);*/

        Thread.sleep(4000);
        selTxt.deselectAll();


    }
}
