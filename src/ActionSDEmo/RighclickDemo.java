package ActionSDEmo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class RighclickDemo {

    @Test
    public void myTest() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");


        WebElement clickBtn = driver.findElement(By.xpath("//span[normalize-space()='right click me']"));

        Actions action = new Actions(driver);

        action.contextClick(clickBtn).build().perform();

        driver.findElement(By.xpath("//li[@class='context-menu-item context-menu-icon context-menu-icon-copy']")).click();


    }
}
