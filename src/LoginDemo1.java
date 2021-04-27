import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class LoginDemo1 {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://stock.scriptinglogic.net/");

        List<WebElement> wbList =   driver.findElements(By.tagName("input"));


        System.out.println("Size="+wbList.size());

        wbList.get(0).sendKeys("admin");

        wbList.get(1).sendKeys("admin");

        wbList.get(2).click();




    }
}
