import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumOtherMethods {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://facebook.com");

        System.out.println(driver.getTitle());

        driver.navigate().to("http://gmail.com");

        System.out.println(driver.getCurrentUrl());

        driver.navigate().to("https://scriptinglogic.com");

        System.out.println(driver.getPageSource());

    }
}
