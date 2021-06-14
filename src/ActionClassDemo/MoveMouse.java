package ActionClassDemo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MoveMouse {

    @Test
    public void mytest()
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.makemytrip.com/");

        WebElement menuMore = driver.findElement(By.xpath("//span[@class='darkGreyText']"));

        Actions action = new Actions(driver);
        action.moveToElement(menuMore).build().perform();

        driver.findElement(By.xpath("//a[@data-cy='submenu_MyBiz']")).click();

    }


}
