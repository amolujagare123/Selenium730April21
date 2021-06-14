package TestNGDemos;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertDemo {


    @Test
    public void addCustomerTest() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://demo.guru99.com/v4/index.php");

        driver.findElement(By.xpath("//input[@value='LOGIN']")).click();

        Alert alert = driver.switchTo().alert();

        System.out.println(alert.getText());
        alert.dismiss();
        //alert.accept();

    }
}
