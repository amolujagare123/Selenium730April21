import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumDemoFireFox {

    public static void main(String[] args) {

        // 1. open a browser
        System.setProperty("webdriver.gecko.driver","Drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        //2. Maximize browser
        driver.manage().window().maximize();

        //3. Open url
        driver.get("https://facebook.com");
    }


}
