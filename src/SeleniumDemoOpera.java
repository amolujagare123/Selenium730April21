import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class SeleniumDemoOpera {

    public static void main(String[] args) {

        // 1. open a browser
        System.setProperty("webdriver.opera.driver","Drivers/operadriver.exe");
        WebDriver driver = new OperaDriver();

        //2. Maximize browser
        driver.manage().window().maximize();

        //3. Open url
        driver.get("https://facebook.com");
    }


}
