package TestNGDemos;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDownDemo {


    @Test
    public void dropDownDemo()
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///D:/Scriptinglogic%20docs/class%20Activities/Selenium/Mywebsite/amol.html");

        WebElement drpTxt = driver.findElement(By.id("seltext"));

        Select selTxt = new Select(drpTxt);

      //  selTxt.selectByVisibleText("text 2");

      //  selTxt.selectByIndex(3);

        selTxt.selectByValue("v13");
    }
}
