package JunitDemos;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JunitDemo1 {

    WebDriver driver;

    @Before // method wriiten below this annotation will run before every test method
    public void openBrowser()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }

    @After// method wriiten below this annotation will run after every test method
    public  void closeBrowser() throws InterruptedException {

        Thread.sleep(4000);
        driver.close();
    }


    @Test
    public void myTest1()
    {

        driver.get("http://billing.scriptinglogic.net/");

        WebElement txtUsername  =  driver.findElement(By.xpath("//input[@id='email']"));
        txtUsername.sendKeys("amolujagare@gmail.com");

        WebElement txtpassword = driver.findElement(By.xpath("//input[@id='password']"));
        txtpassword.sendKeys("admin123");

        WebElement btnLogin = driver.findElement(By.xpath("//input[@name='btn_login']"));
      //  btnLogin.click();
    }

    @Test
    public void myTest2()
    {


        driver.get("http://billing.scriptinglogic.net/");

        WebElement txtUsername  =  driver.findElement(By.xpath("//input[@id='email']"));
        txtUsername.sendKeys("sdsd");

        WebElement txtpassword = driver.findElement(By.xpath("//input[@id='password']"));
        txtpassword.sendKeys("sdsds");

        WebElement btnLogin = driver.findElement(By.xpath("//input[@name='btn_login']"));
      //  btnLogin.click();
    }

    @Test
    public void myTest3()
    {


        driver.get("http://billing.scriptinglogic.net/");

        WebElement txtUsername  =  driver.findElement(By.xpath("//input[@id='email']"));
        txtUsername.sendKeys("");

        WebElement txtpassword = driver.findElement(By.xpath("//input[@id='password']"));
        txtpassword.sendKeys("");

        WebElement btnLogin = driver.findElement(By.xpath("//input[@name='btn_login']"));
     //   btnLogin.click();
    }

}
