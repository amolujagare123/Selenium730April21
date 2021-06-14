package ActionSDEmo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MakeMyTripDemo {

    @Test
    public void myTest()
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.myntra.com/");


        WebElement menuMen = driver.findElement(By.xpath("//a[@class='desktop-main'][normalize-space()='Men']"));

        Actions action = new Actions(driver);

        action.moveToElement(menuMen).build().perform();

        WebElement tshirt = driver.findElement(By.xpath("//li[@data-reactid='29']//a[text()='T-Shirts' ]"));

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].click()",tshirt);
    }
}
