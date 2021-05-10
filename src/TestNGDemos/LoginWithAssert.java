package TestNGDemos;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginWithAssert {

    @Test
    public void myTest1()
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://stock.scriptinglogic.net/");

        WebElement txtUsername  =  driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("admin");

        WebElement txtpassword = driver.findElement(By.id("login-password"));
        txtpassword.sendKeys("admin");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();

        // 1. page title

       /* String expected = "POSNIC - Dashboard";
        String actual = driver.getTitle();
*/
      /*  String expected ="http://stock.scriptinglogic.net/dashboard.php";
        String actual = driver.getCurrentUrl();*/


        String expected = "Log out";
        String actual = "";


        try {
            actual = driver.findElement(By.xpath("//a[contains(@class,'logoff')]")).getText();
        }
        catch (Exception e)
        {

        }


        System.out.println("actual="+actual);

        System.out.println("expected="+expected);

        Assert.assertEquals(actual,expected,"this is not a dashboard page");
    }
}
