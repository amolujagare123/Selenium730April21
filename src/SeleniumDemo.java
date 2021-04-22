import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo {

    public static void main(String[] args) {

        // 1. open a browser
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //2. Maximize browser
        driver.manage().window().maximize();

        //3. Open url
        driver.get("https://facebook.com");

        // 4. navigate to other url
        driver.navigate().to("https://gmail.com");

        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();

    }


}
