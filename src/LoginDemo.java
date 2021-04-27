import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginDemo {

    public static void main(String[] args) throws InterruptedException {

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

        Thread.sleep(4000);

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


        WebElement lnkAddCustomer = driver.findElement(By.linkText("Add Customer"));
        lnkAddCustomer.click();


        WebElement txtName =  driver.findElement(By.id("name"));
        txtName.sendKeys("Sunny");

        WebElement txtAddress = driver.findElement(By.name("address"));
        txtAddress.sendKeys("xyz");

        WebElement txtContact1 = driver.findElement(By.name("contact1"));
        txtContact1.sendKeys("898989");


        WebElement txtContact2 = driver.findElement(By.name("contact2"));
        txtContact2.sendKeys("198989");

        WebElement btnSave = driver.findElement(By.name("Submit"));
        btnSave.click();





    }
}
